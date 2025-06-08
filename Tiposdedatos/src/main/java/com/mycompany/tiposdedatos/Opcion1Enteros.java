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

public class Opcion1Enteros {
    public void ejecutar() {
        Scanner entrada = new Scanner(System.in);
        NumerosEnteros num1 = new NumerosEnteros();
        NumerosEnteros num2 = new NumerosEnteros();

        int valor;
        boolean asignado;

        do {
            System.out.print("Ingresa un número entero positivo para num1: ");
            try {
                valor = entrada.nextInt();
                asignado = num1.setValor(valor);
            } catch (InputMismatchException e) {
                System.out.println("Error: debes ingresar un número entero válido.");
                entrada.next();
                asignado = false;
            }
        } while (!asignado);

        do {
            System.out.print("Ingresa un número entero positivo para num2: ");
            try {
                valor = entrada.nextInt();
                asignado = num2.setValor(valor);
            } catch (InputMismatchException e) {
                System.out.println("Error: debes ingresar un número entero válido.");
                entrada.next();
                asignado = false;
            }
        } while (!asignado);

        System.out.println("\nNúmero 1: " + num1.getValor());
        System.out.println("Número 2: " + num2.getValor());
        System.out.println("Suma: " + (num1.getValor() + num2.getValor()));
        System.out.println("Resta: " + (num1.getValor() - num2.getValor()));
        System.out.println("multiplicación: " + (num1.getValor() * num2.getValor()));
        System.out.println("División: " + (num1.getValor() / num2.getValor()));
    }
}
