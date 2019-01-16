package ejercicio9;

import java.io.IOException;

import excepciones.trycatch;
import excepciones.utilescarmen;

public class ejercicio9 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		trycatch e = new trycatch();
		utilescarmen u= new utilescarmen();
	
		int cadena;
		
	int aux=0;
	
System.out.println("escribe el numero");

cadena=e.try_int();
aux=cadena;

/**
 * metodo que invierte el numero que introducimos por teclado
 *
 */
cadena=u.ivertirnumero(cadena);
if(cadena==aux) {
	System.out.println("es un numero capicua");
}else {
	System.out.println("no es un numero capicua");
}

	}

}
