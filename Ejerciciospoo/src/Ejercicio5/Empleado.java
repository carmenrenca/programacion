package Ejercicio5;
//no terminado
public class Empleado {
private int NIF;
private double sueldo_base;
private double pagohoraextra;
private int horasextras;
private double IRPF;
private boolean casado;
private int nhijos;
public Empleado() {
	
}
public Empleado(int nIF, double sueldo_base, double pagohoraextra, int horasextras, double iRPF, boolean casado,
		int nhijos) {
	super();
	NIF = nIF;
	this.sueldo_base = sueldo_base;
	this.pagohoraextra = pagohoraextra;
	this.horasextras = horasextras;
	IRPF = iRPF;
	this.casado = casado;
	this.nhijos = nhijos;
}
public int getNIF() {
	return NIF;
}
public void setNIF(int nIF) {
	NIF = nIF;
}
public double getSueldo_base() {
	return sueldo_base;
}
public void setSueldo_base(double sueldo_base) {
	this.sueldo_base = sueldo_base;
}
public double getPagohoraextra() {
	return pagohoraextra;
}
public void setPagohoraextra(double pagohoraextra) {
	this.pagohoraextra = pagohoraextra;
}
public int getHorasextras() {
	return horasextras;
}
public void setHorasextras(int horasextras) {
	this.horasextras = horasextras;
}
public double getIRPF() {
	return IRPF;
}
public void setIRPF(double iRPF) {
	IRPF = iRPF;
}
public boolean isCasado() {
	return casado;
}
public void setCasado(boolean casado) {
	this.casado = casado;
}
public int getNhijos() {
	return nhijos;
}
public void setNhijos(int nhijos) {
	this.nhijos = nhijos;
}
public double calculohoraextra() {
	
	return this.horasextras*this.pagohoraextra;
}

public double calculosueldobruto() {
	return this.sueldo_base+this.calculohoraextra();
	
}

}
