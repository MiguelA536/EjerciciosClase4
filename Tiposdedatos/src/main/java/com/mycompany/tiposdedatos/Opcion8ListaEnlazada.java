/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiposdedatos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Opcion8ListaEnlazada {
    public void ejecutar(){
        ListaEnlazada li1 = new ListaEnlazada();
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        
        do {
            try {
                System.out.println("\n--- SUBMENÚ ---");
                System.out.println("Este programa permite agregar números a una lista enlazada: ");
                System.out.println("1. Agregar un número");
                System.out.println("2. Mostrar la lista");
                System.out.println("3. Vaciar la lista");
                System.out.println("4. Para cerrar este apartado");

                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.print("Ingresa un número: ");
                        double numero = entrada.nextDouble();
                        li1.agregarLista(numero);
                        break;
                    case 2:
                        System.out.println("Los elementos de la lista son: ");
                        li1.mostrarLista();
                        break;
                    case 3:
                        System.out.println("Lista vaciada");
                        li1.vaciarLista();
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
        } while (opcion != 4);  entrada.close();    
    }   
}
