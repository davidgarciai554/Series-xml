/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import java.io.File;
import java.io.FileOutputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 *
 * @author David
 */
public class añadirElemento {

    Document doc;

    public boolean abrirDom(File file) {
        doc = null;

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

            factory.setIgnoringComments(true);
            factory.setIgnoringElementContentWhitespace(true);

            DocumentBuilder builder = factory.newDocumentBuilder();
            doc = builder.parse(file);
            return true;
        } catch (Exception e) {
            return false;
        }

    }
    
        public boolean addDOM(String nombre, String genero, String reparto,String creador,String temporadas , String episodios , String fechaIni,String fechaFin,String plataformaVis) {

        try {

            Node nnombre = doc.createElement("nombre");
            Node nnombre_text = doc.createTextNode(nombre);
            nnombre.appendChild(nnombre_text);
            
            Node ngenero = doc.createElement("genero");
            Node ngenero_text = doc.createTextNode(genero);
            ngenero.appendChild(ngenero_text);
            
            Node nreparto = doc.createElement("reparto");
            Node nreparto_text = doc.createTextNode(reparto);
            nreparto.appendChild(nreparto_text);
            
            Node ncreador = doc.createElement("creador");
            Node ncreador_text = doc.createTextNode(creador);
            ncreador.appendChild(ncreador_text);
            
            Node ntemporadas = doc.createElement("temporadas");
            Node ntemporadas_text = doc.createTextNode(temporadas);
            ntemporadas.appendChild(ntemporadas_text);
            
            Node nepisodios = doc.createElement("episodios");
            Node nepisodios_text = doc.createTextNode(episodios);
            nepisodios.appendChild(nepisodios_text);
            
            Node nfechaIni = doc.createElement("fechaInicio");
            Node nfechaIni_text = doc.createTextNode(fechaIni);
            nfechaIni.appendChild(nfechaIni_text);
            
            Node nfechaFin = doc.createElement("fechaFinalizacion");
            Node nfechaFin_text = doc.createTextNode(fechaFin);
            nfechaFin.appendChild(nfechaFin_text);
            
            Node nplataformaVis = doc.createElement("plataformaVisualicacion");
            Node nplataformaVis_text = doc.createTextNode(plataformaVis);
            nplataformaVis.appendChild(nplataformaVis_text);
            
            Node nserie = doc.createElement("serie");
            
            nserie.appendChild(nnombre);
            nserie.appendChild(ngenero);
            nserie.appendChild(nreparto);
            nserie.appendChild(ncreador);
            nserie.appendChild(ntemporadas);
            nserie.appendChild(nfechaIni);
            nserie.appendChild(nfechaFin);
            nserie.appendChild(nplataformaVis);
            
            Node raiz = doc.getFirstChild();
            raiz.appendChild(nserie);

            return true;

        } catch (Exception e) {
            return false;
        }
    }
        public boolean guardarDOM() {

        try {

            File archivo_xml = new File("series.xml");
            OutputFormat format = new OutputFormat(doc);
            format.setIndenting(true);
            XMLSerializer serializer = new XMLSerializer(new FileOutputStream(archivo_xml), format);
            serializer.serialize(doc);

            return true;

        } catch (Exception e) {

            return false;

        }

    }
}
