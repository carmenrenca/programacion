package ejercicio18;

import java.io.IOException;

import excepciones.arrays;


public class ejercicio18 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		arrays a= new arrays();

		int matriz[][] = new int[5][5];
		a.rellenarmatriz(matriz);
		System.out.println("esta es tu matriz");
		a.imprimirmatrizint(matriz);
		a.ordenarunafilamatrizburbuja(matriz);
	
		System.out.println("------vamos a ordenar la diagonal------");
		a.ordenadiagonal(matriz);
		
	}

}
