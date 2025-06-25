/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.roadmapchallenge.sesion1.reto2.Classes;

/**
 *
 * @author sergio
 */
public class Entrada {
    
    public String nombreEvento;
    public double precio;

    public Entrada (String nombreEvento, double precio) {
        this.nombreEvento = nombreEvento;
        this.precio = precio;
    }
    
    public void mostrarInformacion() {
        System.out.println("Evento: " + nombreEvento + "| Precio: " + precio);
    }
}
