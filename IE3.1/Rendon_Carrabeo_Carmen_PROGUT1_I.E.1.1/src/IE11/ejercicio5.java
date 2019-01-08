package  IE11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) throws IOException {
		int a,n = 0;
		float positivos=0, negativos=0;
		boolean aux=false;
		System.out.println("Dame 10 numeros");
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
	

		
		
		for(a=1;a<=10; a++ ) {
			
do {
	try {
		n=Integer.parseInt(teclado.readLine());
		aux=true;
	}catch(NumberFormatException e) {
		System.out.println("solo puedes introducir numeros");
		
	}
}while(aux==false);
			
			if (n>=0) {
			positivos=positivos+n;
			} 
			if (n<0){
				negativos=negativos+n;
			}
			
		}
		System.out.println("la media de positivos es " +positivos/10);
		System.out.println("La media de negativos es " +negativos/10);
	}

}
