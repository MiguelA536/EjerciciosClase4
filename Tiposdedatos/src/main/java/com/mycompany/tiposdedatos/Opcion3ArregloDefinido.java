/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiposdedatos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author migue
 */
import java.util.List;

public class Opcion3ArregloDefinido {
    public void ejecutar() {

        ArregloDefinido a1 = new ArregloDefinido();
        List<String> nombres = a1.getNombres();  // recibe una copia segura

        for (int i = 0; i < nombres.size(); i++) {
            System.out.println("Los elementos del arreglo son: " + nombres.get(i));
        }

        System.out.println("El arreglo en sí mismo es: " + nombres);
    }
}

