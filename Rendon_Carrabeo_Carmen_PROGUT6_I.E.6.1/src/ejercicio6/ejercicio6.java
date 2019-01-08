package ejercicio6;

import java.io.IOException;

import excepciones.misString;
import excepciones.trycatch;

public class ejercicio6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
trycatch e = new trycatch();
misString s= new misString();

String numeros;
String letra;
String nif;

do {
numeros = "";
 letra="";
System.out.println("introduce el nif");
nif=e.try_String();
int max = 9;

do {
	if(nif.length()>max|| nif.length()<max) {
		System.out.println("debes introducir 9 caracteres");
		nif=e.try_String();
	}
}while(nif.length()!=max);


for(int j=0; j<7; j++) {
	numeros=numeros+nif.charAt(j);

}
letra=letra+nif.charAt(8);


	if(s.isNumeric(numeros)==true && s.isNumeric(letra)==false ) {
		
		System.out.println(numeros);
			}else if (s.isNumeric(numeros)==false || s.isNumeric(letra)==true) {
				System.out.println("NIF no valido");
				
			
			}
}while(s.isNumeric(numeros)==false || s.isNumeric(letra)==true);


	}

}
