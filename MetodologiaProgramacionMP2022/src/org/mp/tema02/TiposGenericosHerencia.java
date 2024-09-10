package org.mp.tema02;

public class TiposGenericosHerencia {

	public static void main(String[] args) {

		Rectangulo rectangulo = new Rectangulo(2, 2);
		Circulo circulo = new Circulo(2);

		System.out.println("¿Tienen el mismo área? " + equalArea(rectangulo, circulo));

	}

	public static <E extends ObjetoGeometrico> boolean equalArea(E objeto1, E objeto2) {

		return objeto1.getArea() == objeto2.getArea();
	}

}
