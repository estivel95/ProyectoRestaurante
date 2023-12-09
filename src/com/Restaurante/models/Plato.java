/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Restaurante.models;

/**
 *
 * @author Usuario
 */
public abstract class Plato {
    
    ///////////////////////////////////////////////////////////
    private static int contadorPlato =1;
    
    ////////////////////////////atributos
    private long id;
    private String nombre;
    private double precioVenta;
    private double costoFabricacion;

    
    //////////////////////////////constructores

    public Plato( String nombre, double costoFabricacion) {
        this.id = Plato.contadorPlato;
        this.nombre = nombre;
        this.costoFabricacion = costoFabricacion;
        this.precioVenta = calcularPrecioVenta(); 
        contadorPlato++;
    }
    
    //////////////////////////////////////metodo de acceso
    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getCostoFabricacion() {
        return costoFabricacion;
    }

    public void setCostoFabricacion(double costoDeFabricacion) {
        this.costoFabricacion = costoDeFabricacion;
    }
    
    public abstract double calcularGanancia();
    
    private long calcularPrecioVenta(){
        double ganancia = calcularGanancia();
        double precioVentaSinIVA = costoFabricacion + ganancia;
        return (long) (precioVentaSinIVA * 1.19);
    }

    public void setPaisOrigen(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
