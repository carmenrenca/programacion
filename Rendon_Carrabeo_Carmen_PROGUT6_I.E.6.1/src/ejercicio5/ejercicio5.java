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
		String aux ="";
System.out.println("dame una cadena de texto");
cadena=e.try_String();


for(int i=cadena.length()-1; i>=0; i--) {
	aux=aux+cadena.charAt(i);
	
}


if(cadena.equals(aux)) {
	System.out.println("es un palíndromo");
}else {
	System.out.println("no es un palíndromo");
}

	}

}
