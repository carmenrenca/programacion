package ejerciciosIE31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio9 {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		int array[], i,n = 0, mayor = 0, pos = 0;
		boolean aux=true;
		array= new int [20];
	
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Introduce los numeros");
		
		for(i=0;i<array.length;i++) {
			do {
				try {
					n=Integer.parseInt(teclado.readLine());
					aux=true;
				}catch(NumberFormatException e) {
					System.out.println("No introduzcas caracteres");
					aux=false;
				}
			}while(aux==false);
			System.out.println("introduzca un numero");
		
			array[i]=n;
		if(array[i]>mayor) {
			mayor=array[i];
			pos=i;
			
		}
		
		}
		System.out.println("el mayor es " +mayor+ " y esta en la posicion " +pos);

	}

}
