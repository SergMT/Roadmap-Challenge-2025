/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.roadmapchallenge.sesion1.reto2;

import com.roadmapchallenge.sesion1.reto2.Classes.Entrada;

/**
 *
 * @author sergio
 */
public class Reto2 {

    public static void main(String[] args) {
        
        Entrada entrada1 = new Entrada("Knot fest", 1499.99);
        
        Entrada entrada2 = new Entrada("La Mole", 699.99);
        
        
        System.out.println("=====================================");
        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();
        System.out.println("=====================================");
    }
}
