/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiposdedatos;

/**
 *
 * @author migue
 */
public class StringCadena {
    private String nombre;
    private String apellido;
    private int edad; //Valor a utilizar

    public StringCadena() {
        // Constructor vacío
    }
    //Getters
    
    public String getNombre() { 
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getEdad() { 
        return edad;
    }
    
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Validamos que el valor sea un entero positivo o cero
    //setter
    public boolean setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
            return true;  // Indica que se asignó bien
        } else {
            System.out.println("Error: el número debe ser mayor o igual a 0.");
            return false; // Indica error
        }
    }
}
