package ejercicios.ejericicio6;

import java.io.IOException;

import excepciones.trycatch;


public class mainPersona{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Persona persona1 = new Persona("Pepe", 18); //creamos el objeto persona 
		empleado1 empleado = new empleado1(); //creamos el objeto de la case empleado que hereta de persona
		trycatch excepcion =new trycatch();
	System.out.println("Datos de la persona");
		System.out.println(persona1.imprimirdato());
		
		System.out.println("Dame el nombre y la edad del empleado");
		empleado.modificarrdato(excepcion.try_String(), excepcion.try_int());
		System.out.println("Dame su sueldo");
		empleado.modificarsueldo(excepcion.try_double());
		System.out.println(empleado.imprimirdato());
		System.out.println(empleado.imprimirsueldo());
		
	
		
	}
	
	

}
