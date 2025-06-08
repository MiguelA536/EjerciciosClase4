/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiposdedatos;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Opcion7Cola {
    public void ejecutar(){
         Cola c1 = new Cola();
         Scanner entrada = new Scanner(System.in);
         int opcion = 0;
         
         do {
            try {
                System.out.println("\n--- SUBMENÚ ---");
                System.out.println("1.- Agregar impresiones ");
                System.out.println("2.- Imprimir");
                System.out.println("3.- Salir");
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.print("Ingresa el número de impresiones a realizar: ");
                        int impresiones = entrada.nextInt();
                        if (!c1.setImpresiones(impresiones)) {
                            System.out.println("No se pudo establecer la cantidad de impresiones.");
                        }
                        c1.agregarCola();
                        break;
                    case 2:
                        c1.imprimirCola();
                        break;
                    case 3:
                        System.out.println("Hasta la próxima");
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: debes ingresar un número válido.");
                entrada.nextLine(); // Limpiar buffer
            } catch (Exception e) {
                System.out.println("Ocurrió un error inesperado: " + e.getMessage());
                entrada.nextLine(); // Limpiar por si queda basura
            }
        } while (opcion != 3);
         
    }
}
