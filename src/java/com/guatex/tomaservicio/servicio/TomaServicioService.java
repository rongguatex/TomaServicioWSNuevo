/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guatex.tomaservicio.servicio;

import com.guatex.tomaservicio.entidades.ETomaServicio;
import com.guatex.tomaservicio.entidadesrespuesta.Respuesta;
import com.guatex.tomaservicio.utils.ParseadorXML;
import com.guatex.tomaservicio.utils.Util;
import com.guatex.tomaservicio.utils.Validador;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author RGALICIA
 */
@WebService(serviceName = "TomaServicioService")
public class TomaServicioService {

    /**
     * Método para realizar el proceso de toma de servicio.
     *
     * @param xml
     * @return
     */
    @WebMethod(operationName = "TomaServicio")
    public String TomaServicio(@WebParam(name = "xml") String xml) {
        if (Util.quitaNulo(xml).isEmpty()) {
            Respuesta respuesta = new Respuesta();
            respuesta.setError(new com.guatex.tomaservicio.entidadesrespuesta.Error("El xml enviado está vacío."));
            return new ParseadorXML().parseoObj(respuesta, Respuesta.class);
        }
        
        ETomaServicio datos = (ETomaServicio) new ParseadorXML().parseoXML(xml, ETomaServicio.class);
        String error = Validador.validar(datos);
        
        if (error != null) {
            return error; 
        }
        
        System.out.println(datos.toString());
        
        return "Todo bien!!!";
    }
    
}
