package ejerciciosIE31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class ejercicio13 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
	

		int array [][], i, j, aux;
		array= new int [5][8];
		Random randon= new Random (); //declaracion de la clase random
		for ( i = 0; i < 5; i++) {
		for ( j = 0; j < 8; j++) {
		
			
		aux= randon.nextInt(100)+1;
		
		
		array [i][j]=aux;
		
		}	
		}
		
		for(i=0; i<5; i++) {
		for(j=0;j<8;j++) {
			System.out.print("|"+array[i][j]);
		}
		System.out.print("\n");
		}
	}

}
