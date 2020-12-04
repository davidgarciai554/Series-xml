/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author David
 */
public class consultas {
    Document doc;
    XPath xpath;
    
    public boolean abreXPATH(File file) {
        doc = null;
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setIgnoringComments(true);
            factory.setIgnoringElementContentWhitespace(true);

            DocumentBuilder builder = factory.newDocumentBuilder();
            Document XMLDoc = factory.newDocumentBuilder().parse(file);

            doc = builder.parse(file);
            xpath = XPathFactory.newInstance().newXPath();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
        public String ejecutarXPath(String consulta) {
        String cadena = "";
        try {
            XPathExpression exp = xpath.compile(consulta);
            Object result = exp.evaluate(doc, XPathConstants.NODESET);
            NodeList listaNodos = (NodeList) result;
            String datos_nodo[] = null;
            Node node;

            for (int i = 0; i < listaNodos.getLength(); i++) {
                ///Libros/Libro/Titulo[.='Oliver Twist']

                if (listaNodos.item(i).getNodeName().equals("serie")) {
                    datos_nodo = procesarInfo(listaNodos.item(i));
                    cadena = cadena + "\n " + datos_nodo[0];
                    cadena = cadena + "\n " + datos_nodo[1];
                    cadena = cadena + "\n " + datos_nodo[2];

                } else {
                    cadena = cadena + "\n " + listaNodos.item(i).getFirstChild().getNodeValue();

                }
            }
            if (cadena.equals("")) {
                return "MALA SINTAXIS DE CONSULTA";
            }
            return cadena;
        } catch (Exception e) {
            return "ERROR AL LEERLO";
        }

    }

    private String[] procesarInfo(Node n) {

        String datos[] = new String[80];
        Node ntemp = null;
        int contador = 1;

        datos[0] = n.getAttributes().item(0).getNodeValue();

        NodeList nodos = n.getChildNodes();

        for (int i = 0; i < nodos.getLength(); i++) {

            ntemp = nodos.item(i);

            if (ntemp.getNodeType() == Node.ELEMENT_NODE) {
                //datos[contador] = ntemp.getChildNodes().item(0).getNodeValue();
                datos[contador] = ntemp.getFirstChild().getNodeValue();
                contador++;
            }
        }
        return datos;
    }
}
