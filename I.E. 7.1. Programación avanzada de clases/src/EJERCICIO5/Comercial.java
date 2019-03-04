package EJERCICIO5;

public class Comercial extends Empleado {

double sueldo;
double importe;


	public Comercial(String nombre, String dni, double sueldo, double importe) {
		super(nombre, dni);

		this.sueldo=sueldo;
		this.importe=importe;
	}
	public String getSueldo() {
	
		return "sueldo recibido "+sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	@Override
	public double calcularsueldo() {

		return this.sueldo+comision();
	}
	public double comision() {
		return importe*0.1;
	}
	public String toString () {
		return "Nombre: "+this.nombre+ "DNI: "+this.dni+ " sueldo "+sueldo+" importe "+importe+ " retencion: "+this.retencion()+" gratificacion: "+this.gratificacion(this.getHijos())+" Sueldo total "+this.calcular();
	}

	
	
}
