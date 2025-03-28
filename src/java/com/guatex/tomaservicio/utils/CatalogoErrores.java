/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guatex.tomaservicio.utils;

/**
 *
 * @author RGALICIA
 */
public class CatalogoErrores {

    public static String COD_OK_GEN = "0000";
    public static String COD_ERR_GEN = "9999";
    public static String DESC_TRANSOK_GEN = "Transaccion realizada exitosamente";
    public static String ERROR_TRYCATCH_DESC = "Error del sistema, contacte a Guatex";
    public static String ERROR_FALTATAG_COD = "0001";
    public static String ERROR_FALTATAG_DESC = "El campo % es requerido";
    public static String ERROR_MAXLONGITUD_COD = "0002";
    public static String ERROR_MAXLONGITUD_DESC = "El campo % debe tener como maximo $2 caracteres ";
    public static String ERROR_NOGUIARANGO_COD = "0003";
    public static String ERROR_NOGUIARANGO_DESC = "El valor del campo % no esta entre el rango permitido ";
    public static String ERROR_NOENCABEZADO_COD = "0004";
    public static String ERROR_NOENCABEZADO_DESC = "No fue posible crear el servicio solicitado, contacte a Guatex";
    public static String ERROR_NOPTOORI_COD = "0005";
    public static String ERROR_NOPTOORI_DESC = "El valor del campo % no es correcto ";
    public static String ERROR_CODCOBIN_COD = "0006";
    public static String ERROR_CODCOBIN_DESC = "El codigo de cobro indicado se encuentra inactivo ";
    public static String ERROR_CODCOBINV_COD = "0007";
    public static String ERROR_CODCOBINV_DESC = "El codigo de cobro indicado es invalido";
    public static String ERROR_CODCOBBLO_COD = "0008";
    public static String ERROR_CODCOBBLO_DESC = "El codigo de cobro indicado se encuentra bloqueado";
    public static String ERROR_PAGOCONT_COD = "0009";
    public static String ERROR_PAGOCONT_DESC = "El valor del campo pago contado seguro debe ser S o N";
    public static String ERROR_RECOFI_COD = "0010";
    public static String ERROR_RECOFI_DESC = "El valor del campo recoge oficina debe ser S o N";
    public static String ERROR_MNCPORIPTORI_COD = "0011";
    public static String ERROR_MNCPORIPTORI_DESC = "El valor del campo municipio origen y punto origen es invalido";
    public static String ERROR_MNCPDESTI_COD = "0012";
    public static String ERROR_MNCPDESTI_DESC = "El valor del campo municipio destino y punto destino es invalido";
    public static String ERROR_ESTALISTO_COD = "0013";
    public static String ERROR_ESTALISTO_DESC = "El valor del campo esta listo debe ser S o N";
    public static String ERROR_HORALISTO_COD = "0014";
    public static String ERROR_HORALISTO_DESC = "El valor del campo hora listo debe estar en un formato HH:mm valido";
    public static String ERROR_ARESMS_COD = "0015";
    public static String ERROR_ARESMS_DESC = "El valor del campo alerta recoleccion sms debe ser S o N";
    public static String ERROR_AREEMAIL_COD = "0016";
    public static String ERROR_AREEMAIL_DESC = "El valor del campo recolección debe ser S o N";
    public static String ERROR_AENSMS_COD = "0017";
    public static String ERROR_AENSMS_DESC = "El valor del campo alerta entrega sms debe ser S o N";
    public static String ERROR_AENEMAIL_COD = "0018";
    public static String ERROR_AENEMAIL_DESC = "El valor del campo alerta entrega email debe ser S o N";
    public static String ERROR_NOGUIADET_COD = "0019";
    public static String ERROR_NOGUIADET_DESC = "El numero de guia del encabezado debe ser el mismo que el del detalle";
    public static String ERROR_PIEZADET_COD = "0020";
    public static String ERROR_PIEZADET_DESC = "El valor del campo piezas debe ser mayor o igual a 1";
    public static String ERROR_TIPENVIO_COD = "0021";
    public static String ERROR_TIPENVIO_DESC = "El tipo de envio indicado es invalido";
    public static String ERROR_PESODET_COD = "0022";
    public static String ERROR_PESODET_DESC = "El peso debe ser mayor a 0";
    public static String ERROR_ERRTIPUS_COD = "0023";
    public static String ERROR_ERRTIPUS_DESC = "Tipo de usuario invalido";
    public static String ERROR_NOGUIARE_COD = "0024";
    public static String ERROR_NOGUIARE_DESC = "El numero de guia indicado ya se encuentra registrado";
    public static String ERROR_CODREMINV_COD = "0025";
    public static String ERROR_CODREMINV_DESC = "El código de remitente indicado es invalido";
    public static String ERROR_CODDESINV_COD = "0025";
    public static String ERROR_CODDESINV_DESC = "El código de destinatario indicado es invalido";

    public static String ERROR_CODORIGEN = "El código de origen es invalido";
    public static String ERROR_CODDESTINO = "El código de destino es invalido";
    public static String ERROR_DESCCOBCOD = "El codigo de cobro no es COD";
    public static String ERROR_CODCOB_COD = "0026";

    public static String ERROR_COD_DATOS = "0027";
    public static String ERROR_COD_DATOS2 = "0028";
    public static String ERROR_COD_DATOS3 = "0029";

    public static String ERROR_PES_ENVIS = "0030";
    public static String ERROR_ACTUALIZA_COD = "0031";
    public static String ERROR_ACTUALIZA_DESC = "No se logró actualizar correlativo de guía";
    public static String ERROR_UEGUIAS_COD = "0032";
    public static String ERROR_UEGUIAS_DESC = "El usuario no tiene asignado código único para generar guías";

}
