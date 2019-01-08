package ejercicio3;

import java.io.IOException;

import excepciones.trycatch;

public class ejercicio4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		trycatch e= new trycatch();
		String cadena;
		String cadenainvertida;
System.out.println("Dame una cadena de caracteres");
		cadena=e.try_String();
		for(int i=cadena.length()-1; i>=0; i--) {
			System.out.print(cadena.charAt(i));
			
		}
		
	}

}
