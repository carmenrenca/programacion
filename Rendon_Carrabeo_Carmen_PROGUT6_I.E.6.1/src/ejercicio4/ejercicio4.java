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
		
		System.out.println("Dame una cadena de caracteres");
		cadena=excepcion.try_String();
s.invertircadena(cadena);

for(int i=0; i<cadena.length(); i++){
	if(cadena.charAt(i)=='a') {
		a++;
	
	}else if( cadena.charAt(i)=='o') {
		o++;
	}else if(cadena.charAt(i)=='e') {
		e++;
	}
	
}
                                                               
System.out.println();
if(a>10) {
	System.out.println("Exceso de a");
}else if(o>5) {
	System.out.println("Exceso de o");
}else if(e>3) {
	System.out.println("Exceso de e");
}

System.out.println("palabra a buscar");
aux=excepcion.try_String();

if(cadena.contains(aux)) {
	System.out.println("se encuentra");
}else {
	System.out.println("no se encuentra");
}


	}
}
