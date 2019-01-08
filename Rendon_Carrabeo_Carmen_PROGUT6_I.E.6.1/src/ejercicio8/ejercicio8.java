package ejercicio8;

import java.io.IOException;
import java.util.StringTokenizer;

import excepciones.trycatch;
import excepciones.utilescarmen;

public class ejercicio8 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String notas="6.3\n6.2\n6.4\n6.2";
		StringTokenizer tokens=new StringTokenizer(notas, "\n");
	        int nDatos=tokens.countTokens();
	        double[] datos=new double[nDatos];
	        int i=0;
	        while(tokens.hasMoreTokens()){
	            String str=tokens.nextToken();
	            datos[i]=Double.valueOf(str).doubleValue();
	            System.out.println(datos[i]);
	            i++;
	        }
	}

}
