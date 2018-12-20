package ejercicios.ejercicio3;


import java.io.InputStreamReader;

public class cuenta {
/**@author Carmen Rendon 
 */
	//Atributos
int n;
private long numerocuenta;
public static  long id=10001; //creamos una variable static para que sume en uno mi numero de cuenta
private long DNI;
private double saldoactual;
public double interesanual;


/**
 *Contructor vacio, en el cual inicializamos los atributos
 */
 public cuenta(){
		this.numerocuenta=id;
		id++;
}

/**
 * Constructor en que tenemos 4 parametros
 * @param DNI  DNI de el cliente
 * @param saldoactual el saldoactual que tiene en la cuenta
 * @param interesanual interes
 
 */
public cuenta(long DNI, double saldoactual, double interesanual){
	this.DNI=DNI;
	this.saldoactual=saldoactual; 
	this.interesanual=interesanual;
	this.numerocuenta=id;
	id++;
}

public long getNumerocuenta() {
	
	return numerocuenta;
}



public long getDNI() {
	return DNI;
}

public void setDNI(long DNI) {
	this.DNI=DNI;
}



public double getInteresanual() {
	
		return interesanual;
	}



public void setInteresanual(double interesanual) {

		this.interesanual = interesanual;
	
	
}

/**
 * metodo get que nos actualiza el saldo actual aplicando el interes diario
 * @return nos devuelve el saldo actual
 */
public double getactualizarSaldo() {
	saldoactual+=saldoactual*( interesanual/36500);
	return saldoactual;
}
/**
 * Realizamos un ingreso 
 * @param cantidad sumamos el parametro cantidad a el saldo actual
 */
public void setingreso(double cantidad) {
	saldoactual=saldoactual+cantidad;
}
public double getingreso()  {
	return saldoactual;
}
/**
 * realizamos un retiro
 * @param cantidad restamos el parametro cantidad al el saldo actual
 */
public void setretiro( double cantidad) {
	saldoactual=saldoactual-cantidad;
}

public double getretiro () {
	return saldoactual;
}



public double getSaldoactual() {
	return saldoactual;
}
public void setSaldoactual(double saldoactual) {
	this.saldoactual=saldoactual;
}
/**
 * 
 * @return nos devuelve un String con todos los datos de la cuenta
 */
public String mostrardatos() {
	
	return "Numero de cuenta: "+numerocuenta
	+"\n" 
	+ "Su DNI es: "+DNI 
	+"\n"
	+"Su saldo de "+saldoactual+
	"\n"
	+"Su interes anual es de "+interesanual+"%"
	+"\n"
	+"\n";
}

}
