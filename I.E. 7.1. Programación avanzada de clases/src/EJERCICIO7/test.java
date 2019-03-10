package EJERCICIO7;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import EJERCICIO1.cuenta;
import excepciones.trycatch;

public class test {
	static HashMap<Integer, Empleado> list = new HashMap<Integer,Empleado>();
	static trycatch e= new trycatch();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n;
		do {
			
		
System.out.println("1- Ingresar Empleado");
System.out.println("2- Eliminar Empleado");
System.out.println("3- Listar Empleado");
System.out.println("4- Modificar Empleado");
System.out.println("5- Mostrar salarios");
System.out.println("0- salir");
n=e.try_int();
switch(n) {
case 1: ingresar(); break;
case 2: eliminar(); break;
case 3: listar();break;
case 4: modificar(); break;
case 5:  mostrarsalarios(); break;
default: System.out.println("Numero incorrecto");
}
		}while(n!=0);	
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
			Empleado emA= new Asalariado(nombre,apellido,NSS,salariosemanal);
			list.put(NSS, emA);break;
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
			BasesMasComision Ebmc= new BasesMasComision(nombre,apellido, NSS,ventasBrutas,tarifaComision,sueldobase);
			
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
	for (Map.Entry<Integer, Empleado> entry : list.entrySet()) {
	System.out.println(entry.getValue().toString());
	}
}
public static void modificar() throws IOException {
	int nss;
	int n;
	do {
		

	System.out.println("Numero de seguro social del empleado a modificar");

	nss=e.try_int();
	do {
		if(!list.containsKey(nss)) {
			System.out.println("No existe ese numero, vuelva introducirlo");
			nss=e.try_int();
		}
	}while(!list.containsKey(nss));
	
	System.out.println("1 Nuevo Nombre");
	System.out.println("2 Nuevo Apellido");
	System.out.println("3 Nuevo Numero Seguro Social");
	if(list.get(nss) instanceof Asalariado) {
		System.out.println("4 Salario semanal");
	}else if(list.get(nss) instanceof PorHoras) {
		System.out.println("4 Sueldo");
		System.out.println("5 Horas");
	}else if(list.get(nss) instanceof PorComision) {
		System.out.println("4 Ventas Brutas");
		System.out.println(" 5 Tarifa Comision");
	}else if( list.get(nss) instanceof BasesMasComision) {
		System.out.println("4 Ventas Brutas");
		System.out.println(" 5 Tarifa Comision");
		System.out.println("6 Sueldo base");
	}
	System.out.println("0 No quiero mas modificaciones");

	n=e.try_int();
	
	switch(n) {
	case 1: 
		System.out.println("Introduce el nuevo nombre");
		list.get(nss).setNombre(e.try_String());break;
	case 2:
		System.out.println("introduce el nuevo apellido");
		list.get(nss).setApellido(e.try_String());break;
	case 3: System.out.println("Nuevo numero de seguro Social");	
	list.get(nss).setSeguro_Social(e.try_int());break;
	case 4: 
		if(list.get(nss) instanceof Asalariado) {
			System.out.println("Salario semanal");
			((Asalariado)list.get(nss)).setSalarioSemanal(e.try_double());
		}else if(list.get(nss) instanceof PorHoras) {
			System.out.println("Sueldo");
			((PorHoras)list.get(nss)).setSueldo(e.try_double());
		}else if(list.get(nss) instanceof PorComision ) {
			System.out.println("Ventas Brutas");
			((PorComision)list.get(nss)).setVentasBrutas(e.try_double());
		
		}else if(list.get(nss) instanceof BasesMasComision) {
			System.out.println("Ventas Brutas");
			((BasesMasComision)list.get(nss)).setVentasBrutas(e.try_double());
		}
	break;
	case 5:
		 if(list.get(nss) instanceof PorHoras) {
			System.out.println("Horas");
			((PorHoras)list.get(nss)).setHoras(e.try_int());
		}else if(list.get(nss) instanceof PorComision) {
			System.out.println("Tarifa Comision");
			((PorComision)list.get(nss)).setTarifaComision(e.try_double());
		}else if(list.get(nss) instanceof BasesMasComision) {
			System.out.println("Tarifa Comision");
			((BasesMasComision)list.get(nss)).setTarifaComision(e.try_double());
		}
		 break;
	case 6: 
		if(list.get(nss) instanceof BasesMasComision) {
			System.out.println("Sueldo Base");
			((BasesMasComision)list.get(nss)).setSueldobase(e.try_double());
		}
	case 0: System.out.println("Adios");break;
		default: System.out.println("Numero incorrecto");break;
	
}
	}while(n!=0);
}
public static void mostrarsalarios() {
	for (Map.Entry<Integer, Empleado> entry : list.entrySet()) {
		System.out.println(entry.getValue().ingresos());
	}
	
}
}
