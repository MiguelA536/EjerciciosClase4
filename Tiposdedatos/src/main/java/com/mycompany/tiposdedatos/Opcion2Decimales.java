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
import java.util.InputMismatchException;
import java.util.Scanner;

public class Opcion2Decimales {
    public void ejecutar() {
        Scanner entrada = new Scanner(System.in);
        NumerosDecimales num1 = new NumerosDecimales();
        NumerosDecimales num2 = new NumerosDecimales();
        double valor;
        boolean asignado;

        // Pedimos el primer número decimal
        do {
            System.out.print("Ingresa un número decimal para num1: ");
            try {
                valor = entrada.nextDouble();
                num1.setValor(valor);
                asignado = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: debes ingresar un número decimal válido.");
                entrada.next(); // Limpiar buffer
                asignado = false;
            }
        } while (!asignado);

        // Pedimos el segundo número decimal
        do {
            System.out.print("Ingresa un número decimal para num2: ");
            try {
                valor = entrada.nextDouble();
                num2.setValor(valor);
                asignado = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: debes ingresar un número decimal válido.");
                entrada.next(); // Limpiar buffer
                asignado = false;
            }
        } while (!asignado);

        System.out.println("\nNúmero 1: " + num1.getValor());
        System.out.println("Número 2: " + num2.getValor());
        System.out.println("Suma: " + (num1.getValor() + num2.getValor()));
        System.out.println("Resta: " + (num1.getValor() - num2.getValor()));
        System.out.println("Multiplicación: " + (num1.getValor() * num2.getValor()));
        
        if (num2.getValor() != 0) {
            System.out.println("División: " + (num1.getValor() / num2.getValor()));
        } else {
            System.out.println("División: No se puede dividir entre 0.");
        }
        
        entrada.close(); 
    } 
} 
