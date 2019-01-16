package ejercicio10;

import java.io.IOException;


import java.util.Random;

import excepciones.arrays;
import excepciones.trycatch;

public class ejercicio10 {
	arrays a=new arrays();
	static char matrizaux[][]= new char[6][6];
	static char matriz[][]= new char[6][6];
	static Random r = new Random();
	static int cfila;
	static int ccolumna;
	static int ipos;
	static int jpos;
	static	int c=0;
	static int barcos=0;
	//metodo que crea la matriz, que hará de tablero del juego
	public static void iniciartablero(char matriz[][]) {
		
		for (int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz.length ;j++) {
				matriz[i][j]='X';
				 System.out.print(" "+ matriz[i][j]);
			}
			   System.out.println(" ");
		}
		
		
}
	/**
	 * metodo en el que vamos a esconder los barcos, que seran los *,
	 *  lo vamos a colocar de forma aleatoria gracias a un random
	 * @param matriz
	 */
	
	
	public static void escoderbarco(char matriz[][]) {

	int posicioni;
	int posicionj;
	int J=0;
	do {
		J++;
		posicioni=r.nextInt(6);
		posicionj=r.nextInt(6);	
		matriz[posicioni][posicionj]='*';
		
	}while(J!=7);

		
	}
	
	
	/**
	 * en el metodo main vamos a llamar al metodo para iniciar el tablero y el otro para esconder
	 * el barco.
	 * A continiacion vamos a pedirle al usuario que introduzca una posioción de la matriz, para verificar si esta el barco
	 * crearemos una condicion para que el usuario no introduzca unas coordenadas erroneas
	 * Despues de todo esto vamos llamar a nuestro metodo comprobar, que lo que hará sera comprobar si en nuestro coordenada hay un barco
	 * si esta nos lo imprimirá en el tablero, si no saldra un mensaje de que hemos tocado agua.
	 * @param args
	 * @throws IOException
	 */
	
	public static void main(String[] args) throws IOException {
		trycatch e= new trycatch();
	
		iniciartablero(matriz);
		escoderbarco(matriz);
		
System.out.println("Empieza el juego!!!");
		
	do {
		System.out.println("Dame una posicion");
		do {
		ipos=e.try_int();
		System.out.println("dame la siguente posicion");
			jpos=e.try_int();
			if(ipos>5 || jpos>5) {
				System.out.println("valor incorrecto, se pasa del tablero");
			}
		}while(ipos>5|| jpos>5);
	
	comprobar(ipos, jpos);
	}while(barcos<=6 || barcos<=7);
	System.out.println("Has encontrado todos los barquitos, FELICIDADES!!");
		
		
	}
	

	

	public static void comprobar( int ipos, int jpos) {
	
	
	
		if(c==0) {
			for (int i=0; i<matrizaux.length; i++) {
				for(int j=0; j<matrizaux.length ;j++) {
					matrizaux[i][j]='X';
					 //System.out.print(" "+ matriz[i][j]);
				}
				   //System.out.println(" ");
			}
		}
		c++;
			if(matriz[ipos][jpos]=='*') {
				matrizaux[ipos][jpos]='*';
				barcos++;
				for (int i=0; i<matrizaux.length; i++) {
					for(int j=0; j<matrizaux.length ;j++) {
						
						 System.out.print(" "+ matrizaux[i][j]);
					}
					   System.out.println(" ");
				}
				System.out.println("has dado!!");
				}else {
					System.out.println("AGUA!!");
					System.out.println("Sigue intentandolo");
				}
			
		
		
			
	}
	
	
	
	
	}
	

