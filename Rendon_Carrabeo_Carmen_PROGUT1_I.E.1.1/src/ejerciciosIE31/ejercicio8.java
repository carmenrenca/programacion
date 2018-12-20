package ejerciciosIE31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio8 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int n = 0, i = 0, j, num=0, contador=0;
		boolean aux=false;
		//boolean aux=false;
		int array[] ;
	
		
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		
		
		
			System.out.println("Cuantos numeros desea introducir");
			n=Integer.parseInt(teclado.readLine());
			array= new int [n];
				
				
			for (i = 0;  i< array.length;i++) {	
				
				do {
					do {
						try {
							System.out.println("ingresa un numero");
							num=Integer.parseInt(teclado.readLine());
							if(num%3!=0 || num<0) {
							System.out.println("numero no valido introduzca un numero valido");
							aux=false;
							}
							
						}catch(NumberFormatException e ) {
							System.out.println("Introduce caracteres correctos");
						aux=true;
						}
					}while(aux==true);
					
					
					
				}while(num%3!=0 || num<0  );
						
				array[i]=num;	
				}
			
				
				
				
for(j=0;j<array.length;j++) {
	
		System.out.println(array[j]+" Es multiplo de 3");
	
	
}
		
	}

}

	

