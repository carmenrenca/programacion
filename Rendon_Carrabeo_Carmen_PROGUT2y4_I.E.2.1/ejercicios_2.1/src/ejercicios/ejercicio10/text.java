package ejercicios.ejercicio10;

import java.io.IOException;


import excepciones.trycatch;

public class text {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		patatachoco a= new patatachoco();
		trycatch excepcion =new trycatch();
		int n=0; 
		int res=0;
		do {
			
		
			System.out.println("Elige una opcion");
			
			System.out.println("1- Añadir kilos de chocos");
			System.out.println("2- Añadir kilos de patatas");
			System.out.println("3- Visualizar los kilos de chocos actuales");
			System.out.println("4- Visualizar los kilos de patatas actuales");
			System.out.println("5- Cuantas personas puedo atender ");
			n=excepcion.try_int();
			switch(n) {
		
			case 1:
				System.out.println("Cuantos kilos de chocos quieres añadir");
				a.addchoco(excepcion.try_int()); break;
			case 2: 
				System.out.println("cuantos kilos de patatas quieres añadir");
				a.addpatata(excepcion.try_int());break;
			case 3: System.out.println("Visualiza los kilos de chocos que estan ahora mismo en el almacen");
				System.out.println(a.showchocos()); break;
			case 4: System.out.println("Visualiza los kilos depatatas que estan ahora mismo en el almacen");
			System.out.println(a.showpatatas()); break;
			
			case 5:
				
				do{								//restinciones para que no me ponga una cantidad por debajo de la minima
				System.out.println("Dime el numero de kilos de chocos");
				a.setKilochoco(excepcion.try_int());
				if(a.kilochoco<0.5) {
					System.out.println("me tienes que dar una cantidad mayor");
				}
			}while (a.kilochoco<0.5);

		do {  //restinciones para que no me ponga una cantidad por debajo de la minima
			System.out.println("Dime numero de kilos de patatas");
			a.setkilopatata(excepcion.try_int());
			if(a.kilopatata<1) {
				System.out.println("me tienes que dar un numero mayor");
			}
		}while(a.kilopatata<1);

		System.out.println("el numero de comensales de " +a.getcomensales());
			}
			
			
			System.out.println("Si deseas continuar pulsa 1, para finalizar pulsa 0");
			res=excepcion.try_int();
		}while(res==1);
		
		
		
		
	
	}

}
