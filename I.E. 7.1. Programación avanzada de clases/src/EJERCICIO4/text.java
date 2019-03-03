package EJERCICIO4;

import java.io.IOException;
import java.util.ArrayList;

import excepciones.trycatch;

public class text {
	static ArrayList<datos> publicaciones = new ArrayList<datos>();
static trycatch e= new trycatch();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	int año;
		Libros l1= new Libros(123,"El principito",1999,true);
		Libros l2= new Libros(345,"harry potter y la orden del fenix", 2006,false);
		Libros l3= new Libros(567,"crepusculo",2010,true);
		Revistas r1= new Revistas(001,"Ciclismo",2018,1);
		Revistas r2= new Revistas(002,"cocina",2019,4);
		
		
		l1.prestar();
		l1.prestar();
		l3.prestar();
		l2.prestar();
		l1.devolver();
		
		publicaciones.add(l1);
		publicaciones.add(l2);
		publicaciones.add(l3);
		publicaciones.add(r1);
		publicaciones.add(r2);
		prestarlibro();
	System.out.println("Dime un año para saber las publicaciones anteriores");
	año=e.try_int();
	publicacionesanterioresA(año);
	}

	public static void prestarlibro() {
		int c=0;
		for(datos Datos: publicaciones) {
			if(Datos instanceof Libros) {
				if(((Libros) Datos).prestado()) {
					c++;
				}
		}
		
	}
		System.out.println("hay "+c+" libros prestados");
	}
	
	public static void publicacionesanterioresA(int año) {
		
		for(int i=0; i<publicaciones.size(); i++) {
		if(publicaciones.get(i).getAño()<año) {
			System.out.println(publicaciones.get(i).getTitulo()+" es del año "+publicaciones.get(i).getAño());
		}
			
		}
		}
}
