/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Restaurante.main;
import com.Restaurante.models.Restaurante;
import com.Restaurante.views.VentanaPrincipal;

/**
 *
 * @author Usuario
 */
public class RestauranteControl {
    
    public static void main(String[] args) {
        
        Restaurante restaurante = new Restaurante("El buen sabor", "calle 69 n 35 a 163", "8788623");
        
        VentanaPrincipal ventana = new VentanaPrincipal(restaurante);
        ventana.setVisible(true);
    }
}
