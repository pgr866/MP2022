package org.mp.tema07.serializacion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class CuentaCorrienteJSON {

	private String nombreArchivo;

	public CuentaCorrienteJSON(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	public void escribir(CuentaCorriente cuenta) throws IOException {
		Gson gson = new Gson();
		// Convert Object to JSON string
		String strCuenta = gson.toJson(cuenta);
		PrintWriter pw = new PrintWriter(nombreArchivo);
		pw.println(strCuenta);
		pw.close();

	}
	
	public void escribirBonito(CuentaCorriente cuenta) throws IOException {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		// Convert Object to JSON string
		String strCuenta = gson.toJson(cuenta);
		PrintWriter pw = new PrintWriter(nombreArchivo+"Bonito");
		pw.println(strCuenta);
		pw.close();

	}


	public CuentaCorriente leer() throws IOException {

		String strJson = new String(Files.readAllBytes(Paths.get(nombreArchivo)));
		// Create new GSON object
		Gson gson = new Gson();

		// Parse the JSON string
		CuentaCorriente cuenta = gson.fromJson(strJson, CuentaCorriente.class);
		return cuenta;
	}

	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	public String getNombreArchivo() {
		return nombreArchivo;
	}
}
