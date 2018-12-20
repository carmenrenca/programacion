package  IE11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio13 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int dia1 = 0, dia2 = 0, hora1 = 0, hora2 = 0, min1 = 0, min2 = 0, sumaida, sumallegada, total;
		boolean aux=false;
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		do {
			
			
			do {
				try {System.out.println("dame un dia valido de ida (1 al 31) ");
				dia1=Integer.parseInt(teclado.readLine());
					aux=true;
				}catch(NumberFormatException e) {
					System.out.println("No se permiten caracteres");
					
				}
			}while(aux==false);
			
			

			
		}while (dia1<1 || dia1>31);
		aux=false;
		do {
			do {
				try {
					System.out.println("dame una hora valida de ida (1 al 24) ");
					
					hora1=Integer.parseInt(teclado.readLine());
						
					aux=true;
				}catch(NumberFormatException e) {
					System.out.println("No se permiten caracteres");
				}
			}while(aux==false);
			
			
		}while (hora1<1 || hora1>24);
		aux=false;
		do {
			do { try {
				System.out.println("dame los minutos de ida (1 al 60) ");
				
				min1=Integer.parseInt(teclado.readLine());
				aux=true;
			}catch(NumberFormatException e) {
				System.out.println("No se permiten caracteres");
			}
			}while(aux==false);
			
		
			
		}while (min1<1 || min1>60);
		
	do {
			
			
			do {
				try {System.out.println("dame un dia valido de llegada (1 al 31) ");
				dia2=Integer.parseInt(teclado.readLine());
					aux=true;
				}catch(NumberFormatException e) {
					System.out.println("No se permiten caracteres");
					
				}
			}while(aux==false);
			
			

			
		}while (dia2<1 || dia2>31);
		aux=false;
		do {
			do {
				try {
					System.out.println("dame una hora valida de llegada (1 al 24) ");
					
					hora2=Integer.parseInt(teclado.readLine());
						
					aux=true;
				}catch(NumberFormatException e) {
					System.out.println("No se permiten caracteres");
				}
			}while(aux==false);
			
			
		}while (hora2<1 || hora2>24);
		aux=false;
		do {
			do { try {
				System.out.println("dame los minutos de llegada (1 al 60) ");
				
				min2=Integer.parseInt(teclado.readLine());
				aux=true;
			}catch(NumberFormatException e) {
				System.out.println("No se permiten caracteres");
			}
			}while(aux==false);
			
		
			
		}while (min1<1 || min1>60);
		
	
		dia1=dia1*1440;
		dia2=dia2*1440;
		hora1= hora1*60;
		hora2=hora2*60;
	
		sumaida=dia1+hora1+min1;
		sumallegada=dia2+hora2+min2;
		total=sumallegada-sumaida;
		System.out.println(total);
		System.out.println("has tardado estos dias "+(total/1440) );
		total=(total%1440);
		System.out.println("has tardado estos horas " +(total/60));
		total=total%60;
		System.out.println("Y estos minutos " +total);
	}
	

}
