package ejercicio19;

import java.io.IOException;

import excepciones.arrays;
import excepciones.trycatch;

public class ejercicio19 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		trycatch e= new trycatch();
		arrays a= new arrays();
		int n;
		int conta=0;
		int c=0;
		
		System.out.println("de cuento quieres que sea la matriz");
		n=e.try_int();
		int[] numeros =new int[n];
		int matriz[][] = new int[n][n];
		a.rellenarmatriz(matriz);
		a.imprimirmatrizint(matriz);
		for(int i=0; i<numeros.length; i++) {
			numeros[i]=matriz[i][1];
			
		}
		for(int i=0; i<matriz.length; i++ ) {
			for(int j=0; j<numeros.length; j++) {
				if(numeros[j]==matriz[j][i]) {
					conta++;
				}
				if(conta==5) {
					System.out.println("El array es igual que la columna "+i+" de la matriz");
					conta=0;
				}
				}
			}
		System.out.println("Dime que metodo de ordenacion quieres utilizar ");
		System.out.println("1- burbuja");
		System.out.println("2- insersion");
		n=e.try_int();
		if(n!=1 || n!=2) {
			System.out.println("Solo puedes darme un 1 o un 2");
			n=e.try_int();
		}
		switch(n) {
		case 1: a.ordenarcolumnaburbuja(matriz);break;
		case 2: a.ordenarcolumnainsersion(matriz);break;
		}
		
		}
	
	}


