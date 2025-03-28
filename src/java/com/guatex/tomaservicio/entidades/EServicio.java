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
 * @author RGALICIA
 */
@XmlRootElement(name = "SERVICIO")
@XmlAccessorType(XmlAccessType.FIELD)
public class EServicio {

    @XmlElement(name = "TIPO_USUARIO")
    private String tipoUsuario;

    @XmlElement(name = "NOMBRE_REMITENTE")
    private String nomrem;

    @XmlElement(name = "TELEFONO_REMITENTE")
    private String telrem;

    @XmlElement(name = "DIRECCION_REMITENTE")
    private String dirrem;

    @XmlElement(name = "MUNICIPIO_ORIGEN")
    private String mncpori;

    @XmlElement(name = "PUNTO_ORIGEN")
    private String ptoori;

    @XmlElement(name = "ESTA_LISTO")
    private String estaListo;

    @XmlElement(name = "CODORIGEN")
    private String codorigen;

    @XmlElement(name = "GUIA")
    private EGUIA EGUIA;

    public EServicio() {
    }

    public EServicio(String tipoUsuario, String nomrem, String telrem, String dirrem, String mncpori, String ptoori, String estaListo, String codorigen) {
        this.tipoUsuario = tipoUsuario;
        this.nomrem = nomrem;
        this.telrem = telrem;
        this.dirrem = dirrem;
        this.mncpori = mncpori;
        this.ptoori = ptoori;
        this.estaListo = estaListo;
        this.codorigen = codorigen;
    }

    public EServicio(String tipoUsuario, String nomrem, String telrem, String dirrem, String mncpori, String ptoori, String estaListo, String codorigen, EGUIA EGUIA) {
        this.tipoUsuario = tipoUsuario;
        this.nomrem = nomrem;
        this.telrem = telrem;
        this.dirrem = dirrem;
        this.mncpori = mncpori;
        this.ptoori = ptoori;
        this.estaListo = estaListo;
        this.codorigen = codorigen;
        this.EGUIA = EGUIA;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getNomrem() {
        return nomrem;
    }

    public void setNomrem(String nomrem) {
        this.nomrem = nomrem;
    }

    public String getTelrem() {
        return telrem;
    }

    public void setTelrem(String telrem) {
        this.telrem = telrem;
    }

    public String getDirrem() {
        return dirrem;
    }

    public void setDirrem(String dirrem) {
        this.dirrem = dirrem;
    }

    public String getMncpori() {
        return mncpori;
    }

    public void setMncpori(String mncpori) {
        this.mncpori = mncpori;
    }

    public String getPtoori() {
        return ptoori;
    }

    public void setPtoori(String ptoori) {
        this.ptoori = ptoori;
    }

    public String getEstaListo() {
        return estaListo;
    }

    public void setEstaListo(String estaListo) {
        this.estaListo = estaListo;
    }

    public String getCodorigen() {
        return codorigen;
    }

    public void setCodorigen(String codorigen) {
        this.codorigen = codorigen;
    }

    public EGUIA getEGUIA() {
        return EGUIA;
    }

    public void setEGUIA(EGUIA EGUIA) {
        this.EGUIA = EGUIA;
    }

    @Override
    public String toString() {
        return "EServicio{" + "tipoUsuario=" + tipoUsuario + ", nomrem=" + nomrem + ", telrem=" + telrem + ", dirrem=" + dirrem + ", mncpori=" + mncpori + ", ptoori=" + ptoori + ", estaListo=" + estaListo + ", codorigen=" + codorigen + ", EGUIA=" + EGUIA + '}';
    }

}
