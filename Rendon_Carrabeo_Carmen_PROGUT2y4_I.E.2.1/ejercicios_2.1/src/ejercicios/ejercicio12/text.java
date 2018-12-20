package ejercicios.ejercicio12;

import java.io.IOException;
import excepciones.trycatch;

public class text {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
trycatch excepcion = new trycatch();
sueldobruto empleado1 = new sueldobruto();
sueldobruto empleado2 = new sueldobruto();
sueldobruto empleado3 = new sueldobruto();
//empleado1
System.out.println("Nombre del empleado 1 ");
empleado1.setNombre(excepcion.try_String());
System.out.println("Numero de horas que realiza "+empleado1.nombre);
empleado1.setHoras(excepcion.try_int());
System.out.println("remuneracion por hora");
empleado1.setDineroxhora(excepcion.try_double());
System.out.println(empleado1.getprintall());
System.out.println(" ");
//empleado2
System.out.println("Nombre del empleado 2 ");
empleado2.setNombre(excepcion.try_String());
System.out.println("Numero de horas que realiza "+empleado2.nombre);
empleado2.setHoras(excepcion.try_int());
System.out.println("remuneracion por hora");
empleado2.setDineroxhora(excepcion.try_double());
System.out.println(empleado2.getprintall());


System.out.println(" ");
//empleado3
System.out.println("Nombre del empleado 3 ");
empleado3.setNombre(excepcion.try_String());
System.out.println("Numero de horas que realiza "+empleado3.nombre);
empleado3.setHoras(excepcion.try_int());
System.out.println("remuneracion por hora");
empleado3.setDineroxhora(excepcion.try_double());
System.out.println(empleado3.getprintall());
	}

}
