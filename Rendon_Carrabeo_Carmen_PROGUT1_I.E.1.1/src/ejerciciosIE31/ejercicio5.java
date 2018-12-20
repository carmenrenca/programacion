package ejerciciosIE31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.annotation.processing.SupportedSourceVersion;

public class ejercicio5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int  menu = 0, infantil = 0, terror = 0, pelicula = 0;
		
		double total = 0, porcentaje;
		boolean aux=false;
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		do {
			 do {
			System.out.println("Dame el codigo de pelicula");
			
			
			System.out.println("1- Suspense");
		
		    System.out.println("2- Terror");
		
		    System.out.println("3- Acción");
		
		    System.out.println("4- Ciencia Ficción");
		    System.out.println("5- Romantica");
		    System.out.println("6- Infantil");
		   
		    	 try {
					    menu=Integer.parseInt(teclado.readLine());
					    aux=false;
				    }catch(NumberFormatException e){
				    	aux=true;
				    }
		    }while(menu>6|| menu<0 || aux==true);
		   
	
			switch (menu) {
			case 1: total=total+2;  
			pelicula++; break;
			//suspense
			
			case 2: total=total+2;  
			terror++; 
			break;
			//terror
			
			case 3: total=total+2;  
			pelicula++;
			break;
			//acción
			case 4:
				pelicula++;
				total=total+1.80; 
				break;
				//ciencia ficción
				
			case 5: 
			total=total+1.80;
			pelicula++;
			break;
			
			//romantica
			
			case 6: System.out.println("Has elegido Infantil");
					pelicula++;
					total=total+1.50;
					infantil++;
					//infantil
			System.out.println("Si deseas terminar la elección de peliculas pulse 0");
			
			}
			
			
		}while(menu!=0 );
		
		System.out.println("El precio a pagar es de " +total+"€");
		
	
		porcentaje=(terror*100)/pelicula;
	
		System.out.println("el porcentaje de las pelis de terror es de "+porcentaje);
		System.out.println("tienes "+infantil+ " peliculas infantiles");
		
		
		
		
	}

}
