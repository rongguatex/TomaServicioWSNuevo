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
public class Util {

    /**
     * Método para validación de datos nulos, devuelve una cadena vacia si el
     * dato es nulo.
     *
     * @param valor cualquier valor de tipo cadena.
     * @return valor sin espacios en blanco a los costados.
     */
    public static String quitaNulo(String valor) {
        return valor == null ? "" : valor.trim();
    }

}
