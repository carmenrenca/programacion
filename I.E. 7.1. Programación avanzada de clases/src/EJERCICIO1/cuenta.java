package EJERCICIO1;

import java.io.IOException;

import excepciones.trycatch;

public abstract class cuenta {
private int numerocuenta;
private double saldocuenta;
private Persona cliente;

trycatch e= new trycatch();

public cuenta (int numerocuenta, Persona cliente) {
	this.numerocuenta=numerocuenta;
	this.cliente=cliente;
}

public cuenta(int numerocuenta, double saldocuenta, Persona cliente) {
	super();
	this.numerocuenta = numerocuenta;
	this.saldocuenta = saldocuenta;
	this.cliente = cliente;
	
}

public int getNumerocuenta() {
	return numerocuenta;
}
public void setNumerocuenta(int numerocuenta) {
	this.numerocuenta = numerocuenta;
}
public double getSaldocuenta() {
	return saldocuenta;
}
public void setSaldocuenta(double saldocuenta) {
	this.saldocuenta = saldocuenta;
}
public Persona getCliente() {
	return cliente;
}
public void setCliente(Persona cliente) {
	this.cliente = cliente;
}

public double ingreso() throws IOException {
	double ingreso;
System.out.println("cuanto deseas ingresar");	
ingreso=e.try_double();
this.saldocuenta=saldocuenta+ingreso;
return ingreso;
}

public abstract void retirar (double retirar);

public abstract void actualizarsaldo ();



}
