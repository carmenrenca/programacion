package excepciones;

import java.io.IOException;

public class prueba {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		arrays a= new arrays();
		
		int matriz[][] = new int[3][3];
		int matriz1[][] = new int[3][3];
		a.rellenarmatriz(matriz1);
	
		a.imprimirmatrizint(matriz1);
	System.out.println(a.posicionmenorcolumna(matriz1));
	}

}
