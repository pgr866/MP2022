package org.mp.tema02;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class EjemploCalendario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar calendario = new GregorianCalendar();
		
		

		System.out.println("Año: " + calendario.get(Calendar.YEAR));
		System.out.println("Mes: " + (calendario.get(Calendar.MONTH) + 1));
		System.out.println("Día: " + calendario.get(Calendar.DATE));
		System.out.println("Día juliano: " + calendario.get(GregorianCalendar.DAY_OF_YEAR));

	}

}
