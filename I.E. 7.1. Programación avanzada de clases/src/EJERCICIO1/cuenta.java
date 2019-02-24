package EJERCICIO1;

import java.io.IOException;

import excepciones.trycatch;

public abstract class cuenta {
 int numerocuenta;
double saldocuenta;
 Persona cliente;
 double interes;

trycatch e= new trycatch();
public cuenta() {
	
}
public cuenta (int numerocuenta, Persona cliente) {
	this.numerocuenta=numerocuenta;
	this.cliente=cliente;
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

public double ingreso(double ingreso) throws IOException {

this.saldocuenta=saldocuenta+ingreso;
return ingreso;
}

public abstract void retirar (double retirar);

public abstract void actualizarsaldo();



public String ToString(){
	return "Numero cuenta "+this.numerocuenta+" saldo: "+saldocuenta+"Nombre cliente: "+cliente.getNombre()+" apellidos"+cliente.getApellidos()+" NIF"+cliente.getNIF();
	   
}
public double getInteres() {
	return interes;
}
public void setInteres(double interes) {
	this.interes = interes;
}



}
