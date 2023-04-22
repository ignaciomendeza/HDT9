/**
 * 
 */
package edu.uvg.ht9;

import java.util.Comparator;

import structure5.*;

/*
 * Ignacio Méndez (22613)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 9
 * 21-04-2023
 * Clase ArbolSplay
 * Obtenida de: Moisés Alonso
 */

/**
 * @author MAAG
 *
 */
public class ArbolSplay<T extends Comparable<T>> implements IEstructuraArbol<T> {

	private SplayTree<T> miInternalTree;
	
	public ArbolSplay() {
		miInternalTree = new SplayTree<T>();
	}
	
	public ArbolSplay(Comparator<T> comparador) {
		miInternalTree = new SplayTree<T>(comparador);
	}
	
	
	/** 
	 * @param value
	 */
	@Override
	public void add(T value) {
		miInternalTree.add(value);
		
	}

	
	/** 
	 * @param key
	 * @return T
	 */
	@Override
	public T get(T key) {
		return miInternalTree.get(key);
	}

	
	/** 
	 * @param key
	 * @return T
	 */
	@Override
	public T remove(T key) {
		return miInternalTree.remove(key);
	}

	
	/** 
	 * @return int
	 */
	@Override
	public int count() {
		return miInternalTree.size();
	}

	
	/** 
	 * @return boolean
	 */
	@Override
	public boolean isEmpty() {
		return miInternalTree.isEmpty();
	}
	
	
	/** 
	 * @return SplayTree<T>
	 */
	public SplayTree<T> getInternalTree(){
		return miInternalTree;
	}

}
