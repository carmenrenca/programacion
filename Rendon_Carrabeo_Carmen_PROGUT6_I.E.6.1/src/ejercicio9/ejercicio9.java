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

u.escapicua(cadena);

	}
}
