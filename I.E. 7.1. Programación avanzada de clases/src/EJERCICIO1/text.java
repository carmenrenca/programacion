package EJERCICIO1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import excepciones.trycatch;


public class text {
	static HashMap<Integer, cuenta> cuentas = new HashMap<Integer, cuenta>();
	static trycatch e = new trycatch();
	static 	int cont = 0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub



int n;

do {
System.out.println("1 crear cuenta correinte ");
System.out.println("2 crear cuenta ahorro");
System.out.println("3 listar cuentas");
System.out.println("4 ingresar dinero");
System.out.println("5 retirar dinero");
System.out.println("6 actualizar el saldo");
System.out.println("7 cambiar el interes");
n=e.try_int();




switch(n) {
case 1:
	crearcuentacorriente();break;
case 2: 
	crearcuentaahorro(); break;
case 3:
	listarcuentas(); break;
case 4:
	ingresar(); break;
case 5: 
	retirar(); break;
case 6: 
	actualizarsaldo();break;
case 7: 
	
	cambiarinteres();break;
}


}while(n!=0);
	
	}


	public static void crearcuentacorriente() throws IOException {
		
		String nombre;
		String apellidos;
		String NIF;
	
		
		System.out.println("nombre del cliente");
		nombre=e.try_String();
		System.out.println("apellido del cliente");
		apellidos=e.try_String();
		System.out.println("NIF del cliente");
		NIF=e.try_String();
		System.out.println();
		Persona p= new Persona(nombre,apellidos,NIF);
		cuenta_corrriente c= new cuenta_corrriente(cont,p);
		
		cuentas.put(cont, c);
		cont++;
		
		}


	
	public static void crearcuentaahorro() throws IOException {
		String nombre;
		String apellidos;
		String NIF;
		
		System.out.println("nombre del cliente");
		nombre=e.try_String();
		System.out.println("apellido del cliente");
		apellidos=e.try_String();
		System.out.println("NIF del cliente");
		NIF=e.try_String();
		System.out.println();
		Persona p= new Persona(nombre,apellidos,NIF);
		cuenta_ahorro ch= new cuenta_ahorro(cont,p);
		cuentas.put(cont, ch);
		cont++;	
	}
	public static void listarcuentas() {
for (Map.Entry<Integer, cuenta> cuenta : cuentas.entrySet()) {

			
			System.out.println(cuenta.getValue().ToString());

			

		}
}
	public static void ingresar () throws IOException {
		int ncuenta;
		double saldo;
		System.out.println("dime que numero de cuentas quieres realizar el ingreso");
		listarcuentas();
		ncuenta=e.try_int();
		if(cuentas.containsKey(ncuenta)) {
			System.out.println("cuanto deseas ingresar");
			saldo=e.try_double();
			cuentas.get(ncuenta).ingreso(saldo);
			System.out.println(" se han depositado "+saldo+ "en la cuenta"+ncuenta);
		}else {
			System.out.println("esa cuenta no existe");
		}
	}
	public static void retirar() throws IOException {
		int ncuenta;
		double retiro = 0;
		System.out.println("introduce el numero de cuenta en el que quieres retirar la cantidad");
		listarcuentas();
		ncuenta=e.try_int();
		
		System.out.println("cuanto deseas retirar");
	retiro=e.try_double();
		if(cuentas.containsKey(ncuenta)) {
			cuentas.get(ncuenta).retirar(retiro);
		}else {
			System.out.println("esa cuenta no existe");
		}
	}
	
	public static void actualizarsaldo() throws IOException {
		int ncuenta;
		System.out.println("de que cuenta quieres actualizar el saldo");
		listarcuentas();
		ncuenta=e.try_int();
		
		if(cuentas.containsKey(ncuenta)) {
			cuentas.get(ncuenta).actualizarsaldo();
		}else {
			System.out.println("esa cuenta no existe");
		}
	}
	
	public static void  cambiarinteres() throws IOException {
		int ncuenta;
		double interes;
		System.out.println("dime el numero de cuenta");
		listarcuentas();
		ncuenta=e.try_int();
		if(cuentas.containsKey(ncuenta)) {
			if(cuentas.get(ncuenta) instanceof cuenta_ahorro) {
				System.out.println("Introduzca el interes");
				interes=e.try_double();
				cuentas.get(ncuenta).setInteres(interes);
			}else {
				System.out.println("una cuenta corriente no tiene el interes variable");
			}
			
			
		}else {
			System.out.println("el codigo es incorrecto");
		}
	}
	
	}