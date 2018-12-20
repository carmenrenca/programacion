package ejercicios.ejercicio14;

import java.io.IOException;

import javax.annotation.processing.SupportedSourceVersion;

import excepciones.trycatch;
public class text {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       Marciano et1= new Marciano ("carmen") ;
       Marciano et2	= new Marciano ("paco") ;
       Marciano et3 = new Marciano ("alba");
       
 et2.muere();
  Marciano et4 = new Marciano("maria");
  et2.muere();

     System.out.println( et4.cuentaMarcianos()); 
	}

}
