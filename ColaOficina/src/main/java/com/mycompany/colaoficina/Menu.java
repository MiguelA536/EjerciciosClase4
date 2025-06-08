/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colaoficina;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Menu {
    private Cola c1 = new Cola(); // Ahora es un atributo de la clase, no local

    public void ejecutar() {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        do {
            try {
                System.out.println("\n--- SUBMENÚ ---");
                System.out.println("1.- Agregar a la fila");
                System.out.println("2.- Atender al primero");
                System.out.println("3.- Ver quien sigue");
                System.out.println("4.- Cerrar el programa");
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        c1.agregarCola();
                        break;
                    case 2:
                        c1.atendersiguiente();
                        break;
                    case 3:
                        c1.VerQuiensigue();
                        break;
                    case 4:
                        System.out.println("Hasta luego...");
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
        } while (opcion != 4); // Cambiado: debe cerrar solo con opción 4
    }
}

