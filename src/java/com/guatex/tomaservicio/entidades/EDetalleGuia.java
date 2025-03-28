/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guatex.tomaservicio.entidades;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PJUNIOR-5
 */
@XmlRootElement(name = "DETALLE_GUIA")
@XmlAccessorType(XmlAccessType.FIELD)
public class EDetalleGuia {
    
    @XmlElement(name = "LINEA_DETALLE_GUIA")
    private  ELineaDetalleGuia linDetGuia;

    public EDetalleGuia() {
    }

    public EDetalleGuia(ELineaDetalleGuia linDetGuia) {
        this.linDetGuia = linDetGuia;
    }

    public ELineaDetalleGuia getLinDetGuia() {
        return linDetGuia;
    }

    public void setLinDetGuia(ELineaDetalleGuia linDetGuia) {
        this.linDetGuia = linDetGuia;
    }
}
