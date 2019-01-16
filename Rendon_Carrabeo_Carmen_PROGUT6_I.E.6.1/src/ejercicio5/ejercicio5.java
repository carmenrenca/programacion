package ejercicio5;

import java.io.IOException;

import excepciones.misString;
import excepciones.trycatch;

public class ejercicio5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		trycatch e = new trycatch();

		String cadena="";
		String aux ="";
		/**
		 * introducimos la cadena
		 */
System.out.println("dame una cadena de texto");
cadena=e.try_String();

//recorremos hacia atras la palabra y la guardamos en aux;
for(int i=cadena.length()-1; i>=0; i--) {
	aux=aux+cadena.charAt(i);
	
}

//comparamos con equals
if(cadena.equals(aux)) {
	System.out.println("es un palíndromo");
}else {
	System.out.println("no es un palíndromo");
}

	}

}
