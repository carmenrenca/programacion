package ejercicios.ejercicio2;


import java.io.InputStreamReader;

public class meinejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo v1;
		Vehiculo v2;
		v1 = new Vehiculo("seat");
		v2= new Vehiculo("toyota");
		
		
		
		v1.setPotencia(150.12);
	
		v1.setcRuedas(true);
		
	
		v2.setPotencia(555.34);
	
		
		System.out.println("Modelo:"+ v1.mostrarmodelo());
		System.out.println("Potencia: "+ v1.getPotencia());
		System.out.println("tiene traccion: "+ v1.traccionruedas());
		System.out.println("Modelo:"+ v2.mostrarmodelo());
		System.out.println("Potencia: "+ v2.getPotencia());
		System.out.println("tiene traccion: "+ v2.traccionruedas());
		
	}

}
