/**
 * 
 */
package edu.uvg.ht9;

import java.util.Comparator;
import structure5.BinarySearchTree;

/*
 * Ignacio Méndez (22613)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 9
 * 21-04-2023
 * Clase ArbolBinarySearchTree
 */

/**
 *
 */
public class ArbolBinarySearchTree<T extends Comparable<T>> implements IEstructuraArbol<T> {

	private BinarySearchTree<T> miInternalTree;
	
	public ArbolBinarySearchTree() {
		miInternalTree = new BinarySearchTree<T>();
	}
	
	public ArbolBinarySearchTree(Comparator<T> comparador) {
		miInternalTree = new BinarySearchTree<T>(comparador);
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
	 * @return BinarySearchTree<T>
	 */
	public BinarySearchTree<T> getInternalTree(){
		return miInternalTree;
	}

}
