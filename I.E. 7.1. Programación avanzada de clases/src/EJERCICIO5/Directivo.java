package EJERCICIO5;

public class Directivo extends Empleado {

	double sueldo;
	double comision;
	
	public Directivo(String nombre, String dni, double sueldo, double comision) {
		super(nombre, dni);
		// TODO Auto-generated constructor stub
		this.sueldo=sueldo;
		this.comision=comision;
		
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	@Override
	public double calcularsueldo() {
		// TODO Auto-generated method stub
		return sueldo+comision;
	}
	public String toString () {
		return super.toString()+ " saldo "+sueldo+" comision "+comision+ " retencion: "+this.retencion()+" gratificacion: "+this.gratificacion(this.getHijos())+" Sueldo total "+this.calcular();
	}
	
}
