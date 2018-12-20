package ejerciciosIE31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
	int distancia = 0, personas = 0,  res, kmadicional;
	double  descuento,  grupo=0.0, billete=20;
	boolean aux=false;
	do {
		
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		do {
			try {
				System.out.println("Dime la distancia a tu destino");
				distancia=Integer.parseInt(teclado.readLine());
				System.out.println("Cuantas personas viajais");
				personas=Integer.parseInt(teclado.readLine());
				aux=false;
			}catch(NumberFormatException e) {
				System.out.println("No introduzcas caracteres");
				aux=true;
			}
		}while (aux);
		
		
	
		if(distancia<=200) {
			System.out.println("Su billete  individual le costaria " +billete);
		
	
		}
		
		if(distancia>200 && distancia<400) {
			kmadicional=distancia-200;
		billete=(kmadicional*0.03)+billete;
		System.out.println("Al recorrer mas de 200km se le añade un plus de 0.03€ el km");
		System.out.println("Su billete individual cuesta" +billete+ "€");
		}
		if(distancia>=400) {
			kmadicional=distancia-200;
			billete=(kmadicional*0.03)+billete;
			descuento=billete*0.15;
			billete=billete-descuento;
			System.out.println("El billete individual para trayectos de mas de 400 km es de " +billete + "€");
			
		}
		
		 if(personas>=3) {
			 descuento=(billete*personas)*0.10;
			 grupo=(billete*personas)-descuento;
			 System.out.println("Para un grupo de mas de 3 le hacemos un descuento del 10%");
			 System.out.println("Todos los billetes seria de " +grupo+ "€");
		 }
		 if(personas==2) {
				
				grupo=billete*personas;
				System.out.println("En total los billetes para dos personas les costaria "+grupo );
			}
		
		
		
	
		
		System.out.println("desea salir del programa pulse 1 si quiere continuar");
		res=Integer.parseInt(teclado.readLine());
	}while(res==1);
		
	
	
	
	
	}

}
