package ejercicio2;

import java.io.IOException;

import excepciones.trycatch;
import excepciones.utilescarmen;

public class text {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Vehiculo c= new Vehiculo("seat");
trycatch e= new trycatch();
utilescarmen e1= new utilescarmen();

System.out.println("potencia");
c.setPotencia(e.try_double());
System.out.println("Tiene tración  ");
c.setcRueda(e1.afirmaODesmiente());

System.out.println(c.To_string());
	
	}

}
