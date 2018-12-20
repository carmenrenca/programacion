package ejerciciosIE31;

public class ejercicio12 {

	public static void main(String[] args) {
		System.out.println("Estos son los numeros primos hasta el 80");
		
		int  i,l,k=0,  numero, contador=0;
		int array[];
		array= new int [22]; //creamos el array con los 22 numeros que hay desde el 1 al 80
		
	
		
		for ( numero = 1; numero<80;) { //creamos el bucle para dividir cada uno de los numeros entre los divisores
			contador=0;
			for(i=1; i<100; i++) { //for para los divisores que llegan hasta 100
			
				if (numero%i==0) { //comprobamos q la division sea 0 si es asi a contador se le va sumando
					contador++;
				}
				
			}
			
			if (contador==2) { //si contador solo vale 2 es porque es primo
			
			array[k]=numero; //creamos un array q vaya metiendo todos lo numeros, al princio k vale 0 y se va a ir llenando
			k++;
			}
			numero++; //cada vex que terminamos de dividir el numero lo incrementamos en uno
				}
		
		for ( l = 0; l < array.length; l++) { //aqui imprimimos los numeros con un for que recorra todo el array
			System.out.println(array[l]);
		}
			
	
	
	

	}
	
	}
		
	


