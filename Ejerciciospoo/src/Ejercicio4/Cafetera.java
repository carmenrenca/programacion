package Ejercicio4;

public class Cafetera {
private int capacidadmaxima;
private int cantidad_actual;

public Cafetera() {
	this.capacidadmaxima=1000;
	this.cantidad_actual=0;
	
}
public Cafetera(int capacidadmaxima) {
	this.capacidadmaxima=capacidadmaxima;
	this.capacidadmaxima=this.cantidad_actual;
	
}
public Cafetera(int capacidadmaxima, int cantidad_actual) {
	this.capacidadmaxima=capacidadmaxima;
	this.cantidad_actual=cantidad_actual;
	if(this.cantidad_actual>this.capacidadmaxima) {
		this.capacidadmaxima=this.cantidad_actual;
	}
	
	
}
public double getCapacidadmaxima() {
	return capacidadmaxima;
}
public void setCapacidadmaxima(int capacidadmaxima) {
	this.capacidadmaxima = capacidadmaxima;
}
public double getCantidad_actual() {
	return cantidad_actual;
}
public void setCantidad_actual(int cantidad_actual) {
	this.cantidad_actual = cantidad_actual;
}
public void llenarcafetera() {
	this.cantidad_actual=this.capacidadmaxima;
	
}
public void servirtaza(int servir) {
	
	this.cantidad_actual=this.cantidad_actual-servir;
	if(this.cantidad_actual<servir) {
		System.out.println("vaya parece que no va a haber suficente cafe para rellenar la taza al completo");
	this.cantidad_actual=0;
	}
}
public void vaciarcafetera() {
	this.cantidad_actual=0;
	System.out.println("Se a vaciado la cafetera al completo");
}
public void agregarcafe(int agregar) {

	if(agregar<this.capacidadmaxima) {
		this.cantidad_actual=this.cantidad_actual+agregar;
	}else {
		System.out.println("Stop, esa cantidad ua supera la capadidad máxima");
	}
	
	
}
public String To_String() {
	return "capantidad actual: "+this.cantidad_actual
			+"capacidad total: "+this.capacidadmaxima;
}
}
