package ejercicio17;

import java.io.IOException;

import excepciones.arrays;
import excepciones.trycatch;

public class ejercicio17 {

	static int n;
	static int matriz[][] = new int[4][4];
	static trycatch c= new trycatch();
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		arrays a= new arrays();

rellenarmatriz(matriz);

a.imprimirmatrizint(matriz);
	}
public static void rellenarmatriz(int matriz[][]) {
	int j =0;
	int i=0;
	int contador = 0;
	
	
	for( j=0; j<matriz.length; j++) {
		contador++;
		if(j<3) {
			matriz[i][j+1]=contador;	
		}
	
	}
	j=3;
	for(i=0;i<matriz.length; i++) {
	if(j!=0) {

	
		matriz[i+1][j]=contador;
		contador++;

	
}

}
}
}
