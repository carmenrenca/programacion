package ejercicio14;

import java.io.IOException;

import excepciones.trycatch;

public class ejercicio14 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		trycatch e = new trycatch();
		int n;

		System.out.println("Dime un numero");
		n=e.try_int();
System.out.println("El factorial de "+n+ " es: "+CalculaFactorial(n));
	
		}
	
	public static int CalculaFactorial(int n) {



		if(n==0)

			return 1;

		else

		return n*CalculaFactorial(n-1);

	}
	}


