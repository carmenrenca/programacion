package EJERCICIO6;

public class pinturas extends obras {
	
	
	int alto;
	int ancho;
	String soportes;
public pinturas(String titulo, int numero_invetario, String autor, int año, int ancho,int alto, String soportes) {
		super(titulo, numero_invetario, autor, año);
		// TODO Auto-generated constructor stub
		this.alto=alto;
		this.ancho=ancho;
		this.soportes=soportes;
		
	}

 

public boolean comapararpinturas(pinturas p) {
	if(this.titulo.equalsIgnoreCase(p.getTitulo()) && this.año==p.getAño() && this.autor.equalsIgnoreCase(p.getAutor()) && this.ancho==p.getAncho() && this.alto==p.getAlto()) {
		return true;
	}else {
		return false;
	}
}


public int getAlto() {
	return alto;
}




public void setAlto(int alto) {
	this.alto = alto;
}




public int getAncho() {
	return ancho;
}




public void setAncho(int ancho) {
	this.ancho = ancho;
}




public String getSoportes() {
	return soportes;
}
public void setSoportes(String soportes) {
	this.soportes = soportes;
}

}
