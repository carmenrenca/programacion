package ejercicio8;

import java.util.Random;

import excepciones.arrays;

public class ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrays a= new arrays();
		int diagonal[];
		diagonal= new int [4];
		int array [][];
		array= new int [4][4];
		Random randon= new Random();
		for(int i=0; i<array.length;i++) {
			for(int j=0; j<array[i].length;j++) {
				array[i][j]=  randon.nextInt(9);
				
				
				if(i==j) {
					diagonal[i]=array[i][j];
					
				}
				
			
			}
		
		
			
		}
		a.imprimirmatriz(array);
		System.out.println(" ");
		
	diagonal=a.inviertearray(diagonal);
		System.out.println(" ");
		
		for(int i=0; i<array.length;i++) {
			for(int j=0; j<array[i].length;j++) {
	
				
				if(i==j) {
					array[i][j]=diagonal[i];
					
				}
				
			
			}
		
		
			
		}
		
		a.imprimirmatriz(array);
		
		
		
	}

}
