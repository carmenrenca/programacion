package ejercicio6examen;

import java.io.IOException;

import excepciones.trycatch;

public class text {

	public static void main(String[] args) throws IOException {

trycatch e= new trycatch();
Plaza p1= new Plaza();
Coche c= new Coche();

int n=0;
do {
	System.out.println(p1.To_String());
System.out.println("Introduce un numero: ");

n=e.try_int();
switch(n) {

case 1: p1.aparcar();break;
case 2: p1.sacarcoche();break;
case 3: p1.mostrarcoche();break;
case 4: 
	p1.estado();
	System.out.println("Hasta pronto");break;
	
default: System.out.println("Has introducido un numero mal");
}
		
	
			
		}while(n!=4);
		
	}

}
