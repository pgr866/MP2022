package org.mp.tema07.serializacion;

import java.io.Serializable;
import java.util.Date;

public class Movimiento implements Serializable {
	private String concepto;
	private Date fecha;
	private double importe;

	public Movimiento(String concepto, Date mFecha, double mImporte) {
		super();
		this.concepto = concepto;
		this.fecha = mFecha;
		this.importe = mImporte;
	}

	public Movimiento() {
		super();
		this.fecha = new Date();
	}

	public double getImporte() {
		return importe;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	@Override
	public String toString() {
		return "Movimiento [mConcepto=" + concepto + ", mFecha=" + fecha + ", mImporte=" + importe + "]";
	}
}
