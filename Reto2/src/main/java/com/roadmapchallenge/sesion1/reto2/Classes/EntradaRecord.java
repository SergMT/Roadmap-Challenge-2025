/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package com.roadmapchallenge.sesion1.reto2.Classes;

/**
 *
 * @author sergio
 */
public record EntradaRecord(String nombreEvento, double precio) {

    public void mostrarInformacion(){
        System.out.println("Evento: " + nombreEvento + " | Precio: $" + precio);
    }
}
