package org.mp.tema00;

import java.util.Arrays;
import java.util.Scanner;

public class Busqueda2 {

	private static Scanner entrada;

	public static int busquedaBinaria(int [] a, int clave){
		int primero = 0;
		int ultimo = a.length-1;
		int central;
		if (clave < a[0] || clave > a[a.length -1])
			return -1;
		else{
			while (ultimo >= primero){
				central = (primero + ultimo)/ 2;
				if (clave < a[central]) //subarray izquierdo
					ultimo = central -1;
				else if (clave > a[central])//subarray derecho
					primero = central + 1;
				else
					return central;
			}
			return -1;
		}
	}
	
	public static void main(String[] args) {

		int[] a = { 4, 6, 8, 10, 12, 14, 16 };
		entrada = new Scanner(System.in);
		System.out.println("Introduce el valor que buscas en el array ");
		int clave = entrada.nextInt();
		int posicion = busquedaBinaria(a, clave);
		if (posicion == -1) {
			System.out.println("El valor " + clave + " no está en el array");
			System.out.println(Arrays.toString(a));
		} else {
			System.out.println("El valor " + clave
					+ " está en el array en la posición " + (posicion + 1));
			System.out.println(Arrays.toString(a));
		}
	}
}







