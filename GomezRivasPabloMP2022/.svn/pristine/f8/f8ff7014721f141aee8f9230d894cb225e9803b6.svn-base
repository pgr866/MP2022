package org.mp.sesion06;

import java.io.*;
import java.util.*;

/**
 * Clase que debera manejar un archivo de texto en el que la primera linea es
 * una cabecera descriptiva de cada columna. Todos los datos se almacenaran en
 * un array de doubles.
 * 
 * @author Pablo
 * @version 1.0
 */
public class ConjuntoDatos {
	private File archivoTexto;
	private String separador;
	private Locale locale;
	private List cabecera;
	private int numeroLineas;
	private int numeroColumnas;
	private double[][] datos;

	/**
	 * Constructor
	 * 
	 * @param archivo   objeto de la clase File
	 * @param separador String que nos indica que separa de un elemento a otro
	 * @param locale
	 * @throws Exception lanza una excepcion si no se encuentra el archivo
	 */
	public ConjuntoDatos(File archivoTexto, String separador, Locale locale) throws Exception {
		this.archivoTexto = archivoTexto;
		this.separador = separador;
		this.locale = locale;
		this.numeroLineas = numLineas(archivoTexto);
		this.numeroColumnas = numColumnas(archivoTexto);
		this.cabecera = cabecera(archivoTexto);
		this.datos = leerDatos(archivoTexto, numeroLineas, numeroColumnas);
	}

	/**
	 * Metodo que permite obtener la cabecera de un archivo
	 * 
	 * @param archivoTexto
	 * @return devuelve la cabecera del archivo (la primera linea)
	 * @throws IOException lanza una excepcion si el archivo no se encuentra
	 */
	private List cabecera(File archivoTexto) throws IOException {
		FileReader fr = new FileReader(archivoTexto);
		BufferedReader br = new BufferedReader(fr);

		String cadena = br.readLine();
		ArrayList cabecera = new ArrayList();

		Scanner scanner = new Scanner(cadena);
		scanner.useDelimiter(separador);
		scanner.useLocale(locale);
		while (scanner.hasNext())
			cabecera.add(scanner.next());

		br.close();
		return cabecera;
	}

	/**
	 * Metodo para obtener la cantidad de lineas del archivo
	 * 
	 * @param archivo
	 * @return devuelve el numero de lineas del archivo (incluida la cabecera)
	 * @throws IOException lanza una excepcion si el archivo no se encuentra
	 */
	private int numLineas(File archivoTexto) throws IOException {
		FileReader fr = new FileReader(archivoTexto);
		BufferedReader br = new BufferedReader(fr);

		int numLineas = 0;
		while ((br.readLine()) != null)
			numLineas += 1;

		br.close();
		return numLineas - 1;
	}

	/**
	 * Metodo privado para obtener el numero de columnas de un archivo
	 * 
	 * @param archivoTexto
	 * @return devuelve el numero de columnas
	 * @throws IOException lanza una excepcion si el archivo no se encuentra
	 */
	private int numColumnas(File archivoTexto) throws IOException {
		FileReader fr = new FileReader(archivoTexto);
		BufferedReader br = new BufferedReader(fr);

		String cadena = br.readLine();
		int numColumnas = 0;

		Scanner scanner = new Scanner(cadena);
		scanner.useDelimiter(this.separador);
		scanner.useLocale(locale);
		while (scanner.hasNext()) {
			scanner.next();
			numColumnas += 1;
		}
		br.close();
		return numColumnas;
		// return cabecera(archivoTexto).size;
	}

	/**
	 * Metodo privado para obtener los datos de un archivo en una matriz
	 * 
	 * @param archivoTexto
	 * @param filas
	 * @param columnas     numero de columnas
	 * @return devuelve una matriz con los datos contenidos del archivo
	 */
	private double[][] leerDatos(File archivoTexto, int filas, int columnas) {
		double[][] datosPotables = new double[filas][columnas];

		try {
			FileReader fr = new FileReader(archivoTexto);
			BufferedReader br = new BufferedReader(fr);
			br.readLine();

			for (int i = 0; i < filas; i++) {
				String cadena = br.readLine();
				Scanner scanner = new Scanner(cadena);
				scanner.useDelimiter(this.separador);
				scanner.useLocale(locale);
				int j = 0;
				while (scanner.hasNext()) {
					datosPotables[i][j] = scanner.nextDouble();
					j++;
				}
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return datosPotables;
	}

	/**
	 * @param columna numero entero que indica el indice de la columna que queremos
	 *                obtener
	 * @return devuelve la un array con el numero de columna pasado como parametro
	 * @throws Exception
	 */
	public double[] getColumna(int columna) throws Exception {
		if (columna < 0 || columna > numeroColumnas)
			throw new Exception("Columna no valida");

		double[] array = new double[numeroLineas];
		for (int i = 0; i < numeroLineas; i++)
			array[i] = datos[i][columna];

		return array;
		// int posicion = cabecera.indexOf(columna);
		// return getColumna(posicion);
	}

	/**
	 * @param columna String que contiene la columna que queremos obtener
	 * @return devuelve un array con la columna que queremos encontrar
	 * @throws Exception lanza una excepcion si no encuentra la columna
	 */
	public double[] getColumna(String columna) throws Exception {
		Iterator iterador = cabecera.iterator();
		boolean encontrado = false;
		int i = 0;
		int indice = 0;

		while (iterador.hasNext()) {
			String cadena = (String) iterador.next();
			if (cadena.equals(columna)) {
				indice = i;
				encontrado = true;
				break;
			}
			i++;
		}
		if (!encontrado)
			throw new Exception("Columna no valida");

		return getColumna(indice);
	}

	/**
	 * Getter
	 * 
	 * @return cabecera
	 */
	public List getCabecera() {
		return cabecera;
	}

	/**
	 * Getter
	 * 
	 * @return separador
	 */
	public String getSeparador() {
		return separador;
	}

	/**
	 * Getter
	 * 
	 * @return locale
	 */
	public Locale getLocale() {
		return locale;
	}

	/**
	 * Getter
	 * 
	 * @return numeroLineas
	 */
	public int getNumeroLineas() {
		return numeroLineas;
	}

	/**
	 * Getter
	 * 
	 * @return numeroColumnas
	 */
	public int getNumeroColumnas() {
		return numeroColumnas;
	}

	/**
	 * Getter
	 * 
	 * @return datos
	 */
	public double[][] getDatos() {
		return datos;
	}

	/**
	 * Getter
	 * 
	 * @return archivoTexto
	 */
	public File getArchivoTexto() {
		return archivoTexto;
	}

	/**
	 * Copia la informacion de un archivo en otro nuevo
	 * 
	 * @param cabecera     String que contiene la cabecera que queremos exportar al
	 *                     nuevo archivo
	 * @param archivoTexto archivo en el que queremos copiar la informacion
	 * @param separador    String que separa un elemento de otro
	 * @throws Exception lanza una excepcion si no encuentra el archivo
	 */
	public void exportar(String[] cabecera, String archivoTexto, String separador) throws Exception {
		double[][] tempDatos = new double[numeroLineas][cabecera.length];

		for (int i = 0; i < cabecera.length; i++) {
			double[] tempCol = getColumna(cabecera[i]);
			for (int j = 0; j < tempCol.length; j++)
				tempDatos[j][i] = tempCol[j];
		}

		PrintWriter pw = new PrintWriter(archivoTexto);

		for (int i = 0; i < cabecera.length; i++) {
			pw.print(cabecera[i]);
			if (i < cabecera.length - 1)
				pw.print(separador);
		}

		pw.println();
		for (int i = 0; i < tempDatos.length; i++) {
			for (int j = 0; j < tempDatos[0].length; j++) {
				pw.print(tempDatos[i][j]);

				if (j < tempDatos[0].length - 1)
					pw.print(separador);
			}
			pw.println();

		}
		pw.close();
	}

	/**
	 * Metodo que primero exporta la informacion de un archivo a otro nuevo y
	 * despues devuelve un objeto de la clase ConjuntoDatos
	 * 
	 * @param cabecera     le indica la cabecera que quiere exportar al archivo
	 *                     nuevo
	 * @param archivoTexto
	 * @param separador
	 * @param locale
	 * @return devuelve un objeto de la clase ConjuntoDatos con el archivo nuevo
	 * @throws Exception lanza una excepcion si no encuentra al archivo, el
	 *                   separador y el locale indicados
	 */
	public ConjuntoDatos conjuntoDatos(String[] cabecera, String archivoTexto, String separador, Locale locale)
			throws Exception {
		exportar(cabecera, archivoTexto, separador);
		return new ConjuntoDatos(new File(archivoTexto), separador, locale);
	}
}
