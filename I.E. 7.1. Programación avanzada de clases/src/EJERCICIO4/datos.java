package EJERCICIO4;

public class datos {
private int codigo;
private String titulo;
private int a�o;


public datos(int codigo, String titulo, int a�o) {
	super();
	this.codigo = codigo;
	this.titulo = titulo;
	this.a�o = a�o;
}
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public int getA�o() {
	return a�o;
}
public void setA�o(int a�o) {
	this.a�o = a�o;
}

public String To_String() {
	return "codigo: "+codigo+" titulo: "+titulo+" a�o: "+a�o; 
}

public String a�o() {
	return "a�os de publicacion; "+getA�o();
}

public String codigo() {
	return "a�os de publicacion; "+getCodigo();
}

}
