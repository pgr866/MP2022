package org.mp.tema07.serializacion;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Arrays;
import java.util.List;

public class PrettyPrintExample {

	public static void main(String[] args) {
		List<String> cars = Arrays.asList("Fiat", "BMW", "Lamborghini");
		// Create new GSON object
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String prettyJson = gson.toJson(cars);
		System.out.println("pretty " + prettyJson);
	}
}
