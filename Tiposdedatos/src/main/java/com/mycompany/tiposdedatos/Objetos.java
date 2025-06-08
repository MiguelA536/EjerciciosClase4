/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiposdedatos;

/**
 *
 * @author migue
 */
// Archivo: Auto.java
public class Objetos {

    // Clase Persona
    public static class Persona {
        private String nombre;
        private int edad;

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        public String getNombre() { return nombre; }
        public void setNombre(String nombre) { this.nombre = nombre; }

        public int getEdad() { return edad; }
        public void setEdad(int edad) { this.edad = edad; }
    }

    // Clase Auto
    public static class Auto {
        private final String region = "Latinoamérica"; // valor fijo
        private final String pais = "México";          // valor fijo

        private String marca;
        private String modelo;
        private int año;

        public Auto(String marca, String modelo, int año) {
            this.marca = marca;
            this.modelo = modelo;
            this.año = año;
        }

        public String getRegion() { return region; }
        public String getPais() { return pais; }

        public String getMarca() { return marca; }
        public void setMarca(String marca) { this.marca = marca; }

        public String getModelo() { return modelo; }
        public void setModelo(String modelo) { this.modelo = modelo; }

        public int getAño() { return año; }
        public void setAño(int año) { this.año = año; }
    }

    // Clase Perro
    public static class Perro {
        private String nombre;
        private String raza;
        private int edad;

        public Perro(String nombre, String raza, int edad) {
            this.nombre = nombre;
            this.raza = raza;
            this.edad = edad;
        }

        public String getNombre() { return nombre; }
        public void setNombre(String nombre) { this.nombre = nombre; }

        public String getRaza() { return raza; }
        public void setRaza(String raza) { this.raza = raza; }

        public int getEdad() { return edad; }
        public void setEdad(int edad) { this.edad = edad; }
    }
}


