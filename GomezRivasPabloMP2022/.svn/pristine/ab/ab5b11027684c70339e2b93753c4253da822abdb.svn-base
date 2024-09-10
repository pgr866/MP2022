package org.mp.sesion02;

import java.util.GregorianCalendar;

/**
 * Clase que representa Objetos Geometricos
 * 
 * @author Pablo
 * @version 1.0
 */
public abstract class ObjetoGeometrico {

	protected String color;
	protected boolean relleno;
	protected GregorianCalendar fechaCreado;

	/**
	 * Constructor por defecto
	 * 
	 * Crea objeto geometrico blanco y sin relleno fechaCreado es la fecha en que se
	 * creo el objeto geometrico
	 */
	protected ObjetoGeometrico() {
		this.color = "blanco";
		this.relleno = false;
		this.fechaCreado = new GregorianCalendar();
	}

	/**
	 * Constructor
	 * 
	 * @param color   del objeto geometrico
	 * @param relleno es true si el octogono esta relleno, y si no, false
	 *                fechaCreado es la fecha en que se creo el objeto geometrico
	 */
	protected ObjetoGeometrico(String color, boolean relleno) {
		this.color = color;
		this.relleno = relleno;
		this.fechaCreado = new GregorianCalendar();
	}

	/**
	 * Getter
	 * 
	 * @return color del objeto geometrico
	 */
	public String getColor() {
		return this.color;
	}

	/**
	 * Setter
	 * 
	 * @param color es el nuevo color que queremos darle al objeto geometrico
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return true si el objeto geometrico esta relleno, y si no, false
	 */
	public boolean esRelleno() {
		return this.relleno;
	}

	/**
	 * Setter
	 * 
	 * @param relleno true si queremos que el objeto geometrico tenga relleno, y si
	 *                no, false
	 */
	public void setRelleno(boolean relleno) {
		this.relleno = relleno;
	}

	/**
	 * Getter
	 * 
	 * @return fechaCreado es la fecha en que se creo el objeto geometrico
	 */
	public GregorianCalendar getFechaCreado() {
		return this.fechaCreado;
	}

	/**
	 * Metodo que convierte cualquier objeto de la clase a String
	 * 
	 * @return datos del objeto geometrico en forma de String
	 */
	@Override
	public String toString() {
		return "";
	}

	/**
	 * Metodo abstracto getter
	 * 
	 * @return perimetro del objeto geometrico
	 */
	public abstract double getPerimetro();

	/**
	 * Metodo abstracto getter
	 * 
	 * @return area del objeto geometrico
	 */
	public abstract double getArea();

}
