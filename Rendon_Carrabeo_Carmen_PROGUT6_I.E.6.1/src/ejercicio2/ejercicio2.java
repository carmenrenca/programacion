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
 System.out.println("Excribe la cadena de caracteres");//escribimos la frase original
 palabra=e.try_String();
 System.out.println("que palabra quieres sustituir");//introducimos una de la palabra de la cadena anterior para sustituirla
 
sustituir=e.try_String();
System.out.println("por cual la quieres sustiuir");//introducimos la nueva palabra
aux=e.try_String();

System.out.println(palabra.replaceAll(sustituir, aux));//con el metodo replaceALL le pasamos la palabra y la que queremos sustituirla
 
	}

}
