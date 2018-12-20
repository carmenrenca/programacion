package ejercicios.ejercicio4;


import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.plaf.synth.SynthScrollBarUI;

import excepciones.trycatch;


public class mainejercicio4 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n;
		int res = 0;
		trycatch excepcion = new trycatch();
	
		Cafetera c= new Cafetera(100,200);
		System.out.println("Dame la cantidad maxima de la cafetera");
		c.setCapacidadmaxima(excepcion.try_double());
		System.out.println("Dame la cantidad actual de cafe que hay en la cafetera");
		c.setCantidadactual(excepcion.try_double());
		if(c.capacidadmaxima<c.cantidadactual) {
			System.out.println("esa valor es incorrecto ya que supera la capacidad maxima de la cafetera, vuelva a introdicor la cantidad");
			c.setCantidadactual(excepcion.try_double());
		}
		
		do {
			System.out.println("Elige la opcion que deeses realizar:");
			System.out.println("1 Llenar la cafetera");
			System.out.println("2 Servir taza");
			System.out.println("3 Vaciar cafetera");
			System.out.println("4 Agregar cafe");
			System.out.println("5 ver la cantidad de cafe que tengo en este momento");
			System.out.println("6 para salir del programa");
			n=excepcion.try_int();
			switch(n) {
			case 1:
			System.out.println("vamos a llenar la cafera");
			System.out.println("la cantidad que tenias era "+c.cantidadactual+"cc");
			System.out.println("ahora la cantidad de la cafetera es de "+c.getllenarcafetera()); break;
			
			case 2:
				do {
					System.out.println("dime la cantidad que deseas servirte porfavor");
					c.setCapacidadtaza(excepcion.try_int());
					c.servirTaza(c.capacidadtaza); 
					System.out.println("Pulsa 1 si deseas servir otra taza, y si quires salir al menu pulsa cualquier numero");
					res=excepcion.try_int();
				}while(res==1);
		
				
				break;
			case 3: 
				System.out.println("la cafetera en este momento esta en "+c.vaciarCafetera()); break;
				
			case 4: 
				do {
					if(c.cantidadactual==c.capacidadmaxima) {
						System.out.println("No se puede añadir mas cafe ya que esta al máximo");
					}
					if(c.cantidadactual<c.capacidadmaxima) {
						System.out.println("Dime cuanto cafe quieres agregarle a la cafetera");
						c.agregarCafe(excepcion.try_int());
					}
					
					
					System.out.println("la cafetera tiene actualmente una cantidad de " + c.cantidadactual+ " cc");
					if(c.cantidadactual<=c.capacidadmaxima)
					System.out.println("Deseas introducir mas cafe, pulsa el 1 si es que si");
					res=excepcion.try_int();
					}while(res==1); break;
			case 5:
				System.out.println("La cantidad de café que hay en la cafetera es de: "+c.cantidadactual);break;
				
			case 6: 
				System.out.println("Hasta pronto!!");
			
			}
				
					
					
					
			}while(n<1 || n>5 && n!=6);
		
		
			
	}
		
		
		
		
	}


