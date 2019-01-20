package ejercicio6;

import java.io.IOException;

import excepciones.misString;
import excepciones.trycatch;

public class ejercicio6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
trycatch e = new trycatch();
misString s= new misString();

String nif;


System.out.println("introduce el nif");//introdumos el dni
nif=e.try_String();

s.nif(nif);

}
	
	
}

