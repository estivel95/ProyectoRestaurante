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
    
    ////////////////////////////atributos
    private int id;
    private String nombre;
    private double precioVenta;
    private double costoFabricacion;
    private String descripcion;

    
    
    //////////////////////////////constructores

    public Plato(int id, String nombre, double costoFabricacion, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.costoFabricacion = costoFabricacion;
        this.precioVenta = calcularPrecioVenta(); 
        this.descripcion = descripcion;
    }
    
    //////////////////////////////////////metodo de acceso
    public int getId() {
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public abstract double calcularGanancia();
    
    private long calcularPrecioVenta(){
        double ganancia = calcularGanancia();
        double precioVentaSinIVA = costoFabricacion + ganancia;
        return (long) (precioVentaSinIVA * 1.19);
    }
}
