package ejercicio5;

import java.io.IOException;

import excepciones.misString;
import excepciones.trycatch;

public class ejercicio5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		trycatch e = new trycatch();
misString s= new misString();
		String cadena="";

System.out.println("dame una palabra");
cadena=e.try_String();


s.palidromo(cadena);
}
}