package Ejercicio6;

public class Empleado extends Persona {
	private int sueldo;
	
	Empleado(){
		this.sueldo=0;
	}
	public void cargarsueldo(int sueldo) {
		this.sueldo=this.sueldo+sueldo;
		
	}
	public int imprimirsueldo() {
		return this.sueldo;
	}

}
