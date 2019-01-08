package ejerciciosIE31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio7 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		double n = 0,numeros, suma = 0, media = 0;
		int array[];
		boolean aux=false;
		do {
			
			try {
				System.out.println("Cuantos numeros quieres introduccir en el array");
				n=Integer.parseInt(teclado.readLine());
				aux=false;
			}catch(NumberFormatException e) {
				System.out.println("Dame un numero valido");
				aux=true;
			}
		}while(aux==true);
	
		aux=false;
		array= new int [(int) n];
		
		
		
		
		for(int i=0; i<array.length; i++) {
			do {
				try {
					System.out.println("Introduca los numeros");
					
					numeros=Integer.parseInt(teclado.readLine());
					array[i]=(int) numeros;
					aux=false;
				}catch(NumberFormatException e) {
					System.out.println("dame un numero valido");
					aux=true;
				}
			}while(aux==true);
			
			
			suma+=array[i];
			media=	suma/2;
			
		}
		System.out.println("La suma de los numeros es de "+suma);
		System.out.println("La media de los numeros es de "+media);
	
	
	}

}
