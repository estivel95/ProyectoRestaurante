/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Restaurante.models;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Venta {
    private int factura;
    private Date fecha;
    
    /////////////////////////////constructores
    public Venta (){
        
    }
    
    //////////////////////////////////constructores

    public Venta(int factura, Date fecha) {
        this.factura = factura;
        this.fecha = fecha;
    }
    
    /////////////////////////////////metodo acceso

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
}
