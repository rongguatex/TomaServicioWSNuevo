/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guatex.tomaservicio.entidades;

import javax.validation.constraints.*;
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

    @NotNull(message = "El campo es obligatorio. Ingresar el detalle de las piezas.")
    @Size(max = 5, message = "El detalle de las piezas sobrepasa los 5 caracteres.")
    @XmlElement(name = "PIEZAS_DETALLE")
    private String pieDet;

    @NotNull(message = "El campo es obligatorio. Ingresar el detalle de tipo de envío.")
    @Size(max = 10, message = "El detalle del tipo de envío sobrepasa los 10 caracteres.")
    @XmlElement(name = "TIPO_ENVIO_DETALLE")
    private String tipEnvDet;

    @NotNull(message = "El campo es obligatorio. Ingresar el detalle del peso.")
    @Size(max = 8, message = "El detalle del peso sobrepasa los 8 caracteres.")
    @XmlElement(name = "PESO_DETALLE")
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

    @Override
    public String toString() {
        return "ELineaDetalleGuia{" + "pieDet=" + pieDet + ", tipEnvDet=" + tipEnvDet + ", pesoDet=" + pesoDet + '}';
    }

}
