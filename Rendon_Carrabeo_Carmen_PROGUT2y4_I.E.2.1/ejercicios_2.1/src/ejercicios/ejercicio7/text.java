package ejercicios.ejercicio7;

import java.io.IOException;

import excepciones.trycatch;


public class text {
static int n;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Asignatura a= new Asignatura("programacion", 4);
		trycatch excepcion = new trycatch (); //integramos un objeto de nuestra clase de excepciones try_catch
		
		do {
			
		
		System.out.println("Elige la opcion que desees");
		System.out.println("1 Nombre de la asignatura");
		System.out.println("2 Consultar la nota");
		System.out.println("3 modificar la nota");
		System.out.println("4 Verificar si es apto");
		System.out.println("5 salir");
		n=excepcion.try_int();
		switch (n) { //creamos el menu con las opciones
		
		case 1:
			System.out.println("El nombre de la asignatura es: "+a.asignatura); break;
		case 2: System.out.println("Tu nota es de "+a.cosultarnota());break;
		case 3: System.out.println("Indroduzca la nota");
		a.modificarnota(excepcion.try_double()); break;
		case 4: System.out.println(a.verificarapto()); break;
		case 5: System.out.println("Adios!!"); break;
		}
		
		
	}while(n!=5);
	}
}
