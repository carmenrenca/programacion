package  IE11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio9 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
	

			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
				int n1 = 0, n2 = 0, suma=0,n, resta=0, multiplicacion=0, division=0;
				boolean aux=false;
				
				do {
					System.out.println("Dame un numeros para hacer la operacion que desees");
					
					try {
						n1=Integer.parseInt(teclado.readLine());
						aux= true;
						
					}catch(NumberFormatException e){
						System.out.println("No puedes introduccir caracteres");
						
					}
				}while(aux==false);
					aux=false;	
						do { 
							try {
								System.out.println("Dame otro numero");
								n2=Integer.parseInt(teclado.readLine());
								aux=true;
							}catch(NumberFormatException e) {
								System.out.println("No puedes introducir caracteres");
							}
						}while(aux==false);
						
						do {
						System.out.println("-------------------------------------------------------------");
						System.out.println("ELIGE UNA OPCION");
						
						
						System.out.println("1.- Sumar los números.");
						System.out.println("2.- Restar los números.");
						System.out.println("3.- Multiplicar los números");
						System.out.println("4.- Dividir los números.");
						System.out.println("5.- Salir del programa.");
						System.out.println("-------------------------------------------------------------");
						n=Integer.parseInt(teclado.readLine());
						while(n<0 || n>5){
							System.out.println("Dame un numero del 1 al 5");	
							n=Integer.parseInt(teclado.readLine());
							
						}
				switch (n) {
				case 1: System.out.println("Has elegido suma");
				
					suma=n1+n2;
					System.out.println(suma);break;
				
				
				case 2: System.out.println("Has elegido resta");
					resta=n1-n2;
					System.out.println(resta); break;
			
				case 3: System.out.println("has elegido multiplicar");
				multiplicacion=n1*n2;
				System.out.println(multiplicacion); break;
				
				case 4: System.out.println("Has elegido division");
				while (n2==0) {
					System.out.println(" Dame un numero distinto de cero");
					n2=Integer.parseInt(teclado.readLine());
				}
				division=n1/n2;
				System.out.println(division);break;
				
				case 5: System.out.println("Adios!!");break;
				}
				
				}while(n<1 || n<5);	
				
				
				
					
				}
			

		

	}


