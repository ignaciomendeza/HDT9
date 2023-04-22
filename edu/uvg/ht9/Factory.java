package edu.uvg.ht9;

import java.util.*;

/*
 * Ignacio Méndez (22613)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 9
 * 21-04-2023
 * Clase Factory
 */

public class Factory {
	
	/***
	 * @param type 
	 */
	public IEstructuraArbol<Palabra> getInstance(int type) {
		
		IEstructuraArbol<Palabra> treeInstance;
        ComparadorPalabras<Palabra> comparador = new ComparadorPalabras<Palabra>();
		
		switch (type) {
		case 1:{
			treeInstance = new ArbolSplay<Palabra>();
		}break;
		
		case 2:{
			treeInstance = new ArbolRedBlack<Palabra>();
		}break;

        case 3:{
			treeInstance = new ArbolBinarySearchTree<Palabra>(comparador);
		}break;
		
		default:{
			treeInstance = null;
		}
		}
		
		return treeInstance;
	}

}
