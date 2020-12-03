//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantacin de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder si se vuelve a compilar el esquema de origen. 
// Generado el: PM.12.03 a las 05:39:11 PM CET 
//


package series;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serie" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="genero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="reparto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="creador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="temporadas">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="episodios" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="fechaInicio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="fechaFinalizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="plataformaVisualicacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "serie"
})
@XmlRootElement(name = "Series")
public class Series {

    protected List<Series.Serie> serie;

    /**
     * Gets the value of the serie property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serie property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSerie().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Series.Serie }
     * 
     * 
     */
    public List<Series.Serie> getSerie() {
        if (serie == null) {
            serie = new ArrayList<Series.Serie>();
        }
        return this.serie;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="genero" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="reparto" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="creador" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="temporadas">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="episodios" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="fechaInicio" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="fechaFinalizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="plataformaVisualicacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "nombre",
        "genero",
        "reparto",
        "creador",
        "temporadas",
        "fechaInicio",
        "fechaFinalizacion",
        "plataformaVisualicacion"
    })
    public static class Serie {

        @XmlElement(required = true)
        protected String nombre;
        @XmlElement(required = true)
        protected String genero;
        @XmlElement(required = true)
        protected String reparto;
        @XmlElement(required = true)
        protected String creador;
        @XmlElement(required = true)
        protected Series.Serie.Temporadas temporadas;
        @XmlElement(required = true)
        protected String fechaInicio;
        protected String fechaFinalizacion;
        @XmlElement(required = true)
        protected String plataformaVisualicacion;

        /**
         * Obtiene el valor de la propiedad nombre.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombre() {
            return nombre;
        }

        /**
         * Define el valor de la propiedad nombre.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombre(String value) {
            this.nombre = value;
        }

        /**
         * Obtiene el valor de la propiedad genero.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGenero() {
            return genero;
        }

        /**
         * Define el valor de la propiedad genero.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGenero(String value) {
            this.genero = value;
        }

        /**
         * Obtiene el valor de la propiedad reparto.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReparto() {
            return reparto;
        }

        /**
         * Define el valor de la propiedad reparto.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReparto(String value) {
            this.reparto = value;
        }

        /**
         * Obtiene el valor de la propiedad creador.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreador() {
            return creador;
        }

        /**
         * Define el valor de la propiedad creador.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreador(String value) {
            this.creador = value;
        }

        /**
         * Obtiene el valor de la propiedad temporadas.
         * 
         * @return
         *     possible object is
         *     {@link Series.Serie.Temporadas }
         *     
         */
        public Series.Serie.Temporadas getTemporadas() {
            return temporadas;
        }

        /**
         * Define el valor de la propiedad temporadas.
         * 
         * @param value
         *     allowed object is
         *     {@link Series.Serie.Temporadas }
         *     
         */
        public void setTemporadas(Series.Serie.Temporadas value) {
            this.temporadas = value;
        }

        /**
         * Obtiene el valor de la propiedad fechaInicio.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFechaInicio() {
            return fechaInicio;
        }

        /**
         * Define el valor de la propiedad fechaInicio.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFechaInicio(String value) {
            this.fechaInicio = value;
        }

        /**
         * Obtiene el valor de la propiedad fechaFinalizacion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFechaFinalizacion() {
            return fechaFinalizacion;
        }

        /**
         * Define el valor de la propiedad fechaFinalizacion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFechaFinalizacion(String value) {
            this.fechaFinalizacion = value;
        }

        /**
         * Obtiene el valor de la propiedad plataformaVisualicacion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlataformaVisualicacion() {
            return plataformaVisualicacion;
        }

        /**
         * Define el valor de la propiedad plataformaVisualicacion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlataformaVisualicacion(String value) {
            this.plataformaVisualicacion = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="episodios" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Temporadas {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "episodios")
            protected String episodios;

            /**
             * Obtiene el valor de la propiedad value.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Define el valor de la propiedad value.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Obtiene el valor de la propiedad episodios.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEpisodios() {
                return episodios;
            }

            /**
             * Define el valor de la propiedad episodios.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEpisodios(String value) {
                this.episodios = value;
            }

        }

    }

}
