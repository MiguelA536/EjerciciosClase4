/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiposdedatos;

/**
 *
 * @author migue
 */
public class NumerosDecimales {
     private double valor; //Valor a utilizar

    public NumerosDecimales() {
        // Constructor vacío
    }

    public double getValor() { //getter
        return valor;
    }

    public boolean setValor(double valor) {
    if (valor >= 0) {
        this.valor = valor;
        return true;
    } else {
        System.out.println("Error: el valor debe ser mayor o igual a 0.");
        return false;
    }
}

}
