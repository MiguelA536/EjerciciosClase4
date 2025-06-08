/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menudecomida;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author migue
 */
public class MenuPrincpal {
        public void ejecutar() {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        Menucomida m1 = new Menucomida();

        do {
            System.out.println("\n_____Menu del porgrama ____");
            System.out.println("1.- Para ver el menú");
            System.out.println("2.- Para elegir algo del menú por número");
            System.out.println("3.- Para elegir algo del menu por su nombre");
            System.out.println("4.- Para agregar algo al menú");
            System.out.println("5.- Para eliminar algo del menú");
            System.out.println("6.- Cerar el programa");

            try {
                opcion = entrada.nextInt();
                switch (opcion) {
                    
                    case 1:
                        m1.verMenu();
                        break;
                    case 2:
                        System.out.println("Ingresa el número del platillo que deseas pedir: ");
                        int platillo = entrada.nextInt();
                        m1.pedirPlatilloIndice(platillo);
                        break;
                    case 3:
                        entrada.nextLine(); 
                        System.out.println("Ingresa el nombre del platillo que deseas: ");
                        String plato = entrada.nextLine();
                        m1.pedirplatilloNombre(plato);
                        break;
                    case 4:
                        entrada.nextLine(); 
                        System.out.println("Ingresa el platillo que desea agregar al menú: ");
                        String nuevoPlato = entrada.nextLine();
                        m1.agregarPlatillo(nuevoPlato);
                        break;
                    case 5:
                        System.out.println("Ingresa el número del plato que quieres eliminar: ");
                        int eliminar = entrada.nextInt();
                        m1.eliminarPlatillo(eliminar);
                        break;
                    case 6:
                        System.out.println("Hasta luego...");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes ingresar un número entero.");
                entrada.next();
                opcion = 0;
            }
        } while (opcion != 6);
    }
}
