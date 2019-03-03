package EJERCICIO5;

public abstract class Empleado implements calculos{
String nombre;
String dni;
int gratificacion;
int hijos;

public Empleado(String nombre, String dni) {
	super();
	this.nombre = nombre;
	this.dni = dni;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getDni() {
	return dni;
}
public void setDni(String dni) {
	this.dni = dni;
}
public abstract double calcularsueldo();

@Override
public double retencion() {
	 if(this.calcularsueldo()>=1000 && this.calcularsueldo()<1500) {
		return this.calcularsueldo()*0.15;
	}else if(this.calcularsueldo()>=1500 && this.calcularsueldo()<2500) {
		return this.calcularsueldo()*0.8;
	}else if(this.calcularsueldo()>=2500) {
				return this.calcularsueldo()*0.20;
	}else {
		return this.calcularsueldo()*0.12;
	}
	
}


@Override
public int gratificacion(int hijos) {
	// TODO Auto-generated method stub
	if(hijos>3) {
		gratificacion=300;
		return 300;
	}else if(hijos>=1 && hijos<=3) {
		gratificacion=200;
		return 200;
	}else {
		gratificacion=0;
		return 0;
	}
	
}
@Override
public double calcular() {
	return this.calcularsueldo()-this.retencion()+gratificacion;
}

public String toString () {
	return "Nombre: "+this.nombre+ " DNI: "+this.dni;
}
public int getHijos() {
	return hijos;
}
public void setHijos(int hijos) {
	this.hijos = hijos;
}
}
