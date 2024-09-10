package org.mp.tema07.serializacion;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

/**
 * Creates an object and then converts it to a JSON. Uses GSON library
 */
public class PojoToJson {

	public static void main(String[] args) throws FileNotFoundException {
		// Create a Person object
		Person person = initializePerson();
		// Create a GSON object
		Gson gson = new Gson();
		// Convert Object to JSON string
		String strVirat = gson.toJson(person);
		// Print the result
		System.out.println(strVirat);

		String directorioEntrada = System.getProperty("user.dir");
		String archivoDatos = directorioEntrada + File.separator + "src" + File.separator + "org" + File.separator
				+ "mp" + File.separator + "tema07" + File.separator + "serializacion" + File.separator + "person.json";

		PrintWriter pw = new PrintWriter(archivoDatos);
		pw.println(strVirat);
		pw.close();

	}

	private static Person initializePerson() {
		Person virat = new Person();
		virat.setName("Virat Kohli");
		virat.setAge("30");
		virat.setPlace("Bangalore");
		virat.setTitle("Mr");
		List<String> hobbies = Arrays.asList("cricket", "Running", "travelling", "Sledging");
		virat.setMyHobbies(hobbies);
		return virat;

	}
}
