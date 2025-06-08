/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.platos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Menu {
        public void ejecutar() {
        Pila p1 = new Pila();
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        do {
            try {
                System.out.println("\n--- SUBMENÚ ---");
                System.out.println("Este programa permite agregar platos a una pila: ");
                System.out.println("1. Agregar un plato");
                System.out.println("2. Agregar un conjunto de platos");
                System.out.println("3. Lavar un plato");
                System.out.println("4. lavar los platos");
                System.out.println("5. Ver el plato de hasta arriba");
                System.out.println("6. Dejar los platos en paz");

                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        p1.agregarPlato();
                        break;
                    case 2:
                        System.out.println("Ingresa el número de platos que quieres agregar: ");
                        int numPlatos = entrada.nextInt();
                        p1.agregarPila(numPlatos);
                        break;
                    case 3:
                        p1.lavarPlato();
                        break;
                    case 4:
                        p1.lavarPlatos();
                    case 5:
                        p1.verCima();
                        break;
                    case 6:
                        System.out.println("Hasta luego...");
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: debes ingresar un número válido.");
                entrada.nextLine(); // Limpiar buffer
            } catch (Exception e) {
                System.out.println("Se acabaron los platos ");
                entrada.nextLine(); // Limpiar por si queda basura
            }
        } while (opcion != 6);
        
         entrada.close();
    } 
}
