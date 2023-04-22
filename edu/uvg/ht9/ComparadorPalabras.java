/**
 * 
 */
package edu.uvg.ht9;

import java.util.Comparator;

/*
 * Ignacio Méndez (22613)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 9
 * 21-04-2023
 * Clase ComparadorPalabras
 * Obtenida de: Moisés Alonso
 */

/**
 * @author MAAG
 *
 */
public class ComparadorPalabras<T> implements Comparator<T> {

	
	/** 
	 * @param o1
	 * @param o2
	 * @return int
	 */
	@Override
	public int compare(T o1, T o2) {
		Palabra pal1 = (Palabra)o1;
		Palabra pal2 = (Palabra)o2;
		return pal1.getEnglish().compareTo(pal2.getEnglish());
	}

}
