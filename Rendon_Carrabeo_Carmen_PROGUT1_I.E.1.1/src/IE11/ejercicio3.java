package  IE11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int a, n = 0, c, b;
		boolean aux=false;
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
	

		System.out.println("Dame un numero");
		do {
			try {
				n=Integer.parseInt(teclado.readLine());
				aux=true;
			
			}catch(NumberFormatException e) {
				System.out.println("No se pueden introducir caracteres, dame un numero");
			}
		}while(aux==false);
		
		for (a=1; a<=n; a++) {	
			c=0;
		
			for (b=1; b<=a; b++){
				
				if(a%b==0){
					c=c+1;
				}
				
				if (c==2) {
					System.out.println("Son primos" +a);
					} 
			}
		}
		

	}

}
