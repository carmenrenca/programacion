package ejercicios.ejercicio4;

/**
 * <h2> Ejercicio 4 cafetera</h2>
 * @author Carmen
 *
 */
public class Cafetera {
double capacidadmaxima;
double cantidadactual;
int capacidadtaza;
int llenarcafetera;
/**
 * constructor vacio
 */
Cafetera(){
	
}
/**
 * constructor con dos parametros en los cuales le ponemos restrinciones
 * Si el usuario llegara a meter en la cantidad un numero mayo que la maxima lo igualaria a la capacidad de la maxima
 * @param capacidadmaxima capidad que soporta la cafetera
 * @param cantidadactual cantidad de cafe que tenemos 
 */


Cafetera(double capacidadmaxima, double cantidadactual){

	this.capacidadmaxima=capacidadmaxima;
	
	if(capacidadmaxima<cantidadactual) {
		this.cantidadactual=capacidadmaxima;
	}else this.cantidadactual=cantidadactual;
	}

public int getCapacidadtaza() {
	return capacidadtaza;
}

public void setCapacidadtaza(int capacidadtaza) {
	this.capacidadtaza = capacidadtaza;
}




public double getCapacidadmaxima() {
	return capacidadmaxima;
}

public void setCapacidadmaxima(double capacidadmaxima) {
	this.capacidadmaxima = capacidadmaxima;
}

public double getCantidadactual() {
	
	return cantidadactual;
}


public void setCantidadactual(double cantidadactual) {
	this.cantidadactual = cantidadactual;
}


public int getllenarcafetera() {
	this.cantidadactual=capacidadmaxima;
	return (int) cantidadactual;
}

public void setservirTaza(int capacidadtaza) {
	this.capacidadtaza=capacidadtaza;
}

/**
 * Hacemos un set para llenar las tazas con el cafe que tenemos 
 * Le ponemos condicionales por si ya no quedara mas cafe que me coga lo que quede y me imprimiera
 * NO HAY SUFICIENTE CAFE EN LA CAFETERA
 * @param capacidadtaza la cantidad de cafe que queremos, para rellenar nuestra taza
 */
public void servirTaza(int capacidadtaza) {
	
	if(this.cantidadactual<capacidadtaza) {
		this.capacidadtaza=(int)this.cantidadactual;
		System.out.println("No hay suficente cafe en la catera para completar la taza");
		System.out.println("Tu taza ahora mismo tiene "+this.capacidadtaza);
		
		}else {
			this.cantidadactual=this.cantidadactual-capacidadtaza;
			System.out.println("la taza se a rellenado por completo");
			System.out.println("Ahora mismo en la cafetera te queda "+cantidadactual+ "cc");
		}


}
/**
 * en este metodo ponemos la cantidad actual a 0 para vaciarla
 * @return
 */
public int vaciarCafetera() {
	 this.cantidadactual=0;
	 return (int)cantidadactual;
}
/**
 * con este metodo llenamos la cafetera a la cantidad que nosotrs queramos 
 * si se diera el caso de que queremos rellenar la cafetera y esta esta llena, el programa lo avisaria o si la cantidad
 * a rellenar sobrepasa la mazima
 * 
 * @param llenarcafetera con este parametro le pasamos la cantidad a rellenar
 */
public void agregarCafe(int llenarcafetera) {
	this.llenarcafetera=llenarcafetera;
	
	if((int)this.cantidadactual == this.capacidadmaxima) {
		System.out.println("La cafetera en este momento esta completamente llena");
	}else if(this.cantidadactual+llenarcafetera>this.capacidadmaxima) {
		
		System.out.println("la cantidad introducida sobrepasa el volumen de la cafetera");
	}else if(this.cantidadactual+llenarcafetera<=this.capacidadmaxima) {
		this.cantidadactual=this.cantidadactual+llenarcafetera;
		
	}
	
	
}


}
