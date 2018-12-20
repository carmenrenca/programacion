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
 *  recibe por parámetro una cantidad de energía(int) con
el que incrementa el nivel propio de energía
 * @param energia parametro que incrementa el nivel de enegia
 */
public void alimentarse(int energia) {
	this.nivel_energia=this.nivel_energia+energia;
	
}
}
