/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Restaurante.models;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Venta {
    private static int contadorCodigos = 1;
    
    private int factura;
    private double valorTotal;
    private double valorGanancia;
    private Date fecha;
    private ArrayList<Plato> platosVendidos;
    

    //////////////////////////////////constructores

    public Venta(ArrayList<Plato> platosVendidos) {
        this.factura = contadorCodigos++;
        this.platosVendidos = platosVendidos;
        calcularValoresVenta();
        this.fecha = new Date();
    }
    
    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorGanancia() {
        return valorGanancia;
    }

    /////////////////////////////////metodo acceso
    public void setValorGanancia(double valorGanancia) {    
        this.valorGanancia = valorGanancia;
    }

    public int getFactura() {
        return factura;
    }

    public void setFactura(int factura) {
        this.factura = factura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    private void calcularValoresVenta() {
        valorTotal = platosVendidos.stream().mapToDouble(Plato::getPrecioVenta).sum();
        valorGanancia = platosVendidos.stream().mapToDouble(plato -> (plato.getPrecioVenta() - plato.getCostoFabricacion())).sum();
    }

}
