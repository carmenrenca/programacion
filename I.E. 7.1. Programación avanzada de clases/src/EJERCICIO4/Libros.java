package EJERCICIO4;

public class Libros extends datos implements interfaz {

	public Libros(int codigo, String titulo, int año, boolean prestado) {
		super(codigo, titulo, año);
		// TODO Auto-generated constructor stub
		prestado= false;
	}

	boolean prestado;

	
	@Override
	public void prestar() {
	 if(prestado==false) {
		 prestado=true;
		 System.out.println("El libro: "+this.getTitulo()+" puede ser prestado");
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
	public void prestado() {
		if(prestado==false) {
			System.out.println("no esta prestado");
			
		}else {
			System.out.println("ese libro esta ya prestado");
		}

	}
	
}
