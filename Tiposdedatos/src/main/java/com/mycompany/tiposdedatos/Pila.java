/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiposdedatos;

import java.util.Stack;

/**
 *
 * @author migue
 */



public class Pila {
    private Stack<String> platos = new Stack<>();
    private int contadorPlatos = 0; // Acumulador global

    // Agrega varios platos
    public void agregarPila(int numPlatos) {
        if (numPlatos > 0) {
            for (int i = 1; i <= numPlatos; i++) {
                contadorPlatos++;
                System.out.println("Agregando el plato número: " + contadorPlatos);
                platos.push("Plato número " + contadorPlatos);
            }
        } else {
            System.out.println("Agrega un número positivo");
        }
    }

    // Agrega un plato
    public void agregarPlato() {
        contadorPlatos++;
        System.out.println("Se agregó el plato número " + contadorPlatos);
        platos.push("Plato número " + contadorPlatos);
    }

    // Lava (quita) los platos uno a uno
    public void lavarPlatos() {
        while (!platos.isEmpty()) {
            System.out.println("Lavando el: " + platos.pop());
        }
    }

    // Consulta si la pila está vacía
    public boolean estaVacia() {
        return platos.isEmpty();
    }

    // Consulta cuántos platos hay
    public int cantidadPlatos() {
        return platos.size();
    }
}

