package org.mp.sesion05;

import java.util.Arrays;

public class Ordenacion {
	public static void ordenacionPorInsercion(Comparable[] a) {
		ordenacionPorInsercion(a, 0, a.length - 1);
	}

	private static void ordenacionPorInsercion(Comparable[] a, int izq, int der) {
		int j;
		for (int i = izq + 1; i <= der; i++) {
			Comparable aux = a[i];
			for (j = i - 1; j >= izq && (aux.compareTo(a[j]) < 0); j--)
				a[j + 1] = a[j];
			a[j + 1] = aux;
		}
	}

	public static void mergeSort(Comparable[] a) {
		Comparable[] vectorTemp = new Comparable[a.length];
		mergeSort(a, vectorTemp, 0, a.length - 1);
	}

	private static void mergeSort(Comparable[] a, Comparable[] vectorTemp, int izq, int der) {
		if (izq < der) {
			int centro = (izq + der) / 2;
			mergeSort(a, vectorTemp, izq, centro);
			mergeSort(a, vectorTemp, centro + 1, der);
			mezclar(a, vectorTemp, izq, centro + 1, der);
		}
	}

	private static void mezclar(Comparable[] a, Comparable[] vectorAux, int posIzq, int posDer, int posFin) {
		int finIzq = posDer - 1;
		int posAux = posIzq;
		int numElementos = posFin - posIzq + 1;
		while ((posIzq <= finIzq) && (posDer <= posFin)) {
			if (a[posIzq].compareTo(a[posDer]) <= 0)
				vectorAux[posAux++] = a[posIzq++];
			else
				vectorAux[posAux++] = a[posDer++];
		}
		// Copiar el resto de la primera mitad
		while (posIzq <= finIzq)
			vectorAux[posAux++] = a[posIzq++];
		// Copiar el resto de la segunda mitad
		while (posDer <= posFin)
			vectorAux[posAux++] = a[posDer++];
		// Copiar el vector temporal en el original
		for (int i = 0; i < numElementos; i++, posFin--)
			a[posFin] = vectorAux[posFin];
	}

	public static void sort(Comparable[] a) {
		Arrays.sort(a);
	}
}
