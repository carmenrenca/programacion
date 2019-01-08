package IE11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio16 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		

		int n = 0,semillarepollo=0,res=0, semillatomates = 0, sumasemilla = 0, semillapatata = 0, num = 0, semillacebolla=0;
		boolean aux=false;
	
			do {
				do {
				try {
					System.out.println("pulse el cultivo que desea");
					System.out.println("1-TOMATES");
					System.out.println("2-REPOLLO");
					System.out.println("3-PATATA");
					System.out.println("4-CEBOLLA");
				
					n=Integer.parseInt(teclado.readLine());
					aux=true;
				}catch(NumberFormatException e) {
					System.out.println("no debe de introducir caracteres");
					
				}
			}while((aux==false) || (n<1 || n>4));
			aux=false;
			
			switch (n){
			
			case 1: System.out.println("Has elegido tomates");
			do {
				try {
					System.out.println("coge la semilla que desees");
					System.out.println("1-Pera"); 
					System.out.println("2-Ensalada");
					semillatomates=Integer.parseInt(teclado.readLine());
					aux=true;
				}catch(NumberFormatException e){
					System.out.println("No debe de introducir caraceres");
					
				}
			}while((aux==false) || (semillatomates<1 || semillatomates>2));break;
		
			
			case 2: 
				aux=false;
			do {
				try {
					System.out.println("Has elegido Repollo");
					System.out.println("El precio de estas semillas es de 10");
					System.out.println("Cuantas deseas");
					semillarepollo=Integer.parseInt(teclado.readLine());
					aux=true;
				}catch(NumberFormatException e) {
					System.out.println("No debe de introducor caracteres");
					
				}
			}while(aux==false);
			
			sumasemilla=semillarepollo*10;
			System.out.println("su precio es de " +sumasemilla);break;
			
			case 3: 
				aux=false;
			do {
				try {
					System.out.println("Has elegido Patata");
					System.out.println("coge la semilla que desees");
					
					System.out.println("1-Criolla");
					System.out.println("2-Pastusa");
					System.out.println("3-Salentuna");
					semillapatata=Integer.parseInt(teclado.readLine());
					aux=true;
				}catch(NumberFormatException e) {
					System.out.println("No debes introducir caracteres");
				}
			
			}while((aux==false)|| (semillapatata<1 || semillapatata>3)) ;break;
			
			
			case 4:
			aux=false;
			do {
				try {
					System.out.println("Has elegido Cebolla");
					System.out.println("coge la semilla que desees");
					System.out.println("1-largas");
					System.out.println("2- Viejas");
					semillacebolla=Integer.parseInt(teclado.readLine());
					aux=true;
				}catch(NumberFormatException e) {
					System.out.println("No debes de introduccir caracteres");
				}
			}while((aux==false)||(semillacebolla<1 || semillacebolla>2));
			
			}
			switch (semillatomates) {
			case 1 :
			aux=false;
			 do {
				 try {
				  System.out.println("El valor de las semillas de pera es de 15");
					System.out.println("dime el numero de semillas");
					num=Integer.parseInt(teclado.readLine());
					aux=true;
					
					}catch(NumberFormatException e) {
						System.out.println("No se permiten caracteres");
					}
					
				 }while(aux==false);
				sumasemilla=num*15;
				System.out.println("le costaria " +sumasemilla);break;
				
			case 2:
				do {
					try {
						System.out.println("El valor de las semillas de ensalada es de 20");
						System.out.println("dime el numero de semillas");
						num=Integer.parseInt(teclado.readLine());
						aux=true;
						}catch(NumberFormatException e) {
						System.out.println("No se permiten caracteres");
					}	
				}while(aux==false);
			
			sumasemilla=num*20;
			System.out.println("le costaria " +sumasemilla);break;
			
			 }
			
			
			switch (semillapatata) {
			
			case 1: 
				aux=false;
			do {
				try {
					System.out.println("El valor de las criolla es de 8");
					System.out.println("dime el numero de semillas");
					num=Integer.parseInt(teclado.readLine());
					aux=true;
					
				}catch(NumberFormatException e) {
					System.out.println("No se permiten caracteres");
				}
			}while(aux==false);
			
			sumasemilla=num*8;
			System.out.println("le costaria " +sumasemilla);break;
			
			
			case 2:
			aux=false;
				do {
					try {
						System.out.println("El valor de las semilla de pastusa es de 9");
						System.out.println("dime el numero de semillas");
						num=Integer.parseInt(teclado.readLine());
						aux=true;
					
					}catch(NumberFormatException e) {
						System.out.println("No se permiten caracteres");
					}
				
			}while(aux==false);
			
			sumasemilla=num*9;
			System.out.println("le costaria " +sumasemilla);break;
			
			case 3:
				aux=false;
			do {
				try {
					System.out.println("El valor de las semilla de salentuna es de 11");
					System.out.println("dime el numero de semillas");
					num=Integer.parseInt(teclado.readLine());
					aux=true;
				}catch(NumberFormatException e) {
					System.out.println("No se permiten caracteres");
				}	
			}while(aux==false);
			
			sumasemilla=num*11;
			System.out.println("le costaria " +sumasemilla);break;
			}
			
			switch (semillacebolla) {
			
			case 1: 
				aux=false;
			do {
				
				try {
					System.out.println("El valor de la larga  es de 15");
					System.out.println("dime el numero de semillas");
					num=Integer.parseInt(teclado.readLine());
					aux=true;
				}catch(NumberFormatException e) {
					System.out.println("No se permiten caracteres");
				}
			}while(aux==false);
			
			sumasemilla=num*15;
			System.out.println("le costaria " +sumasemilla);break;
			
			case 2:
				aux=false;
				do {
					try {
						System.out.println("El valor de la vieja es de 13");
						System.out.println("dime el numero de semillas");
						num=Integer.parseInt(teclado.readLine());
						aux=true;
					}catch(NumberFormatException e) {
						System.out.println("No se permiten caracteres");
					}
				}while(aux==false);
				
			sumasemilla=num*13;
			System.out.println("le costaria " +sumasemilla);break;
			}
			System.out.println("Pulse 1 si desea continuar y cualquier otro numero para salir");
			res=Integer.parseInt(teclado.readLine());
		}while(res==1);
		
		System.out.println("Hasta pronto");
	
			}

}
