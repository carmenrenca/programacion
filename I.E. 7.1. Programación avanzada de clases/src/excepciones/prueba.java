package excepciones;

import java.io.IOException;

public class prueba {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		arrays a= new arrays();
		
		int matriz[][] = new int[3][6];
		int array[] = new int [5];
		a.rellenararray(array);
	a.imprimearray(array);
		a.contarpares(array);
		a.contarimpares(array);
		a.extrerpares(array);
		a.extrerimpares(array);

	}

}
