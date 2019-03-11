package EJERCICIO3;

public class estudiante extends Persona {
int id;




public estudiante(String nombre, String apellidos, String nIF, int id, direccion direccion) {
	super(nombre, apellidos, nIF, direccion);
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
	return identificate()+" Nombre: "+this.apellidos+" Apellido: "+apellidos+" NIF: "+NIF+" id: "+id+"\n"+" Direccion: calle:"+this.getDireccion().getCalle()+" Pais: "+this.getDireccion().getPais()+" Ciudad: "+this.getDireccion().getCiudad()+" Codigo Postal: "+this.getDireccion().getCp(); 
}



}
