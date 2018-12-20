package IE11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio10 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int numero,n = 0;
		boolean aux=false;
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		numero = (int) (Math.random() * 100) + 1;
		do {
			try {
				System.out.println("Dame un numero");
				
				n=Integer.parseInt(teclado.readLine());
				aux=true;
			}catch(NumberFormatException e) {
				System.out.println("No puedes introducir caracteres");
				
			}
		}while(aux==false);
		aux=false;
	
		while(n!=numero) {
			if (n<numero){
				do {
					try {
						System.out.println("Es menor que el numero secreto");
						n=Integer.parseInt(teclado.readLine());
						aux=true;
					}catch(NumberFormatException e){
						System.out.println("No se permiten caracteres");
						
					}
				}while(aux==false);
				aux=false;
			}
			else if (n>numero) {
				do {
					try {
						System.out.println("Es mayor que el numero secreto");
						n=Integer.parseInt(teclado.readLine());
						aux=true;
					}catch(NumberFormatException e) {
						System.out.println("No se permiten caracteres");
						
					}
				}while(aux==false);
				
			}
			
			
		}
		
		if(n==numero) {
			System.out.println("Enorabuena!!! el numero secreo era " +numero);
		}
		
		
	}

}
