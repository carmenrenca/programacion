package ejercicio3;

import java.io.IOException;

import excepciones.trycatch;

public class ejercicio3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		trycatch e= new trycatch();
		String palabra;
		
		
		
System.out.println("Escribe una cadena de caracteres");
palabra= e.try_String();

System.out.println(palabra.replace(" ", ""));
	}

}