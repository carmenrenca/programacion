package ejercicios.ejercicio16;
/**
 * 
 * @author Carmen
 *
 */
public class Magos extends Personajes {//la clase Magos es hija de la clase Personajes
String poder;

/**
 * constructor con 2 parametros
 * @param nombre nombre del mago
 * @param poder poder del mago
 * se inicia al atributo nivel energia de la clase padre a 100 por defecto
 * se hace un sysou para mostrar los datos del mago
 */ 
Magos(String nombre,  String poder){
	this.nombre=nombre;
	this.nivel_energia=100;
	this.poder=poder;
	System.out.println("El nombre del mago es "+this.nombre+" tiene un energia inicial de "+this.nivel_energia);
}
/**
 * este metodo  disminuye en 2 unidades el nivel propio de energía y que
retorna el poder del mago. 
 * @return
 */
public String encantar() {
	this.nivel_energia=this.nivel_energia-2;
	return " Su poder es: "+poder;
}
}
