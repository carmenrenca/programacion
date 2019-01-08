package navidad;

import java.io.IOException;
import java.util.Random;

import excepciones.arrays;
import excepciones.trycatch;

public class ejercicio10 {
	arrays a=new arrays();
	static char matriz[][]= new char[6][6];
	static Random r = new Random();
	static int c=0;
	static int ipos;
	static int jpos;
	
	public static void iniciartablero(char matriz[][]) {
		
		for (int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz.length ;j++) {
				matriz[i][j]='X';
				 System.out.print(" "+ matriz[i][j]);
			}
			   System.out.println(" ");
		}
		
		escoderbarco(matriz);
	}
	
	public static void escoderbarco(char matriz[][]) {

	int posicioni;
	int posicionj;
	
	do {
		c++;
		posicioni=r.nextInt(5);
		posicionj=r.nextInt(5);	
		matriz[posicioni][posicionj]='*';
		
	}while(c!=7);
	
		
	}
	
	
	
	
	public static void main(String[] args) throws IOException {
		trycatch e= new trycatch();
		
		
		
System.out.println("Empieza el juego!!!");
		iniciartablero(matriz);
	do {
		System.out.println("Dame una posicion");
		do {
			ipos=e.try_int();
			jpos=e.try_int();
			if(ipos>5 || jpos>5) {
				System.out.println("valor incorrecto, se pasa del tablero");
			}
		}while(ipos>5|| jpos>5);
	
	comprobar(ipos, jpos);
	}while(c!=100);
		
		
	}
	

	

	public static void comprobar( int ipos, int jpos) {
		
			if(matriz[ipos][jpos]=='*') {
				System.out.println(matriz[ipos][jpos]='*');
				for (int i=0; i<matriz.length; i++) {
					for(int j=0; j<matriz.length ;j++) {
						matriz[i][j]='X';
						matriz[ipos][jpos]='*';
						 System.out.print(" "+ matriz[i][j]);
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
	

