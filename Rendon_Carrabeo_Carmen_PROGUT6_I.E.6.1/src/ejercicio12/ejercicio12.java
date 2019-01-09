package ejercicio12;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import excepciones.trycatch;

public class ejercicio12 {
	static String[] lista =new String[5];

	char[] abecedario= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

	
static trycatch e= new trycatch();
	static Random random=new Random();
	
	public static void main(String[] args) throws IOException {
		char[][] matriz=new char[15][15];
		iniciomatriz(matriz);
		perdirpalabra();
		escondopalabra();
	}
	
	
	public static void iniciomatriz(char matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {

				matriz[i][j]=' ';

			}
System.out.println(" ");
		}
	}
	
	
	public static void perdirpalabra() throws IOException {
	String palabra;
		System.out.println("Dame 10 palabras");
	
		for(int i=0; i<lista.length; i++) {
			palabra=e.try_String();
			lista[i]=palabra;
			System.out.println("Dame otra palabra");
		}
		
	}
public static void escondopalabra() {
	int menu;
	String palabra = null;
	char[] chars = null;
	for(int i =0; i<lista.length; i++) {
		palabra=lista[i];
	chars = palabra.toCharArray();
	menu=random.nextInt(4);
	switch(menu) {
	case 1: vertical();
	case 2: 
	case 3:
	}
	
	}
	
	

	
	
	
	
}

public void vertical() {
	
}


	
	}

