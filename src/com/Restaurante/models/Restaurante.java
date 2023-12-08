/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Restaurante.models;

import java.awt.List;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Restaurante {
    
    ////////////////////////////////////atributos
    private String nombre;
    private String direccion;
    private String telefono;
    private Menu menu;
    private ArrayList<Venta> ventas;
    private ArrayList<Object> menus;

    ///////////////////////////////////////constructores

    public Restaurante(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.menu= new Menu ("comida ancestral", 2015);
        this.menus = new ArrayList<>();
        this.ventas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    ///////////////////CRUD
    public String mostrarMenu(){
       return this.menu.mostrarMenu();
    }
    
    public boolean agregarPlato(Plato plato){
        return this.menu.agregarPlato(plato);
    }

    public Plato buscarPlato(Plato plato){
        return this.menu.buscarPlato(plato);
    }
    
    public Plato buscarPlato(int id){
        return this.menu.buscarPlato(id);
    }
    
    public Plato buscarPlato(String nombre){
        return this.menu.buscarPlato(nombre);
    }
    
    public Plato actualizarPlato(int id, Plato plato)
    {
        return this.menu.actualizarPlato(id, plato);
    }   
    public Plato eliminarPlato(int id){  
        return this.menu.eliminarPlato(id);
    }
    
    public void agregarMenu(Menu menu) {
        menus.add(menu);
    }
    
    public void realizarVenta(Venta venta){
        this.ventas.add(venta);
    }
    
    public EstadoFinanciero generarEstadoFinanciero(Date fechaGeneracion){
        double totalRecaudado = 0;
        double totalGanancias = 0;
        
        for (Venta venta: ventas){
            totalRecaudado = venta.getValorTotal();
            totalGanancias = venta.getValorGanancia();
        }
        
        return new EstadoFinanciero(fechaGeneracion,totalGanancias,totalRecaudado);
    }
}
