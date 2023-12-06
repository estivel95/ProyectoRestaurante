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
    private double costoDeFabricacion;
    private String descripcion;

    
    
    //////////////////////////////constructores

    public Plato(int id, String nombre, double costoDeFabricacion, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.precioVenta = calcularPrecioVenta();
        this.costoDeFabricacion = costoDeFabricacion;
        this.descripcion = descripcion;
    }
    
    private long calcularPrecioVenta(){
        double ganancia = 0.25;
        double precioprecioVentaSinIva = costoDeFabricacion * (1 + ganancia);
        return (long) (precioprecioVentaSinIva * 1.19);
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

    public void setPrecioVenta(long precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getCostoDeFabricacion() {
        return costoDeFabricacion;
    }

    public void setCostoDeFabricacion(long costoDeFabricacion) {
        this.costoDeFabricacion = costoDeFabricacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public abstract void calcularGanancia();
    public abstract void calcularPreciodeVenta();
    public abstract void sumarIva();

}
