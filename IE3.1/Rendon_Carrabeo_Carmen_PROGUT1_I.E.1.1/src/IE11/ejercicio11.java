package  IE11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio11 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int n1 = 0, n2 = 0, numero, suma1 = 0, suma2 = 0, salida;
		boolean aux=false;
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		
		do {
			do {
				try {
					System.out.println("Dame el primer numero");
					n1 = Integer.parseInt(teclado.readLine());
					aux=true;
					
				}catch(NumberFormatException e) {
					System.out.println("No se permiten introducir caracteres");
					
				}
			}while(aux==false);
			
			aux=false;
		do {
			try {
				System.out.println("Dame el segundo numero");
				n2 = Integer.parseInt(teclado.readLine());
				aux=true;
			}catch(NumberFormatException e){
				System.out.println("No se permiten introducir caracteres");
				
				
			}
		}while(aux==false);
			

			for (numero = 1; numero <= n1; numero++) {
				if (n1 % numero == 0) {
					suma1 = suma1 + numero;

				}
			}
			for (numero = 1; numero <= n2; numero++) {
				if (n2 % numero == 0) {
					suma2 = suma2 + numero;

				}
			}

			if (suma1 == suma2) {
				System.out.println("son amigos");
			}

			else {
				System.out.println("No son amigos");
			}
		System.out.println("Pulsa 1 si deseas continuar y cualquier otro numero si deseas salir");	
		
		salida = Integer.parseInt(teclado.readLine());
		
		}while (salida==1);
		System.out.println("Adios!!!");


	}

}
