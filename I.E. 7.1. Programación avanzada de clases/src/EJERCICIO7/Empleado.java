package EJERCICIO7;

public abstract class Empleado {
private String Nombre;
private String Apellido;
private int Seguro_Social;
public Empleado(String nombre, String apellido, int seguro_Social) {
	super();
	Nombre = nombre;
	Apellido= apellido;
	Seguro_Social = seguro_Social;
}
public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
public String getApellido() {
	return Apellido;
}
public void setApellido(String apellido) {
	Apellido= apellido;
}
public int getSeguro_Social() {
	return Seguro_Social;
}
public void setSeguro_Social(int seguro_Social) {
	Seguro_Social = seguro_Social;
}
public String toString() {
	return "Nombre: "+this.getNombre()+" Apellido "+this.getApellido()+" Seguro Social "+this.getSeguro_Social();
}
public abstract double ingresos();
}
