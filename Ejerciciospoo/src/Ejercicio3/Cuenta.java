package Ejercicio3;

public class Cuenta {
private long ncuenta;
static int id=10001;
private long DNI;
private double saldo;
private double interes;
public Cuenta() {
	super();
}
public Cuenta(long dNI, double saldo, double interes) {
	super();
	id++;
	this.ncuenta=id;
	DNI = dNI;
	this.saldo = saldo;
	this.interes = interes;
}
public long getNcuenta() {
	return ncuenta;
}

public long getDNI() {
	return DNI;
}
public void setDNI(long dNI) {
	DNI = dNI;
}
public double getSaldo() {
	return saldo;
}
public void setSaldo(double saldo) {
	this.saldo = saldo;
}
public double getInteres() {
	return interes;
}
public void setInteres(double interes) {
	this.interes = interes;
}

public void actualizarsaldo() {
	this.saldo=this.saldo+(this.interes/365);
	System.out.println(this.saldo);
}
public void ingresar(double ingresar) {
	this.saldo=this.saldo+ingresar;
	
}
public void retirar(double retirar) {
	this.saldo=this.saldo-retirar;
	
}
public String To_String() {
	return "Numero de cuenta: "+this.ncuenta
			+ "\n"
			+ "DNI: "+this.DNI
			+ "\n"
			+ "Saldo: "+this.saldo
			+ "\n"
			+ "Interes: "+this.interes;
			
}

}
