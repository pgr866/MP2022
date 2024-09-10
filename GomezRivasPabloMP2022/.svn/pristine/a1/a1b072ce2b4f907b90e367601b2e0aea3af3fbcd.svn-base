package org.mp.sesion03;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Clase generica para crear listas de tipo LinkedList
 * 
 * @author Pablo
 * @param <E>
 * @version 1.0
 */
public class LinkedList<E> extends AbstractList<E> {

	private Node<E> head, tail;

	/** Crea una lista por defecto */
	public LinkedList() {
	}

	/**
	 * Crea una lista a partir de un array de objetos
	 *
	 * @param objects es array de objetos para la lista
	 */
	public LinkedList(E[] objects) {
		super(objects); // se puede hacer porque aqui no hay ningun data
	}

	/** @return devuelve el primer elemento de la lista */
	public E getFirst() {
		return size == 0 ? null : head.element;
	}

	/** @return devuelve el último elemento de la lista */
	public E getLast() {
		return tail == null ? null : tail.element;
	}

	/**
	 * Añade un elemento a la cabeza de la lista
	 *
	 * @param e es elemento generico a comprobar si esta en la lista
	 */
	public void addFirst(E e) {
		Node<E> nuevoNodo = new Node<E>(e); // Crea un nodo
		nuevoNodo.next = head; // enlaza el nuevoNodo con la cabeza
		head = nuevoNodo; // la cabeza apunta al nuevoNodo
		size++; // incrementa el tamaño de la lista

		if (tail == null) // si la lista estaba vacia
			tail = head; // nuevoNodo es el único en la lista
	}

	/**
	 * Añade un elemento al final de la lista
	 * 
	 * @param e es elemento generico a comprobar si esta en la lista
	 */
	public void addLast(E e) {
		Node<E> nuevoNodo = new Node<E>(e); // Crea un nuevo nodo para e
		if (tail == null)
			head = tail = nuevoNodo; // El único nodo en la lista
		else
			tail = tail.next = nuevoNodo;// enlaza el nuevo nodo con el último nodo, al que apunta la cola

		size++; // incrementa el tamaño
	}

	@Override /**
				 * Añade un nuevo elemento en la posición especifica por index
				 *
				 * @param index es posicion del elemento indicado en la lista
				 * @param e     es elemento generico a comprobar si esta en la lista
				 */
	public void add(int index, E e) {
		if (index <= 0)
			addFirst(e); // Inserta al principio
		else if (index >= size)
			addLast(e); // Inserta al final
		else if (index > 0 || index < size - 1) {
			// Inserta en medio
			Node<E> current = head;
			for (int i = 1; i < index; i++) // N0 N1 N2 N3 N4 N5 N6
				current = current.next; // Situo current

			Node<E> temp = current.next; // Situo temp
			current.next = new Node<E>(e); // Inserto el nuevo nodo
			(current.next).next = temp; // enlazas el nuevoNodo con temp
			size++; // incrementa el tamaño
		}
	}

	/**
	 * Elimina el primer elemento de la lista
	 * 
	 * @return el elemento eliminado de la lista
	 */
	public E removeFirst() {
		if (size == 0)
			return null; // Nada que borrar
		else {
			Node<E> temp = head; // conserva el primer nodo temporalmente
			head = head.next; // mueve head para apuntar al siguiente nodo
			size--; // reduce en 1 el tamaño
			if (head == null) // si solo hubiera un nodo , al desplazar head , la lista se queda vacia al
				tail = null; // quitar el unico que habia y la lista se pone vacia
			return temp.element; // devuelve el elemento borrado
		}
	}

	/**
	 * Elimina el último elemento de la lista
	 * 
	 * @return el elemento eliminado de la lista
	 */
	public E removeLast() {
		if (size == 0)
			return null; // Nada que eliminar
		else if (size == 1) { // solo un elemento en la lista
			Node<E> temp = head;
			head = tail = null; // la lista la hacemos vacía
			size = 0;
			return temp.element;
		} else {
			Node<E> current = head;
			for (int i = 1; i < size - 1; i++)
				current = current.next;

			Node<E> temp = tail;
			tail = current;
			tail.next = null;
			size--;
			return temp.element;
		}
	}

	/**
	 * Elimina el elemento en la posición index
	 * 
	 * @param index es posicion del elemento indicado en la lista
	 * @return el elemento eliminado de la lista
	 */
	public E remove(int index) {
		if (index < 0 || index >= size)
			return null; // Fuera de rango
		else if (index == 0)
			return removeFirst(); // Elimina el primero
		else if (index == size - 1)
			return removeLast(); // Elimina el ultimo
		else {
			Node<E> current = head;

			for (int i = 1; i < index; i++)
				current = current.next;

			Node<E> temp = current.next;
			current.next = (current.next).next;
			size--;
			return temp.element;
		}
	}

	@Override /**
				 * Sobreescribe toString()
				 * 
				 * @return la lista en forma de cadena String
				 */
	public String toString() {
		String resultado = "[";
		if (size != 0) {
			Iterator<E> iterador = iterator();
			while (iterador.hasNext()) {
				resultado += iterador.next();
				if (iterador.hasNext())
					resultado += ", ";
			}
		}
		return resultado += "]";
	}

	/** Elimina todos los elementos de la lista */
	public void clear() {
		size = 0;
		head = tail = null;
	}

	/**
	 * Indica si la lista contiene el elemento e
	 *
	 * @param e es elemento generico a comprobar si esta en la lista
	 * @return true si la lista contiene el elemento e, si no false
	 */
	public boolean contains(E e) {
		for (int i = 0; i < size; i++)
			if (get(i).equals(e))
				return true;
		return false;
	}

	/**
	 * Indica el elemento en la posicion index especificada
	 * 
	 * @param index es posicion del elemento indicado en la lista
	 * @return elemento en la posicion index especificada
	 */
	public E get(int index) {
		Node<E> current = head;
		for (int i = 1; i <= index; i++)
			current = current.next;
		return current.element;
	}

	/**
	 * Indica el indice de la primera ocurrencia del elemento en la lista
	 *
	 * @param e es elemento generico a comprobar si esta en la lista
	 * @return primera posicion en la que se encuentra el elemento, o -1 si no esta
	 *         en la lista
	 */
	public int indexOf(E e) {
		for (int i = 0; i < size; i++)
			if (e.equals(get(i)))
				return i;
		return -1;
	}

	/**
	 * Indica el índice de la última ocurrencia del elemento en la lista
	 *
	 * @param e es elemento generico a comprobar si esta en la lista
	 * @return mayor posicion en la que se encuentra el elemento, o -1 si no esta en
	 *         la lista
	 */
	public int lastIndexOf(E e) {
		for (int i = size - 1; i >= 0; i--)
			if (e.equals(get(i)))
				return i;
		return -1;
	}

	/**
	 * Sustituye el elemento de la posición especificada en la lista por el elemento
	 * especificado
	 * 
	 * @param index es posicion del elemento indicado en la lista
	 * @param e     es elemento generico a comprobar si esta en la lista
	 * @return aux es el elemento sustituido por el nuevo
	 */
	public E set(int index, E e) {
		if (size == 0)
			return null;
		E temp = this.get(index);
		this.remove(index);
		this.add(index, e);
		return temp;
	}

	@Override /**
				 * Sobre-escribe el método iterator() definido en Iterable
				 * 
				 * @return devuelve una instancia de LinkedListIterator
				 */
	public Iterator<E> iterator() {
		return new LinkedListIterator();
	}

	/** Esta clase implementa la interface Iterator */
	private class LinkedListIterator implements Iterator<E> {
		private Node<E> current = head;

		@Override /**
					 * @return true si la lista tiene un elemento siguiente
					 * @return false si no tiene siguiente
					 */
		public boolean hasNext() {
			return current != null;
		}

		@Override /** @return devuelve el elemento actual y apunta al siguiente */
		public E next() {
			if (!hasNext())
				throw new NoSuchElementException("No hay más elementos en la lista");
			E temp = current.element;
			current = current.next;
			return temp;
		}

		@Override /**
					 * Utiliza el metodo remove de la clase AbstractList elimina la primera
					 * ocurrencia del elemento en la lista
					 */
		public void remove() {
			if (size != 0)
				LinkedList.this.remove(current.element);
		}
	}

	// Esta clase solo se usa en LinkedList, por eso es private. Es estatica porque
	// no necesita acceder a ningún miembro de instancia de LinkedList
	/**
	 * Clase privada que representa Nodos
	 * 
	 * @author Pablo
	 * @param <E> es tipo generico
	 * @version 1.0
	 */
	private static class Node<E> {
		E element;
		Node next;

		/**
		 * Constructor
		 * 
		 * @param o es objeto generico y contenido del nodo
		 */
		public Node(E o) {
			element = o;
		}
	}
}
