package EJERCICIO3;

public class profesor extends Persona  {
String despacho;




public profesor(String nombre, String apellidos, String nIF, String despacho) {
	super(nombre, apellidos, nIF);
	this.despacho = despacho;
}

public String getDespacho() {
	return despacho;
}

public void setDespacho(String despacho) {
	this.despacho = despacho;
}
public String To_String() {
	return identificate()+" Nombre: "+this.Nombre+" Apellido: "+apellidos+" NIF: "+NIF+" despacho"+despacho; 
}

public String identificate() {
	// TODO Auto-generated method stub
	return "tipo: profesor";
}
}
