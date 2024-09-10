package org.mp.sesion04;

/**
 * Clase que permite resolver una variante del problema de Josephus
 * 
 * @author Pablo
 * @param <E>
 * @version 1.0
 */
public class GenericJosephus<E> {

	private int k;

	private int n;

	GenericQueue<E> cola;

	/**
	 * Constructor
	 * 
	 * @param k       es individuo que se elimina
	 * @param n       es numero de individuos
	 * @param objects array de objetos de tipo generico
	 */
	public GenericJosephus(int k, int n, E[] objects) {
		this.k = k;
		this.n = n;
		cola = new GenericQueue<>();
		if (objects != null)
			for (int i = 0; i < objects.length; i++)
				cola.enqueue(objects[i]);
	}

	/**
	 * Getter
	 * 
	 * @return devuelve la cola
	 */
	public GenericQueue<E> getCola() {
		return cola;
	}

	/**
	 * toString
	 * 
	 * @return devuelve un String con los atributos del objeto GenericJosephus
	 */
	public String toString() {
		return "Problema de Josephus: k=" + k + ", n=" + n + "\n" + cola.toString();
	}

	/**
	 * @throws lanza una excepcion en tiempo de ejecucion si no hay ninguna persona
	 *               (k=0)
	 * @param cola
	 * @return devuelve un String con el orden en el que las personas deben "morir"
	 *         en funcion de lo que valga k
	 */
	public String ordenEliminar(GenericQueue<E> cola) {
		if (n == 0)
			throw new RuntimeException("No hay ninguna persona");
		else if (n == 1)
			return "Solo hay una persona";
		else {
			String salida = "Orden de eliminación: \n";
			while (cola.getSize() > 0) {
				for (int i = 1; i < k; i++)
					cola.enqueue(cola.dequeue());
				salida += "Debe morir " + cola.dequeue() + "\n";
			}
			return salida;
		}
	}
}
