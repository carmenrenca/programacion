package  IE11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio17 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int baliza = 0,n = 0,num,a = 0, sumamayor=0, sumamenor=0, totalmayor=0;
		boolean aux=false;
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		do {
			try {
				System.out.println("Dime cuanto vale baliza");
				
				baliza=Integer.parseInt(teclado.readLine());
				aux=true;
			}catch(NumberFormatException e) {
				System.out.println("No introduzcas caracteres");
			}
		}while(aux==false);
		aux=false;
		do {
			try {
				System.out.println("dime cuantos numeros deseas  introducir");
				n=Integer.parseInt(teclado.readLine());
				aux=true;
			}catch(NumberFormatException e) {
					System.out.println("No introducas caracteres");
				}
			
		}while(aux==false);
		aux=false;
		for(num=1;num<=n;num++){
			do {
				try {
					System.out.println("introduce los numeros a comparar");
					a=Integer.parseInt(teclado.readLine());	
					aux=true;
				}catch(NumberFormatException e) {
					System.out.println("No introduzcas caracteres");
				}
				
			}while(aux==false);
			
			if(a>baliza) {
				sumamayor=sumamayor+1;
				totalmayor=totalmayor+a;
				
			}else if(a<baliza) {
				 sumamenor=sumamenor+1;
			 }
		 }
		System.out.println("Hay "+sumamenor+ " numeros, hay " +sumamayor+ " numeros mayores, y la suma de estos es " +totalmayor);
	}

}
