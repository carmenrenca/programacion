package excepciones;

public class puntosilla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		arrays a = new arrays();
		/**
		 * creamos una matriz con los numeros, para provocar el punto de silla
		 */
		int matriz[][] ={ {23,44,65,88,90},{11,22,56,86,3 },{9,12,10,33,66},{20,22,45,58,93},{16,22,45,58,93}};
		int[] menor =new int[5];
		int[] menorfila =new int[5];
		int[] mayor =new int[5];
		int[] mayorfila =new int[5];
		int h=0;
		int aux=0; 
		/**
		 * imprimimos la matriz
		 */
		a.imprimirmatrizint(matriz);
		//en este for determinamos los menores de la fila y lo metemos en un array
		for(int i=0; i<matriz.length; ) {
			for(int j=0; j<matriz.length; j++) {
			aux=matriz[i][j];
			menor[j]=aux;
			
				
			}
			
			aux=a.menorarray(menor);
			
			menorfila[h]=aux;
			h++;
			i++;
		}
		aux=0;
		h=0;
		//determinamos el mayor de la columa y lo metemos en un array
		for(int i=0; i<matriz.length; i++) {
			for(int j=h; j<matriz.length; j++) {
				if(j==h) {
					aux=matriz[i][j];
					mayor[i]=aux;
			if(i==3) {
				aux=a.mayorarray(mayor);
				mayorfila[h]=aux;
				h++;
				i=0;
			}
			}
		}

			}
		int k=0;
		aux=0;
		//aqui comparamos y si el menor de la fila es igual al mayor de la columna lo guardamos en aux
		for(int i=0; i<4; i++) {

			if(menorfila[i]==mayorfila[k]) {
				aux=menorfila[i];
			}
			if(i==3) {
				k++;
				i=0;
			}else if(k==3) {
				i=3;
			}
				
				
		}
		//si aux esta vacio pues no habrá punto de silla, si tiene valor ese el punto de silla
		if(aux==0) {
			System.out.println("no hay punto de silla");
		}else {
			System.out.println(aux+" es un punto de silla");
		}

		
		
	}

	/////////////////////////////////////////////////
	
	//Descomentar para probar con matrices aleatorias

			//int[][] matriz = amadeus.creaMatriz(4, 4, 99);

			//Y comentar esta línea

			int[][] matriz = {{2,8,4,8},{0,0,0,0},{0,0,0,0},{2,3,3,3}};

			

			int aux; //Variable auxiliar

			int col; //Variable para guardar la columna

			ArrayList<Integer> respuestas=new ArrayList<Integer>(); //Para uno de los ejercicios comentados

			System.out.println("Esta es nuestra matriz");

			amadeus.imprimeMatriz(matriz);

			System.out.println();



			// System.out.println(amadeus.menorEnFila(matriz, 0));



			//EL MAYOR VALOR DE UNA FILA Y UNA COLUMNA 

			/*for (int i = 0; i < matriz.length; i++) {

				aux = amadeus.mayorEnFila(matriz, i);

				respuestas = amadeus.posicionesMayorEnFila(matriz, i);

				for (int j = 0; j < respuestas.length; j++) {

					if(aux==amadeus.mayorEnColumna(matriz, respuestas[j]))

						System.out.println(aux+", fila "+i+" y columna "+respuestas[j]+", es el mayor común");

				}

			}*/



			//OTRA VERSIÓN BUENA, PERO MENOS EFICIENTE

			/*for (int i = 0; i < matriz.length; i++) {

				for (int j = 0; j < matriz[i].length; j++) {

					if (amadeus.menorEnFila(matriz, i) == amadeus.mayorEnColumna(matriz, j)) {

						System.out.println(matriz[i][j] + "(Posición:[" + i + "," + j + "]" + " es un punto de silla");

					}

				}

			}*/

			

			//Para cada fila, buscamos el menor valor existente y guardamos ese valor en un auxiliar.

			for (int i = 0; i < matriz.length; i++) {

				aux=amadeus.menorEnFila(matriz, i);

				for (int j = 0; j < matriz[i].length; j++) {

					if(aux==matriz[i][j]) { //Ahora, si el valor coincide en la fila, bloqueamos la columna y comprobamos

						if(aux==amadeus.mayorEnColumna(matriz, j))

							System.out.println(matriz[i][j] + "(Posición:[" + i + "," + j + "]" + " es un punto de silla");

					}

				}

			}

	


		}
	
	
}
