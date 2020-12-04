/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.io.File;
import java.io.FileWriter;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import series.Series;
import series.Series.Serie;
import visual.index;

/**
 *
 * @author David
 */
public class cambiarValores {

    Series misSeries;
    String serieCambiar;

    public boolean abrirJAXB(File file) {
        try {
            JAXBContext contexto = JAXBContext.newInstance(Series.class);
            Unmarshaller u = contexto.createUnmarshaller();
            misSeries = (Series) u.unmarshal(file);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean validarSerie(String serie) {
        if (!serie.equals("")) {
            List<Series.Serie> _series = misSeries.getSerie();//Buscamos que la serie que hemos escrito existe
            for (int i = 0; i < _series.size(); i++) {

                Serie seriestemp = _series.get(i);
                if (seriestemp.getNombre().equals(serie)) {
                    serieCambiar = serie;
                    System.out.println("Si existe");
                    return true;
                }

            }
        }

        return false;
    }

    public void cambiarValores(String nombreSerie, String generoSerie, String fechaIni, String fechaFin) {

        try {
            JAXBContext contexto = JAXBContext.newInstance(Series.class);
            Marshaller marshaller = contexto.createMarshaller();
            List<Series.Serie> _series = misSeries.getSerie();

            for (int i = 0; i < _series.size(); i++) {
                if (_series.get(i).getNombre().equals(serieCambiar)) {
                    System.out.println(nombreSerie);
                    if (!nombreSerie.equals("")) {
                        _series.get(i).setNombre(nombreSerie);
                    }
                    if (!generoSerie.equals("")) {
                        _series.get(i).setGenero(generoSerie);
                    }
                    if (!fechaIni.equals("")) {
                        _series.get(i).setFechaInicio(fechaIni);
                    }
                    if (!fechaFin.equals("")) {
                        _series.get(i).setFechaFinalizacion(fechaFin);
                    }
                }
            }
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(misSeries, new FileWriter(new File("series.xml")));
        } catch (Exception e) {
        }
    }
}
