/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guatex.tomaservicio.utils;

import com.guatex.tomaservicio.entidadesrespuesta.Error;
import com.guatex.tomaservicio.entidadesrespuesta.Respuesta;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

/**
 *
 * @author RGALICIA
 */
public class Validador {

         private static final  ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
         private static final Validator validator = factory.getValidator();
         
        public static <T> String validar(T datos) {

        //ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        //Validator validator = factory.getValidator();

        Set<ConstraintViolation<T>> violations = validator.validate(datos);

        if (violations.isEmpty()) {
            return null;
        }

        Respuesta respuesta = new Respuesta();
        Error error = new Error();
        for (ConstraintViolation<T> violation : violations) {
            error.setDescripcion(violation.getMessage());
        }
        respuesta.setError(error);
        return new ParseadorXML().parseoObj(respuesta, Respuesta.class, Error.class);
    }
}
