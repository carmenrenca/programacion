package ejercicios.ejercicio17;

import java.io.IOException;

import excepciones.trycatch;



public class test {
/**
 * Metodo estático que controla que el tamaño del disco duro sea multiplo de 5
 * @param discoduro
 * @return
 * @throws IOException
 */
	public static  int controlDiscoduro(int discoduro) throws IOException {
		int comprobar=discoduro;
		trycatch excepcion =new trycatch();
		
		while(comprobar%5!=0 || comprobar<5) {
			System.out.println("Debes introducir un multiplo de 5 ");
			comprobar=excepcion.try_int();
		}
		return comprobar;
	} 
	/**
	 * metodo estático para controlar que el tamaño del monitor sea mayor a 14
	 * @param tamaño_monitor
	 * @return
	 * @throws IOException
	 */
	public static int controlTamaño_monitor(int tamaño_monitor) throws IOException {
		
		int comprobar=tamaño_monitor;
		trycatch excepcion =new trycatch();
		while(comprobar<14) {
			System.out.println("El numero debe de ser mayor a 14");
			comprobar=excepcion.try_int();
		}
		return comprobar;
	}
	

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Servidor servidor1 = new Servidor(8, 500, "amd", "i3",30,"hp", "yamaha");
		System.out.println("-----Especificaciones del servidor 1-----");
		System.out.println(servidor1.print());
		System.out.println(" ");
		Servidor servidor2 = new Servidor(16, 1000, "gigabay", "amd4",50,"leonovo", "gaming");
		System.out.println("-----Especificaciones del servidor 2-----");
		System.out.println(servidor2.print());
		Servidor servidor3= new Servidor ();
		trycatch excepcion =new trycatch();
		System.out.println(" ");
		System.out.println("Dime la RAM del servidor");
		servidor3.setRAM(excepcion.try_int());
		System.out.println("Tamaño del disco duro");
		servidor3.setDiscoduro(controlDiscoduro(excepcion.try_int()));
		System.out.println("Modelo de la grafica");
		servidor3.setModelo_grafica(excepcion.try_String());
		System.out.println("Modelo procesador");
		servidor3.setModelo_procesador(excepcion.try_String());
		System.out.println("Tamaño del monitor");//introducimos nuestro metodo static controlTamaño_monitor
		servidor3.setTamaño_monitor(controlTamaño_monitor(excepcion.try_int()));
		System.out.println("Marca del teclado");
		servidor3.setModelo_teclado(excepcion.try_String());
		System.out.println("Modelo del raton");
		servidor3.setModelo_raton(excepcion.try_String());
		
		System.out.println("-----Especificaciones del servidor 3-----");
		System.out.println(servidor3.print());
		
		Portatil portatil1 =new Portatil(16,300,"NVIDIA" , "IBM", "ACER", 60, 700);
		System.out.println("-----Especificaciones del portil 1-----");
		System.out.println(portatil1.print());
		
		Portatil portatil2= new Portatil(32,300,"ASUS" , "pentium7", "Sony", 30, 500);
		System.out.println("-----Especificaciones del portil 2-----");
		System.out.println(portatil2.print());
		Portatil portatil3 = new Portatil();
		System.out.println(" ");
		System.out.println("Dime la RAM del portatil");
		portatil3.setRAM(excepcion.try_int());
		System.out.println("Tamaño del disco duro");
		portatil3.setDiscoduro(controlDiscoduro(excepcion.try_int())); //introducimos nuestro metodo static controlDiscoduro
		System.out.println("Modelo de la grafica");
		portatil3.setModelo_grafica(excepcion.try_String());
		System.out.println("Modelo procesador");
		portatil3.setModelo_procesador(excepcion.try_String());
		System.out.println("Tamaño de la pantalla");
		portatil3.setTamaño_pantalla(excepcion.try_int());
		System.out.println("Marca del portatil");
		portatil3.setMarca(excepcion.try_String());
		System.out.println("Peso del portatil");
		portatil3.setPeso(excepcion.try_int());
		System.out.println();
		System.out.println("-----Especificaciones del portil 3-----");
		System.out.println(portatil3.print());
		
	}

}
