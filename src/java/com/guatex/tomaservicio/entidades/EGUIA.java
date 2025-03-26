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
@XmlRootElement(name = "GUIA")
@XmlAccessorType(XmlAccessType.FIELD)
public class EGUIA {
    @XmlElement(name = "LLAVE_CLIENTE")
    private String llaveCliente;
    @XmlElement(name = "COD_VALORACOBRAR")
    private String codVal;
    @XmlElement(name = "SEABREPAQUETE")
    private String seAbre;
    @XmlElement(name = "CODIGO_COBRO_GUIA")
    private String codCob;
    @XmlElement(name = "NOMBRE_DESTINATARIO")
    private String nomDes;
    @XmlElement(name = "TELEFONO_DESTINATARIO")
    private String telDes;
    @XmlElement(name = "DIRECCION_DESTINATARIO")
    private String dirDes;
    @XmlElement(name = "MUNICIPIO_DESTINO")
    private String mncpDes;
    @XmlElement(name = "PUNTO_DESTINO")
    private String ptoDes;
    @XmlElement(name = "DESCRIPCION_ENVIO")
    private String desEnv;
    @XmlElement(name = "RECOGE_OFICINA")
    private String recogeOfi;
    @XmlElement(name = "CODDESTINO")
    private String codDestino;
}
