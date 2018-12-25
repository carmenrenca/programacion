package ejercicio5;
//esta clase es hija de la class Vehiculo
public class Coche extends Vehiculo {
private int numpuerta;
//contructor vacio
public Coche(){
	
}
//El primero permite crear un coche con la matrícula y color(por defecto el numero de ruedas siempre va a ser 4 por lo que no hace falta pasarle parametro)
public Coche(String matricula,String color_vehiculo){
	super(matricula,color_vehiculo, 4);
	
}
/**El segundo permite crear un coche a partir de los datos señalados
en el primer constructor y de la cilindrada**/

public Coche(String matricula,String color_vehiculo, int numero_rueda, double cilindradas){
	super(matricula,color_vehiculo,numero_rueda, cilindradas);
	
}
/**
 * El tercero permite crear un coche a partir de los datos del segundo
constructor y de la potencia.
 * @param matricula
 * @param color_vehiculo
 * @param numero_rueda
 * @param cilindradas
 * @param potencia
 */
public Coche(String matricula,String color_vehiculo, int numero_rueda, double cilindradas, int potencia){
	super( matricula,color_vehiculo, numero_rueda, cilindradas, potencia);

}
/**
 * El cuarto permite crear un coche a partir de los datos del tercer
constructor y del número de puertas.
 * @param matricula
 * @param color_vehiculo
 * @param numero_rueda
 * @param cilindradas
 * @param potencia
 * @param numpuerta
 */
public Coche(String matricula,String color_vehiculo, int numero_rueda, double cilindradas, int potencia, int numpuerta){
	super( matricula,color_vehiculo, numero_rueda, cilindradas, potencia);
	this.numpuerta=numpuerta;

}
//metodo que retorne el numero de puertas de nuestro coche)
public String getNumpuerta() {
	return ""
			+ "\n"
			+ "Numero de puerta:" +numpuerta;
}
public void setNumpuerta(int numpuerta) {
	this.numpuerta = numpuerta;
}

}