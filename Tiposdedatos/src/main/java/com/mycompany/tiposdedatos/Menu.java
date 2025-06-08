/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiposdedatos;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author migue
 */

public class Menu {
    public void mostrar() {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n");
            System.out.println("La opcíon 1 mostrará ejemplos de números enteros");
            System.out.println("La opcíon 2 mostrará ejemplos de decimales");
            System.out.println("La opcíon 3 mostrará un arreglo definido");
            System.out.println("La opcíon 4 mostrará ejemplos de strings");
            System.out.println("La opcíon 5 mostrará un Arraylist");
            System.out.println("La opcíon 6 mostrará un ejemplo de un objeto");
            System.out.println("La opcion 7 mostrará un ejemplo de cola");
            System.out.println("La opción 8 mostrará una lista enlazada");
            System.out.println("La opción 9 mostrará un ejemplo de pila");
            System.out.println("La opción 10 mostrará un ejemplo de hasmap");
            System.out.println("La opción 11 cerrará el programa");

            try {
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        Opcion1Enteros op1 = new Opcion1Enteros();
                        op1.ejecutar();  // Llama la lógica de la opción 1
                        break;
                        
                    case 2:
                        Opcion2Decimales op2 = new Opcion2Decimales();
                        op2.ejecutar();
                        break;
                        
                    case 3:
                        Opcion3ArregloDefinido ad1 = new Opcion3ArregloDefinido();
                        ad1.ejecutar();
                        break;
                        
                    case 4:
                        Opcion4Strings s1 = new Opcion4Strings();
                        s1.ejecutar();
                        break;
                        
                    case 5:
                        Opcion5ArrayLists ar1 = new Opcion5ArrayLists();
                        ar1.ejecutar();
                        break;
                        
                    case 6:
                        Opcion6Objetos ob1 = new Opcion6Objetos();
                        ob1.ejecutar();
                        break;
                        
                    case 7:
                        Opcion7Cola c1 = new Opcion7Cola();
                        c1.ejecutar();
                        break;
                        
                    case 8:
                        Opcion8ListaEnlazada lie1 = new Opcion8ListaEnlazada();
                        lie1.ejecutar();
                        break;
                    
                    case 9:
                        Opcion9Pila pi1 = new Opcion9Pila();
                        pi1.ejecutar();
                        break;
                        
                    case 10:
                        System.out.println("Hasta la próxima...");
                        break;
                        
                    case 11:
                        break;
                        
                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes ingresar un número entero.");
                entrada.next();
                opcion = 0;
            }
        } while (opcion != 11);
    }
}
