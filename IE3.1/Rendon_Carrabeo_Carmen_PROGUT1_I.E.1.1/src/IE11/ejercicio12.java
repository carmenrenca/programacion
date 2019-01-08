package IE11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio12 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int a, n = 0, numero;
		float cara1 = 0, cara2 = 0, cara3 = 0, cara4 = 0, cara5 = 0, cara6 = 0;
		boolean aux=false;
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		do {
			try {
				System.out.println("Dime el numero de veces que quieres tirar el dado");

				n = Integer.parseInt(teclado.readLine());
				aux=true;
			}catch(NumberFormatException e){
				System.out.println("No se permiten introduccir caracteres");
				
				
			}
		}while(aux==false);
		

		for (a = 1; a <= n; a++) {
			numero = (int) (Math.random() * 6) + 1;
		System.out.println(numero);

			switch (numero) {
			case 1:
				cara1 = cara1 + 1; break;
			case 2:
				cara2 = cara2 + 1; break;
			case 3:
				cara3 = cara3 + 1; break;
			case 4:
				cara4 = cara4 + 1; break;
			case 5:
				cara5 = cara5 + 1; break;
			case 6:
				cara6 = cara6 + 1; break;
			}
		}
		System.out.println("El porcentaje del numero de veces que salio la cara 1 es " + (cara1 / n) * 100);
		System.out.println("El porcentaje del numero de veces que salio la cara 2 es " + (cara2 / n) * 100);
		System.out.println("El porcentaje del numero de veces que salio la cara 3 es " + (cara3 / n) * 100);
		System.out.println("El porcentaje del numero de veces que salio la cara 4 es " + (cara4 / n) * 100);
		System.out.println("El porcentaje del numero de veces que salio la cara 5 es " + (cara5 / n) * 100);
		System.out.println("El porcentaje del numero de veces que salio la cara 6 es " + (cara6 / n) * 100);
		
	}

}
