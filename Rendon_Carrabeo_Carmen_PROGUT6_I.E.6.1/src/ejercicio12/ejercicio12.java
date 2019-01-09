package ejercicio12;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import excepciones.trycatch;

public class ejercicio12 {

	char[] abecedario= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

	char[][] matriz=new char[15][15];
trycatch e= new trycatch();
	Random random=new Random();
	public void perdirpalabra() throws IOException {
		ArrayList<String> lista = new ArrayList<String>(10);
		System.out.println("Dame 10 palabras");
	
		for(int i=0; i<lista.size(); i++) {
			lista.add(e.try_String());
		}
		
	}
	public void iniciomatriz() {
		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {

				matriz[i][j]=' ';

			}

		}
	}
	public  void imprimirsopadeletras() {
		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j]=abecedario[random.nextInt(abecedario.length)];
				System.out.println(matriz[i][j]);
			}
	}
	}
}
