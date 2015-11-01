/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * computadora
 */
package com.cf.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Edwin
 */
public class conexion {

    private String user;
    private String pass;
    private String host;
    private String puerto;
    private String squema;
    private String cadenaConexion;
    private String driver;
    private Connection connection = null;
    private ResultSet dam = null;
    private PreparedStatement stmt;
    private boolean conectado = false;

    public conexion() {
        

    }

    public void conectar() throws Exception {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://" + getHost() + ":" + getPuerto() + "/" + getSquema(), getUser(), getPass());
            if (connection != null) {
                this.conectado = true;
            }

        } catch (Exception e) {
           throw  e;
        }

    }

    public ResultSet ExecuteQuery(String query) {
        try {
            if (query != null && query != "" && conectado) {
               this.connection.createStatement();
                this.dam =stmt.executeQuery(query);
            }

        } catch (Exception e) {

        }

        return dam;

    }

    public void cerrarConexion() {
        try {
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setPass(char[] pass) {
        this.pass = String.valueOf(pass);
    }
    
    
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public String getSquema() {
        return squema;
    }

    public void setSquema(String squema) {
        this.squema = squema;
    }

    public boolean conectado() {
        return conectado;
    }

}
