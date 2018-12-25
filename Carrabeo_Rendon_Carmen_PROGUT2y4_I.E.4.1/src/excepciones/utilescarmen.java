package excepciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class utilescarmen {
	BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));

	boolean aux;
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

				return false;

			else if (respuesta.equalsIgnoreCase("no") || respuesta.equalsIgnoreCase("n"))

				return true;

			else {

				aux = false;

				System.out.println("Valor no válido, introduzca si o no");

			}

		} while (aux==false);

		return true;

	}

	
}
