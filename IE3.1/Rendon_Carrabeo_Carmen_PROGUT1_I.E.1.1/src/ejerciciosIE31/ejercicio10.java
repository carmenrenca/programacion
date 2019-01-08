package ejerciciosIE31;

import java.awt.print.Printable;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class ejercicio10 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int i, array[], n=0, repetido = 0;
		
		array= new int [25];
		
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Vamos a introducir 25 numeros y sacaremos los que se repiten dentro del array");
		Random randon= new Random (); //declaracion de la clase random
		System.out.println("que numero deseas buscar");
		n=Integer.parseInt(teclado.readLine());
			
		for ( i= 0; i < array.length; i++) {
		
		
			array[i]= randon.nextInt(100)+1;;
		System.out.println(array[i]);
		if(array[i]==n) {
			repetido++;
			}
			
		
		}
				
			
		 System.out.println("el numero "+n+" se repite "+repetido);

}
}
