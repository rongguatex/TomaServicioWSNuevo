/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guatex.tomaservicio.entidadesrespuesta;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author RGALICIA
 */
@XmlRootElement(name = "SERVICIO")
@XmlAccessorType(XmlAccessType.FIELD)
public class Servicio {

    @XmlElement(name = "CODIGO")
    private String codigo;
    @XmlElement(name = "URLGUIAS")
    private String urlGuias;
    @XmlElement(name = "GUIAS")
    private Guias guias;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getUrlGuias() {
        return urlGuias;
    }

    public void setUrlGuias(String urlGuias) {
        this.urlGuias = urlGuias;
    }

    public Guias getGuias() {
        return guias;
    }

    public void setGuias(Guias guias) {
        this.guias = guias;
    }

    @Override
    public String toString() {
        return "Servicio{" + "codigo=" + codigo + ", urlGuias=" + urlGuias + ", guias=" + guias + '}';
    }

}
