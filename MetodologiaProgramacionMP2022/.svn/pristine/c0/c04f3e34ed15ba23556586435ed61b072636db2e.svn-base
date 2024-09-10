package org.mp.tema07.serializacion;

import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Reads JSON from file and parses it to a POJO
 */
public class JsonToPojo {

//SneakyThrows annotation will internally declare all checked exceptions.

	public static void main(String[] args) throws IOException {
		// Read a Json from file and convert it to a string

		String directorioEntrada = System.getProperty("user.dir");
		String archivoDatos = directorioEntrada + File.separator + "src" + File.separator + "org" + File.separator
				+ "mp" + File.separator + "tema07" + File.separator + "serializacion" + File.separator + "Person.json";

		String strJson = new String(Files.readAllBytes(Paths.get(archivoDatos)));
		// Create new GSON object
		Gson gson = new Gson();

		// Parse the JSON string to Person object
		Person person = gson.fromJson(strJson, Person.class);

		// Print required information from POJO
		System.out.println("Person Name is " + person.getName());
	}
}
