/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Restaurante.models;

/**
 *
 * @author Usuario
 */
public class PlatoInternacional extends Plato{
    
    /////////////////////////atributo
    private String paisOrigen;
    
    ///////////////////////////////constructor

    public PlatoInternacional(String paisOrigen, int id, String nombre, double costoDeFabricacion, String descripcion) {
        super(id, nombre, costoDeFabricacion, descripcion);
        this.paisOrigen = paisOrigen;
    }
    
    ///////////////////////////metodo de acceso

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    
    @Override
    public double calcularGanancia() {
        return getCostoFabricacion() * 0.30;
    }
}

