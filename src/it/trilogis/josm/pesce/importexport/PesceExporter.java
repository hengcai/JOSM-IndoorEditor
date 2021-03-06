// License: GPL. For details, see LICENSE file.
package it.trilogis.josm.pesce.importexport;

import static org.openstreetmap.josm.tools.I18n.tr;
import it.trilogis.ingoorgml.utils.IndoorGMLNamespaceMapper;
import it.trilogis.josm.pesce.converters.OSMConverter;
import it.trilogis.josm.pesce.converters.OSMConverter.ConversionException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.text.MessageFormat;
import java.util.Collection;

import javax.swing.JOptionPane;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;

import net.opengis.gml.v_3_2_1.FeatureCollectionType;
import net.opengis.indoorgml.v_1_0.core.IndoorFeaturesType;

import org.openstreetmap.josm.Main;
import org.openstreetmap.josm.actions.ExtensionFileFilter;
import org.openstreetmap.josm.data.osm.DataSet;
import org.openstreetmap.josm.data.osm.Node;
import org.openstreetmap.josm.data.osm.Relation;
import org.openstreetmap.josm.data.osm.Way;
import org.openstreetmap.josm.gui.layer.Layer;
import org.openstreetmap.josm.gui.layer.OsmDataLayer;
import org.openstreetmap.josm.io.FileExporter;
import org.openstreetmap.josm.tools.Utils;
import org.openstreetmap.josm.io.Compression;

import trilogis.net.opengis.gml.v_3_2_1.CustomLineFeatureMember;
import trilogis.net.opengis.gml.v_3_2_1.CustomPointFeatureMember;

/**
 * Exports data to an .osm file.
 * @since 1949
 */
public class PesceExporter extends FileExporter {
    
    public final static ExtensionFileFilter INDOOR_FILE_FILTER = new ExtensionFileFilter(
            String.format("%s,%s.gz,%s.bz2", PesceImporter.EXT, PesceImporter.EXT, PesceImporter.EXT),
            PesceImporter.EXT, tr("IndoorGML files") + " (*."+PesceImporter.EXT+"[.gz|.bz2])");
    /**
     * Constructs a new {@code OsmExporter}.
     */
    public PesceExporter() {
        super(PesceImporter.INDOOR_FILE_FILTER);
    }

    /**
     * Constructs a new {@code OsmExporter}.
     * @param filter The extension file filter
     */
    public PesceExporter(ExtensionFileFilter filter) {
        super(filter);
    }

    @Override
    public boolean acceptFile(File pathname, Layer layer) {
        if (!(layer instanceof OsmDataLayer))
            return false;
        return super.acceptFile(pathname, layer);
    }

    @Override
    public void exportData(File file, Layer layer) throws IOException {
        
        exportData(file, layer, false);
    }

    /**
     * Exports OSM data to the given file.
     * @param file Output file
     * @param layer Data layer. Must be an instance of {@link OsmDataLayer}.
     * @param noBackup if {@code true}, the potential backup file created if the output file already exists will be deleted
     *                 after a successful export
     * @throws IllegalArgumentException if {@code layer} is not an instance of {@code OsmDataLayer}
     */
    public void exportData(File file, Layer layer, boolean noBackup) throws IllegalArgumentException {
        checkOsmDataLayer(layer);
        save(file, (OsmDataLayer) layer, noBackup);
    }

    protected static void checkOsmDataLayer(Layer layer) throws IllegalArgumentException {
        if (!(layer instanceof OsmDataLayer)) {
            throw new IllegalArgumentException(MessageFormat.format("Expected instance of OsmDataLayer. Got ''{0}''.", layer
                    .getClass().getName()));
        }
    }

    protected static OutputStream getOutputStream(File file) throws FileNotFoundException, IOException {
        return Compression.getCompressedFileOutputStream(file);
    }

    private void save(File file, OsmDataLayer layer, boolean noBackup) {
        File tmpFile = null;
        try {
            // use a tmp file because if something errors out in the
            // process of writing the file, we might just end up with
            // a truncated file.  That can destroy lots of work.
            if (file.exists()) {
                tmpFile = new File(file.getPath() + "~");
                Utils.copyFile(file, tmpFile);
            }

            doSave(file, layer.data);
            if (noBackup || !Main.pref.getBoolean("save.keepbackup", false)) {
                if (tmpFile != null) {
                    tmpFile.delete();
                }
            }
            layer.onPostSaveToFile();
        } catch (IOException e) {
            Main.error(e);
            JOptionPane.showMessageDialog(
                    Main.parent,
                    tr("<html>An error occurred while saving.<br>Error is:<br>{0}</html>", e.getMessage()),
                    tr("Error"),
                    JOptionPane.ERROR_MESSAGE
            );

            try {
                // if the file save failed, then the tempfile will not
                // be deleted.  So, restore the backup if we made one.
                if (tmpFile != null && tmpFile.exists()) {
                    Utils.copyFile(tmpFile, file);
                }
            } catch (IOException e2) {
                Main.error(e2);
                JOptionPane.showMessageDialog(
                        Main.parent,
                        tr("<html>An error occurred while restoring backup file.<br>Error is:<br>{0}</html>", e2.getMessage()),
                        tr("Error"),
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }

    private static void doSave(File file, Writer writer, DataSet data) throws IOException, FileNotFoundException {
        IndoorFeaturesType document;
        try {
            document = OSMConverter.convert(data);
            
            if(null != file) {
                try(OutputStream os = getOutputStream(file)){
                    
                    
                    
                    JAXBContext jaxbContext = JAXBContext.newInstance(IndoorFeaturesType.class);
                    Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
                    IndoorGMLNamespaceMapper mapper = new IndoorGMLNamespaceMapper();
                    
                    Main.debug("mapper class name: "+mapper.getClass().getSuperclass().getName());
                    for(String propName : new String[] {
                            "com.sun.xml.bind.namespacePrefixMapper", // Windows
                            "com.sun.xml.internal.bind.namespacePrefixMapper",
                            "com.sun.xml.bind.marshaller.NamespacePrefixMapper"}) {
                        Main.debug("propName: "+propName);
                        try {
                            jaxbMarshaller.setProperty(propName, mapper);
                            break;
                        } catch (PropertyException e) {
                            // In case another JAXB implementation is used
                            e.printStackTrace();
                        }    
                    }
                    
                    // output pretty printed
                    jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
                    jaxbMarshaller.marshal(document, os);
                    
                    //Marshalling.marshal(document, os);
                    os.close();
                }
            } else if(null != writer) {
                Marshalling.marshal(document, writer);
            }
        } catch (ConversionException | JAXBException e) {
            e.printStackTrace();
        } 
    }
    
    public static void doSave(Writer writer, DataSet data) throws IOException, FileNotFoundException  {
        doSave(null, writer, data);
    }
    
    public static void doSave(File file, DataSet data) throws IOException, FileNotFoundException  {
        doSave(file, null, data);
    }
}
