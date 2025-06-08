/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermercado;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Menu {

    public void ejecutar() {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        Listadelsuper Ls1 = new Listadelsuper();

        do {
            System.out.println("\n_____Menu del porgrama ____");
            System.out.println("1.- Para ver la lista de artículos");
            System.out.println("2.- Para agregar un nuevo artículo");
            System.out.println("3.- Para eliminar un artículo por su nombre");
            System.out.println("4.- Para eliminar un artículo por su número");
            System.out.println("5.- Para editar un artículo");
            System.out.println("6.- Para cerrar el programa");

            try {
                opcion = entrada.nextInt();
                switch (opcion) {

                    case 1:
                        Ls1.verLista();
                        break;
                    case 2:
                        System.out.println("Ingresa que artículo quieres agregar");
                        String nombre = entrada.next();
                        Ls1.agregarArticulo(nombre);
                        break;
                    case 3:
                        System.out.println("Ingresa el número del artículo que quieres eliminar por su número");
                        String articulonom = entrada.next();
                        Ls1.eliminarArtnom(articulonom);
                        break;
                    case 4:
                        System.out.println("Ingresa el número del artítulo que quieres eliminar ");
                        int articulonum = entrada.nextInt();
                        Ls1.eliminarArtnum(articulonum);
                        break;
                    case 5:
                        System.out.println("Ingresa el número del artíuculo que quieres editar: ");
                        int editar = entrada.nextInt();
                        System.out.println("Ingresa el nuevo nombre de ese artículo: ");
                        String nuevoArtv = entrada.next();
                        Ls1.editar(editar, nuevoArtv);
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
