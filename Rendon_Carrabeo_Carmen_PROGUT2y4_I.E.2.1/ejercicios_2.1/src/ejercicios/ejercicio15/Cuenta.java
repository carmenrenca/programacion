package ejercicios.ejercicio15;
/***
 * 
 * @author Carmen
 *
 */
public class Cuenta {
float saldo;

/**
 * constructor vacío
 */
Cuenta(){
	this.saldo=100;
}
/**
 * pasamos el parametro c que nos permitira introducir al cantidad a ingresar
 * @param c
 */
public void ingresar(float c) {
	this.saldo=saldo+c;
}
/**
 * pasamos el parametro c que nos permitira introducir al cantidad a retirar
 * @param c
 */
public void retirar(float c) {
this.saldo=saldo-c;	
}

public String getSaldo() {
	return "Tienes un saldo actual de " +saldo+ "€";
}

public void setSaldo(float saldo) {
	this.saldo = saldo;
}
}
