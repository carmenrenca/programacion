package ejercicio12;

import java.util.Random;

public class ejercicio12 {

	char[] abecedario= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

	char[][] matriz=new char[15][15];

	Random random=new Random();
	
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
