package ejercicios.ejercicio15;

import java.io.IOException;

import excepciones.trycatch;

public class text {
static int n=0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		trycatch excepcion =new trycatch();
		Cuenta a = null; //creamos objeto a para la cuenta con saldo
		
		//hacemos objeto null porque realmente no esta creado hasta q el usuario en el menu elige la opcion
		//poner null sirve para crear la variable, pero no el objeto
		//por ejemplo cuadnfo hemos echo la opcion 3, todavia los obajetos no estaban creados y necesitabamos dar valor a la varible saldo;
		
		do {
			
	
		System.out.println("Elige una opcion: "); //hacemos nuestro menu con las diferentes opciones 
		System.out.println("1 Crear una cuenta vacia");
		System.out.println("2 Crear cuenta con saldo inicial");
		System.out.println("3 Ingresase dinero");
		System.out.println("4 Sacar dinero");
		System.out.println("5 ver saldo");
		System.out.println("6 salir");
		n=excepcion.try_int();
		switch (n) {
		case 1: a=new Cuenta();
		System.out.println("Tu  cuenta a sido creada"); break;
		case 2: 
		a.setSaldo(100);
		System.out.println("Tienes un saldo inicial de "+a.saldo+"€");break;
		case 3:
			System.out.println("Cuanto dinero quieres ingresar en la cuenta");
			a.setSaldo(excepcion.try_float()); break;
			
			
		case 4:
			System.out.println("Cuanto dinero deseas retirar");
			a.retirar(excepcion.try_float()); break;
		
		case 5:
			System.out.println(a.getSaldo());break;
			
		case 6: System.out.println("Hasta pronto");
		}
		
		}while(n!=6);
		
	}

}
