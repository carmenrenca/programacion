package EJERCICIO4;

public class datos {
private int codigo;
private String titulo;
private int año;


public datos(int codigo, String titulo, int año) {
	super();
	this.codigo = codigo;
	this.titulo = titulo;
	this.año = año;
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
public int getAño() {
	return año;
}
public void setAño(int año) {
	this.año = año;
}

public String To_String() {
	return "codigo: "+codigo+" titulo: "+titulo+" año: "+año; 
}

public String año() {
	return "años de publicacion; "+getAño();
}

public String codigo() {
	return "años de publicacion; "+getCodigo();
}

}
