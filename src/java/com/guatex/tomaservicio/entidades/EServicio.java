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
}
