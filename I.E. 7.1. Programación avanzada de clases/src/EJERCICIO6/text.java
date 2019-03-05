package EJERCICIO6;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import EJERCICIO1.cuenta;
import EJERCICIO2.usuarios;
import EJERCICIO4.datos;
import excepciones.trycatch;

public class text {
	public static ArrayList<obras> o = new ArrayList<obras>();

	static HashMap<Integer,obras> obras = new HashMap<Integer, obras>();

	static trycatch e= new trycatch();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n;
		do {
			
		
System.out.println("1 añade obra");
n=e.try_int();
switch(n) {
case 1: 
	añadirobra();break;
}
			
	}while(n!=0);
		
	}
	
	
	public static void añadirobra() throws IOException {
		String titulo;
		int numeroinventario;
		String autor;
		int año;
		int n;
		boolean error=false;;
		System.out.println("1 crear una pintura");
		System.out.println("2 crear una esculcura");
		n= e.try_int();
		switch(n) {
		case 1:
			boolean r;
			int ancho;
			int alto;
			String soportes;
			System.out.println(" Titulo");
			titulo=e.try_String();
			System.out.println("numero de inventario");
			numeroinventario=e.try_int();
				
			System.out.println("autor");
			autor=e.try_String();
			System.out.println("año");
			año=e.try_int();
			System.out.println("alto");
			alto=e.try_int();
			System.out.println("ancho");
			ancho=e.try_int();
			System.out.println("soportes");
			soportes=e.try_String();
		
			pinturas p = new pinturas(titulo, numeroinventario,autor,año,ancho,alto,soportes);
			
		
				if(obras.containsKey(numeroinventario)){
					System.out.println("no se puden repetir las key");
					error=true;
				}else if(error==false){
					for(Map.Entry<Integer, obras> pintura: obras.entrySet()) {
						
						
							if(((pinturas) pintura.getValue()).comapararpinturas(p)==true ){
								System.out.println("es una falsificacion");
								error=true;
							}
						
						
					}
					
				}
				if(error==false) {
					System.out.println("creado");
					 obras.put(numeroinventario, p);
				}break;
		case 2: 
			String material;
			double altura;
			titulo=e.try_String();
			System.out.println("numero de inventario");
			numeroinventario=e.try_int();
				
			System.out.println("autor");
			autor=e.try_String();
			System.out.println("año");
			año=e.try_int();
			System.out.println("material");
			material=e.try_String();
			System.out.println("altura");
			altura=e.try_double();
			esculturas es = new esculturas(titulo,numeroinventario,autor,año,material,altura);
			if(obras.containsKey(numeroinventario)){
				System.out.println("no se puden repetir las key");
				error=true;}else if(error==false){
					for(Map.Entry<Integer, obras> escultura: obras.entrySet()) {
						
						if(escultura instanceof esculturas) {
							if(((esculturas)escultura.getValue()).compararescultura(es)==true ){
								System.out.println("es una falsificacion");
								error=true;
							}
						}
					
					
					
				}
				
			}if(error==false) {
				System.out.println("creado");
				 obras.put(numeroinventario, es);
			}
			
		}

	}
	


}
