package edu.uvg.ht9;

/*
 * Ignacio Méndez (22613)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 9
 * 21-04-2023
 * Clase Principal: Interacción con el usuario
 */

import java.util.*;
import java.util.Scanner;


public class Principal {

    
    /** 
     * @param args
     */
    public static void main(String[] args){

        Scanner teclado = new Scanner (System.in);

        Archivo archivo = new Archivo("./Spanish.txt");
        ArrayList<String> lineasDatos = archivo.leerArchivo();
        Archivo archivo2 = new Archivo("./texto.txt");
        ArrayList<String> lineasDatos2 = archivo2.leerArchivo();
        

        int tipo = 0;
        boolean seguir = true;
        String menu = "--------------------DICCIONARIO INGLÉS - ESPAÑOL--------------------\nIndique qué árbol desea utilizar:\n1. SplayTree \n2. RedBlackTree\n3. BinarySearchTree";
        
        try {
            while (seguir){
                System.out.println(menu);
                tipo = teclado.nextInt();
                teclado.nextLine();
                
                Diccionario diccionario = new Diccionario(tipo);
                diccionario.guardarDatos(lineasDatos);
    
                System.out.println(diccionario.traducir(lineasDatos2));
    
                System.out.println("¿Desea utilizar otro árbol? (1. Si, 2. No)");
                int respuesta = teclado.nextInt();
                teclado.nextLine();
    
                if (respuesta == 2){
                    seguir = false;
                }
            }
            
        } catch (Exception nullException) {
            System.out.println("No se pudo realizar la operación, revise su entrada");
        }


    }
}