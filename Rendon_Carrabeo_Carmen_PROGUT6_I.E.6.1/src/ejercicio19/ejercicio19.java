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
		//introducimos el tamaño de la matriz
		System.out.println("de cuento quieres que sea la matriz");
		n=e.try_int();
		int[] numeros =new int[n];
		int matriz[][] = new int[n][n];
		a.rellenarmatriz(matriz);
		a.imprimirmatrizint(matriz);
		//provocamos que el array coga los numeros de la columana que queramos en mi caso la columna 1
		for(int i=0; i<numeros.length; i++) {
			numeros[i]=matriz[i][1];
			
		}
		//recorremos la matriz y cuando el array coincida con la matriz el contador suma uno, si contador 
		//vale 5 pues significa que conicide 
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
		//creamos el menu para nuestros metodos de ordenación
		System.out.println("Dime que metodo de ordenacion quieres utilizar ");
		System.out.println("1- burbuja");
		System.out.println("2- insersion");
		n=e.try_int();
		if(n!=1 || n!=2) {
			System.out.println("Solo puedes darme un 1 o un 2");
			n=e.try_int();
		}
		switch(n) {
		case 1: a.ordenarcolumnaburbujaascendente(matriz);break;
		case 2: a.ordenarcolumnainsersionascendente(matriz);break;
		}
		
		}
	
	}


