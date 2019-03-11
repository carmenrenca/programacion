package EJERCICIO3;

import java.io.IOException;
import java.util.ArrayList;

import com.sun.java_cup.internal.runtime.Symbol;

import excepciones.misString;
import excepciones.trycatch;

public class text {
	
	static ArrayList<Persona> personas = new ArrayList<Persona>();
static trycatch e= new trycatch();
static misString s= new misString();

static String nombre;
static String apellido;
static String dni;
static String calle;
static String ciudad;
static String cp;
static String pais;
static String despacho;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n;
do {
	

System.out.println("1 crear alumno");
System.out.println("2 crear profesor");
System.out.println("3 listar alumos");
System.out.println("4 listar profesores");
n=e.try_int();

switch(n) {
case 1:
	crearalumno();
	break;
case 2:
	crearprofesor(); break;
case 3:
	listaralumno(); break;
case 4:
	listarprofesor(); break;
}
		
}while(n!=0);		
	}

	public static void crearalumno() throws IOException {
	
		int id;
		
		System.out.println("nombre");
		nombre=e.try_String();
		System.out.println("apellido");
		apellido=e.try_String();
		dni=s.nif();
		System.out.println("id");
		id=e.try_int();
		System.out.println("calle");
		calle=e.try_String();
		System.out.println("Ciudad");
			ciudad=e.try_String();
		System.out.println("codigo postal");
		cp=e.try_String();
		System.out.println("Pais");
		pais=e.try_String();
		direccion d = new direccion(calle,ciudad,cp,pais);
		estudiante es = new estudiante(nombre,apellido,dni, id, d);

		
		System.out.println("Estudiante creado con exito");
		personas.add(es);
	}
	public static void crearprofesor() throws IOException {

		
		System.out.println("nombre");
		nombre=e.try_String();
		System.out.println("apellido");
		apellido=e.try_String();
		dni=s.nif();
		System.out.println("despacho");
		despacho=e.try_String();
		System.out.println("calle");
		calle=e.try_String();
		System.out.println("Ciudad");
			ciudad=e.try_String();
		System.out.println("codigo postal");
		cp=e.try_String();
		System.out.println("Pais");
		pais=e.try_String();
		direccion d = new direccion(calle,ciudad,cp,pais);
	profesor p= new profesor(nombre, apellido, dni,despacho,d);
	personas.add(p);
	
	}
	public static void listaralumno() {
		for(int i=0; i<personas.size(); i++) {
			 if(personas.get(i) instanceof estudiante) {
				 System.out.println(personas.get(i).To_String());
			 }
		}
	}
	
	public static void listarprofesor() {
		for(int i=0; i<personas.size(); i++) {
			 if(personas.get(i) instanceof profesor) {
				 System.out.println(personas.get(i).To_String());
			 }
		}
	}
	
	


}
