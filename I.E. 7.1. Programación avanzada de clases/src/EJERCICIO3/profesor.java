package EJERCICIO3;

public class profesor extends Persona  {
String despacho;




public profesor(String nombre, String apellidos, String nIF, String despacho, direccion direccion) {
	super(nombre, apellidos, nIF, direccion);
	this.despacho = despacho;
}

public String getDespacho() {
	return despacho;
}

public void setDespacho(String despacho) {
	this.despacho = despacho;
}
public String To_String() {
	return identificate()+" Nombre: "+this.Nombre+" Apellido: "+apellidos+" NIF: "+NIF+" despacho"+despacho+"\n"+" Direccion: calle:"+this.getDireccion().getCalle()+" Pais: "+this.getDireccion().getPais()+" Ciudad: "+this.getDireccion().getCiudad()+" Codigo Postal: "+this.getDireccion().getCp(); 
}

public String identificate() {
	// TODO Auto-generated method stub
	return "tipo: profesor";
}
}
