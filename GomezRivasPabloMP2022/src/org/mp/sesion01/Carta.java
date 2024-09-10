package org.mp.sesion01;

/**
 * Clase que representa Cartas
 * 
 * @author Pablo
 * @version 1.0
 */
public class Carta implements Comparable<Carta> {

	private String palo;
	private int numero;
	private int valor;

	/**
	 * Constructor por defecto
	 * 
	 * Crea una carta nula
	 */
	public Carta() {
		this.palo = "";
		this.numero = 0;
		this.valor = 0;
	}

	/**
	 * Constructor
	 * 
	 * @param palo   es el palo de la carta
	 * @param numero el es numero de la carta
	 */
	public Carta(String palo, int numero) {
		this.palo = palo;
		this.numero = numero;

		switch (this.palo) {
		case "O":
			this.valor = numero;
			break;
		case "C":
			this.valor = 12 + numero;
			break;
		case "E":
			this.valor = 12 * 2 + numero;
			break;
		case "B":
			this.valor = 12 * 3 + numero;
			break;
		default:
			this.valor = 0;
		}
	}

	/**
	 * Getter
	 * 
	 * @return palo devuelve el palo de la carta
	 */
	public String getPalo() {
		return palo;
	}

	/**
	 * Getter
	 * 
	 * @return numero devuelve el numero de la carta
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Getter
	 * 
	 * @return valor devuelve el valor de la carta
	 */
	public int getValor() {
		return valor;
	}

	/**
	 * Equals
	 * 
	 * Comprueba si las dos cartas son iguales
	 * 
	 * @param cartas
	 * @return devuelve true si las cartas son iguales, y si no false
	 */
	public boolean equals(Carta cartas) {
		// Carta otro = (Carta) obj; No se por que no va de esta manera
		if (this.numero == cartas.numero && this.palo == cartas.palo && this.valor == cartas.valor)
			return true;
		else
			return false;
	}

	/**
	 * Compare To
	 * 
	 * @return devuelve 1 si la primera carta es mayor que la pasada como parametro,
	 *         0 si son iguales, y -1 si la primera es menor
	 */
	@Override
	public int compareTo(Carta o) {
		if (this.valor == o.valor)
			return 0;
		else if (this.valor > o.valor)
			return 1;
		else
			return -1;
	}
}
