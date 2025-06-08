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
public class Opcion4Strings {
    public void ejecutar(){
        StringCadena sc1 = new StringCadena();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre");
        String nombre = entrada.next();
        sc1.setNombre(nombre); // Asignar al objeto
        
        System.out.println("Ingresa tu apellido");
        String apellido = entrada.next();
        sc1.setApellido(apellido); // Asignar al objeto
        
        int valor;
        boolean asignado;
        do {
            System.out.print("Ingresa tu edad en años: ");
            try {
                valor = entrada.nextInt();
                sc1.setEdad(valor);
                asignado = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: debes ingresar un número entero válido.");
                entrada.next(); // Limpiar buffer
                asignado = false;
            }
        } while (!asignado);
        
        System.out.println("El nombre es: " + sc1.getNombre());
        System.out.println("El apellido es: " + sc1.getApellido());
        System.out.println("La edad es de: " + sc1.getEdad() +"años");
        System.out.println("El nombre completo es: " + sc1.getNombre() + " " + sc1.getApellido() + " con " + sc1.getEdad() + " años" );
        
    }
}
