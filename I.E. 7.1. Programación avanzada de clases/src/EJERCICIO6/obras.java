package EJERCICIO6;

public abstract class  obras {

	String titulo;
	int numero_invetario;
	String autor;
	int a�o;
	public obras(String titulo, int numero_invetario, String autor, int a�o) {
		super();
		this.titulo = titulo;
		this.numero_invetario = numero_invetario;
		this.autor = autor;
		this.a�o = a�o;
	}

	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getNumero_invetario() {
		return numero_invetario;
	}
	public void setNumero_invetario(int numero_invetario) {
		this.numero_invetario = numero_invetario;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getA�o() {
		return a�o;
	}
	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	public String To_String() {
		return "titulo "+titulo+" numero de inventario "+numero_invetario+" autor "+autor+" a�o: "+a�o;
	}
	
}
