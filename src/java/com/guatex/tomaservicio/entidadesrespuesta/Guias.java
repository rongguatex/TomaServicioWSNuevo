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
@XmlRootElement(name = "GUIAS")
@XmlAccessorType(XmlAccessType.FIELD)
public class Guias {
    
    @XmlElement(name = "GUIA")
    private Guia guia;

    public Guia getGuia() {
        return guia;
    }

    public void setGuia(Guia guia) {
        this.guia = guia;
    }

    @Override
    public String toString() {
        return "Guias{" + "guia=" + guia + '}';
    }
}
