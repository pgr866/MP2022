package org.mp.sesion07;

/**
 * Clase que permite crear las bandas de una imagen de satelite
 * 
 * @author Pablo
 * @version 1.0
 * @param <T>
 */
public class Banda<E extends Number> {

	private String nombreBanda;
	private E[][] datos;

	/**
	 * Constructor
	 * 
	 * @param nombre String con el nombre de la banda
	 * @param x      columnas
	 * @param y      filas
	 */
	public Banda(String nombre, int x, int y) {
		this.nombreBanda = nombre;
		this.datos = (E[][]) new Number[x][y];
	}

	/**
	 * Constructor
	 * 
	 * @param nombre nombre de la banda
	 * @param datos  matriz con los datos de la banda
	 */
	public Banda(String nombre, E[][] datos) {
		this.nombreBanda = nombre;
		this.datos = datos;
	}

	/**
	 * Getter
	 * 
	 * @return devuelve el nombre de la banda
	 */
	public String getNombreBanda() {
		return this.nombreBanda;
	}

	/**
	 * Setter
	 * 
	 * @param nombreBanda String con el nombre de la banda que queremos asignarle al
	 *                    atributo nombreBanda
	 */
	public void setNombreBanda(String nombreBanda) {
		this.nombreBanda = nombreBanda;
	}

	/**
	 * Getter
	 * 
	 * @return devuelve los datos de la banda
	 */
	public E[][] getDatos() {
		return datos;
	}

	/**
	 * Setter
	 * 
	 * @param datos matriz con los datos que queremos asignarle al atributo datos
	 */
	public void setDatos(E[][] datos) {
		this.datos = datos;
	}

	/**
	 * Getter
	 * 
	 * @param x
	 * @param y
	 * @return devuelve el elemento que se encuentra en la posicion (x,y) de la
	 *         matriz
	 */
	public E getDatoXY(int x, int y) {
		return datos[x][y];

	}

	/**
	 * Setter
	 * 
	 * @param dato elemento que queremos asignarle a la matriz en la posicion (x,y)
	 * @param x
	 * @param y
	 */
	public void setDatoXY(E dato, int x, int y) {
		this.datos[x][y] = dato;

	}

	/**
	 * Metodo que almacena en un String el nombre de la banda y sus datos
	 */
	public String toString() {
		String salida = nombreBanda + ": \n";

		for (int i = 0; i < datos.length; i++) {
			for (int j = 0; j < datos[0].length; j++) {
				salida += datos[i][j] + " ";
			}
			salida += "\n";
		}
		return salida;
	}

}