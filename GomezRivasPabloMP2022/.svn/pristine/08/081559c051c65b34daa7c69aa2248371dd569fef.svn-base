package org.mp.sesion03;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Clase que representa listas de tipo ArrrayList
 * 
 * @author Pablo
 * @param <E> es tipo generico
 * @version 1.0
 */
public class ArrayList<E> extends AbstractList<E> {

	/** Es la capacidad inicial de la lista */
	private static final int CAPACIDAD_INICIAL = 16;

	private E[] data = (E[]) new Object[CAPACIDAD_INICIAL]; // Crea un array

	/** Crea una lista por defecto */
	public ArrayList() {
	}

	/** Crea una lista a partir de un array de objetos */
	public ArrayList(E[] objects) {
		for (int i = 0; i < objects.length; i++)
			add(objects[i]);
	}

	@Override /** Añade un nuevo elemento en la posicion especificada por index */
	public void add(int index, E e) {
//		 checkIndex(index); pero hasta data.length
		if (index < 0 || index > data.length)
			throw new IndexOutOfBoundsException("Indice: " + index + ", Tamaño: " + size);
		ensureCapacity();
//		 Mueve los elementos a la derecha desde la posición especificada por index
		for (int i = size - 1; i >= index; i--)
			data[i + 1] = data[i];
//		 Inserta un nuevo elemento en data[index]
		data[index] = e;
//		 Incrementa el tamaño en 1
		size++;
	}

	/**
	 * Verifica cuando el array está lleno. De ser así, crea un nuevo array con el
	 * doble tamaño más 1 y copia el array en el nuevo utilizando el método System.
	 * arraycopy y pone el nuevo array como el array a utilizar
	 */
	private void ensureCapacity() {
		if (size == data.length) {
			E[] aux = (E[]) new Object[data.length * 2 + 1];
			for (int i = 0; i < size; i++)
				aux[i] = data[i];
//			System.arraycopy(data, 0, aux, 0, size);
			data = aux;
		}
	}

	@Override /** Elimina todos los elementos de la lista */
//	 Crea un nuevo array de tamaño CAPACIDAD_INICIAL y resetea la variable size a
//	 0
	public void clear() {
		data = (E[]) new Object[CAPACIDAD_INICIAL];
		size = 0;
	}

	@Override /** Devuelve true si la lista contiene el elemento */
//	 Comprueba si e está en el array comparando cada elemento del array con e
//	 usando para
//	 ello equals
	public boolean contains(E e) {
		for (int i = 0; i < size; i++) {
			if (e.equals(data[i]))
				return true;
		}
		return false;
	}

	@Override /** Devuelve el elemento en la posicion index especificada */
	public E get(int index) {
		checkIndex(index);
		return data[index];
	}

	/**
	 * Comprueba si el indice que paso como parametro se encuentra entre 0 y el
	 * tamaño de la lista
	 * 
	 * @param index
	 */
	private void checkIndex(int index) {
		if (index < 0 || index >= size) // Comprueba si index está en el rango
			// Si no, el método lanza esa Excepción
			throw new IndexOutOfBoundsException("Indice: " + index + ", Tamaño: " + size);
	}

	/**
	 * Devuelve la longitud de la lista
	 */
	private int getLength() {
		return data.length;
	}

	@Override /**
				 * Devuelve el índice de la primera ocurrencia del elemento en la lista.
				 * Devuelve -1 si no está.
				 */
	public int indexOf(E e) {
		for (int i = 0; i < size; i++) {
			if (e.equals(data[i]))
				return i;
		}
		return -1;
	}

	@Override /**
				 * Devuelve el índice de la última ocurrencia del elemento en la lista. Devuelve
				 * -1 si no está.
				 */
	public int lastIndexOf(E e) {
		for (int i = size - 1; i >= 0; i--) {
			if (e.equals(data[i]))
				return i;
		}
		return -1;
	}

	@Override /**
				 * Elimina el elemento en la posición especificada en la lista. Desplaza la
				 * subsecuencia de elementos a la izquierda. Devuelve el elemento eliminado.
				 */
	public E remove(int index) {
		checkIndex(index);
		E eliminado = data[index];
		for (int i = index; i < size - 1; i++)
			data[i] = data[i + 1];
		data[--size] = null;
		return eliminado;
	}

	@Override /**
				 * Sustituye el elemento de la posición especificada en la lista por el elemento
				 * especificado.
				 */
	public E set(int index, E e) {
		checkIndex(index);
		E aux = data[index];
		data[index] = e;
		return aux;
	}

	@Override /** Convierte la lista en un String */
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

	/** Ajusta la capacidad del array al tamaño de la lista */
	public void trimToSize() {
		if (size != data.length) {
			E[] aux = (E[]) new Object[size];
			for (int i = 0; i < size; i++)
				aux[i] = data[i];
//			System.arraycopy(data, 0, aux, 0, size);
			data = aux;
		} else {
			throw new RuntimeException("Guapit@ no necesitas hacer un trim, el tamaño coincide con la capacidad");
		}
	}

	@Override /** Sobre-escribe el método iterator() definido en Iterable */
	// Devuelve una instancia de java.util.Iterator, una instancia de
	// ArrayListIterator
	public Iterator<E> iterator() {
		return new ArrayListIterator();
	}

	/**
	 * Clase privada que implementa la interfaz Iterator
	 * 
	 * @author Pablo
	 * @version 2.0
	 */
	private class ArrayListIterator implements Iterator<E> {
		private int current = 0;

		/**
		 * Metodo que comprueba si la lista tiene elemento siguiente
		 * 
		 * @return true si el iterator tiene elemento siguiente
		 * @return false si no tiene siguiente
		 */
		@Override
		public boolean hasNext() {
			return current < size;
		}

		/**
		 * Devuelve la posicion actual y avanza al siguiente elemento
		 */
		@Override
		public E next() {
			if (!hasNext())
				throw new NoSuchElementException("No hay más elementos en la lista");
			return data[current++];
		}

		/**
		 * Elimina el elemento de la posicion current, la que devolveria el metodo next
		 */
		@Override
		public void remove() {
			if (size != 0)
				ArrayList.this.remove(current);
		}
	}

}
