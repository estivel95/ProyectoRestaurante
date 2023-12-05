/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Restaurante.models;

/**
 *
 * @author Usuario
 */
public class Plato {
    
    ////////////////////////////atributos
    private int id;
    private String nombre;
    private long precioVenta;
    private long costoDeFabricaacion;
    private String descripcion;
    
    
    ////////////////////////////////constructores
    public Plato(){
        
    }
    
    //////////////////////////////constructores

    public Plato(int id, String nombre, long precioVenta, long costoDeFabricaacion, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.precioVenta = precioVenta;
        this.costoDeFabricaacion = costoDeFabricaacion;
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

    public long getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(long precioVenta) {
        this.precioVenta = precioVenta;
    }

    public long getCostoDeFabricaacion() {
        return costoDeFabricaacion;
    }

    public void setCostoDeFabricaacion(long costoDeFabricaacion) {
        this.costoDeFabricaacion = costoDeFabricaacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
