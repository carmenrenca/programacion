package ejercicio4;

import java.io.IOException;

import excepciones.misString;
import excepciones.trycatch;

public class ejercicio4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String cadena;
		String aux = null;
		trycatch excepcion= new trycatch();
		misString s= new misString();
		int a=0;
		int o=0;
		int e=0;
		
		System.out.println("Dame una cadena de caracteres");//le introducimos la frase
		cadena=excepcion.try_String();
		/**
		 * este metodo nos invertira la cadena introducida
		 */
s.invertircadena(cadena);
/**
 * //con este for, lo que hacemos es introduir 
 * condiciones pasandole las vocales ,a,o,e,
 *  y esto lo hacemos con el metodo
 */
for(int i=0; i<cadena.length(); i++){
	if(cadena.charAt(i)=='a') {
		a++;
	
	}else if( cadena.charAt(i)=='o') {
		o++;
	}else if(cadena.charAt(i)=='e') {
		e++;
	}
	
}
      /**
       * si se pasa del tamaño establecido en estas
       * condiciones, dara exceso de esa vocal                                                         
       */
System.out.println();
if(a>10) {
	System.out.println("Exceso de a");
}else if(o>5) {
	System.out.println("Exceso de o");
}else if(e>3) {
	System.out.println("Exceso de e");
}
/**
 * a continuacon buscaremos una palabra, para comprobar si
 * esta dentro de nuestra cadena
 */
System.out.println("palabra a buscar");
aux=excepcion.try_String();

if(cadena.contains(aux)) {
	System.out.println("se encuentra");
}else {
	System.out.println("no se encuentra");
}


	}
}
