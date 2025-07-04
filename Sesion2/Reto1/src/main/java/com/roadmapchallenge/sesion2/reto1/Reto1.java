/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.roadmapchallenge.sesion2.reto1;

import com.roadmapchallenge.sesion2.reto1.Clases.SimuladorFarmacia;
import java.util.Scanner;

/**
 *
 * @author sergio
 */
public class Reto1 {

    public static void main(String[] args) {
        
        Scanner valor = new Scanner(System.in);
        SimuladorFarmacia farmacia = new SimuladorFarmacia();
        double porcentaje = 15;
        
        System.out.println("==================================");
        
        System.out.println("Ingrese los siguientes datos. ");
        
        System.out.println("Nombre del medicamento: ");
        farmacia.setNombreMedicamento(valor.nextLine());
        
        System.out.println("Precio unitario: ");
        farmacia.setPrecioUnitario(Double.parseDouble(valor.nextLine()));
        
        System.out.println("Cantidad: ");
        farmacia.setCantidad(Integer.parseInt(valor.nextLine()));
        
        var importe = farmacia.getCantidad() * farmacia.getPrecioUnitario();
        boolean tieneDescuento = (importe >= 500);
        double cantidadDescuento = (tieneDescuento) ? (porcentaje/100 * importe) : 0;
        var total = (tieneDescuento) ? (importe - cantidadDescuento) : importe;
        
        System.out.println("Medicamento: " + farmacia.getNombreMedicamento());
        System.out.println("Cantidad: " + farmacia.getCantidad());
        System.out.println("Precio unitario: " + farmacia.getPrecioUnitario());
        System.out.println("Total sin descuento: " + importe);
        System.out.println("¿Aplica descuento?: " + tieneDescuento);
        System.out.println("Descuento: " + cantidadDescuento);
        System.out.println("Total a pagar: " + total);
        
        System.out.println("==================================");
    }
}
