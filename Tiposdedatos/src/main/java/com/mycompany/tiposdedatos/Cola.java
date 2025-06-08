/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiposdedatos;


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author migue
 */

public class Cola {

    private Queue<String> cola = new LinkedList<>();
    private int impresiones = 0;

    // Devuelve una copia para no exponer la cola interna
    public Queue<String> getCola() {
        return new LinkedList<>(cola);
    }

    // Mejor: método para vaciar la cola sin reemplazarla con otra externa
    public void vaciarCola() {
        cola.clear();
    }

    public int getImpresiones() {
        return impresiones;
    }

    public boolean setImpresiones(int impresiones) {
        if (impresiones >= 0) {
            this.impresiones = impresiones;
            return true;
        } else {
            System.out.println("Error: el número debe ser mayor o igual a 0.");
            return false;
        }
    }

    // Agrega elementos según impresiones
    public void agregarCola() {
        for (int i = 1; i <= impresiones; i++) {
            cola.add("Impresión " + i + ":");
        }
    }

    // Imprime y vacía la cola
    public void imprimirCola() {
        if (cola.isEmpty()) {
            System.out.println("No hay nada que imprimir.");
        } else {
            while (!cola.isEmpty()) {
                System.out.println("Cola de impresión, hoja de: " + cola.poll());
            }
            System.out.println("Todas las hojas han sido impresas.");
        }
    }
}
