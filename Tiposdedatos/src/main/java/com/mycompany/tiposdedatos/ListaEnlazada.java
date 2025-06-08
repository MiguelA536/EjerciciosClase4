/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiposdedatos;

import java.util.LinkedList;

/**
 *
 * @author migue
 */
public class ListaEnlazada {
    private LinkedList<Double> numeros = new LinkedList<>();

    // Devuelve una copia para proteger la lista interna
    public LinkedList<Double> getNumeros() {
        return new LinkedList<>(numeros);
    }

    // En lugar de un setter general, mejor métodos para manipular la lista
    // por ejemplo para reemplazar toda la lista si es estrictamente necesario:
    public void setNumeros(LinkedList<Double> numeros) {
        if (numeros != null) {
            this.numeros = new LinkedList<>(numeros);
        }
    }

    public void agregarLista(double num) {
        if (num < 0) {
            System.out.println("Agrega un número mayor o igual a 0");
        } else {
            numeros.add(num);
        }
    }

    public void mostrarLista() {
        if (numeros.isEmpty()) {
            System.out.println("La lista está vacía");
        } else {
            System.out.println("Los elementos de la lista son:");
            for (Double numero : numeros) {
                System.out.println("Número agregado: " + numero);
            }
        }
    }

    public void vaciarLista() {
        numeros.clear();
    }
}
