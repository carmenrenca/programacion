package ejercicio11;

import java.util.Random;

public class ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] carton= new int[10];
		Random randon= new Random();
		int[] numeros =new int[99];
	
		System.out.println("Los numeros que tiene tu carton son: ");
		for(int h=0; h<carton.length;h++) {
			carton[h]=randon.nextInt(100);
			System.out.print(carton[h]+" ");
		}
		System.out.println("Empieza el juego!!!");
		
		
		for(int i=0; i<numeros.length; i++) {
			numeros[i]=randon.nextInt(100);
			for(int j=0; j<i; j++) {
		
				if(numeros[i]==numeros[j]) {
					i--;}
				}
		
			}
		
		for(int i=0; i<numeros.length; i++) {
			System.out.println("ha salido el "+numeros[i]);
			 for(int k=0; k<carton.length; k++) {
				  if(numeros[i]==carton[k]) {
					System.out.println(numeros[i]+" lo tienes!!!");	
					}
		}
		
		
		
			
		}
			
		}
		
}
	
	

	
