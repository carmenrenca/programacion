package ejercicios.ejercicio16;
/**
 * 
 * @author Carmen
 *
 */
public class Personajes {
String nombre;
int nivel_energia;
/**
 * contructor vacio
 */
Personajes(){
	
}
/**
 *  recibe por par�metro una cantidad de energ�a(int) con
el que incrementa el nivel propio de energ�a
 * @param energia parametro que incrementa el nivel de enegia
 */
public void alimentarse(int energia) {
	this.nivel_energia=this.nivel_energia+energia;
	
}
}
