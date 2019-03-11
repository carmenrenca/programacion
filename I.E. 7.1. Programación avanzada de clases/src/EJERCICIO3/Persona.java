package EJERCICIO3;

import java.io.IOException;

import excepciones.trycatch;

public class Persona implements humano {
 String Nombre;
 String apellidos;
String NIF;
trycatch e= new trycatch();
protected static direccion direccion;

public Persona(String nombre, String apellidos, String nIF, direccion direccion) {
	super();
	Nombre = nombre;
	this.apellidos = apellidos;
	NIF = nIF;
	this.direccion=direccion;
	
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


public direccion getDireccion() {
	return direccion;
}


public void setDireccion(direccion direccion) {
	this.direccion = direccion;
}

public String To_String() {
	return "Nombre: "+this.apellidos+" Apellido: "+apellidos+" NIF: "+NIF; 
}


@Override
public String identificate() {
	// TODO Auto-generated method stub
	return null;
}
	
}
