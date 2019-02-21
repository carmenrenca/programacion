package EJERCICIO1;

import java.io.IOException;
import java.util.ArrayList;

import excepciones.trycatch;


public class text {
	
	
static int cont;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		trycatch e = new trycatch();
ArrayList corriente= new ArrayList();
cuenta_corrriente cc= new cuenta_corrriente();
int n;
String nombre;
String apellidos;
String NIF;
do {
	

System.out.println("1 crear cuenta correinte ");
System.out.println("2 ver el numero de cuentas corrientes");
n=e.try_int();
switch(n) {

case 1: 

System.out.println("nombre");
nombre=e.try_String();
System.out.println("apellidos");
apellidos=e.try_String();
System.out.println("NIF");
NIF=e.try_String();
corriente.add(cc=new cuenta_corrriente(cont++,0.0,nombre,apellidos,NIF ));
break;
case 2: 
	for(int i=0; i<corriente.size();i++) {
		System.out.println(cc.ToString());
	}
}

}while(n!=0);
		
	}

}
