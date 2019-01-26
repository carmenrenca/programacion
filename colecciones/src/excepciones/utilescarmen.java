package excepciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class utilescarmen {
	BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));

arrays s= new arrays();	
	boolean aux;
	
	public static int CalculaFactorial(int num) {

		if(num==0)
			return 1;
		else
		return num*CalculaFactorial(num-1);
}
	
	//metodo para invertir el orden de un numero
	
	
public int ivertirnumero(int  num) {
	int numero_invertido , division , resto_division; 
	

	numero_invertido = 0 ; 
	division = num ; 
	resto_division = 0; 
	while (division != 0) { 
	resto_division = division % 10 ; 
	division = division / 10 ; 
	numero_invertido = numero_invertido * 10 + resto_division; 
	} 
	
	System.out.println("El numero " + num + " invertido es " + numero_invertido); 
	return numero_invertido;
}
	
	/**Método que aplica solicita la introducción de un dato tipo Integer

	 * y aplica los try catch necesarios durante el proceso.

	 * @return Número entero controlado positivo (incluyendo el 0)

	 * */

	public int controlaIntPositivo() throws IOException {

		int n = 0;

		do {
			try {
	n= Integer.parseInt(teclado.readLine());

				aux= true;

				if (n < 0)

					System.out.println("Introduzca un valor positivo");

			} catch (NumberFormatException e) {

				// TODO: handle exception

				System.out.println("Valor no válido");

				aux = false;

			}

		} while (aux=false || n < 0);

		return n;

	}
	
	/**

	 * Método que aplica solicita la introducción de un dato tipo Integer

	 * y aplica los try catch necesarios durante el proceso.

	 * @return Número entero controlado entre 0 y 100

	 * */

	public int controlaIntPorcentaje() throws IOException {

		int n = 0;

		do {

			try {

				n = Integer.parseInt(teclado.readLine());

				aux=true;

				if (n < 0)

					System.out.println("Introduzca un valor mayor a 0");

				if (n > 100)

					System.out.println("Introduzca un valor menor a 100");

			} catch (NumberFormatException e) {

				// TODO: handle exception

				System.out.println("Valor no válido");

				aux=false;

			}

		} while (aux=false || n < 0 || n > 100);

		return n;

	}
	/**

	 * Método que aplica solicita la introducción de un dato tipo Double

	 * y aplica los try catch necesarios durante el proceso.

	 * @return Número del tipo double positivo (incluyendo 0)

	 * */

	public double controlaDoubePositivo() throws IOException {

		double n = 0;

		do {
			try {
	n= Double.parseDouble(teclado.readLine());

				aux= true;

				if (n < 0)

					System.out.println("Introduzca un valor positivo");

			} catch (NumberFormatException e) {

				// TODO: handle exception

				System.out.println("Valor no válido");

				aux = false;

			}

		} while (aux=false || n < 0);

		return n;

	}
	/**

	 * Método que aplica solicita la introducción de un dato tipo Double

	 * y aplica los try catch necesarios durante el proceso.

	 * @return Número del tipo double controlado entre 0 y 100

	 * */
	public double controlaDoublePorcentaje() throws IOException {

		double n = 0;

		do {

			try {

				n = Integer.parseInt(teclado.readLine());

				aux=true;

				if (n < 0)

					System.out.println("Introduzca un valor mayor a 0");

				if (n > 100)

					System.out.println("Introduzca un valor menor a 100");

			} catch (NumberFormatException e) {

				// TODO: handle exception

				System.out.println("Valor no válido");

				aux=false;

			}

		} while (aux=false || n < 0 || n > 100);

		return n;
}
	
	/**

	 * Método que aplica solicita la introducción de una cadena de caracteres por teclado.

	 * El método comprueba si se ha escrito 's', 'sí', 'si', 'yes','y', 'no','n'

	 * @return <ul>

	 * <li>true Si se ha escrito 's', 'sí', 'si', 'yes','y'

	 * <li>false Si se ha escrito 'n', 'no'

	 * </ul>

	 * */

	public boolean afirmaODesmiente() throws IOException {

		String respuesta;

		do {

			respuesta = teclado.readLine();

			aux = true;

			if (respuesta.equalsIgnoreCase("si") || respuesta.equalsIgnoreCase("y") || respuesta.equalsIgnoreCase("sí")

					|| respuesta.equalsIgnoreCase("s") || respuesta.equalsIgnoreCase("yes"))

				return true;

			else if (respuesta.equalsIgnoreCase("no") || respuesta.equalsIgnoreCase("n"))

				return false;

			else {

				aux = false;

				System.out.println("Valor no válido, introduzca si o no");

			}

		} while (aux==false);

		return true;

	}
public void escapicua(int cadena) {
	int aux;
	aux=cadena;

	/**
	 * metodo que invierte el numero que introducimos por teclado
	 *
	 */
	cadena=ivertirnumero(cadena);
	if(cadena==aux) {
		System.out.println("es un numero capicua");
	}else {
		System.out.println("no es un numero capicua");
	}

		}

/**

 * Método público que imprime una matriz en caracol

 * @param tamanho Tamaño de la matriz caracol.

 * @param contador Número inicial por el cual empieza la Matriz Caracol

 * */

public void Caracol (int tamanho, int contador) {



		int principio=0; // Variable inicial, para llevar la cuenta de los límites

		int fin=tamanho-1; //Variable inicial sobre el final, para llevar la cuenta de los límites

		int[][] matriz=new int[tamanho][tamanho]; //Matriz cuadrada. 

		

		for (int j = 0; j <=tamanho/2; j++) { //Mientras el contador no sea igual al 

											//cuadrado del tamaño, repite el bucle

			

			

			for (int i = principio; i <= fin; i++) {	//El primer for, va de izda a dcha,

				matriz[principio][i]=contador++;		//en las filas superiores.

			}

			

			

			for (int i = principio+1; i <= fin; i++) { //El segundo for, de arriba a abajo, 

				matriz[i][fin]=contador++;			  //en las columnas a la derecha.

			}

			

			

			for (int i = fin-1; i >=principio; i--) { //El tercer for, de dcha a izda

				matriz[fin][i]=contador++;			 //en la filas inferiores.

			}


			for (int i = fin-1; i >=principio+1; i--) { //El último for, va de abajo a arriba

				matriz[i][principio]=contador++;	   //en las columnas de la izquierda

			}

			principio++; //Aumentamos el principio en uno, para comenzar uno después

			fin--; //Reducimos el final para acabar uno antes

		}
s.imprimirmatrizint(matriz);
		

}
}
	

