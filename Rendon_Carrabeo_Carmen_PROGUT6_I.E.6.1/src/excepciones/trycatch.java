package excepciones;
/**
 * Esta clase ha sido creada para llevar a cabo el control de excepciones con try catch
 * @author Carmen
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class trycatch {
	/**
	 * importamos budderedReader
	 */
BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
	
	
	boolean aux;
	
/**
 * metedo get para controrlar los datos de tipo int
 * @return
 * @throws IOException
 */
	public int try_int() throws IOException  {
		int n = 0;
		do {
			try {
				n=Integer.parseInt(teclado.readLine());
				aux=true;
				
			}catch(NumberFormatException e) {
				aux=false;
				System.out.println("Valor incorrecto");
		}
		
	}while(aux=false);
		return n;

}
	
	/**
	 * metedo get para controrlar los datos de tipo float
	 * @throws IOException
	 */
	public float try_float() throws IOException  {
		float n = 0;
		do {
			try {
				n=Integer.parseInt(teclado.readLine());
				aux=true;
				
			}catch(NumberFormatException e) {
				aux=false;
				System.out.println("Valor incorrecto");
		}
		
	}while(aux=false);
		return n;

}
	/**
	 * metedo get para controrlar los datos de tipo double
	 * @return
	 * @throws IOException
	 */
	public double try_double() throws IOException  {
		double n = 0;
		do {
			try {
				n=Double.parseDouble(teclado.readLine());
				aux=true;
				
			}catch(NumberFormatException e) {
				aux=false;
				System.out.println("Valor incorrecto");
		}
		
	}while(!aux);
		return n;

}
	/**
	 * metedo get para controrlar los datos de tipo boolean
	 * @return
	 * @throws IOException
	 */
	public boolean try_boolean() throws IOException  {
		boolean n = false;
		do {
			try {
				n=Boolean.parseBoolean(teclado.readLine());
				aux=true;
				
			}catch(NumberFormatException e) {
				aux=false;
				System.out.println("Valor incorrecto");
		}
		
	}while(!aux);
		return n;

}
	/**
	 * metedo get para controrlar los datos de tipo String
	 * @return
	 * @throws IOException
	 */
public String try_String() throws IOException  {
	String n = null;
	do {
		try {
			n=(teclado.readLine());
			aux=true;
			
		}catch(NumberFormatException e) {
			aux=false;
			System.out.println("Valor incorrecto");
	}
	
}while(!aux);
	return n;

}



public long try_Long() throws IOException  { //control para los LONg
	long n =0 ;
	do {
		try {
			n=Long.parseLong(teclado.readLine());
			aux=true;
			
		}catch(NumberFormatException e) {
			aux=false;
			System.out.println("Valor incorrecto");
	}
	
}while(!aux);
	return n;

}


}



