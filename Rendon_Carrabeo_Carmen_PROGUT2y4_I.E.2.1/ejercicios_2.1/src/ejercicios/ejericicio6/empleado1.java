package ejercicios.ejericicio6;

public class empleado1 extends Persona { //esta clase es hija de la clase persona
double saldo; 

/**
 * constructor vacío
 */
empleado1(){
	
}

public void modificarsueldo(double saldo) {
	this.saldo=saldo;
}

public String imprimirsueldo () {
	return "Saldo: "+ saldo;
}

}
