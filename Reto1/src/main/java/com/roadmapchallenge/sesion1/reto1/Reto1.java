/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.roadmapchallenge.sesion1.reto1;

import com.roadmapchallenge.sesion1.reto1.Classes.Paciente;
import java.util.Scanner;

/**
 *
 * @author sergio
 */
public class Reto1 {
    public static void main(String[] args) {
        
        Paciente paciente1 = new Paciente();
        
        Scanner valor = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del paciente:");
        paciente1.nombre = valor.nextLine();
        
        System.out.println("Ingrese la edad del paciente:");
        paciente1.edad = Integer.parseInt(valor.nextLine());
        
        System.out.println("Ingrese el número de expediente del paciente:");
        paciente1.numeroExpediente = valor.nextLine();
        
        paciente1.mostrarInformacion();
    }
}
