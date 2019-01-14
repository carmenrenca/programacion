package ejercicio17;

import java.io.IOException;

import excepciones.arrays;
import excepciones.trycatch;

public class ejercicio17 {

	static int n=3;
	static int matriz[][] = new int[n][n];

	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		arrays a= new arrays();

rellenarmatriz(matriz);

a.imprimirmatrizint(matriz);
	}
public static void rellenarmatriz(int matriz[][]) {
	int j =0;
	int i=0;
	int contador = 1;
	int principio = n-1;
	int fin = 0;
	do {
		for( j=0; j<principio; j++) {
		
				
				matriz[fin][j+1]=contador;	
				contador++;
		
		}

		for(i=fin;i<principio; i++) {
		

		
			matriz[i+1][principio]=contador;

			contador++;
		
	}

		for(j=principio; j>fin; j--) {
			
			matriz[principio][j-1]=contador;
			contador++;
		}
		
		for(i=principio;i>fin+1;i--) {
			
			matriz[i-1][fin]=contador;
			contador++;
			
		}
		principio--;
		fin++;
	
	}while(contador<(n*n));
		
		
	
}

	
}

