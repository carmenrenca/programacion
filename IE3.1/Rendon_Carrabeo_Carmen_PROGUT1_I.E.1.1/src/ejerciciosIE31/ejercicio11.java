package ejerciciosIE31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio11 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int array[], i, n = 0;
		array=new int[20];
		boolean aux=false;
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("introduce los numeros");
		for (int j = 0; j < array.length; j++) {
			do {
				try {
					n=Integer.parseInt(teclado.readLine());
					aux=false;
				}catch(NumberFormatException e) {
					System.out.println("Dame un numero valido");
					aux=true;
				}
			}while(aux==true);
			
			array[j]=n;
		}
		for (i = array.length-1; i>=0; i--) {
			System.out.println("El orden inverso seria " +array[i]);
		}
	}

}
