package ejercicio1;

import java.io.IOException;

import excepciones.trycatch;

public class ejercicio1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	trycatch e= new trycatch();
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
System.out.println("en la cadena "+palabra+" hay "+ id+" volcales");
	}

}
