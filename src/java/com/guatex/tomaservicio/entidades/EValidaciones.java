/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guatex.tomaservicio.entidades;

import com.guatex.tomaservicio.utils.CatalogoErrores;
import com.guatex.tomaservicio.utils.ValidCampo;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author PJUNIOR-5
 */
public class EValidaciones implements ConstraintValidator<ValidCampo, Object> {

    private String tagElement;
    private boolean padre;
    private String nombrePadre;
    private boolean obligatorio;
    private int maxLength;
    private String mensaje; //msm personalizado por c/u

    @Override
    public void initialize(ValidCampo constraintAnnotation) {
        this.obligatorio = constraintAnnotation.obligatorio();
        this.maxLength = constraintAnnotation.maxLength();
        this.tagElement = constraintAnnotation.message();
    }

    @Override
    public boolean isValid(Object valor, ConstraintValidatorContext context) {

        if (obligatorio && (valor == null || valor.toString().isEmpty())) {//si se tiene la restriccion pero es falsa o se encuntra vacio
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("El campo es obligatorio.").addConstraintViolation();
            return false;
        }

        if (valor != null) {
            String stringValue = valor.toString();
            if (stringValue.length() > maxLength) {
                context.disableDefaultConstraintViolation();
                context.buildConstraintViolationWithTemplate("El valor ingresado  en" + tagElement+ "sobrepasa la cantidad maxima de " + maxLength+ " caracteres permitidos.").addConstraintViolation();
                return false;
            }
        }
        return true;
    }

    public boolean campoObligatorio(Object valor) {
        return !(obligatorio && valor == null);
    }

    public void longitud(Object valor) {
        if (valor != null) {
            String stringValue = valor.toString();
            if (stringValue.length() > maxLength) {
                System.out.println("El valor ingresado sobrepasa la cantidad de caracteres establecidos.");
            }
        } else {
            System.out.println("No se ha establecido ningún límite máximo de caracteres.");
        }
    }
}
