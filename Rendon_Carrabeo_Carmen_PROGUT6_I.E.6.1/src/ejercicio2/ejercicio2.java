package ejercicio2;

import java.io.IOException;

import excepciones.trycatch;

public class ejercicio2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		trycatch e = new trycatch();
		String palabra;
		String sustituir;
		String aux;
 System.out.println("Excribe la cadena de caracteres");
 palabra=e.try_String();
 System.out.println("que palabra quieres sustituir");
 
sustituir=e.try_String();
System.out.println("por cual la quieres sustiuir");
aux=e.try_String();

System.out.println(palabra.replaceAll(sustituir, aux));
 
	}

}
