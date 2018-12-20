package ejercicios.ejercicio17;

public class Servidor extends Ordenador {
int tama�o_monitor;
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
 * @param discoduro Tama�o del disco duro (del cual tenemos un metodo static en el text para que nos introduzca numero multiplos de 5)
 * @param modelo_grafica El modelo de la grafia
 * @param modelo_procesador El modelo del procesador
 * @param tama�o_monitor Tama�o del monitor (del cual tenemo un metodo static en el text para controlar q el tama�o del monitor no se menor a 14)
 * @param moldelo_teclado Modelo del teclado
 * @param modelo_raton Modelo del raton
 */
Servidor(int ram, int discoduro, String modelo_grafica, String modelo_procesador,int tama�o_monitor, String moldelo_teclado, String modelo_raton ){
	this.RAM=ram;
	this.discoduro=discoduro;
	this.modelo_grafica=modelo_grafica;
	this.modelo_procesador=modelo_procesador;
	this.tama�o_monitor=tama�o_monitor;
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

public int getTama�o_monitor() {
	return tama�o_monitor;
}
public void setTama�o_monitor(int tama�o_monitor) {
	this.tama�o_monitor = tama�o_monitor;
}
/**
 * nos retorna la informaci�n del portatil
 * @return
 */
public String print() {
	return "RAM: "+this.RAM
			+"\n"
			+"Disco Duro: "+this.discoduro
			+"\n"
			+"Modelo gr�fica: "+this.modelo_grafica
	         +"\n"
	         +"Modelo procesador: "+this.modelo_procesador
	         +"\n"
	         +"Tama�o de monitor "+this.tama�o_monitor
	         +"\n"
	         +"Modelo del teclado: "+this.modelo_teclado
	         +"\n"
	         +"Modelo del raton: "+this.modelo_raton;
	         
	
}
	
}
