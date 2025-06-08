/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiposdedatos;

/**
 *
 * @author migue
 */

public class NumerosEnteros {

    private int valor; //Valor a utilizar

    public NumerosEnteros() {
        // Constructor vacío
    }

    public int getValor() { //getter
        return valor;
    }

    // Validamos que el valor sea un entero positivo o cero
    //setter
    public boolean setValor(int valor) {
        if (valor >= 0) {
            this.valor = valor;
            return true;  // Indica que se asignó bien
        } else {
            System.out.println("Error: el número debe ser mayor o igual a 0.");
            return false; // Indica error
        }
    }
}


