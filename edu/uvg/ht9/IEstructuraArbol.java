/**
 * 
 */
package edu.uvg.ht9;

/*
 * Ignacio Méndez (22613)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 9
 * 21-04-2023
 * Clase IEstructuraArbol
 * Obtenida de: Moisés Alonso
 */

/**
 * @author MAAG
 *
 */
public interface IEstructuraArbol<T> {

	public void add(T value);
	
	public T get(T key);
	
	public T remove(T key);
	
	public int count();
	
	public boolean isEmpty();
	
}
