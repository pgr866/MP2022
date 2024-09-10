package org.mp.sesion02;

/**
 * Clase que representa fracciones
 * 
 * @author Pablo
 * @version 2.0
 * 
 * @param <E> tipo generico formal
 */
public abstract class MatrizGenerica<E extends Number> {

	/**
	 * Metodo abstracto para sumar dos objetos
	 * 
	 * @param o1
	 * @param o2
	 * @return suma de o1 y o2
	 */
	protected abstract E sumar(E o1, E o2);

	/**
	 * Metodo abstracto para multiplicar dos objetos
	 * 
	 * @param o1
	 * @param o2
	 * @return producto de o1 por o2
	 */
	protected abstract E multiplicar(E o1, E o2);

	/**
	 * Metodo abstracto de cero
	 * 
	 * @return valor nulo para cada clase
	 */
	protected abstract E cero();

	/**
	 * Metodo para sumar dos matrices
	 * 
	 * @param matriz1 es el primer array que se pasa como parametro
	 * @param matriz2 es el segundo array que se pasa como parametro
	 * @return suma de la primera matriz y la segunda si tienen misma dimension, y
	 *         si no, devuelve una excepcion
	 */
	public E[][] sumarMatrices(E[][] matriz1, E[][] matriz2) {

		if (!(matriz1.length == matriz2.length && matriz1[0].length == matriz2[0].length))
			throw new RuntimeException("Las matrices no tienen el mismo tamaño");

		E[][] resultado = (E[][]) new Number[matriz1.length][matriz1[0].length];
		for (int i = 0; i < resultado.length; i++)
			for (int j = 0; j < resultado[0].length; j++)
				resultado[i][j] = sumar(matriz1[i][j], matriz2[i][j]);
		return resultado;
	}

	/**
	 * Metodo para multiplicar dos matrices
	 * 
	 * @param matriz1 es el primer array que se pasa como parametro
	 * @param matriz2 es el segundo array que se pasa como parametro
	 * @return producto de la primera matriz por la segunda si coinciden el numero
	 *         de columnas de la primera y el numero de filas de la segunda, y si
	 *         no, devuelve una excepcion
	 */
	public E[][] multiplicarMatrices(E[][] matriz1, E[][] matriz2) {

		if (matriz1[0].length != matriz2.length)
			throw new RuntimeException("No coinciden las columnas de la primera matriz con las filas de la segunda");

		E[][] resultado = (E[][]) new Number[matriz1.length][matriz2[0].length];
		E sumatoria;
		for (int i = 0; i < resultado.length; i++)
			for (int j = 0; j < resultado[0].length; j++) {
				sumatoria = cero();
				for (int k = 0; k < matriz1[0].length; k++)
					sumatoria = sumar(sumatoria, multiplicar(matriz1[i][k], matriz2[k][j]));
				resultado[i][j] = sumatoria;
			}
		return resultado;
	}
}
