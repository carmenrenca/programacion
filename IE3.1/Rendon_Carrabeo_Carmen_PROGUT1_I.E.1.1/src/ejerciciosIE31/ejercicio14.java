package ejerciciosIE31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class ejercicio14 {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		int array[][], i, j, n = 0, mayor = -25797589, menor = 25797589 , suma=0;
		array= new int [4][2];
	boolean aux=false;
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		for ( i = 0; i < 4; i++) {
		for ( j = 0; j < 2; j++) {
			do {
				try {
					System.out.println("Introduce los numeros");
					n=Integer.parseInt(teclado.readLine());
					aux=false;
				}catch(NumberFormatException e) {
					System.out.println("dame un numero valido");
					aux=true;
				}
			}while(aux==true);
			
		array[i][j]=n;
		
		
	suma=suma+array[i][j];
		
		if(array[i][j]<menor) {
			
			menor=array[i][j];
			
			
			
		
		}
		
		if(array[i][j]>mayor) {
			mayor=array[i][j];
		}
		
		}


		
		}
		
		System.out.println("El numero mas grande es el " +mayor);
			System.out.println("El numero mas pequeño es el "+menor);
			System.out.println("La suma de los numeros es de " +suma);
			
	}

}
