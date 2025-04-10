/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guatex.tomaservicio.entidades;


import com.guatex.tomaservicio.utils.ValidCampo;
import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author RGALICIA
 */
@XmlRootElement(name = "TOMA_SERVICIO")
@XmlAccessorType(XmlAccessType.FIELD)
public class ETomaServicio {

    @ValidCampo(maxLength = 10, tagElement = "CODIGO_COBRO")
    @XmlElement(name = "CODIGO_COBRO")
    private String padre;

    @ValidCampo(obligatorio = true, maxLength = 50, tagElement = "USUARIO")
    @XmlElement(name = "USUARIO")
    private String usuario;

    @ValidCampo(obligatorio = true, maxLength = 10, tagElement = "PASSWORD")
    @XmlElement(name = "PASSWORD")
    private String password;

    @ValidCampo(obligatorio = true)
    @XmlElement(name = "SERVICIO")
    @Valid //que valide guia que se encuentra dentro de servicio
    private EServicio servicio;

    public ETomaServicio() {

    }

    public ETomaServicio(String padre, String usuario, String password) {
        this.padre = padre;
        this.usuario = usuario;
        this.password = password;
    }

    public ETomaServicio(String padre, String usuario, String password, EServicio servicio) {
        this.padre = padre;
        this.usuario = usuario;
        this.password = password;
        this.servicio = servicio;
    }

    public String getPadre() {
        return padre;
    }

    public void setPadre(String padre) {
        this.padre = padre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public EServicio getServicio() {
        return servicio;
    }

    public void setServicio(EServicio servicio) {
        this.servicio = servicio;
    }

    @Override
    public String toString() {
        return "ETomaServicio{" + "padre=" + padre + ", usuario=" + usuario + ", password=" + password + ", servicio=" + servicio + '}';
    }

}
