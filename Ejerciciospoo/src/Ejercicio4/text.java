package Ejercicio4;

import java.io.IOException;

import excepciones.trycatch;

public class text {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n;
trycatch e = new trycatch();
Cafetera c= new Cafetera(1000, 500);
System.out.println("capacidad total de la cafetera");
c.setCapacidadmaxima(e.try_int());
System.out.println("Cantidad actual");
c.setCantidad_actual(e.try_int());
do {
	

System.out.println("1-llenar cafetera");
System.out.println("2-Servir taza");
System.out.println("3- vaciar taza");
System.out.println("4- agregar cafe");
System.out.println("5- cantidad actual");
System.out.println("6- salir");

n=e.try_int();
switch(n) {
case 1: c.llenarcafetera();
System.out.println("la cafetera esta comlpletamente llena");break;
case 2:System.out.println("cuanto cafe deseas servirte");
	c.servirtaza(e.try_int());break;
case 3: c.vaciarcafetera();break;
case 4: c.agregarcafe(e.try_int());break;
case 5:System.out.println(c.To_String());break;
case 6: System.out.println("Hasta pronto");
}
	}while(n>=1||n<=6);

}
}
