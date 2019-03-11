package EJERCICIO7;

import java.io.IOException;

import excepciones.trycatch;

public class Asalariado extends Empleado {
	trycatch e= new trycatch();
private double SalarioSemanal;
	public Asalariado(String nombre, String apellido, int seguro_Social, double SalarioSemanal) {
		super(nombre, apellido, seguro_Social);
		// TODO Auto-generated constructor stub
		this.SalarioSemanal=SalarioSemanal;
	}
	
	
public double getSalarioSemanal() {
		return SalarioSemanal;
	}


	public void setSalarioSemanal(double Salario) throws IOException {
		if(Salario>0) {
			this.SalarioSemanal=Salario;
		}else {
			System.out.println("El salario semanal no puede ser negativo, vuelva a itroducirlo");
			Salario=e.try_double();
		}
		this.SalarioSemanal=Salario;
	}

/**
 * metodo abstracto de empleado ya lo implementamos aqui, en este caso nos devolvera el salario semanal
 */
@Override
public double ingresos() {
	return this.SalarioSemanal;
}
public String toString() {
return super.toString()+" Salario semana: "+this.getSalarioSemanal()+" ingresos "+this.ingresos();
}
}
