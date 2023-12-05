/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Restaurante.models;

/**
 *
 * @author Usuario
 */
public class PlatoInternacional {
    
    /////////////////////////atributo
    private String paisOrigen;
    
    ///////////////////////////////constructor
    public PlatoInternacional(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    
    //////////////////////////////////////////metodo de acceso

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
}
