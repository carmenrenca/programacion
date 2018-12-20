package Ejercicio1;

public class DVD_CINE {
private String titulo;
private int duracion;
private String resumen;
private String genero;
private String personaje;



public DVD_CINE() {
	
}


public DVD_CINE(String titulo, int duracion, String descripcion, String genero, String personaje, String resumen) {
	super();
	this.titulo = titulo;
	this.duracion = duracion;
	
	this.genero = genero;
	this.personaje = personaje;
	this.resumen = resumen;
}


public String getTitulo() {
	return titulo;
}


public void setTitulo(String titulo) {
	this.titulo = titulo;
}


public int getDuracion() {
	return duracion;
}


public void setDuracion(int duracion) {
	this.duracion = duracion;
}






public String getGenero() {
	return genero;
}


public void setGenero(String genero) {
	this.genero = genero;
}


public String getPersonaje() {
	return personaje;
}


public void setPersonaje(String personaje) {
	this.personaje = personaje;
}


public String isResumen() {
	return resumen;
}


public void setResumen(String resumen) {
	this.resumen = resumen;
}

public String muestraDVDCine() {
	return this.titulo+" De: "+this.personaje
			+"\n"
			+"Con "+this.personaje
			+"\n"
			+ this.genero+" - "+this.duracion+" min"
			+"Resumen "+this.resumen;
	
			
}
public boolean esThriller() {
	if(this.genero.equalsIgnoreCase("thirller")) {
		return true;
	}else {
		return false;
	}
}

public boolean tieneResumen() {
	if(this.resumen.isEmpty()) {
		return false;
	}else {
		return true;
	}
}
public String muestraDuracion() {
	return this.duracion+" min";
}
}
