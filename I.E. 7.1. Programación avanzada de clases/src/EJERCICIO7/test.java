package EJERCICIO7;

import java.io.IOException;
import java.util.HashMap;

import EJERCICIO1.cuenta;
import excepciones.trycatch;

public class test {
	static HashMap<Integer, Empleado> list = new HashMap<Integer,Empleado>();
	static trycatch e= new trycatch();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n;
System.out.println("1- Ingresar Empleado");
System.out.println("2- Eliminar Empleado");
System.out.println("3- Listar Empleado");
System.out.println("4- Modificar Empleado");
System.out.println("5- Mostrar salarios");
n=e.try_int();
switch(n) {
case 1: ingresar(); break;
case 2: eliminar(); break;
case 3: 
}
	
	}
	
	public static void ingresar() throws IOException {
		int n;
		String nombre;
		String apellido;
		int NSS;
		System.out.println("Elige un tipo de empleado");
		System.out.println("1 Asalariado");
		System.out.println("2 EmpleadoPorHoras");
		System.out.println("3 EmpleadoPorComision");
		System.out.println("4 EmpleadoBaseMasComisión");
		n=e.try_int();
		switch(n) {
		case 1: 
			double salariosemanal;
			System.out.println("primer nombre");
			nombre=e.try_String();
			System.out.println("apellido paterno");
			apellido=e.try_String();
			System.out.println("número de seguro social");
			NSS=e.try_int();
			System.out.println("Salario Semanal");
			salariosemanal=e.try_double();
			Empleado emA= new Asalariado(nombre,apellido,NSS,salariosemanal);break;
		case 2: 
			double sueldo;
			int horas;
			System.out.println("primer nombre");
			nombre=e.try_String();
			System.out.println("apellido paterno");
			apellido=e.try_String();
			System.out.println("número de seguro social");
			NSS=e.try_int();
			System.out.println("Sueldo");
			sueldo=e.try_double();
			System.out.println("Horas");
			horas=e.try_int();
			Empleado emH= new PorHoras(nombre,apellido,NSS,sueldo,horas);
			if(list.containsKey(NSS)) {
				System.out.println("ese numero de seguro social ya existe");
			}else {
				list.put(NSS, emH);
				
			}
			break;
		case 3: 
			 double ventasBrutas;
			 double tarifaComision;
			System.out.println("primer nombre");
			nombre=e.try_String();
			System.out.println("apellido paterno");
			apellido=e.try_String();
			System.out.println("número de seguro social");
			NSS=e.try_int();
			System.out.println("Ventas");
			ventasBrutas=e.try_double();
			System.out.println("Tarifa de Comision");
			tarifaComision=e.try_double();
			Empleado emC= new PorComision(nombre, apellido,NSS,ventasBrutas,tarifaComision);
			if(list.containsKey(NSS)) {
				System.out.println("Ya existe ese número de seguro social");
			}else {
				list.put(NSS, emC);
			}
			
			break;
		case 4:
	
			double sueldobase;
			System.out.println("primer nombre");
			nombre=e.try_String();
			System.out.println("apellido paterno");
			apellido=e.try_String();
			System.out.println("número de seguro social");
			NSS=e.try_int();
			System.out.println("Ventas");
			ventasBrutas=e.try_double();
			System.out.println("Tarifa de Comision");
			tarifaComision=e.try_double();
			System.out.println("sueldo base");
			sueldobase=e.try_double();
			Empleado Ebmc= new BasesMasComision(nombre,apellido, NSS,ventasBrutas,tarifaComision,sueldobase);
			
			if(list.containsKey(NSS)) {
				System.out.println("Ya existe ese número de seguro social");
			}else {
				list.put(NSS, Ebmc);
			}
			break;
		}
	}
public static void eliminar() throws IOException {
	int NSS;
	System.out.println("Numero de Seguro social del empleado a eliminar");
	NSS=e.try_int();
	if(list.containsKey(NSS)) {
		System.out.println("Empleado eliminado");
		list.remove(NSS);
	}else {
		System.out.println("No existe un empleado con ese seguro");
	}

}
public static void listar() {
	for(int i=0; i<list.size(); i++) {
		if(list.)
	}
}
}
