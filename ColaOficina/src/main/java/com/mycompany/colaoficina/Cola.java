/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colaoficina;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author migue
 */
public class Cola {

    private Queue<String> ClientesCola = new LinkedList<>();
    private int Contador = 0;

    // Devuelve una copia para no exponer la cola interna
    public Queue<String> getCola() {
        return new LinkedList<>(ClientesCola);
    }

    // Vacía la cola
    public void vaciarCola() {
        ClientesCola.clear();
    }

    // Devuelve el número de clientes agregados
    public int getImpresiones() {
        return Contador;
    }

    // Agrega un nuevo cliente a la cola y aumenta el contador
    public void agregarCola() {
        Contador++;
        String nuevoCliente = "Cliente " + Contador;
        ClientesCola.add(nuevoCliente);
        System.out.println("Se ha agregado el " + nuevoCliente);
    }

    // Atiende al siguiente cliente
    public void atendersiguiente() {
        String cliente = ClientesCola.poll();
        if (cliente != null) {
            System.out.println("Se ha atendido al " + cliente);
        } else {
            System.out.println("No hay clientes para atender.");
        }
    }

    // Imprime y vacía la cola
    public void imprimirCola() {
        if (ClientesCola.isEmpty()) {
            System.out.println("Ya no quedan clientes...");
        } else {
            while (!ClientesCola.isEmpty()) {
                System.out.println("Atendiendo cliente " + ClientesCola.poll());
            }
            System.out.println("Todos los clientes han sido atendidos.");
        }
    }

    // Ver quién sigue sin eliminarlo
    public void VerQuiensigue() {
        if (ClientesCola.isEmpty()) {
            System.out.println("No hay clientes en espera.");
        } else {
            System.out.println("Sigue el " + ClientesCola.peek());
        }
    }
}
