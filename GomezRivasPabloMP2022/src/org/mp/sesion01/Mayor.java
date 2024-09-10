package org.mp.sesion01;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Mayor {

	public static int elEnteroMayor(int[] a) {

		int max = Integer.MIN_VALUE;

		if (a.length == 0)
			throw new RuntimeException("Array vacio");

		for (int indice = 0; indice < a.length; indice++) {
			if (a[indice] > max) {
				max = a[indice];
			}
		}
		return max;
	}

}