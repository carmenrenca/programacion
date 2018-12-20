package ejercicios.ejercicio17;
/**
 * 
 * @author Carmen
 *
 */
public class Portatil extends Ordenador { //clase hija de ordenador
String marca;
int tama�o_pantalla;
int peso;

/**
 * constructor vacio
 */
Portatil(){
	
	
}
/**
 * constructor con 7 parametros que inicia los atributos de su clase heredada ordenador y los suyos propios
 * @param ram Memoria RAM
 * @param discoduro Tama�o del disco duro (del cual tenemos un metodo static en el text para que nos introduzca numero multiplos de 5)
 * @param modelo_grafica El modelo de la grafia
 * @param modelo_procesador el modelo del procesador
 * @param marca la marca del portatil
 * @param tama�o_pantalla el tama�o de la pantala
 * @param peso el peso del portatil
 */
Portatil(int ram, int discoduro, String modelo_grafica, String modelo_procesador, String marca, int tama�o_pantalla, int peso){
	this.RAM=ram;
	this.discoduro=discoduro;
	this.modelo_grafica=modelo_grafica;
	this.modelo_procesador=modelo_procesador;
	this.marca=marca;
	this.tama�o_pantalla=tama�o_pantalla;
	this.peso=peso;
	
	
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public int getTama�o_pantalla() {
	return tama�o_pantalla;
}
public void setTama�o_pantalla(int tama�o_pantalla) {
	this.tama�o_pantalla = tama�o_pantalla;
}
public int getPeso() {
	return peso;
}
public void setPeso(int peso) {
	this.peso = peso;
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
	         +"Marca: "+this.marca
	         +"\n"
	         +"Tama�o de la pantalla: "+this.tama�o_pantalla
	         +"\n"
	         +"Peso: "+this.peso;
	         
	
}
}
