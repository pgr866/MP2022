package org.mp.sesion05;

public class SolucionesBusqueda {
	public static int busquedaBinariaRec(Busqueda busqueda) throws ElementoNoEncontradoException {
		int inicio = 0;
		int[] datos = busqueda.getDatos();
		int fin = datos.length - 1;
		int buscado = busqueda.getNumBuscado();
		busquedaBinariaRec(datos, buscado, inicio, fin);
		return buscado;
	}

	private static void busquedaBinariaRec(int[] datos, int buscado, int inicio, int fin)
			throws ElementoNoEncontradoException {
		if (inicio > fin)
			throw new ElementoNoEncontradoException("No encontrado");
		int central = (inicio + fin) / 2;
		if (buscado > datos[central])
			busquedaBinariaRec(datos, buscado, central + 1, fin);
		else if (buscado < datos[central])
			busquedaBinariaRec(datos, buscado, inicio, central - 1);
	}

	public static int busquedaLineal(Busqueda busqueda) throws ElementoNoEncontradoException {
		int buscado = busqueda.getNumBuscado();
		int[] datos = busqueda.getDatos();
		for (int i = 0; i < datos.length; i++) {
			if (buscado == datos[i])
				return buscado;
		}
		throw new ElementoNoEncontradoException("No encontrado");
	}

	public static int busquedaBinariaIter(Busqueda busqueda) throws ElementoNoEncontradoException {
		int[] datos = busqueda.getDatos();
		int buscado = busqueda.getNumBuscado();

		int primero = 0;
		int ultimo = datos.length - 1;
		int central;
		if ((buscado < datos[0]) || (buscado > datos[datos.length - 1]) || datos.length == 0)
			throw new ElementoNoEncontradoException("No encontrado");
		else {
			while (ultimo >= primero) {
				central = (primero + ultimo) / 2;
				if (buscado < datos[central])
					ultimo = central - 1;
				else if (buscado > (datos[central]))
					primero = central + 1;
				else
					return central;
			}
			throw new ElementoNoEncontradoException("No encontrado");
		}
	}
}
