/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Restaurante.models;

/**
 *
 * @author Usuario
 */
public class PlatoNacionaloTipico extends Plato{

    public PlatoNacionaloTipico(String nombre, double costoFabricacion) {
        super(nombre, costoFabricacion);
    }
    
    @Override
    public double calcularGanancia() {
        return getCostoFabricacion() * 0.25;
    }

}
