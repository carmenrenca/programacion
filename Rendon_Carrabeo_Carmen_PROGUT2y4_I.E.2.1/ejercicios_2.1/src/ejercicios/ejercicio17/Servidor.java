package ejercicios.ejercicio17;

public class Servidor extends Ordenador {
int tamaño_monitor;
String modelo_teclado;
String modelo_raton;
/**
 * constructor vacio
 */

Servidor (){
	
}
/**
 * constructor con 7 parametros que inicia los atributos de su clase heredada ordenador y los suyos propios
 *@param ram Memoria RAM
 * @param discoduro Tamaño del disco duro (del cual tenemos un metodo static en el text para que nos introduzca numero multiplos de 5)
 * @param modelo_grafica El modelo de la grafia
 * @param modelo_procesador El modelo del procesador
 * @param tamaño_monitor Tamaño del monitor (del cual tenemo un metodo static en el text para controlar q el tamaño del monitor no se menor a 14)
 * @param moldelo_teclado Modelo del teclado
 * @param modelo_raton Modelo del raton
 */
Servidor(int ram, int discoduro, String modelo_grafica, String modelo_procesador,int tamaño_monitor, String moldelo_teclado, String modelo_raton ){
	this.RAM=ram;
	this.discoduro=discoduro;
	this.modelo_grafica=modelo_grafica;
	this.modelo_procesador=modelo_procesador;
	this.tamaño_monitor=tamaño_monitor;
	this.modelo_teclado=modelo_teclado;
	this.modelo_raton=modelo_raton;
	
}



public String getModelo_teclado() {
	return modelo_teclado;
}
public void setModelo_teclado(String modelo_teclado) {
	this.modelo_teclado = modelo_teclado;
}
public String getModelo_raton() {
	return modelo_raton;
}
public void setModelo_raton(String modelo_raton) {
	this.modelo_raton = modelo_raton;
}

public int getTamaño_monitor() {
	return tamaño_monitor;
}
public void setTamaño_monitor(int tamaño_monitor) {
	this.tamaño_monitor = tamaño_monitor;
}
/**
 * nos retorna la información del portatil
 * @return
 */
public String print() {
	return "RAM: "+this.RAM
			+"\n"
			+"Disco Duro: "+this.discoduro
			+"\n"
			+"Modelo gráfica: "+this.modelo_grafica
	         +"\n"
	         +"Modelo procesador: "+this.modelo_procesador
	         +"\n"
	         +"Tamaño de monitor "+this.tamaño_monitor
	         +"\n"
	         +"Modelo del teclado: "+this.modelo_teclado
	         +"\n"
	         +"Modelo del raton: "+this.modelo_raton;
	         
	
}
	
}
