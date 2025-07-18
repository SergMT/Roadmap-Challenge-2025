/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.roadmapchallenge.sesion2.reto2;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sergio
 */
public class Reto2 {

    public static void main(String[] args) {
        
        double saldo = 1200;
        Scanner input = new Scanner(System.in);
        int valor = 0;
        
        System.out.println("==================================");
        
        do {            
            
            System.out.println("Bienvenido al cajero automático");
            System.out.println("Elija entre las siguientes opciones:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir \n");
            
            System.out.println("Respuesta: ");
            valor = Integer.parseInt(input.nextLine());
            
            System.out.print("\033[H\033[2J");
            System.out.flush();
            
            double monto = switch (valor) {
                case 1 -> {
                    System.out.println("Saldo disponible: $" + saldo);
                    yield saldo;
                }
                case 2 -> {
                    System.out.println("Ingrese el monto a depositar: "); 
                    double deposito = Double.parseDouble(input.nextLine());
                    
                    saldo += deposito;
                    System.out.println("Nuevo saldo $" + saldo);
                    yield saldo;
                }
                case 3 -> {
                    System.out.println("Ingrese el monto a retirar: "); 
                    double retiro = Double.parseDouble(input.nextLine());
                    
                    if ((saldo - retiro) < 0.0 ) {
                        System.out.println("Saldo insuficiente.");
                        yield saldo;
                        
                    } else {
                        
                       saldo -= retiro;
                       System.out.println("Retirando $" + retiro);
                       System.out.println("Nuevo saldo $" + saldo);
                       yield saldo;
                    }
                }
                case 4 -> {
                    System.out.println("Vuelva pronto!");
                    yield 0.0;
                }
                default -> {
                    System.out.println("Valor no válido");
                    throw new AssertionError();
                }
            };
            
            // Espera 5 segundos antes de mostrar el menú si el calor no es 4
            if (valor != 4) {
                try {
                    System.out.println("");
                    TimeUnit.SECONDS.sleep(5);
                    
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Reto2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
        } while (valor != 4);
        
        System.out.println("==================================");
    }
}
