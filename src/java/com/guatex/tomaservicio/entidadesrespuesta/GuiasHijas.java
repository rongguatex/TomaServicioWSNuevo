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
@XmlRootElement(name = "GUIAS_HIJAS")
@XmlAccessorType(XmlAccessType.FIELD)
public class GuiasHijas {
    
    @XmlElement(name = "HGUIAHIJA")
    private String hGuiaHija;

    public String gethGuiaHija() {
        return hGuiaHija;
    }

    public void sethGuiaHija(String hGuiaHija) {
        this.hGuiaHija = hGuiaHija;
    }

    @Override
    public String toString() {
        return "GuiasHijas{" + "hGuiaHija=" + hGuiaHija + '}';
    }
}
