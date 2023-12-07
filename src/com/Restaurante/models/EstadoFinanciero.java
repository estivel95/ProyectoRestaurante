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
public class EstadoFinanciero {
    private Date fechaGeneracion;
    private double totalRecaudado;
    private double totalGanancias;
    
        public Date getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(Date fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    public double getTotalRecaudado() {
        return totalRecaudado;
    }

    public void setTotalRecaudado(double totalRecaudado) {
        this.totalRecaudado = totalRecaudado;
    }

    public double getTotalGanancias() {
        return totalGanancias;
    }

    public void setTotalGanancias(double totalGanancias) {
        this.totalGanancias = totalGanancias;
    }

    public EstadoFinanciero(Date fechaGeneracion, double totalRecaudado, double totalGanancias) {
        this.fechaGeneracion = fechaGeneracion;
        this.totalRecaudado = totalRecaudado;
        this.totalGanancias = totalGanancias;
    }

}
