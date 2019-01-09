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
	public static void iniciartablero(char matriz[][]) {
		
		for (int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz.length ;j++) {
				matriz[i][j]='X';
				 System.out.print(" "+ matriz[i][j]);
			}
			   System.out.println(" ");
		}
		
		
}
	
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
	

