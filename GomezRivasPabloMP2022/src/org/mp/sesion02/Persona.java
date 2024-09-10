package org.mp.sesion02;

/**
 * Clase que representa personas
 * 
 * @author Pablo
 * @version 1.0
 */
public class Persona {

	protected String nombre;
	protected String direccion;
	protected String telefono;
	protected String email;

	/**
	 * Constructor
	 * 
	 * @param nombre    de la persona
	 * @param direccion de la persona
	 * @param telefono  de la persona
	 * @param email     de la persona
	 */
	public Persona(String nombre, String direccion, String telefono, String email) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
	}

}
