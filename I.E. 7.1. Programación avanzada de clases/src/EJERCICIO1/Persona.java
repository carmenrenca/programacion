package EJERCICIO1;

public class Persona {
 String Nombre;
 String apellidos;
String NIF;
public Persona(String nombre, String apellidos, String nIF) {
	super();
	Nombre = nombre;
	this.apellidos = apellidos;
	NIF = nIF;
}


public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
public String getApellidos() {
	return apellidos;
}
public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}
public String getNIF() {
	return NIF;
}
public void setNIF(String nIF) {
	NIF = nIF;
}

	
}
