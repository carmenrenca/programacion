package ejercicios.ejercicio2;

public class Vehiculo {
private String modelo;
private double potencia;
private boolean cRuedas;


/**
 * contructor con un parametro modelo
 * 
 * @param modelo Modelo del vehiculo
 */

Vehiculo( String modelo){ 
this.modelo=modelo;

	
}

//cremaos nuestros getter y setter para trabajar con ellos en el test

public double getPotencia() {
	return potencia;
	
}

public void setPotencia(double potencia) {
	this.potencia = potencia;
}


public boolean getcRuedas() {
	return cRuedas;
}

public void setcRuedas(boolean cRuedas) {
	this.cRuedas = cRuedas;
}

public String mostrarmodelo() {
	return modelo;
}

public void setmodelo(String modelo) {
	this.modelo=modelo;
}

public boolean traccionruedas() {
	return cRuedas;
}

}


	



