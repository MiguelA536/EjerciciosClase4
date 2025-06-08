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

public class ArregloDefinido {

    private List<String> nombres = new ArrayList<>(Arrays.asList("Ana", "Luis", "Pedro"));

    // Devuelve una copia de la lista para evitar modificaciones externas
    public List<String> getNombres() {
        return new ArrayList<>(nombres);
    }

    // Setter opcional si se necesita reemplazar toda la lista (puede omitirse si no se usa)
    public void setNombres(List<String> nombres) {
        this.nombres = new ArrayList<>(nombres); // copia defensiva por seguridad
    }
}

