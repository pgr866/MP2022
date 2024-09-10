package org.mp.sesion05;

import java.util.Random;

/**
 * Clase que representa una baraja de cartas
 * 
 * @author Pablo
 * @version 1.0
 */
public class Baraja {

	private String nombreBaraja;
	private Carta[] cartas;

	/**
	 * Constructor por defecto
	 * 
	 * Crea una baraja de cartas nulas
	 */
	public Baraja() {
		this.nombreBaraja = "";
		for (int i = 0; i < cartas.length; i++) {
			cartas[i] = new Carta();
		}
	}

	/**
	 * Constructor
	 * 
	 * @param nombreBaraja cadena String como parametro
	 * @param cartas       array de objetos de la clase Carta como parametro
	 */
	public Baraja(String nombreBaraja, Carta[] cartas) {
		this.nombreBaraja = nombreBaraja;
		this.cartas = new Carta[cartas.length];
		for (int i = 0; i < cartas.length; i++) {
			this.cartas[i] = cartas[i];
		}
	}

	/**
	 * Getter
	 * 
	 * @return nombreBaraja devuelve el nombre de la baraja
	 */
	public String getNombreBaraja() {
		return nombreBaraja;
	}

	/**
	 * Getter
	 * 
	 * @return cartas devuelve un array de la clase Carta
	 */
	public Carta[] getCartas() {
		return cartas;
	}

	/**
	 * Ordena de menor a mayor un array de objetos de la clase Carta
	 * 
	 * @param cartas array de objetos de la clase Carta como parametro
	 */
	public void insercion(Carta[] cartas) {
		for (int i = 1; i < cartas.length; i++) {
			Carta aux = cartas[i];
			int j;
			for (j = i - 1; j >= 0 && aux.compareTo(cartas[j]) < 0; j--) {
				cartas[j + 1] = cartas[j];
			}
			// Inserto el elemento (aux) en a[j + 1]
			cartas[j + 1] = aux;
		}
	}

	/**
	 * Mezcla de forma aleatoria el array de objetos de la clase Carta
	 * 
	 * @param cartas array de objetos de la clase Carta como parametro
	 */
	public void barajar(Carta[] cartas) {

		Random rand = new Random();
		for (int i = 0; i < 160; i++) {
			int x = rand.nextInt(40);
			int y = rand.nextInt(40);

			Carta swap = cartas[x];
			cartas[x] = cartas[y];
			cartas[y] = swap;
		}
	}

}