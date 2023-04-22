/**
 * 
 */
package edu.uvg.ht9;

import structure5.RedBlackSearchTree;

/*
 * Ignacio Méndez (22613)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 9
 * 21-04-2023
 * Clase ArbolRedBlack
 * Obtenida de: Moisés Alonso
 */

/**
 * @author MAAG
 *
 */
public class ArbolRedBlack<T extends Comparable<T>> implements IEstructuraArbol<T> {

	private RedBlackSearchTree<T> myInternalTree;
	
	public ArbolRedBlack() {
		myInternalTree = new RedBlackSearchTree<T>();
	}
	
	
	/** 
	 * @param value
	 */
	@Override
	public void add(T value) {
		myInternalTree.add(value);
	}

	
	/** 
	 * @param key
	 * @return T
	 */
	@Override
	public T get(T key) {
		return myInternalTree.get(key);
	}

	
	/** 
	 * @param key
	 * @return T
	 */
	@Override
	public T remove(T key) {
		return myInternalTree.remove(key);
	}

	
	/** 
	 * @return int
	 */
	@Override
	public int count() {
		return myInternalTree.size();
	}

	
	/** 
	 * @return boolean
	 */
	@Override
	public boolean isEmpty() {
		return myInternalTree.isEmpty();
	}
	
	
	/** 
	 * @return RedBlackSearchTree<T>
	 */
	public RedBlackSearchTree<T> getInternalTree(){
		return myInternalTree;
	}

}
