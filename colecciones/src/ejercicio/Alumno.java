package ejercicio;

public class Alumno {
	public int id;
	public String nombre;
	public int altura;
	public Alumno(int id, String nombre, int altura) {
	this.id = id;
	this.nombre = nombre;
	this.altura = altura;
	}
	
	@Override
	public String toString() {
	return "Alumno-> ID: "+id+" Nombre: "+nombre+" Altura: "+altura+"cm"+"\n";
	}
	}

