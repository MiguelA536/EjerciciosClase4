package com.mycompany.tiposdedatos;


import com.mycompany.tiposdedatos.Objetos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author migue
 */
public class Opcion6Objetos {
    public void ejecutar(){
        Objetos.Persona p = new Objetos.Persona("Ana", 30);
        Objetos.Auto a = new Objetos.Auto("Toyota", "Corolla", 2020);
        Objetos.Perro perro = new Objetos.Perro("Max", "Labrador", 5);

        System.out.println(p.getNombre() + " tiene " + p.getEdad() + " años.");
        System.out.println("Auto: " + a.getMarca() + " " + a.getModelo() + ", año " + a.getAño());
        System.out.println("Perro: " + perro.getNombre() + ", raza " + perro.getRaza());
    }
}
