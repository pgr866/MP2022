package org.mp.tema00;

import java.util.Arrays;

public class Ordenacion {

	public static void insercion(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int aux = a[i];
			int j;
			for (j = i - 1; j >= 0 && aux < a[j]; j--) {
				a[j + 1] = a[j];
			}
			// Inserto el elemento (aux) en a[j + 1]
			a[j + 1] = aux;
		}
	}

	public static void main(String[] args) {

		int[] a = { 2, 9, 5, 4, 8, 1, 6 };

		System.out.println("Array sin ordenar " + Arrays.toString(a));
		insercion(a);
		System.out.println("Array ordenado por el método de inserción " + Arrays.toString(a));

	}
}


