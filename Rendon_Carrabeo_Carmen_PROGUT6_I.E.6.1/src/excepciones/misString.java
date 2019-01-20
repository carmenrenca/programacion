package excepciones;

import java.io.IOException;
import java.util.StringTokenizer;

public class misString {
	trycatch e= new trycatch();
	
	
	
public String invertircadena(String cadena) throws IOException {


	for(int i=cadena.length()-1; i>=0; i--) {
		System.out.print(cadena.charAt(i));
		
	}
	return cadena;
}

public static boolean isNumeric(String cadena){
    try {
            Integer.parseInt(cadena);
            return true;
    } catch (NumberFormatException nfe){
            return false;
    }
}
public String contarvocales() throws IOException {
	int id=0; //Declaramos un contador para que cuente el numero de vocales que tiene nuestra cadena
	String palabra;	

System.out.println("Escribe la cadena");
palabra= e.try_String();

//utilizamos uno de los metodos string charAT que sirve para coger la posicion de nuestro caracter, por lo que creamos una condicion y la igualamos a las vocales, si es una vocal entra y se le suma uno al contador
for(int i=0; i<palabra.length(); i++) {
	if(palabra.charAt(i)=='a'|| palabra.charAt(i)=='e'|| palabra.charAt(i)=='i'|| palabra.charAt(i)=='o'|| palabra.charAt(i)=='u') {
		id++;
	}

}
//imprimimos el numero de vocales y la cadena que el usuario a introducido	
return "en la cadena "+palabra+" hay "+ id+" volcales";
	}
public void cambiarpalabra() throws IOException {
	String palabra;
	String sustituir;
	String aux;
System.out.println("Excribe la cadena de caracteres");
palabra=e.try_String();
System.out.println("que palabra quieres sustituir");

sustituir=e.try_String();
System.out.println("por cual la quieres sustiuir");
aux=e.try_String();

System.out.println(palabra.replaceAll(sustituir, aux));
}

public String buscarunapalabra() throws IOException {
	String cadena = null;
	String aux;
	System.out.println("palabra a buscar");
	aux=e.try_String();

	if(cadena.contains(aux)) {
		return "se encuentra";
	}else {
		return "no se encuentra";
	}

}

public String nif(String s) throws IOException {

	String respuesta=s;

	boolean error = false;

	char c;

	

	do {

		error=false;

		while(respuesta.length()!=9) {

			System.out.println("Longitud del DNI incorrecta, vuelva a introducirlo");

			respuesta=e.try_String();

		}

		for (int i = 0; i < 8; i++) {

			c = respuesta.charAt(i);

			if (!Character.isDigit(c)) {

				error = true;

				break;

			}

		}

		if(!Character.isAlphabetic(respuesta.charAt(8)))

			error=true;

		if (error) {

			System.out.println("DNI no válido. Vuélvalo a introducir");

			respuesta =e.try_String();

		}

	} while (error);

	return respuesta;

}


public String compruebaTexto(String s) throws IOException {

	String respuesta=s;

	boolean vacio = true;

	char c;

	do {

		for (int i = 0; i < respuesta.length(); i++) {

			c = respuesta.charAt(i);

			if (!Character.isWhitespace(c)) {

				vacio = false;

				break;

			}

		}
	if (vacio) {

			System.out.println("El texto no debe estar vacío, introduzca datos");

			respuesta = e.try_String();

		}

	} while (vacio);

	return respuesta;

}



public void eliminarespacios(String palabra) throws IOException {
	

	System.out.println(palabra.replace(" ", ""));//con el metodo replace le pasamos por parametros el espacio y como lo queremos camiar, es decir quitando el espacio
}


public void palidromo(String palabra){
	String aux ="";
	//recorremos hacia atras la palabra y la guardamos en aux;
	for(int i=palabra.length()-1; i>=0; i--) {
		aux=aux+palabra.charAt(i);
		
	}

	//comparamos con equals
	if(palabra.equals(aux)) {
		System.out.println("es un palíndromo");
	}else {
		System.out.println("no es un palíndromo");
	}

}
public void Tokenizer(String frase, String delimitador) {
	StringTokenizer token=new StringTokenizer(frase,delimitador);
}


}

