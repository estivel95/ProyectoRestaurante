/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Restaurante.models;

import java.awt.List;
import java.util.ArrayList;

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
    private Plato Menu;
    private final List<Menu> menus;
    private final List<Venta> ventas;
    
    ///////////////////////////////////////constructores

    public Restaurante(String nombre, String direccion, String telefono) {
        this.nombre = "El Buen Sabor";
        this.direccion = "Calle 69 n 35 a 163";
        this.telefono = "878869862";
        this.menus = new ArrayList<>();
        this.ventas = new ArrayList<>();
    }
    
    public String Menu(){
       return this.menu.mostrarMenu();
    }
    
    public boolean agregarPlato(Plato plato){
        return this.menu.agregarPlato(Menu);
    }

    public Plato buscarPlato(Plato plato){
        return this.menu.buscarPlato(Menu);
    }
    
    public Plato buscarPlato(int id){
        return this.menu.buscarPlato(id);
    }
    
    public Plato buscarPlato(String nombre){
        return this.menu.buscarPlato(nombre);
    }
    
    public Plato actualizarPlato(int id, Plato producto)
    {
        return this.menu.actualizarPlato(id, producto);
    }
    
    public Plato eliminarPlato(int id){  
        return this.menu.eliminarPlato(id);
    }
    
}
