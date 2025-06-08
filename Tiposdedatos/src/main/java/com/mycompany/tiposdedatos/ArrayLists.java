/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiposdedatos;

import java.util.Arrays;
import java.util.List;
import java.util.List;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author migue
 */
import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    private List<String> strings = new ArrayList<>();
    private List<Integer> ints = new ArrayList<>();
    private List<Double> doubles = new ArrayList<>();

    // Métodos para Strings
    public void agregarNombre(String nombre) {
        strings.add(nombre);
    }

    public void eliminarNombrePorIndice(int indice) {
        if (indice >= 0 && indice < strings.size()) {
            strings.remove(indice);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void eliminarNombrePorValor(String nombre) {
        if (!strings.remove(nombre)) {
            System.out.println("Nombre no encontrado en la lista.");
        }
    }

    public void vaciarNombres() {
        strings.clear();
    }

    public void mostrarNombres() {
        System.out.println("Nombres: " + strings);
    }

    // Métodos para enteros
    public void agregarInt(int numero) {
        ints.add(numero);
    }

    public void eliminarIntPorIndice(int indice) {
        if (indice >= 0 && indice < ints.size()) {
            ints.remove(indice);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void eliminarIntPorValor(int valor) {
        if (!ints.remove(Integer.valueOf(valor))) {
            System.out.println("Valor no encontrado en la lista.");
        }
    }

    public void vaciarInts() {
        ints.clear();
    }

    public void mostrarInts() {
        System.out.println("Números: " + ints);
    }

    // Métodos para decimales
    public void agregarDecimal(Double decimal) {
        doubles.add(decimal);
    }

    public void eliminarDecimalPorIndice(int indice) {
        if (indice >= 0 && indice < doubles.size()) {
            doubles.remove(indice);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void eliminarDecimalPorValor(Double valor) {
        if (!doubles.remove(valor)) {
            System.out.println("Valor no encontrado en la lista.");
        }
    }

    public void vaciarDoubles() {
        doubles.clear();
    }

    public void mostrarDoubles() {
        System.out.println("Decimales: " + doubles);
    }
}

