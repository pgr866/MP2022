package org.mp.sesion04;

import org.mp.sesion03.LinkedList;

/**
 * Clase generica que permite implementar colas usando composicion con
 * LinkedList
 * 
 * @author Pablo
 * @param <E>
 * @version 1.0
 */
public class GenericQueue<E> {

	private LinkedList<E> lista = new LinkedList<E>();

	/**
	 * Anade un elemento a la cola
	 * 
	 * @param e objeto de tipo generico a anadir
	 */
	public void enqueue(E e) {
		lista.addLast(e);
	}

	/**
	 * Elimina un elemento por la cabeza de la cola
	 * 
	 * @return devuelve el elemento eliminado
	 */
	public E dequeue() {
		return lista.removeFirst();
	}

	/**
	 * Getter
	 * 
	 * @return devuelve el numero de elementos de la cola
	 */
	public int getSize() {
		return lista.size();
	}

	/**
	 * Convierte la cola en un String
	 * 
	 * @return la cola en forma de cadena String
	 */
	@Override
	public String toString() {
		return "Cola: " + lista.toString();
	}
}
