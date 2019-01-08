package ejerciciosIE31;

import java.util.Random;

public class ejercicio3 {

	public static void main(String[] args) {
	
		int [] euromillon; //declaramos los arrays
		int [] estrellas;
		euromillon=new int [5]; //damos tamaño a los arrays este por ej va a contener 5 numeros
		estrellas= new int [2]; //este va a tener un tamaño de dos numeros
		boolean aux=false; 
		int numero, i,j;
		Random randon= new Random (); //declaracion de la clase random
		for ( i=0; i<euromillon.length; i++) { //creamos el for para el euromillon
			
		
		do {				//aqui lo que hacemos es hacer un bucle para asegurarse de que los numero no se repitan
			
			numero= randon.nextInt(50)+1; //añadimos a la variable numero, numero aleatorios
			aux=false;
			for(j=0;j<euromillon.length;j++) { //recorremos el array hasta el final
				if(numero==euromillon[j]) {//comprobamos que la variable numero no a cogido ningun numero repetido en el array
					aux=true; //si se a repetido se pondra aux en true y por lo tanto se volvera a repetir el bucle y se metera otro numero aleatorio
				}
			}
		}while(aux==true);
		euromillon[i]=numero; //cuando no se repita. introduciremo el numero en el array euromillon
		}
	for (i=0; i<estrellas.length;i++) { //aqui hacemos lo mismo que con euromillon, recorremos el array de principio a fin
		
		do { //creamos el bucle de comprobacion para que no se repitan
			numero=randon.nextInt(11)+1;
			aux=false;
			for ( j= 0; j<estrellas.length; j++) {
				
				if(numero==estrellas[j]) {
					aux=true;
				}
			}
		}while(aux==true);
			estrellas[i]=numero;
	}
			System.out.println("Los numeros del euromillon son ");
		for(i=0;i<euromillon.length;i++) {
			System.out.print(" "+ euromillon[i]);
		} System.out.println("\nLos numeros de las estrellas son ");
		for (i = 0;  i< estrellas.length; i++) {
			System.out.print(" " +estrellas[i]);
			
		}
	
	}

	

}
