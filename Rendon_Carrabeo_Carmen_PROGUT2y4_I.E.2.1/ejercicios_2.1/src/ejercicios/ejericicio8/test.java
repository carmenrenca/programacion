 package ejercicios.ejericicio8;

import java.io.IOException;

import ejercicios.ejercicio7.Asignatura;
import excepciones.trycatch;


public class test {
static int n;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Alumno a1= new Alumno("Maria", 23); //creamos tres objetos alumno con sus nombres y edad
		Alumno a2= new Alumno("Natalia", 11);
		Alumno a3= new Alumno("Manuel", 19);
		trycatch excepcion= new trycatch(); //clase trycatch 
		//Asignaturas del alumno 1 
		Asignatura asignaruta1= new Asignatura ("programacion ", 4);
		Asignatura asignatura2= new Asignatura ("Lenguaje de marca", 8);
		//Asignaturas del alumno 2
				Asignatura asignaruta3= new Asignatura ("Base de Datos ", 2);
				Asignatura asignatura4= new Asignatura ("Entorno de desarrollo", 6);
	  //Asignaturas del alumno 3
		Asignatura asignaruta5= new Asignatura ("FOL ", 10);
		System.out.println(a1.ficha());
		System.out.println("----Asignatura que curso-----");
		System.out.println("Nombre de la asignatura: "+asignaruta1.getAsignatura());
		System.out.println("Nota obtenida: "+asignaruta1.cosultarnota());
		System.out.println("Verificación "+asignaruta1.verificarapto() );
		
		System.out.println("Nombre de la asignatura: "+asignatura2.getAsignatura());
		System.out.println("Nota obtenida: "+asignatura2.cosultarnota());
		System.out.println("Verificación "+asignatura2.verificarapto() );
		System.out.println(" "); 
		System.out.println(a2.ficha());
		System.out.println("----Asignatura que curso-----");
		System.out.println("Nombre de la asignatura: "+asignaruta3.getAsignatura());
		System.out.println("Nota obtenida: "+asignaruta3.cosultarnota());
		System.out.println("Verificación "+asignaruta3.verificarapto() );
		System.out.println(" ");
		System.out.println("Nombre de la asignatura: "+asignatura4.getAsignatura());
		System.out.println("Nota obtenida: "+asignatura4.cosultarnota());
		System.out.println("Verificación: "+asignatura4.verificarapto() );
		System.out.println(" ");
		
		
		System.out.println(a3.ficha());
		System.out.println("----Asignatura que curso-----");
		System.out.println("Nombre de la asignatura: "+asignaruta5.getAsignatura());
		System.out.println("Nota obtenida: "+asignaruta5.cosultarnota());
		System.out.println("Verificación; "+asignaruta5.verificarapto() );
		System.out.println(" ");
	
		
		
	}

}
