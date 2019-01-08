package ejerciciosIE31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio6 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		int array[]; //declaramos el array
		int i, j, numero = 0;
		boolean aux=false;
		array =new int [5]; //le damos un tamaño en este caso 5
		
	
			System.out.println("introduce los numeros por favor");
		for (i=0; i<array.length; i++) {
			do {
				try {
			
					numero= Integer.parseInt(teclado.readLine());
					
					aux=false;
				}catch(NumberFormatException e) {
					System.out.println("Introduce un numero valido");
					aux=true;
				}
				
				array[i]=numero; //introducimos los numeros directamente en el array
			}while(aux==true);
			
			
		
		}
		for ( j = 0; j < array.length; j++) { //creamos otro for para que nos recorra las posiciones de nuestro array y nos diga el contenido
			System.out.println("en la posicion " +j+ " tenemos un " +array[j]);
		}
		
	}

}
