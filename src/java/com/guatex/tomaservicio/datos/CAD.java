/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guatex.tomaservicio.datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author PJUNIOR-5
 */
public class CAD {
    private static final String USER = "operaciones";
    private static final String PSWRD = "gtxgtx01";
    private static final String URL = "jdbc:sqlserver://192.168.14.224";
    
    public Connection Conexion() throws ClassNotFoundException{
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(USER, PSWRD, URL);
            System.out.println("Conexi[on exitosa.");
            return con;
        }catch(ClassNotFoundException | SQLException ex){
            ex.printStackTrace();
        }
        return null;
    } 
}
