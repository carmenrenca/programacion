package  IE11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio14 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		float sueldo = 0,ventas = 0, kilometros = 0, desplazamiento = 0, totalsuma;
		boolean aux=false;
		int res = 0;
	do {
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		do {
			try {
				System.out.println("Intruduce tu sueldo");
				sueldo=Integer.parseInt(teclado.readLine());
				aux=true;
			}catch(NumberFormatException e) {
				System.out.println("No introduzcas caracteres");
			}
		}while(aux==false);
		sueldo=(float) (sueldo-(sueldo*0.18));
		aux=false;
		do {
			try {
				System.out.println("Introduce las ventas realizadas");
				ventas=Integer.parseInt(teclado.readLine());
				aux=true;
			}catch(NumberFormatException e) {
				System.out.println("No introduzcas caracteres");
			}
		}while(aux==false);
	
		ventas=(float) (ventas+(ventas*0.05));
		aux=false;
		do {
			try {
				System.out.println("Dime el numero de kilometros que realizas");
				kilometros=Integer.parseInt(teclado.readLine()); 
				aux=true;
				
			}catch(NumberFormatException e) {
				System.out.println("No introcuzcas caracteres");
				
			}
		}while(aux==false);
		
		kilometros=kilometros*1;
		aux=false;
		do {
			try {
				System.out.println("Dime el numero de dias de desplazamientos");
				desplazamiento=Integer.parseInt(teclado.readLine()); 
				aux=true;
			}catch(NumberFormatException e) {
				System.out.println("No introduzcas caracteres");
			}
		}while(aux==false);
		aux=false;
		desplazamiento=desplazamiento*60;
		totalsuma=sueldo+ventas+kilometros+desplazamiento;
		totalsuma=totalsuma-150;
		System.out.println("El sueldo liquido es de " +totalsuma );
		System.out.println("Si deseas continuar pulsa 1, si quieres salir pulsa cualquier numero");
		do {
			try {
				res= Integer.parseInt(teclado.readLine());
				aux=true;
				
			}catch(NumberFormatException e) {
				System.out.println("Si deseas continuar pulsa 1, si quieres pulsa cualquier numero");
			}
		}while(aux==false);
		
	}while (res==1);
		System.out.println("Adios!!");
		
	}

}
