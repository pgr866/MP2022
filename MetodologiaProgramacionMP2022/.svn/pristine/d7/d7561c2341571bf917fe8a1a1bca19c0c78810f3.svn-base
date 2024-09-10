package org.mp.tema00;

import java.util.Arrays;
import java.util.Scanner;

public class Busqueda1 {
	private static Scanner entrada;

	/** El método busca el valor clave en el array a */
	public static int busquedaLineal(int[] a, int clave) {
		for (int i = 0; i < a.length; i++) {
			if (clave == a[i])
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 4, 6, 8, -5, 1 };

		entrada = new Scanner(System.in);
		System.out.println("Introduce el valor que buscas en el array ");
		int clave = entrada.nextInt();
		int posicion = busquedaLineal(a, clave);
		if (posicion == -1) {
			System.out.println("El valor " + clave + " no está en el array");
			System.out.println(Arrays.toString(a));
		} else {
			System.out.println("El valor " + clave + " está en el array en la posición " + (posicion + 1));
			System.out.println(Arrays.toString(a));
		}
	}
}

