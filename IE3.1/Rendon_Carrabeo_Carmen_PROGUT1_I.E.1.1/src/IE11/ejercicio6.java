package IE11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio6 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int nota = 0;
		boolean aux=false;
		
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		do {
		do {
			try {
				System.out.println("Introduce una nota");
				nota=Integer.parseInt(teclado.readLine());
				aux=true;
			}catch (NumberFormatException e) {
				System.out.println("No introduzcas un caracter");
			}
		}while (aux==false);
		
		
			if(nota>=0 && nota<=4){
				System.out.println("Tienes un insuficiente");
			} else if(nota>=5 && nota<=6 ) {
				System.out.println("Tienes un suficiente");
			}else if(nota>=7 && nota<=8) {
				System.out.println("Tienes un notable");
			}else if (nota>=9 && nota<=10) {
				System.out.println("Tienes un sobresaliente");
			}
			
		
		}while(nota<0 || nota>10 );
	}

}
