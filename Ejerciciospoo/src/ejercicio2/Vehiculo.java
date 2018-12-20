package ejercicio2;

public class Vehiculo {
private String modelo;
private double potencia;
private boolean cRueda;
public Vehiculo(String modelo) {
	super();
	this.modelo = modelo;
}
public double getPotencia() {
	return potencia;
}
public void setPotencia(double potencia) {
	this.potencia = potencia;
}
public boolean iscRueda() {
	return cRueda;
}
public void setcRueda(boolean cRueda) {
	this.cRueda = cRueda;
}
public String To_string() {
	return "Modelo: "+this.modelo
			+"\n"
			+"Potencia: "+this.potencia
			+"\n"
			+"Traccio: "+this.cRueda;
}
}
