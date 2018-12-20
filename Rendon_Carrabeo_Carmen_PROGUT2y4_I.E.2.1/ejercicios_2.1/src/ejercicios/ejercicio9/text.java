package ejercicios.ejercicio9;

import java.io.IOException;

import excepciones.trycatch;

public class text {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			Persona p1 = new Persona(); //objeto persona
			Docente d1= new Docente(); //objeto decente
			Estudiante e1 =new Estudiante(); //objeto estudiante
			trycatch excepcion = new trycatch();
		
				System.out.println("Introduce el nombre");
				d1.setNombre(excepcion.try_String());
				System.out.println("Introduce el apellido");
				d1.setApellidos(excepcion.try_String());
				System.out.println("Introduce el genero ");
				d1.setGenero(excepcion.try_String());
				System.out.println("Introduce el DNI sin letra");
				d1.setDNI(excepcion.try_int());
				System.out.println("Introduce el codigo del docente");
				d1.setCodigo(excepcion.try_int());
				System.out.println("Introduce la categoría");
				d1.setCategoría(excepcion.try_String());
				System.out.println("Introduce el estudio de postgrado");
				d1.setEstudiosPostgrado(excepcion.try_String());
				System.out.println("introduce las horas de clase");
				d1.setHoraclase(excepcion.try_int());
				System.out.println("Pago por hora");
				d1.setPagoporhora(excepcion.try_double());
				System.out.println(d1.printall());
				System.out.println("El pago parcial es de "+ d1.getpagoparcial());
				System.out.println(" ");
				
				
				System.out.println("Introduce el nombre del estudiante");
				e1.setNombre(excepcion.try_String());
				System.out.println("Introduce el apellido");
				e1.setApellidos(excepcion.try_String());
				System.out.println("Introduce el genero ");
				e1.setGenero(excepcion.try_String());
				System.out.println("Introduce el DNI sin letra");
				e1.setDNI(excepcion.try_int());
				System.out.println("Introduce el codigo de estudiante");
				e1.setCodigo(excepcion.try_int());
				System.out.println("Introduce la categoria");
				e1.setCateoría(excepcion.try_String());
				System.out.println("Pago de pension");
				e1.setPagopension(excepcion.try_double());
				System.out.println("Introuduce el colegio de procedencia");
				e1.setColegiodeprocedencia(excepcion.try_String());
				System.out.println("el promedio");
				e1.setPromedio(excepcion.try_int());
				System.out.println(" ");
				System.out.println("Tu descuento seria de: ");
				System.out.println(e1.descuento());
				System.out.println(" ");
				System.out.println(e1.printall());
	
		}
	}


