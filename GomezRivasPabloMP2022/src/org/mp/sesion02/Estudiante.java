package org.mp.sesion02;

/**
 * Clase que representa estudiantes, que son (hereda de) personas
 * 
 * @author Pablo
 * @version 1.0
 */
public class Estudiante extends Persona {
	private int nivel;

	/**
	 * Constructor
	 * 
	 * @param nombre    del estudiante
	 * @param direccion del estudiante
	 * @param telefono  del estudiante
	 * @param email     del estudiante
	 * @param nivel     del estudiante
	 */
	public Estudiante(String nombre, String direccion, String telefono, String email, int nivel) {
		super(nombre, direccion, telefono, email);
		this.nivel = nivel;
	}

	/**
	 * Metodo que convierte cualquier objeto de la clase a String
	 * 
	 * @return datos del estudiante en forma de String
	 */
	public String toString() {
		String nivelString = "";
		switch (nivel) {
		case 1:
			nivelString = "Grado";
			break;
		case 2:
			nivelString = "Máster";
			break;
		case 3:
			nivelString = "Doctorado";
			break;
		}
		return "Estudiante de " + nivelString + "\n" + "Nombre = " + this.nombre + ", Dirección = " + this.direccion
				+ ", Teléfono = " + this.telefono + ", email = " + this.email;
	}
}
