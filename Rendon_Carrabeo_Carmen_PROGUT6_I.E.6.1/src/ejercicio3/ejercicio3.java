package ejercicio3;

import java.io.IOException;

import excepciones.misString;
import excepciones.trycatch;

public class ejercicio3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		trycatch e= new trycatch();
		misString s= new misString ();
		String palabra;
		
		
		
		System.out.println("Escribe una cadena de caracteres");//escribimos la nueva cadena 
		palabra= e.try_String();
		s.eliminarespacios(palabra);
		
s.invertircadena(palabra);

	}

}
