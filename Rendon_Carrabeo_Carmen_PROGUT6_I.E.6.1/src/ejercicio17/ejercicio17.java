package ejercicio17;

import java.io.IOException;

import excepciones.arrays;
import excepciones.trycatch;

public class ejercicio17 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		trycatch c= new trycatch();
		arrays a= new arrays();
		int n;
System.out.println("dame el tamaño de la matriz");
n=c.try_int();
int matriz[][] = new int[n][n];
a.imprimirmatrizint(matriz);
	}

}
