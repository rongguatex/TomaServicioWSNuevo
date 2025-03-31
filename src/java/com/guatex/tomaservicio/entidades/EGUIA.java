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
 * @author PJUNIOR-5
 */
@XmlRootElement(name = "GUIA")
@XmlAccessorType(XmlAccessType.FIELD)
public class EGUIA {
    
    @Size(max = 200, message = "La llave del clien te sobrepasa los 200 caracteres.")
    @XmlElement(name = "LLAVE_CLIENTE")
    private String llaveCliente;
    
    @Size(max = 15, message = "El codigo de valor a cobrar sobrepasa los 15 caracteres.")
    @XmlElement(name = "COD_VALORACOBRAR")
    private String codVal;
    
    @Size(max = 1, message = "El campo se abre paquete únicamente acepta los valores S(si) / N(no). ")
    @XmlElement(name = "SEABREPAQUETE")
    private String seAbre;
    
    @NotNull(message = "El campo es obligatorio. Ingresar el código de guía.")
    @Size(max = 10, message = "El código de cobro de la guía sobrepasa los 10 caracteres.")
    @XmlElement(name = "CODIGO_COBRO_GUIA")
    private String codCob;
    
    @Size(max = 100, message = "El nombre de destinatario sobrepasa los 100 caracteres.")
    @XmlElement(name = "NOMBRE_DESTINATARIO")
    private String nomDes;
    
    @Size(max = 20, message = "El Telefóno del destinatario sobrepasa los 20 caracteres.")
    @XmlElement(name = "TELEFONO_DESTINATARIO")
    private String telDes;
    
    @Size(max = 100, message = "La dirección del destinatario sobrepasa los 100 caracteres.")
    @XmlElement(name = "DIRECCION_DESTINATARIO")
    private String dirDes;
    
    @Size(max = 50, message = "El municipio de destino sobrepasa los 50 caracteres.")
    @XmlElement(name = "MUNICIPIO_DESTINO")
    private String mncpDes;
    
    @Size(max = 10, message = "El punto de destino, sobrepasa los 10 caracteres.")
    @XmlElement(name = "PUNTO_DESTINO")
    private String ptoDes;
    
    @Size(max = 100, message = "La descripción de envío sobrepass los 100 caracteres")
    @XmlElement(name = "DESCRIPCION_ENVIO")
    private String desEnv;
    
    @Size(max = 1, message = "El campo de recoge en oficina únicamente acepta los valores S(si) / N(no). ")
    @XmlElement(name = "RECOGE_OFICINA")
    private String recogeOfi;
    
    @NotNull(message = "El campo es obligatorio. Ingresar el código de destino.")
    @Size(max = 10, message = "El código de destino sobrepasa los 10 caracteres.")
    @XmlElement(name = "CODDESTINO")
    private String codDestino;
   
   @NotNull(message = "El xml enviado viene incompleto. El detalle de la guía no contiene información.")
   @XmlElement(name = "DETALLE_GUIA")
   private EDetalleGuia detGuia;
   
   @Size(max = 100, message = "Las observaciones de la entrega sobrepasa los 100 caracteres.")
   @XmlElement(name = "OBSERVACIONES_ENTREGA")
   private String observaciones;
   
   @Size(max = 1, message = "El campo de impresión de guía únicamente acepta los valores S(si) / N(no).")
   @XmlElement(name = "IMPRIME_GUIA")
   private String impGuia;
   
   @Size(max = 200, message = "El campo 1 sobrepasa los 200 caracteres. ")
   @XmlElement(name = "CAMPO1")
   private String campo1;
   
   @Size(max = 200, message = "El campo 1 sobrepasa los 200 caracteres. ")
   @XmlElement(name = "CAMPO2")
   private String campo2;
   
   @Size(max = 200, message = "El campo 1 sobrepasa los 200 caracteres. ")
   @XmlElement(name = "CAMPO3")
   private String campo3;
   
   @Size(max = 200, message = "El campo 1 sobrepasa los 200 caracteres. ")
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
