package EJERCICIO4;

public class Revistas extends datos {


	int numero;

	
	
	public Revistas(int codigo, String titulo, int a�o, int numero) {
		super(codigo, titulo, a�o);
		// TODO Auto-generated constructor stub
		this.numero=numero;
	}


	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
