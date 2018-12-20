package ejercicios.ejericicio8;

import ejercicios.ejercicio7.Asignatura;
/**
 * 
 * @author Carmen
 *
 */
public class Alumno extends Asignatura { //esta clase es hija de la clase asignatura

int edad;
String nombre;
/**
 * constructor vacio
 */
Alumno(){
	
}
/**
 * Constructor con 2 parametros 
 * @param nombre nombre del alumno
 * @param edad edad del alumno
 */
Alumno( String nombre, int edad){
	this.nombre=nombre;
	this.edad=edad;

}
 
public void setnombre (String nombre) {
	this.nombre=nombre;
}
public String getnombre () {
	return nombre;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}

/**
 * nos devuelve la edad y le nombre del alumno
 * @return
 */
public String ficha() {
	return "Nombre del alumno: "+nombre
			+"\n"
			+"Edad: "+edad
			+"\n";
			
}

}
