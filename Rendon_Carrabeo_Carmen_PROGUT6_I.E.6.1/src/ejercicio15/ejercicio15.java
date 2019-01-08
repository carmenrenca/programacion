package ejercicio15;

import java.io.IOException;

import excepciones.trycatch;

public class ejercicio15 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
int n;

trycatch a= new trycatch();

		System.out.println("cuantos numeros de la serie ");
		n=a.try_int();
		
		 for(int i = 0; i<n; i++){
	         System.out.print(funcionFibonacci(i) + ", ");
	    }
		
	}

	



private static int funcionFibonacci(int num){
    if(num == 0 || num==1) {
         return num;
  
}  else {
	return funcionFibonacci(num-1) + funcionFibonacci(num-2);
    
}
		}
		
	}


