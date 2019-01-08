package IE11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = 0, resto;
		boolean aux=false;
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
	

		
		do {
		do {
			System.out.println("dame un numero de 4 cifras");
			
			try {
				n=Integer.parseInt(teclado.readLine());
				aux=true;
			}catch(NumberFormatException e) {
				System.out.println("no puedes introducir caracteres");
				
			}
			
			
			
		}while(aux==false);
		
		
		}while(n<1000 || n>9999);
		resto= n/1000;	
		System.out.println("La primera cifra es " +resto);
		resto= ((n%1000)/100);
		System.out.println("La segunda cifra es " +resto);
		resto= ((n%100)/10);
		System.out.println("La tercera cifra es " +resto);
		resto = n%10;
		System.out.println("La cuerta cifra es "+resto  );
	}

}
