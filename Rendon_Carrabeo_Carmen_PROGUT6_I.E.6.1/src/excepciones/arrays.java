package excepciones;

import java.io.IOException;
import java.util.Random;

public class arrays {
	static trycatch e= new trycatch();
	public int[] inviertearray(int array[]) {
		int invierte[];
		
		invierte= new int [array.length];
		for(int i=0; i<array.length; i++) {
			
		invierte[i]= array[ array.length-1-i];
		
				
				
			}
		return invierte;
		}
	
		public void  rellenararray(int array[]) {
			
			Random randon= new Random();
			for(int i=0; i<array.length; i++) {
				array[i]=randon.nextInt(100)+1;	
			}
			
			
		}
		
		public int mayorarray(int array[]){
			int aux = 0;
			for(int i=0; i<array.length; i++) {
				if(array[i]>aux) {
					aux=array[i];
				}else {
					aux=aux;
				}
			}
			return  aux;
		}
		public int menorarray(int array[]){
			int aux = 0;
			int aux1=0;
			aux1=array[1];
			for(int i=0; i<array.length; i++) {
				
				if(array[i]<aux1  ) {
					aux=array[i];
				}else {
					aux=aux;
				}
				aux1=array[i];
			}
			return  aux;
		}
		public int ordenararray_menor_mayor(int array[]){
			int aux = 0;
			for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length; j++) {
				if(array[j]>array[j+1]) {
					aux=array[j];
					array[j]=array[j+1];
					array[j+1]=aux;
				}
			}
			}
			aux=array[0];
			return aux;
		}
		public void paresarray(int array[]) {
			int pares[];
			int k=0;
			int par=0;
			for(int h=0; h<array.length; h++){
				if(array[h]%2==0) {
					par++;
				}
			
			}
			pares= new int [par];
			for(int i=0; i<array.length; i++) {
			
				if(array[i]%2==0) {
					pares[k]=array[i];
					k++;
				
				}
			}
			System.out.println("los numeros pares son: ");
			for(int j=0; j<pares.length; j++) {
				System.out.print(pares[j]+" ");
			
			}
		}
		public void imparesarray(int array[]) {
			int impares[];
			int k=0;
			int impar=0;
			for(int h=0; h<array.length; h++){
				if(array[h]%2==0) {
					impar++;
				}
			
			}
			impares= new int [impar];
			for(int i=0; i<array.length; i++) {
			
				if(array[i]%2==0) {
					impares[k]=array[i];
					k++;
				
				}
			}
			System.out.println("los numeros pares son: ");
			for(int j=0; j<impares.length; j++) {
				System.out.print(impares[j]+" ");
			
			}
		}
		public void burbuja(int array[]) {
			int aux;
			for(int i=0; i<array.length-1; i++){
				for(int j=0; j<array.length-1-i; j++) {
					if(array[j]>array[j+1]) {
					aux=array[j];
					array[j]=array[j+1];
					array[j+1]=aux;
					}
				}
			}
		}
		
		public void insersion(int array[]) {
			int pos;
			int aux;
			for(int i=0; i<array.length; i++) {
				pos=i;
				aux=array[i];
			while(pos>0 && (array[pos-1]>aux)) {
				array[pos]=array[pos-1];
				pos--;
			}
			array[pos]=aux;
			}
		}
	

	///////////////////////////////////////////////

public void rellenarmatriz(int matriz[][] ) {
	Random randon= new Random();
	for(int i=0; i<matriz.length; i++) {
		for(int j=0; j<matriz.length; j++) {
			matriz[i][j]=randon.nextInt(100);
		}
	}
}
		
	public void  imprimirmatrizint(int matriz[][]) {
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				System.out.print(matriz[i][j]+" ");
				
			}
			System.out.println(" ");
		}
	}

	public void  imprimirmatrizString(String array[][]) {
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j]+" ");
				
			}
			System.out.println(" ");
		}
	}

	public String menorfila(int matriz[][]) {
		int menor[] = null;
		int aux;
		for(int i=0; i<i; i++) {
			for(int j=0; j<matriz.length; j++){
				aux=matriz[i][j];
				if(menor[j]<aux) {
					menor[j]=aux;
				}else {
					menor[j]=menor[j];
				}
				
			}
		}
		return "el menor es "+menor;
	}
	public void ordenarunafilamatrizburbuja(int matriz[][]) throws IOException {
		int fila;
		int[] numeros =new int[5];
		System.out.println("Dime la fila que quieres ordenar");
		fila=e.try_int();
		for(int j=0; j<numeros.length; j++) {
			numeros[j]=matriz[fila][j];
		}
		burbuja(numeros);
		for(int i=0; i<numeros.length; i++) {
			matriz[fila][i]=numeros[i];
			
		}
		System.out.println("la fila "+fila+" ya está ordenada correctamente");
		imprimirmatrizint(matriz);
	}
	public void ordenarunafilamatrizinsersion(int matriz[][]) throws IOException {
		int fila;
		int[] numeros =new int[5];
		System.out.println("Dime la fila que quieres ordenar");
		fila=e.try_int();
		for(int j=0; j<numeros.length; j++) {
			numeros[j]=matriz[fila][j];
		}
		insersion(numeros);
		for(int i=0; i<numeros.length; i++) {
			matriz[fila][i]=numeros[i];
			
		}
		System.out.println("la fila "+fila+" ya está ordenada correctamente");
		imprimirmatrizint(matriz);
	}
	
	public void ordenarcolumnaburbuja(int matriz[][]) throws IOException {
		int columna;
		int[] numeros =new int[5];
		System.out.println("Dime la columna que quieres ordenar");
		columna=e.try_int();
		for(int j=0; j<numeros.length; j++) {
			numeros[j]=matriz[j][columna];
		}
		burbuja(numeros);
		for(int i=0; i<numeros.length; i++) {
			matriz[i][columna]=numeros[i];
			
		}
		System.out.println("la columna "+columna+" ya está ordenada correctamente");
		imprimirmatrizint(matriz);
	}
	
	public void ordenarcolumnainsersion(int matriz[][]) throws IOException {
		int columna;
		int[] numeros =new int[5];
		System.out.println("Dime la columna que quieres ordenar");
		columna=e.try_int();
		for(int j=0; j<numeros.length; j++) {
			numeros[j]=matriz[j][columna];
		}
		insersion(numeros);
		for(int i=0; i<numeros.length; i++) {
			matriz[i][columna]=numeros[i];
			
		}
		System.out.println("la columna "+columna+" ya está ordenada correctamente");
		imprimirmatrizint(matriz);
	}
	
	public void ordenadiagonal(int matriz[][]) {
		int c=0;
		int[] numeros =new int[5];
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz.length; j++) {
				if(i==j) {
					numeros[c]=matriz[i][j];
					c++;
				}
			}
		}
		c=0;
		insersion(numeros);
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz.length; j++) {
				if(i==j) {
					matriz[i][j]=numeros[c];
							c++;
				}
			}
		}
		System.out.println("tu diagonal ya esta ordenada");
		 imprimirmatrizint(matriz);
	}
}
