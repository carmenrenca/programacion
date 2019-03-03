package EJERCICIO4;

import java.sql.Date;

public class Libros extends datos implements interfaz {

	public Libros(int codigo, String titulo, int año, boolean prestado) {
		super(codigo, titulo, año);
		// TODO Auto-generated constructor stub
		prestado= false;
	}

	boolean prestado= false;

	
	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	@Override
	public void prestar() {
	 if(prestado==false) {
		 prestado=true;
		 System.out.println("El libro: "+this.getTitulo()+" ha sido prestaso");
	 }else {
		 System.out.println("El libro: "+this.getTitulo()+" no esta disponible");
	 }
		
	}

	@Override
	public void devolver() {
		// TODO Auto-generated method stub
	prestado=false;
	System.out.println("El libro: "+this.getTitulo()+" ha sido devueto");
	}

	@Override
	public boolean prestado() {
	if(prestado == true) {
		return prestado;
	}
	return prestado;
       
	}


	
}
