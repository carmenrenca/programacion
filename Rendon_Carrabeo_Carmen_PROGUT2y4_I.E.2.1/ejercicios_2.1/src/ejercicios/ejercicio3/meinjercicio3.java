package ejercicios.ejercicio3;


import java.io.IOException;
import java.io.InputStreamReader;

import excepciones.trycatch;


public class meinjercicio3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int n = 0;
		boolean aux=true;
		boolean res = false;
		cuenta c1;
		cuenta c2;
		trycatch excepcion = new trycatch(); //creamos un objeto de la clase trycatch la cual hemos creado para el uso de los try catch
		c1 = new cuenta();//objeto con el contructor vacio
		c2= new cuenta(423454223, 100,30); //objerto en el que usamos el constructor con parametros
		
	
		
					System.out.println("introduzca el DNI (sin letra)");
					c1.setDNI(excepcion.try_long());
				
				do {
				System.out.println("introduce interes anual en %");
				c1.setInteresanual(excepcion.try_double());
				if (c1.interesanual<0 || c1.interesanual>100) {
					System.out.println("no puedes introducir un numero menor que 0 ni mayor que 100");
				}
			}while(c1.interesanual<0 || c1.interesanual>100);
			System.out.println("introduce el saldo");
			c1.setSaldoactual(excepcion.try_double());
			System.out.println("Datos cuenta 1");
			System.out.println(c1.mostrardatos());
			System.out.println("Datos cuenta 2");
			System.out.println(c2.mostrardatos());
			do {
			
					System.out.println("Marca la operacion que deseas realizar: ");
					System.out.println("1 Mostrar el saldo actual");
					System.out.println("2 Realizar un ingreso");
					System.out.println("3 Realizar un retiro");
					System.out.println("4 Salir del programa");
					n=excepcion.try_int();
					
				
				switch(n) {
				case 1: 
				System.out.println("el saldo actua es de:  "+c1.getactualizarSaldo());	break;
				case 2:
				System.out.println("cantidad que deseas ingresar");
				c1.setingreso(excepcion.try_int());break;
				case 3:
					System.out.println("cantidad a retirar");
					c1.setretiro(excepcion.try_int());break;
				case 4:
					System.out.println("Hasta pronto");
					res=true;
					 break;
				}
			
				}while(res==false);
			
	
		
	
			
		
	}

}
