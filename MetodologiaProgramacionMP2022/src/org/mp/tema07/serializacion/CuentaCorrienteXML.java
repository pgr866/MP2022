package org.mp.tema07.serializacion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class CuentaCorrienteXML {

	private String nombreArchivo;

	public CuentaCorrienteXML(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	public void escribir(CuentaCorriente cuenta) throws IOException {
		File f = new File(nombreArchivo);
		FileOutputStream fos = new FileOutputStream(f);

		XStream xs = new XStream(new DomDriver());
		xs.toXML(cuenta, fos);
		fos.close();
	}

	public CuentaCorriente leer() throws IOException {
		CuentaCorriente cuenta = new CuentaCorriente();
		File f = new File(nombreArchivo);
		FileInputStream fis = new FileInputStream(f);

		XStream xs = new XStream(new DomDriver());
		xs.fromXML(fis, cuenta);

		fis.close();
		return cuenta;
	}

	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	public String getNombreArchivo() {
		return nombreArchivo;
	}
}
