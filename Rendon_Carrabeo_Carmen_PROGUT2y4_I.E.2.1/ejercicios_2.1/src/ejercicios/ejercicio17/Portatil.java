package ejercicios.ejercicio17;
/**
 * 
 * @author Carmen
 *
 */
public class Portatil extends Ordenador { //clase hija de ordenador
String marca;
int tamaño_pantalla;
int peso;

/**
 * constructor vacio
 */
Portatil(){
	
	
}
/**
 * constructor con 7 parametros que inicia los atributos de su clase heredada ordenador y los suyos propios
 * @param ram Memoria RAM
 * @param discoduro Tamaño del disco duro (del cual tenemos un metodo static en el text para que nos introduzca numero multiplos de 5)
 * @param modelo_grafica El modelo de la grafia
 * @param modelo_procesador el modelo del procesador
 * @param marca la marca del portatil
 * @param tamaño_pantalla el tamaño de la pantala
 * @param peso el peso del portatil
 */
Portatil(int ram, int discoduro, String modelo_grafica, String modelo_procesador, String marca, int tamaño_pantalla, int peso){
	this.RAM=ram;
	this.discoduro=discoduro;
	this.modelo_grafica=modelo_grafica;
	this.modelo_procesador=modelo_procesador;
	this.marca=marca;
	this.tamaño_pantalla=tamaño_pantalla;
	this.peso=peso;
	
	
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public int getTamaño_pantalla() {
	return tamaño_pantalla;
}
public void setTamaño_pantalla(int tamaño_pantalla) {
	this.tamaño_pantalla = tamaño_pantalla;
}
public int getPeso() {
	return peso;
}
public void setPeso(int peso) {
	this.peso = peso;
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
	         +"Marca: "+this.marca
	         +"\n"
	         +"Tamaño de la pantalla: "+this.tamaño_pantalla
	         +"\n"
	         +"Peso: "+this.peso;
	         
	
}
}
