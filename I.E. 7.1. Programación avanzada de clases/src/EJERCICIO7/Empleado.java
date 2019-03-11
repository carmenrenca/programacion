package EJERCICIO7;
/**
 * Clase abstracta de la cual van a partir los distintos tipos de empleados
 * Esta es una clase genérica y nunca nos va a hacer una instancia de esta por eso la ponemos como abtracta
 * tambien contiene un metodo abstracto (sin implementar) llamado ingresos, que ya en cada tipo de 
 * empleado se tendrá que implementar de distinta forma
 * @author Carmen
 *
 */
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
