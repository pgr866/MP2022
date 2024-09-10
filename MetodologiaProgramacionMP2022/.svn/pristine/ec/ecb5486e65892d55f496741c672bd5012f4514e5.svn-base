package org.mp.tema02;
public class MaxUsandoTiposGenericos {
	
	public static void main(String[] arg) {
		
		Integer objetoEntero = new Integer(25);
		System.out.println(max("Hola", "Adios"));
		System.out.println(max(new Integer(25), new Integer(2300)));
		System.out.println(max(25, 2300)); //autoboxing
		System.out.println(objetoEntero); //unboxing	
		"Hola".compareTo("Adios");
		
	}

  /** Devuelve el máximo de dos objetos */

  public static <E extends Comparable<E>> E max(E o1, E o2) {
    if (o1.compareTo(o2) > 0)
      return o1;
    else
      return o2;
  }
}

