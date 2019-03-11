package EJERCICIO6;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import EJERCICIO1.cuenta;
import EJERCICIO2.usuarios;
import EJERCICIO4.datos;
import EJERCICIO7.Empleado;
import excepciones.trycatch;

public class text {
	static int r;
	static HashMap<Integer, obras> list = new HashMap<Integer,obras>();

	static trycatch e= new trycatch();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
obras p1= new pinturas("las meninas", 1,"velazquez",1656, 318,276,"lienzo");
obras p2= new pinturas("La Monalisa", 2,"Leonardo da Vinci",1503, 77,53,"lienzo");
obras p3= new pinturas("Guernica", 1,"Pablo Picasso",1937, 349,777,"lienzo");
obras p4= new pinturas("La Monalisa", 3,"Leonardo da Vinci",1503, 77,53,"lienzo");

obras e1= new esculturas("David",4," Miguel Ángel",1501,"Mármol de Carrara",110);
obras e2 = new esculturas("El pensador",5,"Auguste Rodin",1904,"Bronce, Mármol",320);
obras e3= new esculturas("David",6," Miguel Ángel",1501,"Mármol de Carrara",110);
//añadimos las obras al arraylist obras


addobras(p1);
addobras(p2);
addobras(p3);
addobras(p4);

addobras(e1);
addobras(e2);
addobras(e3);
System.out.println("Numero de inventario de la obra a eliminar");
elimiarobra(e.try_int());
System.out.println("Numero de inventario de la obra a buscar ");
buscarobra(e.try_int());
superficie();
masalta();
	}
	
	public static void addobras(obras e) {
		r=0;
		if(list.containsKey(e.getNumero_invetario())) {
			System.out.println("Ese numero de inventario ya esta en el catalago");
			r++;
		}
		if(e instanceof pinturas) {
			for (Map.Entry<Integer, obras> entry : list.entrySet()) {
				
				if(entry.getValue().getTitulo()==e.getTitulo() && entry.getValue().getAutor()==e.getAutor() && entry.getValue().getAño()==e.getAño() && ((pinturas)entry.getValue()).getAlto()==((pinturas)e).getAlto() && ((pinturas)entry.getValue()).getAncho()==((pinturas)e).getAncho()) {
					System.out.println("es una falsificacion");
					r++;
				}
			}
				if(r==0) {
					list.put(e.getNumero_invetario(), e);
					System.out.println("pintura añadida");
				}
				
			
		}
			if(e instanceof esculturas) {
				r=0;
				for (Map.Entry<Integer, obras> entry : list.entrySet()) {
					if(entry.getValue().getTitulo()==e.getTitulo() && entry.getValue().getAutor()==e.getAutor() && entry.getValue().getAño()==e.getAño() && ((esculturas)entry.getValue()).getAltura()==((esculturas)e).getAltura() && ((esculturas)entry.getValue()).getMaterial()==((esculturas)e).getMaterial()) {
						System.out.println("es una falsificacion");
						r++;
					}
				}
					if(r==0) {
						list.put(e.getNumero_invetario(), e);
						System.out.println("escultura añadida");
						list.put(e.getNumero_invetario(),e);
					}
					
				
		}
		
	}
	public static void elimiarobra(int n) throws IOException {
	
		if(list.containsKey(n)) {
			System.out.println("La obra:----- "+list.get(n).To_String()+"-----");
			System.out.println("Ha sido eliminada");
			list.remove(n);
			
		}else {
			System.out.println("Numero de inventario incorrecto");
		}
	}
	
	public static void buscarobra(int n) {
		if(list.containsKey(n)) {
			System.out.println(" obra:----- "+list.get(n).To_String()+"-----");
			
		}else {
			System.out.println("Numero de inventario incorrecto");
		}
	}
	public static void superficie() {
		double ancho = 0;
		double aux = 0;
		double alto=0;
		double area = 0;
		for (Map.Entry<Integer, obras> entry : list.entrySet()) {
		if(entry.getValue() instanceof pinturas) {
			alto=((pinturas)entry.getValue()).getAlto();
			ancho=((pinturas)entry.getValue()).getAncho();
		area=ancho*alto;
		aux=area+aux;
			
		}
			
		}
	
		System.out.println("la superficie total de las pinturas del museo es de "+aux);
	}
	
	public static void masalta() {
		double altura=0;
		double aux = 0;
		double cod = 0;
		for (Map.Entry<Integer, obras> entry : list.entrySet()) {
			if(entry.getValue() instanceof esculturas) {
				altura=((esculturas)entry.getValue()).getAltura();
				if(altura>aux) {
					cod=altura;
					aux=altura;
				}else if(aux>altura) {
					cod=aux;
				}
		
				
			}

		}
		System.out.println("la escultura con mas altura es el nº "+cod);
	}
	
	


}
