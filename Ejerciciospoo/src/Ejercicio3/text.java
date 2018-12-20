package Ejercicio3;

import java.io.IOException;

import excepciones.trycatch;

public class text {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		trycatch e = new trycatch();
		Cuenta c= new Cuenta(123452, 1000, 400);
		int n;
		do {
			
		
		System.out.println("1 Actualizar saldo");
		System.out.println("2 Ingresar dinero");
		System.out.println("3 Retirar dinero");
		System.out.println("4 Mostrar datos");
		System.out.println("5 Salir");
		n= e.try_int();
		switch(n) {
		case 1: c.actualizarsaldo();break;
		case 2: System.out.println("Cuanto deseas ingresar");
		c.ingresar(e.try_double());break;
		case 3: System.out.println("Cuanto deseas retirar");
		c.retirar(e.try_double());break;
		case 4: System.out.println(c.To_String());break;
		case 5: System.out.println("hasta pronto");
		default: System.out.println("Introduce numeros del 1 al 5");
		}
		
		}while(n>=1||n<=5);
		
	}

}
