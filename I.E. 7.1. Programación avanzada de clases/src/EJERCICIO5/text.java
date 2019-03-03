package EJERCICIO5;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.sun.java_cup.internal.runtime.Symbol;

import EJERCICIO1.cuenta;
import excepciones.trycatch;

public class text {
static trycatch e= new trycatch();
static HashMap<String, Empleado> empleado = new HashMap<String, Empleado>();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int n;
		int hijos;
		String nombre;
		String dni;
		double sueldo;
		double interes;
		double comision;
		do {
			
	
System.out.println("1 Comercial");
System.out.println("2 Directivo");
System.out.println("3 Visualizar Datos de un directivo");
System.out.println("4 Visualizar Datos de un comercial");
System.out.println("5 Listar directivos ");
System.out.println("6 Listar Comerciales");
System.out.println("7 Listar todos los empleados");
System.out.println("8 salir");
n=e.try_int();
switch(n) {

case 1: 
	
	System.out.println("introduce el nombre");
	nombre=e.try_String();
	System.out.println("introduce el dni");
	dni=e.try_String();
	System.out.println("introduce el saldo");
	sueldo=e.try_double();
	System.out.println("introduce el interes");
	interes=e.try_double();
	Comercial c= new Comercial(nombre,dni, sueldo,interes);
	System.out.println("retencion aplicada: "+c.retencion());
	System.out.println(" Introduce el numero de hijos: ");
	c.setHijos(e.try_int());
	System.out.println("Gratificacion recibida "+c.gratificacion(c.hijos));
	System.out.println("sueldo total "+c.calcular());
	empleado.put(dni, c);
	break;
case 2: 
	System.out.println("introduce el nombre");
	nombre=e.try_String();
	System.out.println("introduce el dni");
	dni=e.try_String();
	System.out.println("introduce el saldo");
	sueldo=e.try_double();
	System.out.println("introduce la comision en euros");
	comision=e.try_double();
	Directivo d = new Directivo(nombre,dni, sueldo,comision);
	
	System.out.println("retencion aplicada: "+d.retencion());
	System.out.println(" Introduce el numero de hijos: ");
	d.setHijos(e.try_int());
	System.out.println("Gratificacion recibida "+d.gratificacion(d.getHijos()));
	System.out.println("sueldo total "+d.calcular());
	empleado.put(dni, d);
	break;
case 3: 
	System.out.println("introduce su dni para acceder a sus datos");
	dni=e.try_String();
	if(empleado.get(dni) instanceof Directivo) {
		System.out.println(empleado.get(dni).toString());
		
		System.out.println("retencion "+empleado.get(dni).retencion());
		System.out.println("gratificacio por "+empleado.get(dni).getHijos()+" hijo es de "+empleado.get(dni).gratificacion(empleado.get(dni).getHijos()));
		System.out.println("Saldo total "+empleado.get(dni).calcular());
	}else {
		System.out.println("No existe ese directivo");
	}
break;
case 4: 
	System.out.println("introduce su dni para acceder a sus datos");
	dni=e.try_String();
	if(empleado.get(dni) instanceof Comercial) {
		System.out.println(empleado.get(dni).toString());
		System.out.println("retencion "+empleado.get(dni).retencion());
		System.out.println("gratificacio por "+empleado.get(dni).getHijos()+" hijo es de "+empleado.get(dni).gratificacion(empleado.get(dni).getHijos()));
		System.out.println("Saldo total "+empleado.get(dni).calcular());
	
	}else {
		System.out.println("No existe ese directivo");
	}break;
case 5: 
	for(Map.Entry<String, Empleado> entry : empleado.entrySet()) {
		if(entry.getValue() instanceof Directivo) {
			System.out.println(((Directivo)entry.getValue()).toString());
		}
	}break;
case 6: 
	for(Map.Entry<String, Empleado> entry : empleado.entrySet()) {
		if(entry.getValue() instanceof Comercial) {
			System.out.println(((Comercial)entry.getValue()).toString());
		}
	}break;
case 7:
	for(Map.Entry<String, Empleado> entry : empleado.entrySet()) {
		System.out.println(entry.toString());
	}
	break;
case 8: System.out.println("hasta pronto");
break; default: System.out.println("error");
	}

		}while(n!=0);
}
}
