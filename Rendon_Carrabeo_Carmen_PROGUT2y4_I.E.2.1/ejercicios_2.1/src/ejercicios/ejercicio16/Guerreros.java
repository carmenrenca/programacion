package ejercicios.ejercicio16;
/**
 * 
 * @author Carmen
 *
 */
public class Guerreros extends Personajes {
String arma;
/**
 * constructor con 3 parametros
 * @param nombre nombre del guerrero
 * @param arma arma que utiliza
 * @param nivel_energia nivel de energia
 * hacemos un sysout para que nos muestre los datos del guerrero
 */
Guerreros(String nombre, String arma, int nivel_energia){
this.nombre=nombre;
this.arma=arma;
this.nivel_energia=nivel_energia;
System.out.println("El nombre del guerrero es "+this.nombre+" tiene un energia inicial de "+this.nivel_energia);
}
/**
 * este metodo recibe por parámetro la
cantidad de energía a gastar en el ataque, la cual es descontada de su
nivel propio de energía
 * @param a
 * @return  retorna el arma y la cantidad de energía del ataque concatenados. 
 */
public String combatir(int a) {
	
	this.nivel_energia=this.nivel_energia-a;
	return "Arma: "+arma
			+"\n"
			+"Energia del ataque: "+a;
}
}
