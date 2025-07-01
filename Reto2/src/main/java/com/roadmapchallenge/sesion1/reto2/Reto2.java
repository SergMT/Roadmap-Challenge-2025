/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.roadmapchallenge.sesion1.reto2;

import com.roadmapchallenge.sesion1.reto2.Classes.Entrada;
import com.roadmapchallenge.sesion1.reto2.Classes.EntradaRecord;

/**
 *
 * @author sergio
 */
public class Reto2 {

    public static void main(String[] args) {
        
        EntradaRecord entrada1 = new EntradaRecord("Knot fest", 1499.99);
        
        EntradaRecord entrada2 = new EntradaRecord("La Mole", 699.99);
        
        System.out.println("=====================================");
        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();
        System.out.println("=====================================");
    }
}
