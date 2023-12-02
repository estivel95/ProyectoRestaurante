/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Restaurante.login;

/**
 *
 * @author Usuario
 */
public class Administrador extends Persona{
    
    ////////////////////////////////////////atributos
    private String username;
    private String password;
    
    /////////////////////////////////metodo constructor
    public Administrador(){
        
    }

    public Administrador(String username, String password, String nombre, String documento, String telefono, String direccion) {
        super(nombre, documento, telefono, direccion);
        this.username = username;
        this.password = password;
    }
    
    
    /////////////////////////////////////////////metodos de acceso
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
