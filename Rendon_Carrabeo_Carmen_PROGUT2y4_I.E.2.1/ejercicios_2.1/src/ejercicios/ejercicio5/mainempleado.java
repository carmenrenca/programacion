package ejercicios.ejercicio5;

import java.io.IOException;

import excepciones.trycatch;


public class mainempleado {
	static int res;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		trycatch excepcion =new trycatch();
		Empleado e1= new Empleado();
		Empleado e2 = new Empleado();
		
		System.out.println("Dame el numero del NIF");
		e1.setNIF(excepcion.try_int());	
		System.out.println("Dame el sueldo base");
		e1.setSueldobase(excepcion.try_double());
		System.out.println("Dime el pago por horas extras");
		e1.setPagohoraextra(excepcion.try_double());
		System.out.println("Numero de horas extras realizadas");
		e1.setHorasextra(excepcion.try_double());
		System.out.println("Dime el IRPF en %");
		
		do {
			e1.setIRPF(excepcion.try_double());
			if(e1.IRPF<0 || e1.IRPF>100) {
			System.out.println("Dame un numero mayor que 0 o menor que 100");	
			e1.setIRPF(excepcion.try_double());
			}
			
		}while(e1.IRPF<0 || e1.IRPF>100);
		
		System.out.println("¿Esta casado? true/false");
		e1.setCasado(excepcion.try_boolean());
		System.out.println("Numero de hijos");
		e1.setHijos(excepcion.try_int());
		
		
		System.out.println(e1.println());
		System.out.println(" ");
		System.out.println(e1.printall());
		System.out.println(" ");
		System.out.println(e2.println());
		System.out.println(" ");
		e2.realizarcopia(e1); //pasasmos el metodo realiza copia para pasarle los datos de e1 a e2 
		System.out.println(e2.println()); //finalmente imprimimos nuestras copia, que seria el objeto e2 ya que a cogido los datos d e1
		
		
	}

}
