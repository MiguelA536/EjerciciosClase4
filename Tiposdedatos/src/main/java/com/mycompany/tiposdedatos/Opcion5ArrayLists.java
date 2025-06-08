/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiposdedatos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author migue
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Opcion5ArrayLists {

    public void ejecutar() {
        ArrayLists arl1 = new ArrayLists();
        Scanner entrada = new Scanner(System.in);
        int opcion = -1;

        do {
            try {
                System.out.println("\n--- SUBMENÚ ---");
                System.out.println("1. Agregar String");
                System.out.println("2. Agregar Entero");
                System.out.println("3. Agregar Decimal");
                System.out.println("4. Mostrar listas");
                System.out.println("5. Eliminar por índice");
                System.out.println("6. Eliminar por valor");
                System.out.println("7. Vaciar listas");
                System.out.println("0. Salir");
                System.out.print("Elige una opción: ");
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        entrada.nextLine(); // limpiar buffer
                        System.out.print("Ingresa un nombre: ");
                        String nombre = entrada.nextLine();
                        arl1.agregarNombre(nombre);
                        break;
                    case 2:
                        System.out.print("Ingresa un número entero: ");
                        int numero = entrada.nextInt();
                        arl1.agregarInt(numero);
                        break;
                    case 3:
                        System.out.print("Ingresa un número decimal: ");
                        double decimal = entrada.nextDouble();
                        arl1.agregarDecimal(decimal);
                        break;
                    case 4:
                        arl1.mostrarNombres();
                        arl1.mostrarInts();
                        arl1.mostrarDoubles();
                        break;
                    case 5:
                        System.out.print("¿De qué lista? (1=String, 2=Int, 3=Double): ");
                        int tipo = entrada.nextInt();
                        System.out.print("Índice a eliminar: ");
                        int indice = entrada.nextInt();

                        switch (tipo) {
                            case 1:
                                arl1.eliminarNombrePorIndice(indice);
                                break;
                            case 2:
                                arl1.eliminarIntPorIndice(indice);
                                break;
                            case 3:
                                arl1.eliminarDecimalPorIndice(indice);
                                break;
                            default:
                                System.out.println("Tipo inválido.");
                        }
                        break;

                    case 6:
                        System.out.print("¿De qué lista? (1=String, 2=Int, 3=Double): ");
                        tipo = entrada.nextInt();
                        entrada.nextLine(); // limpiar buffer

                        if (tipo == 1) {
                            System.out.print("Nombre a eliminar: ");
                            String eliminarStr = entrada.nextLine();
                            arl1.eliminarNombrePorValor(eliminarStr);
                        } else if (tipo == 2) {
                            System.out.print("Entero a eliminar: ");
                            int eliminarInt = entrada.nextInt();
                            arl1.eliminarIntPorValor(eliminarInt);
                        } else if (tipo == 3) {
                            System.out.print("Decimal a eliminar: ");
                            double eliminarDec = entrada.nextDouble();
                            arl1.eliminarDecimalPorValor(eliminarDec);
                        } else {
                            System.out.println("Tipo inválido.");
                        }
                        break;
                    case 7:
                        arl1.vaciarNombres();
                        arl1.vaciarInts();
                        arl1.vaciarDoubles();
                        System.out.println("Listas vaciadas.");
                        break;
                    case 0:
                        System.out.println("Saliendo del programa...");
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
        } while (opcion != 0);
    }
}
