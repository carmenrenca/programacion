package ejercicios.ejercicio13;

import java.io.IOException;


import excepciones.trycatch;

public class text {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	  Alimento a = new Alimento();
	  trycatch excepcion = new trycatch();
	  System.out.println("Contenido en lípidos en %");
	  a.setLipidos(excepcion.try_int());
	  System.out.println("Contenido en hidratos de carbono en %");
	  a.setProteinas(excepcion.try_int());
	  System.out.println("Es de origen animal el producto");
	  a.setOrigen(excepcion.try_boolean());
	  
	  System.out.println("Contenido en vitaminas A alto, M medio y B bajo");

	a.setVitaminas(excepcion.try_String());

	  
System.out.println("Contenido de minerales A alto, M medio y B bajo");

	a.setMinerales(excepcion.try_String());

	  System.out.println(a.esDietetico());
	 
	System.out.println(a.muestraalimento()); 
	}

}
