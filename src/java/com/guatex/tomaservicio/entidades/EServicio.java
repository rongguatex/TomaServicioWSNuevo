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
 * @author RGALICIA
 */
@XmlRootElement(name = "SERVICIO")
@XmlAccessorType(XmlAccessType.FIELD)
public class EServicio {

    @NotNull(message = "El campo es obligatorio. Ingresar el tipo de usuario.")
    @Size(max = 1, message = "El tipo de usuario ingresado no existe y sobrepasa el caracter esperado. Verificar el dato ingresado,.")
    @XmlElement(name = "TIPO_USUARIO")
    private String tipoUsuario;

    @Size(max = 100, message = "El nombre del remitente sobrepasa los 100 caracteres.")
    @XmlElement(name = "NOMBRE_REMITENTE")
    private String nomrem;

    @Size(max = 20, message = "El teléfono del remitente sobrepasa los 20 caracteres.")
    @XmlElement(name = "TELEFONO_REMITENTE")
    private String telrem;

    @Size(max = 100, message = "La dirección del remitente sobrepasa los 100 caracteres.")
    @XmlElement(name = "DIRECCION_REMITENTE")
    private String dirrem;

    @Size(max = 50, message = "El municipio de origen sobrepasa los 50 caracteres.")
    @XmlElement(name = "MUNICIPIO_ORIGEN")
    private String mncpori;

    @Size(max = 10, message = "El punto de origen sobrepasa los 10 caracteres.")
    @XmlElement(name = "PUNTO_ORIGEN")
    private String ptoori;

    @Size(max = 1, message = "El campo esta listo sobrepasa el caracter esperado.")
    @XmlElement(name = "ESTA_LISTO")
    private String estaListo;

    @NotNull(message = "El campo es obligatorio. Ingresar el código de origen.")
    @Size(max = 10, message = "El código de origen sobrepasa los 10 caracteres.")
    @XmlElement(name = "CODORIGEN")
    private String codorigen;

    @NotNull(message = "El xml enviado viene incompleto. La guía no contiene información.")
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
