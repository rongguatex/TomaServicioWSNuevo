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
@XmlRootElement(name = "TOMA_SERVICIO")
@XmlAccessorType(XmlAccessType.FIELD)
public class ETomaServicio {

    @Size(max = 10, message = "El código de cobro sobrepasa los 10 caracteres.")
    @XmlElement(name = "CODIGO_COBRO")
    private String padre;

    @NotNull(message = "El campo es obligatorio. Ingresar el usuario.")
    @Size(max = 50, message = "El campo de usuario sobrepasa los 50 caracteres.")
    @XmlElement(name = "USUARIO")
    private String usuario;

    @NotNull(message = "El campo es obligatorio. Ingresar la contraseña.")
    @Size(max = 10, message = "La contraseña sobrepasa los 10 caracteres.")
    @XmlElement(name = "PASSWORD")
    private String password;

    @NotNull(message = "El xml enviado viene incompleto. El servicio no puede ser null.")
    @XmlElement(name = "SERVICIO")
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
