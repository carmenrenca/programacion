package IE11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio7 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stubç
		int n = 0, num, suma=0;
		boolean aux=false;
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
	do {
		try {
			System.out.println("Introduce un numero hasta donde quieras calcular los multiplos de 3");
			n=Integer.parseInt(teclado.readLine());
			aux=true;
		}catch(NumberFormatException e) {
			System.out.println("No introduzcas caracteres");
		}
	}while(aux==false);
		
		for(num=1; num<=n; num++) {
			if(num%3==0){
				System.out.println(num+ " es multiplo de 3");
				suma=suma+1;
			}
		}
		
		
		System.out.println("hay "+suma+" numeros multiplos de 3");
	}

}
