package org.mp.sesion02;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Clase que representa un iterador de primos (implementa interface Iterator)
 * 
 * @author Pablo
 * @version 1.0
 */
public class IteradorPrimos implements Iterator<Integer> {

	private int limite;
	private int actual;

	/**
	 * Constructor
	 * 
	 * @param limite es el numero de primos que deseo generar actual es el valor del
	 *               ultimo primo calculado
	 */
	public IteradorPrimos(int limite) {
		this.limite = limite;
		this.actual = 2;
	}

	/**
	 * Getter
	 * 
	 * @return limite
	 */
	public int getLimite() {
		return limite;
	}

	/**
	 * Getter
	 * 
	 * @return actual
	 */
	public int getActual() {
		return actual;
	}

	/**
	 * Metodo que devuelve true si quedan mas iteraciones antes del limite, y si no,
	 * false
	 */
	@Override
	public boolean hasNext() {
		return actual <= limite;
	}

	/**
	 * Metodo que devuelve el primo actual, calcula el siguiente y lo guarda en el
	 * atributo actual para devolverlo en la siguiente iteracion Devuelve excepcion
	 * si hemos alcanzado el limite
	 */
	@Override
	public Integer next() {

		if (!hasNext())
			throw new NoSuchElementException("No se puede acceder a más números primos");

		int aux = actual;
		do {
			actual++;
		} while (!esPrimo(actual));

		return aux;
	}

	/**
	 * Metodo que elimina el último elemento devuelto por el iterador (no soportado)
	 */
	public void remove() {
		throw new UnsupportedOperationException("Método no soportado");
	}

	/**
	 * Metodo que comprueba si un numero es primo o no
	 * 
	 * @param numero es el numero a comprobar si es primo
	 * @return true si es primo, o false si no lo es
	 */
	public static boolean esPrimo(int numero) {

		if (numero == 1)
			return false;

		if (numero % 2 == 0)
			if (numero == 2)
				return true;
			else
				return false;

		double raiz = Math.sqrt(numero);
		int resto = 1;

		for (int i = 3; resto != 0 && i <= raiz; i += 2)
			resto = (int) (numero % i);

		if (resto == 0)
			return false;
		else
			return true;
	}

	/**
	 * @return los primos iterados hasta el limite en una cadena String
	 */
	public String mostrarPrimos() {
		String cadena = "";

		for (int i = 1; hasNext(); i++) {
			if (i % 11 == 0)
				cadena += ("\n\t" + next());
			else
				cadena += ("\t" + next());
		}
		return cadena;
	}

}
