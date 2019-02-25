package EJERCICIO3;

public class estudiante extends Persona {
int id;




public estudiante(String nombre, String apellidos, String nIF, int id) {
	super(nombre, apellidos, nIF);
	this.id = id;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String identificate() {
	return "tipo: estudiante";
}

public String To_String() {
	return identificate()+" Nombre: "+this.apellidos+" Apellido: "+apellidos+" NIF: "+NIF+" id: "+id; 
}



}
