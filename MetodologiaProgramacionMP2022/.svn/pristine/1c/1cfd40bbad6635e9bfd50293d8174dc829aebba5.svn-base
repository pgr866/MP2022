package org.mp.tema07.serializacion;

import java.io.File;
import java.util.Date;

public class PruebaCuentaCorrienteSER {

	public static void main(String[] args) throws Exception {

		CuentaCorriente cuenta = new CuentaCorriente("111-111", "Jose Pérez");

		String directorioEntrada = System.getProperty("user.dir");
		String archivoDatos = directorioEntrada + File.separator + "src" + File.separator + "org" + File.separator
				+ "mp" + File.separator + "tema07" + File.separator + "serializacion" + File.separator + "cuenta.ser";

		CuentaCorrienteSER cuentaSer = new CuentaCorrienteSER(archivoDatos);

//        Movimiento m1 = new Movimiento();
//		m1.setConcepto("concepto 1");
//		m1.setImporte(12.12);
//		cuenta.addMovimiento(m1);
		cuenta.ingresar("concepto 1", 12.12);

		Movimiento m2 = new Movimiento();
		m2.setConcepto("concepto 2");
		m2.setImporte(22.12);
		m2.setFecha(new Date());
		cuenta.addMovimiento(m2);

		System.out.println("Saldo: " + cuenta.getSaldo());
		cuenta.ingresar("ahorrillos", 8.0);

		System.out.println("Saldo: " + cuenta.getSaldo());

		cuentaSer.escribir(cuenta);
		cuenta = cuentaSer.leer();
		cuenta.listado();
	}
}
