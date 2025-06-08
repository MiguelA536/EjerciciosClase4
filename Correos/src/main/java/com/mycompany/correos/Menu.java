/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.correos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Menu {
        public void ejecutar() {
        System.out.println("Este programa tiene la funcion de buscar un valor en una Lista enlazada");

        Scanner entrada = new Scanner(System.in);
        int opcion;
        Listaenlazada le1 = new Listaenlazada();
        le1.valorFabrica();

        do {
            System.out.println("\n____Menu principal_____ ");
            System.out.println("1.- Ver los correos agregados");
            System.out.println("2.- Agregar un nuevo correo al final ");
            System.out.println("3.- Eliminar uno por dirección ");
            System.out.println("4.- Mostrar toda la cadena de reenvio ");
            System.out.println("5.- Editar un correo por su número");
            System.out.println("6.- Cerrar el programa");

            try {
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        le1.verValores();
                        break;
                    case 2:
                        System.out.println("Ingresa el nuevo correo: ");
                        String nuevoCorreo = entrada.next();
                        le1.agregarCorreo(nuevoCorreo);
                        break;
                    case 3:
                        System.out.println("Ingresa la direccion que quieres eliminar: ");
                        String eliminar = entrada.next();
                        le1.eliminarArtnom(eliminar);
                        break;
                    case 4:
                        le1.mostrarCadena();
                        break;
                    case 5:
                        System.out.println("Ingresa el número del correo que quieres editar: ");
                        int numeroCorreo = entrada.nextInt();
                        System.out.println("Ingresa el nuevo correo: ");
                        String nuevoCorreoe = entrada.next();
                        le1.editar(numeroCorreo, nuevoCorreoe);
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes ingresar un número entero.");
                entrada.next();
                opcion = 6;
            }
        } while (opcion != 5);
    }
}
