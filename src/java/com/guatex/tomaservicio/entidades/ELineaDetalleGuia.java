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
@XmlRootElement(name = "LINEA_DETALLE_GUIA")
@XmlAccessorType(XmlAccessType.FIELD)
public class ELineaDetalleGuia {
    
    @XmlElement(name = "PIEZAS_DETALLE")
    private String pieDet;
    
    @XmlElement(name = "TIPO_ENVIO_DETALLE")
    private String tipEnvDet;
    
    @XmlElement(name = "PESO_DETALLE_GUIA")
    private String pesoDet;

    public ELineaDetalleGuia() {
    }

    public ELineaDetalleGuia(String pieDet, String tipEnvDet, String pesoDet) {
        this.pieDet = pieDet;
        this.tipEnvDet = tipEnvDet;
        this.pesoDet = pesoDet;
    }

    public String getPieDet() {
        return pieDet;
    }

    public void setPieDet(String pieDet) {
        this.pieDet = pieDet;
    }

    public String getTipEnvDet() {
        return tipEnvDet;
    }

    public void setTipEnvDet(String tipEnvDet) {
        this.tipEnvDet = tipEnvDet;
    }

    public String getPesoDet() {
        return pesoDet;
    }

    public void setPesoDet(String pesoDet) {
        this.pesoDet = pesoDet;
    }  
}
