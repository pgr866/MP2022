package org.mp.sesion02;

import java.util.GregorianCalendar;

/**
 * Clase que representa Octogonos, que son (hereda de) Objetos Geometricos, son
 * comparables, clonables y tienen color
 * 
 * @author Pablo
 * @version 1.0
 */
public class Octogono extends ObjetoGeometrico implements Comparable<Octogono>, Cloneable, DeColor {

	private double lado;

	/**
	 * Constructor por defecto
	 * 
	 * Crea octogono blanco, sin relleno y de lado nulo
	 */
	public Octogono() {
		super();
		this.fechaCreado = super.fechaCreado;
		this.lado = 0;
	}

	/**
	 * Constructor
	 * 
	 * @param color   del octogono
	 * @param relleno es true si el octogono esta relleno, y si no, false
	 * @param lado    del octogono fechaCreado es la fecha en que se creo el
	 *                octogono
	 */
	public Octogono(String color, boolean relleno, double lado) {
		super(color, relleno);
		this.fechaCreado = super.fechaCreado;
		this.lado = lado;
	}

	/**
	 * @return un String de como colorear el octogono
	 */
	@Override
	public String comoColorear() {
		return "Colorear los 8 lados de " + this.color;
	}

	/**
	 * Metodo que compara dos objetos de la clase octogono
	 * 
	 * @param o es el segundo octogono
	 * @return 1 si el primer octogono es mayor que el segundo (pasado como
	 *         parametro)
	 * @return -1 si el primer octogono es menor que el segundo (pasado como
	 *         parametro)
	 * @return 0 si los dos octogonos son iguales
	 */
	@Override
	public int compareTo(Octogono o) {
		if (this.lado == o.lado)
			return 0;
		else if (this.lado > o.lado)
			return 1;
		else
			return -1;
	}

	/**
	 * Getter
	 * 
	 * @return perimetro del octogono
	 */
	@Override
	public double getPerimetro() {
		return this.lado * 8;
	}

	/**
	 * Getter
	 * 
	 * @return area del octogono
	 */
	@Override
	public double getArea() {
		return (2 + 4 / Math.sqrt(2)) * this.lado * this.lado;
	}

	/**
	 * Getter
	 * 
	 * @return lado del octogono
	 */
	public double getLado() {
		return this.lado;
	}

	/**
	 * Setter
	 * 
	 * @param lado es el nuevo valor que queremos darle al lado del octogono
	 */
	public void setLado(double lado) {
		this.lado = lado;
	}

	/**
	 * Metodo que convierte cualquier objeto de la clase a String
	 * 
	 * @return datos del octogono en forma de String
	 */
	@Override
	public String toString() {
		return "Creado el " + this.fechaCreado + "\ncolor: " + this.color + " y relleno: " + this.relleno;
	}

	/**
	 * Sobre-escribe el metodo clone protected definido en la clase Object y
	 * refuerza su accesibilidad
	 */
	@Override
	public Object clone() {
		try {
			// Realiza una copia superficial
			Octogono octogonoClonada = (Octogono) super.clone();
			// Copia profunda de fechaCreado
			octogonoClonada.fechaCreado = (GregorianCalendar) (fechaCreado.clone());
			return octogonoClonada;
		} catch (CloneNotSupportedException ex) {
			return null;
		}
	}
}
