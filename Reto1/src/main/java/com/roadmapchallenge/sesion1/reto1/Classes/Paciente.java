/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.roadmapchallenge.sesion1.reto1.Classes;

/**
 *
 * @author sergio
 */
public class Paciente {
    
    public String nombre;
    public int edad;
    public String numeroExpediente;
    
    public void mostrarInformacion(){
        System.out.println("Paciente: " + nombre + "\nEdad: " + edad + "\nExpediente: " + numeroExpediente);
    }
}
