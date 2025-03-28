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
    
   @XmlElement(name = "DETALLE_GUIA")
   private EDetalleGuia detGuia;
   
   @XmlElement(name = "OBSERVACIONES_ENTREGA")
   private String observaciones;
   
   @XmlElement(name = "IMPRIME_GUIA")
   private String impGuia;
   
   @XmlElement(name = "CAMPO1")
   private String campo1;
   
   @XmlElement(name = "CAMPO2")
   private String campo2;
   
   @XmlElement(name = "CAMPO3")
   private String campo3;
   
   @XmlElement(name = "CAMPO4")
   private String campo4;

    public EGUIA() {
    }

    public EGUIA(String llaveCliente, String codVal, String seAbre, String codCob, String nomDes, String telDes, String dirDes, String mncpDes, String ptoDes, String desEnv, String recogeOfi, String codDestino, String observaciones, String impGuia, String campo1, String campo2, String campo3, String campo4) {
        this.llaveCliente = llaveCliente;
        this.codVal = codVal;
        this.seAbre = seAbre;
        this.codCob = codCob;
        this.nomDes = nomDes;
        this.telDes = telDes;
        this.dirDes = dirDes;
        this.mncpDes = mncpDes;
        this.ptoDes = ptoDes;
        this.desEnv = desEnv;
        this.recogeOfi = recogeOfi;
        this.codDestino = codDestino;
        this.observaciones = observaciones;
        this.impGuia = impGuia;
        this.campo1 = campo1;
        this.campo2 = campo2;
        this.campo3 = campo3;
        this.campo4 = campo4;
    }

    public EGUIA(String llaveCliente, String codVal, String seAbre, String codCob, String nomDes, String telDes, String dirDes, String mncpDes, String ptoDes, String desEnv, String recogeOfi, String codDestino, EDetalleGuia detGuia, String observaciones, String impGuia, String campo1, String campo2, String campo3, String campo4) {
        this.llaveCliente = llaveCliente;
        this.codVal = codVal;
        this.seAbre = seAbre;
        this.codCob = codCob;
        this.nomDes = nomDes;
        this.telDes = telDes;
        this.dirDes = dirDes;
        this.mncpDes = mncpDes;
        this.ptoDes = ptoDes;
        this.desEnv = desEnv;
        this.recogeOfi = recogeOfi;
        this.codDestino = codDestino;
        this.detGuia = detGuia;
        this.observaciones = observaciones;
        this.impGuia = impGuia;
        this.campo1 = campo1;
        this.campo2 = campo2;
        this.campo3 = campo3;
        this.campo4 = campo4;
    }

    public String getLlaveCliente() {
        return llaveCliente;
    }

    public void setLlaveCliente(String llaveCliente) {
        this.llaveCliente = llaveCliente;
    }

    public String getCodVal() {
        return codVal;
    }

    public void setCodVal(String codVal) {
        this.codVal = codVal;
    }

    public String getSeAbre() {
        return seAbre;
    }

    public void setSeAbre(String seAbre) {
        this.seAbre = seAbre;
    }

    public String getCodCob() {
        return codCob;
    }

    public void setCodCob(String codCob) {
        this.codCob = codCob;
    }

    public String getNomDes() {
        return nomDes;
    }

    public void setNomDes(String nomDes) {
        this.nomDes = nomDes;
    }

    public String getTelDes() {
        return telDes;
    }

    public void setTelDes(String telDes) {
        this.telDes = telDes;
    }

    public String getDirDes() {
        return dirDes;
    }

    public void setDirDes(String dirDes) {
        this.dirDes = dirDes;
    }

    public String getMncpDes() {
        return mncpDes;
    }

    public void setMncpDes(String mncpDes) {
        this.mncpDes = mncpDes;
    }

    public String getPtoDes() {
        return ptoDes;
    }

    public void setPtoDes(String ptoDes) {
        this.ptoDes = ptoDes;
    }

    public String getDesEnv() {
        return desEnv;
    }

    public void setDesEnv(String desEnv) {
        this.desEnv = desEnv;
    }

    public String getRecogeOfi() {
        return recogeOfi;
    }

    public void setRecogeOfi(String recogeOfi) {
        this.recogeOfi = recogeOfi;
    }

    public String getCodDestino() {
        return codDestino;
    }

    public void setCodDestino(String codDestino) {
        this.codDestino = codDestino;
    }

    public EDetalleGuia getDetGuia() {
        return detGuia;
    }

    public void setDetGuia(EDetalleGuia detGuia) {
        this.detGuia = detGuia;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getImpGuia() {
        return impGuia;
    }

    public void setImpGuia(String impGuia) {
        this.impGuia = impGuia;
    }

    public String getCampo1() {
        return campo1;
    }

    public void setCampo1(String campo1) {
        this.campo1 = campo1;
    }

    public String getCampo2() {
        return campo2;
    }

    public void setCampo2(String campo2) {
        this.campo2 = campo2;
    }

    public String getCampo3() {
        return campo3;
    }

    public void setCampo3(String campo3) {
        this.campo3 = campo3;
    }

    public String getCampo4() {
        return campo4;
    }

    public void setCampo4(String campo4) {
        this.campo4 = campo4;
    }

    @Override
    public String toString() {
        return "EGUIA{" + "llaveCliente=" + llaveCliente + ", codVal=" + codVal + ", seAbre=" + seAbre + ", codCob=" + codCob + ", nomDes=" + nomDes + ", telDes=" + telDes + ", dirDes=" + dirDes + ", mncpDes=" + mncpDes + ", ptoDes=" + ptoDes + ", desEnv=" + desEnv + ", recogeOfi=" + recogeOfi + ", codDestino=" + codDestino + ", detGuia=" + detGuia + ", observaciones=" + observaciones + ", impGuia=" + impGuia + ", campo1=" + campo1 + ", campo2=" + campo2 + ", campo3=" + campo3 + ", campo4=" + campo4 + '}';
    }
    
}
