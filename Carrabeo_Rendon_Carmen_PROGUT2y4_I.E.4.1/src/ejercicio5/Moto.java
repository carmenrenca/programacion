package ejercicio5;
//esta clase es hija de la class Vehiculo
public class Moto extends Vehiculo {
private int numplaza;
public Moto() {

		
	}

/**la clase moto tiene casi los mismo constructores que la de coche
la diferencia es que en esta no tiene numero de puertas si no de plazas (por defecto el numero de ruedas va a ser 2)**/
public Moto (String matricula,String color_vehiculo ){
	super(matricula,color_vehiculo, 2);

}

public Moto(String matricula,String color_vehiculo, int numero_rueda, double cilindradas){
	super(matricula,color_vehiculo,numero_rueda, cilindradas);
	
}
public Moto(String matricula,String color_vehiculo, int numero_rueda, double cilindradas, int potencia){
	super( matricula,color_vehiculo, numero_rueda, cilindradas, potencia);

}
public Moto(String matricula,String color_vehiculo, int numero_rueda, double cilindradas, int potencia, int numplaza){
	super( matricula,color_vehiculo, numero_rueda, cilindradas, potencia);
	this.numplaza=numplaza;

}


public String getNumplaza() {
	return ""
			+ "\n"
			+ "Numero de plaza: " +numplaza;
}


public void setNumplaza(int numplaza) {
	this.numplaza = numplaza;
}



}
