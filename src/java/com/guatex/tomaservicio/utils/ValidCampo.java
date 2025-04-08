/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guatex.tomaservicio.utils;

import com.guatex.tomaservicio.entidades.EValidaciones;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

/**
 *
 * @author PJUNIOR-5
 */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = EValidaciones.class)
public @interface ValidCampo {
    
    String message() default ""; //crear tipos de msm
    Class<?>[] groups() default {}; //especifica los grupos de validacion a los que pertenece la restriccion, por defecto debe ser vacia
    Class<? extends Payload>[] payload() default {}; // data que se envia y recibe
    boolean obligatorio() default false;
    int maxLength() default Integer.MAX_VALUE;
    String tagElement() default "tag";
}
