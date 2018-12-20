package IE11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		

		int n = 0, total=0;
		boolean aux=false;
		System.out.println("vamos a calcular la nota media");
		
		
	
		do { 
			do {
				System.out.println("Introduzca la nota de Entornos de Programacion:");
				try {
					n=Integer.parseInt(teclado.readLine());
					aux=true;
				}catch(NumberFormatException e) {
					System.out.println("Dato incorrecto");
				}
				
				
			}while(aux==false);
			}while (n<0 || n>10);
		total=total+n;
		
		do {  aux=false;
			do {
				System.out.println("Introduzca la nota de Entornos de Lenguaje de marca:");
				try {
					n=Integer.parseInt(teclado.readLine());
					aux=true;
				}catch(NumberFormatException e) {
					System.out.println("Dato incorrecto");
				}
				
				
			}while(aux==false);
			}while (n<0 || n>10);
		total=total+n;
		
		do {  aux=false;
			do {
				System.out.println("Introduzca la nota de Base de datos:");
				try {
					n=Integer.parseInt(teclado.readLine());
					aux=true;
				}catch(NumberFormatException e) {
					System.out.println("Dato incorrecto");
				}
				
				
			}while(aux==false);
			}while (n<0 || n>10);
		total=total+n;
		
		do {  aux=false;
			do {
				System.out.println("Introduzca la nota de Entornos de Desarrollo:");
				try {
					n=Integer.parseInt(teclado.readLine());
					aux=true;
				}catch(NumberFormatException e) {
					System.out.println("Dato incorrecto");
				}
				
				
			}while(aux==false);
			}while (n<0 || n>10);
		total=total+n;
			
		do {  aux=false;
		do {  
			System.out.println("Introduzca la nota de Sistemas Informáticos:");
			
			try {
				n=Integer.parseInt(teclado.readLine());
				aux=true;
			}catch(NumberFormatException e) {
				System.out.println("Dato incorrecto");
			}
			
			}while (aux==false);
		
		}while (n<0 || n>10);
	
		total=total+n;
			
			
			
		do {  aux=false;
		do {
			System.out.println("Introduzca la nota de Formación y Orientación Laboral:");
			try {

				
				
				n=Integer.parseInt(teclado.readLine());
				aux=true;
			}catch(NumberFormatException e){
				
				System.out.println("Me tienes que dar un numero");
				
				}
			
		}while(aux==false);
		}while (n<0 || n>10);	
		total=total+n;	
			
			
			System.out.println("la media es "+total/6);
	}

}
