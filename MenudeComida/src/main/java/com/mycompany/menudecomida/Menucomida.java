/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menudecomida;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author migue
 */
public class Menucomida {

    private List<String> menuComida;

    // Constructor con valores definidos
    public Menucomida() {
        this.menuComida = new ArrayList<>(Arrays.asList("Mole con arroz", "Enchiladas verdes", "Carne asada con nopales", "Tacos dorados",
                "Pozole rojo", "Pescado empapeldado", "Espaguetti a la boloñesa", "Pollo al horno con papas", "Chilles rellenos"));
    }

    // Getter para acceder a la lista
    public List<String> getComida() {
        return menuComida;
    }

    // Setter para cambiar toda la lista (opcional)
    public void setComida(List<String> nombres) {
        this.menuComida = nombres;
    }

    public void verMenu() {
        System.out.println("El menú es el siguiente: ");
        for (int i = 1; i < menuComida.size()+1; i++) {
            System.out.println("Platillo número " + i + ".- " + menuComida.get(i-1));
        }
    }

    public void pedirPlatilloIndice(int platillo) {
        if (platillo > 0 && platillo < menuComida.size()+1) {
            System.out.println("Has pedido: " + menuComida.get(platillo - 1));
        } else {
            System.out.println("Ingresa un número válido");
        }
    }
    
    public void pedirplatilloNombre(String Platillo){
        if(menuComida.contains(Platillo)){
            System.out.println("Haz pedido " + Platillo);
        } else {
            System.out.println("El platillo no se encuentra en el menú, pero puedes solicitar agregarlo");
        }
    }

    // Método para agregar un nombre
    public void agregarPlatillo(String nombre) {
        menuComida.add(nombre);
    }
    
    public void eliminarPlatillo(int platillo) {
        if (platillo > 0 && platillo < menuComida.size()+1) {
            System.out.println("El platillo " + menuComida.get(platillo-1) + " ha sido eliminado");
            menuComida.remove(platillo-1);
        } else {
            System.out.println("Ingresa un número válido");
        }

    }
}
    
   
