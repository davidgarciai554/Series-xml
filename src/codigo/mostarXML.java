/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author David
 */
public class mostarXML {

    SAXParser parser;
    manejadorSAX sh;
    File ficheroXML = new File("series.xml");

    public boolean abrir(File file) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            parser = factory.newSAXParser();

            sh = new manejadorSAX();
            ficheroXML = file;

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String mostrar() {

        try {
            parser.parse(ficheroXML, sh);
        } catch (Exception e) {
            return "ERROR AL PARSEAR SAX";
        }
        return sh.cadena;

    }

    class manejadorSAX extends DefaultHandler {

        String cadena = "";
        boolean flag = false;

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            for (int i = start; i < length + start; i++) {
                cadena = cadena + ch[i];
            }

        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            if (qName.equals("serie")) {
                cadena = cadena + "-----------------------------------";
            }
        }

        @Override
        public void startElement(String uri, String localName, String etiqueta, Attributes attr) throws SAXException {
            if (etiqueta.equals("nombre")) {
                cadena = cadena + "El nombre es: ";
            } else if (etiqueta.equals("descripcion")) {
                cadena = cadena + "Descripcion: ";
            } else if (etiqueta.equals("genero")) {
                cadena = cadena + "Genero: ";
            } else if (etiqueta.equals("reparto")) {
                cadena = cadena + "Protagonistas: " + attr.getValue(attr.getQName(0)) + "\n ";
                cadena = cadena + "Co-protagonistas: " + attr.getValue(attr.getQName(1));
            } else if (etiqueta.equals("creador")) {
                cadena = cadena + "Creador: ";
            } else if (etiqueta.equals("temporadas")) {
                cadena = cadena + "Temporadas: ";
                cadena = cadena + "Episodios: " + attr.getValue(attr.getQName(0));
            } else if (etiqueta.equals("añoInicio")) {
                cadena = cadena + "Año que empezo: ";
            } else if (etiqueta.equals("añoFinalizacion") && !flag) {
                cadena = cadena + "Año que acabo: ";
                flag = true;
            } else if (etiqueta.equals("plataformaVisualicacion")) {
                if (!flag) {
                    cadena = cadena + "En trasmision \n";
                }
                cadena = cadena + "Plataforma de visualizacion: ";
                flag=false;
            }

        }
    }

}
