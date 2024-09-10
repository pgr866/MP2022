package org.mp.sesion02;

import java.util.GregorianCalendar;

/**
 * Clase que representa administrativos, que son (hereda de) empleados, que a su
 * vez son personas
 * 
 * @author Pablo
 * @version 1.0
 */
public class Administrativo extends Empleado {
	private String unidadDestino;

	/**
	 * Constructor
	 * 
	 * @param nombre            del administrativo
	 * @param direccion         del administrativo
	 * @param telefono          del administrativo
	 * @param email             del administrativo
	 * @param despacho          del administrativo
	 * @param salario           del administrativo en euros por mes
	 * @param fechaContratacion es la fecha en que el administrativo fue contratado
	 * @param unidadDestino     es la unidad de destino del administrativo
	 */
	public Administrativo(String nombre, String direccion, String telefono, String email, String despacho, int salario,
			GregorianCalendar fechaContratacion, String unidadDestino) {
		super(nombre, direccion, telefono, email, despacho, salario, fechaContratacion);
		this.unidadDestino = unidadDestino;
	}

	/**
	 * Metodo que convierte cualquier objeto de la clase a String
	 * 
	 * @return datos del administrativo en forma de String
	 */
	public String toString() {
		return "Administrativo\n" + "Nombre = " + this.nombre + ", Dirección = " + this.direccion + ", Teléfono = "
				+ this.telefono + ", email = " + this.email + "\n" + "Despacho = " + this.despacho + ", salario = "
				+ this.salario + ", Fecha de contratación = " + this.fechaContratacion.get(GregorianCalendar.DATE)
				+ "/" + (this.fechaContratacion.get(GregorianCalendar.MONTH) + 1) + "/"
				+ this.fechaContratacion.get(GregorianCalendar.YEAR) + "\n" + "Destinado en la unidad "
				+ this.unidadDestino;
	}
}
