/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guatex.tomaservicio.entidades;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author RGALICIA
 */
@XmlRootElement(name = "TOMA_SERVICIO")
@XmlAccessorType(XmlAccessType.FIELD)
public class EServicio {
    
    private String tipoUsuario;
    private String nomrem;
    private String telrem;
    private String dirrem;
    private String mncpori;
    private String ptoori;
    private String estaListo;
    private String codorigen;
    
    
}
