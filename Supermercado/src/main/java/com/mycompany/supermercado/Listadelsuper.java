/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermercado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author migue
 */
public class Listadelsuper {
    
    private List<String> Listadelsuper;

    // Constructor con valores definidos
    public Listadelsuper() {
        this.Listadelsuper = new ArrayList<>(Arrays.asList("Tocino" ,"Lechuga", "Carne", "Refresco", "tortigas",
                "Cereal","Pasta","Jamon", "Queso","Yogurt","Frijoles","Chiles","Cerveza","Pescado"));
    }

    // Getter para acceder a la lista
    public List<String> getLista() {
        return Listadelsuper;
    }

    // Setter para cambiar toda la lista (opcional)
    public void setLista(List<String> cosas) {
        this.Listadelsuper = cosas;
    }

    public void verLista() {
        System.out.println("La lista del super es la siguiete : ");
        for (int i = 1; i < Listadelsuper.size()+1; i++) {
            System.out.println("Artículo número " + i + ".- " + Listadelsuper.get(i-1));
        }
    }

    // Método para agregar un nuevo artículo
    public void agregarArticulo(String nombre) {
        Listadelsuper.add(nombre);
    }
    
    public void eliminarArtnum(int platillo) {
        if (platillo > 0 && platillo < Listadelsuper.size()+1) {
            System.out.println("El platillo " + Listadelsuper.get(platillo-1) + " ha sido eliminado");
            Listadelsuper.remove(platillo-1);
        } else {
            System.out.println("Ingresa un número válido");
        }
    }
    
    public void eliminarArtnom(String nombre){
        if(Listadelsuper.contains(nombre)){
            Listadelsuper.remove(nombre);
        } else {
            System.out.println("Artículo no encontrado en la lista del super");
        }
    }
    
    public void editar(int indice, String nuevo){
        if (indice > 0 && indice < Listadelsuper.size()+1){
            System.out.println("Haz sustituido " + Listadelsuper.get(indice-1)+" por: "+ nuevo);
            Listadelsuper.set(indice-1, nuevo);
        } else {
            System.out.println("El elemento no se encuentra en la lista como para ser editado");
        }
    }
}
