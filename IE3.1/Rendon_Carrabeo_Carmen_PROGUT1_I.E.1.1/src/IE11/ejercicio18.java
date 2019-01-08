package IE11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio18 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		int n = 0,j,k = n,suma1=0,suma2=0, i=1;
		System.out.println("vamos a calcular el centro numerico");
		System.out.println("hasta donde quiere que llegue el centro numerico");
		
		n=Integer.parseInt(teclado.readLine());
		//do {
			for(j=1;j<n;i=-1) {
				
				suma1=suma1+j;
				System.out.println(suma1);}
			k= i+1;
			while(suma2==suma1){
				suma2=suma2+k;
			if(suma2==suma1){
				System.out.println(i+ "es un centro numerico");
				
			}
				k=k+1;
			}
			
		
		
	}

}
