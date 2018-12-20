package ejercicios.ejericicio6;
/**
 * 
 * @author Carmen
 *
 */
public class Persona { //Esta clase va a ser la clase padre, de la cual empleado 1 va a heredar sis atributos
	protected String nombre;
	protected int edad;
/**
 * creamos un constrictor vacio
 */
Persona(){
	
}

/**
 * creamos un constructor en el que le hemos pasado 2 parametros
 * @param nombre Nombre de la persona
 * @param edad edad de la persona
 */
Persona(String nombre, int edad){
	this.nombre= nombre;
	this.edad= edad;
}

/**
 * metodo por si queremos modificar el nombre y la eda
 * @param nombre modifica nombre
 * @param edad modifica edad
 */
public void modificarrdato (String nombre, int edad) {
	
	this.nombre= nombre;
	this.edad= edad;
	
}
/**
 * metodo para imprimir los datos
 * @return nos devuelve los datos de la persona
 */

public String imprimirdato () {
	return "Nombre: "+nombre
			+"\n"
			+"Edad: "+edad;
	
	
}

}
