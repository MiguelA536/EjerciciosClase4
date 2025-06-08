/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.correos;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Listaenlazada {
    private List<String> correosUnivo = new LinkedList<>();  // CAMBIO

    public List<String> getList() {
        return correosUnivo;
    }    

    public void valorFabrica() {
        correosUnivo.add("miguelghernandez113@gmail.com");
        correosUnivo.add("zacharyteylorprogramer@gmail.com");
    }

    public void verValores() {
        System.out.println("Los coreos agregados hasta ahora son: ");
        for (int i = 1; i < correosUnivo.size()+1; i++) {
            System.out.println("Correo " +i+ ".- " +correosUnivo.get(i-1));
        }
    }

    public void agregarCorreo(String nuevoCorreo) {
        correosUnivo.add(nuevoCorreo);
        System.out.println(nuevoCorreo+" ha sido agregado a la lista de correos");
    }
    
    public void eliminarArtnom(String nombre){
        if(correosUnivo.contains(nombre)){
            System.out.println("El correo " + nombre +" ha sido eliminado");
            correosUnivo.remove(nombre);
        } else {
            System.out.println("Correo no encontrado");
        }
    }
    
    public void mostrarCadena(){
        for(int i = 0; i<correosUnivo.size(); i++){
            System.out.println("Enviando mensaje... Hola " + correosUnivo.get(i));
        }
    }
    
     public void editar(int indice, String nuevo){
        if (indice > 0 && indice < correosUnivo.size()+1){
            System.out.println("Haz sustituido " + correosUnivo.get(indice-1)+" por: "+ nuevo);
            correosUnivo.set(indice-1, nuevo);
        } else {
            System.out.println("El elemento no se encuentra en la lista como para ser editado");
        }
    }
    
    public void vaciarList() {
        correosUnivo.clear();
        System.out.println("La lista ha sido vaciada con éxito");
    }
}
