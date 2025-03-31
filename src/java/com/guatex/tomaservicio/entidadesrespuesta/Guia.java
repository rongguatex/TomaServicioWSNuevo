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
 * @author PJUNIOR-5
 */
@XmlRootElement(name = "GUIA")
@XmlAccessorType(XmlAccessType.FIELD)
public class Guia {
    
    @XmlElement(name = "ID_GUIA")
    private String idGuia;
    @XmlElement(name = "NOGUIA")
    private String numGuia;
    @XmlElement(name = "GUIAS_HIJAS")
    private GuiasHijas guiasHijas;

    public String getIdGuia() {
        return idGuia;
    }

    public void setIdGuia(String idGuia) {
        this.idGuia = idGuia;
    }

    public String getNumGuia() {
        return numGuia;
    }

    public void setNumGuia(String numGuia) {
        this.numGuia = numGuia;
    }

    public GuiasHijas getGuiasHijas() {
        return guiasHijas;
    }

    public void setGuiasHijas(GuiasHijas guiasHijas) {
        this.guiasHijas = guiasHijas;
    }

    @Override
    public String toString() {
        return "Guia{" + "idGuia=" + idGuia + ", numGuia=" + numGuia + ", guiasHijas=" + guiasHijas + '}';
    }
}
