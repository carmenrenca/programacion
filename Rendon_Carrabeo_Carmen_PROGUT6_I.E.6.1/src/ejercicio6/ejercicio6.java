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
System.out.println("introduce el nif");//introdumos el dni
nif=e.try_String();
int max = 9;//variable para controlar el max
/**
 * con este bucle controlamos el max
 * Si ponemos mas caracteres o menos que 9 nos volvera a pedir el nif
 */
do {
	if(nif.length()>max|| nif.length()<max) {
		System.out.println("debes introducir 9 caracteres");
		nif=e.try_String();
	}
}while(nif.length()!=max);

/**en la variable string numero vamos a introducir solo la parte numerica del nif
 */

for(int j=0; j<7; j++) {
	numeros=numeros+nif.charAt(j);

}
//en la variable String letra vamos a introducir solo la letra
letra=letra+nif.charAt(8);
/**
 * en esta condicion vamos a controlar q si en la parte numerica el usuario
 * introduce una letra salga error y vuelva a pedir el dni, los mismo con la parte numerica
 */

	if(s.isNumeric(numeros)==true && s.isNumeric(letra)==false ) {
		
		System.out.println(numeros);
			}else if (s.isNumeric(numeros)==false || s.isNumeric(letra)==true) {
				System.out.println("NIF no valido");
				
			
			}
}while(s.isNumeric(numeros)==false || s.isNumeric(letra)==true);


	}

}
