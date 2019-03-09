package EJERCICIO7;

import java.io.IOException;

import excepciones.trycatch;

public class PorHoras extends Empleado{
	trycatch e= new trycatch();
private Double Sueldo;
private int horas;
	public PorHoras(String nombre, String apellido, int seguro_Social, double sueldo, int horas) {
		super(nombre, apellido, seguro_Social);
		// TODO Auto-generated constructor stub
		this.Sueldo=sueldo;
		this.horas=horas;
	}
	public Double getSueldo() {
		return Sueldo;
	}
	public void setSueldo(Double sueldo) throws IOException {

		if(sueldo>0) {
			System.out.println("sueldo correcto");
		}else {
			System.out.println("El sueldo no puede ser negativo, vuelva a introducirlo");
		sueldo=e.try_double();
		}
		this.Sueldo=sueldo;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) throws IOException {
		if(horas>=0&&horas<=168){
			System.out.println("Numero total de horas correctas");
		}else {
			System.out.println("las horas tienen que estar entre 0 y 168, vuelva a introducirlas");
		horas=e.try_int();
		}
		this.horas = horas;
	}

@Override
public double ingresos() {
	if(this.getHoras()<=40) {
		return this.getSueldo()*this.getHoras();
	}else {
		return 40*this.getSueldo()+(this.getHoras()-40)*1.5	;
				}
}
}
