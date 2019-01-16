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
	//hacemos un metodo para ir rellenado del 1 hasta n*n y gracias a un contador que empieza en 1
public static void rellenarmatriz(int matriz[][]) {
	int j =0;
	int i=0;
	int contador = 1;
	int principio = n-1;
	int fin = 0;
	do {
		//rellenamos la primera fila dejando la i fija
		for( j=0; j<principio; j++) {
		
				
				matriz[fin][j+1]=contador;	
				contador++;
		
		}
//ahora tenemos que bajar por la columna asi que al contrario dejamos j quieta y vamos sumando 1 a i
		for(i=fin;i<principio; i++) {
		

		
			matriz[i+1][principio]=contador;

			contador++;
		
	}
//ahora para introducir los numeros desde la ultima fila hay que ir hacia atras por lo que cambiamos el for 
		for(j=principio; j>fin; j--) {
			
			matriz[principio][j-1]=contador;
			contador++;
		}
	//y despues subimos la columna
		for(i=principio;i>fin+1;i--) {
			
			matriz[i-1][fin]=contador;
			contador++;
			
		}
		//vamos restando el principio y simando a fin para que no sobreescriba valores
		principio--;
		fin++;
	//el buble no terminara hasya que llegue a n*n
	}while(contador<(n*n));
		
		
	
}

	
}

