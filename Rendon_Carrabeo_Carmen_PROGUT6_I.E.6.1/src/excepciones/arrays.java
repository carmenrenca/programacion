 package excepciones;

import java.io.IOException;
import java.util.Random;

public class arrays {
	static trycatch e= new trycatch();
	static Random randon= new Random();

	
	
	public int[] inviertearray(int array[]) {
		int invierte[];
		
		invierte= new int [array.length];
		for(int i=0; i<array.length; i++) {
			
		invierte[i]= array[ array.length-1-i];
		
				
				
			}
		for(int i=0; i<array.length; i++) {
			
			 array[ i]=invierte[i];
			
					
					
				}
		return invierte;
		}
	
		public void  rellenararray(int array[]) {
			
		
			for(int i=0; i<array.length; i++) {
				array[i]=randon.nextInt(100)+1;	
			}
			
			
		}
		public void imprimearray(int array[]) {
			for(int i=0; i<array.length; i++) {
				System.out.print(array[i]+" ");
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
			System.out.println("el mayor es "+aux);
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
			System.out.println("el menor es "+aux);
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
		
		public int contarpares(int array[]) {
			int cont=0;
			for(int i=0; i<array.length; i++) {
				if(array[i]%2==0) {
					cont++;
				}
			}
			System.out.println("en este vector hay "+cont+" numeros pares");
			return cont;
		}
		
		public int[] extrerpares(int array[]) {
			int [] par= new int[contarpares(array)];
			int c=0;
			for(int i=0; i<array.length; i++) {
				if(array[i]%2==0) {
					par[c]=array[i];
					c++;
				}
			}
			for(int i=0; i<par.length; i++) {
				System.out.println(par[i]);	
			}
			
			return par;
		}
		public void imparesarray(int array[]) {
			int impares[];
			int k=0;
			int impar=0;
			for(int h=0; h<array.length; h++){
				if(array[h]%2!=0) {
					impar++;
				}
			
			}
			impares= new int [impar];
			for(int i=0; i<array.length; i++) {
			
				if(array[i]%2!=0) {
					impares[k]=array[i];
					k++;
				
				}
			}
			System.out.println("los numeros impares son: ");
			for(int j=0; j<impares.length; j++) {
				System.out.print(impares[j]+" ");
			
			}
		}
		public int  contarimpares(int array[]) {
			int cont=0;
			for(int i=0; i<array.length; i++) {
				if(array[i]%2!=0) {
					cont++;
				}
			}
			System.out.println("en este vector hay "+cont+" numeros impares");
			return cont;
		}
		
		public int[] extrerimpares(int array[]) {
			int [] impar= new int[contarimpares(array)];
			int c=0;
			for(int i=0; i<array.length; i++) {
				if(array[i]%2!=0) {
					impar[c]=array[i];
					c++;
				}
			}
			for(int i=0; i<impar.length; i++) {
				System.out.println(impar[i]);	
			}
			
			return impar;
		}
		public void burbuja_ascendente(int array[]) {
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
		
		public void burbuja_descendente(int array[]) {
			int aux;
			for(int i=0; i<array.length-1; i++){
				for(int j=0; j<array.length-1-i; j++) {
					if(array[j]<array[j+1]) {
					aux=array[j];
					array[j]=array[j+1];
					array[j+1]=aux;
					}
				}
			}
		}
		
		public void insersiondrectaascendente(int array[]) {
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
		public void insersiondrectadescendente(int array[]) {
			int pos;
			int aux;
			for(int i=0; i<array.length; i++) {
				pos=i;
				aux=array[i];
			while(pos>0 && (array[pos-1]<aux)) {
				array[pos]=array[pos-1];
				pos--;
			}
			array[pos]=aux;
			}
		}
		
	public void sumaarray(int array[],int array2[]) {
		int total=array.length;
		int[] suma =new int[total];
		for(int i=0; i<suma.length; i++) {
			suma[i]=array[i]+array[i];
		}
	for(int i=0;i< suma.length; i++) {
		System.out.println(suma[i]);
	}
	}
	

	///////////////////////////////////////////////

public int[][]rellenarmatriz(int matriz[][] ) {

	int n;
	for(int i=0; i<matriz.length; i++) {
		for(int j=0; j<matriz[i].length; j++) {
			n=randon.nextInt(100);
			matriz[i][j]=n;
		}
	}
	return matriz;

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

public void sumamatriz(int matriz[][], int matriz1[][]) {
	
	int fila=matriz.length; 
	int columna=matriz[0].length; 
	int suma[][] = new int[fila][columna];
	
	for(int i=0; i<suma.length; i++) {
		for(int j=0; j<suma[i].length; j++) {
			suma[i][j]=matriz[i][j]+matriz1[i][j];
		}
	}
	for(int i=0; i<suma.length; i++) {
		for(int j=0; j<suma[i].length; j++) {
			System.out.println(suma[i][j]);
		}
	}
}
public void menordematriz(int matriz[][]) {
	int aux=matriz[0][0];

	for(int i=0; i<matriz.length; i++) {
		for(int j=0; j<matriz[i].length; j++) {
			
			if(aux>matriz[i][j]) {
				aux=matriz[i][j];
			}else {
				aux=aux;
			}
		}
		
		
	}
	System.out.println("el menor en la matriz es "+aux);
}
	public void mayodematriz(int matriz[][]) {
		int aux=matriz[0][0];

		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				
				if(aux<matriz[i][j]) {
					aux=matriz[i][j];
				}else {
					aux=aux;
				}
			}
			
			
		}
		System.out.println("el mayor en la matriz es "+aux);
	}
	public int menordelafila( int matriz[][]) throws IOException {
		int fila;
		System.out.println("dime la fila que quieres coger el menor ");
		
		fila=e.try_int();
		if(fila>=matriz.length) {
			System.out.println("se pasa de la matriz");
			fila=e.try_int();
		}
		int aux;
		aux=matriz[fila][0];
		for(int i=0; i<matriz.length; i++) {
			
			if(aux>matriz[fila][i]) {
				aux=matriz[fila][i];
			}else {
				aux=aux;
			}
		}
		return aux;
		
	}
	
	public int posicionmenorfila(int matriz[][]) throws IOException {
		int fila;
		int pos = 0;

		System.out.println("dime la fila para coger la posicion del menor ");
		
		fila=e.try_int();
		if(fila>=matriz.length) {
			System.out.println("se pasa de la matriz");
			fila=e.try_int();
		}
		int aux;
		aux=matriz[fila][0];
		for(int i=0; i<matriz.length; i++) {
			
			if(aux>matriz[fila][i]) {
				aux=matriz[fila][i];
				pos=i;
			}else {
				aux=aux;
				pos=pos;
			}
	
	}
		return pos;
	}
	public int mayordelafila( int matriz[][]) throws IOException {
		int fila;
		System.out.println("dime la fila que quieres coger el mayor ");
		
		fila=e.try_int();
		if(fila>=matriz.length) {
			System.out.println("se pasa de la matriz");
			fila=e.try_int();
		}
		int aux;
		aux=matriz[fila][0];
		for(int i=0; i>matriz.length; i++) {
			
			if(aux>matriz[fila][i]) {
				aux=matriz[fila][i];
			}else {
				aux=aux;
			}
		}
		return aux;
		
	}
	public int posicionmayorfila(int matriz[][]) throws IOException {
		int fila;
		int pos = 0;

		System.out.println("dime la fila para coger la posicion del mayor ");
		
		fila=e.try_int();
		if(fila>=matriz.length) {
			System.out.println("se pasa de la matriz");
			fila=e.try_int();
		}
		int aux;
		aux=matriz[fila][0];
		for(int i=0; i<matriz.length; i++) {
			
			if(aux<matriz[fila][i]) {
				aux=matriz[fila][i];
				pos=i;
			}else {
				aux=aux;
				pos=pos;
			}
	
	}
		return pos;
	}
	
	public int menordelacolumna( int matriz[][]) throws IOException {
		int columna;
		System.out.println("dime la columna que quieres coger el menor ");
		
		columna=e.try_int();
		if(columna>=matriz.length) {
			System.out.println("se pasa de la matriz");
			columna=e.try_int();
		}
		int aux;
		aux=matriz[0][columna];
		for(int i=0; i<matriz.length; i++) {
			
			if(aux>matriz[i][columna]) {
				aux=matriz[i][columna];
			}else {
				aux=aux;
			}
		}
		return aux;
		
	}
	
	
	public int posicionmenorcolumna(int matriz[][]) throws IOException {
		int columna;
		System.out.println("dime la columna que quieres coger el menor ");
		
		columna=e.try_int();
		if(columna>=matriz.length) {
			System.out.println("se pasa de la matriz");
			columna=e.try_int();
		}
		int aux;
		int pos=0;
		aux=matriz[0][columna];
		for(int i=0; i<matriz.length; i++) {
			
			if(aux>matriz[i][columna]) {
				aux=matriz[i][columna];
				pos=i;
			}else {
				aux=aux;
				pos=pos;			}
		}
		return pos;
		
	}
	public int mayordelacolumna( int matriz[][]) throws IOException {
		int columna;
		System.out.println("dime la columna que quieres coger el mayor ");
		
		columna=e.try_int();
		if(columna>=matriz.length) {
			System.out.println("se pasa de la matriz");
			columna=e.try_int();
		}
		int aux;
		aux=matriz[0][columna];
		for(int i=0; i<matriz.length; i++) {
			
			if(aux<matriz[i][columna]) {
				aux=matriz[i][columna];
			}else {
				aux=aux;
			}
		}
		return aux;
		
	}
	
	
	public int posicionmayorcolumna(int matriz[][]) throws IOException {
		int columna;
		System.out.println("dime la columna que quieres coger la posicion del el mayor ");
		
		columna=e.try_int();
		if(columna>=matriz.length) {
			System.out.println("se pasa de la matriz");
			columna=e.try_int();
		}
		int aux;
		int pos=0;
		aux=matriz[0][columna];
		for(int i=0; i<matriz.length; i++) {
			
			if(aux<matriz[i][columna]) {
				aux=matriz[i][columna];
				pos=i;
			}else {
				aux=aux;
				pos=pos;			}
		}
		return pos;
		
	}
	
	public void posicionmayormatriz(int matriz[][]) {
		int fila = 0;
		int columna = 0;
		int aux=matriz[0][0];
		int i, j = 0;
		for( i=0; i<matriz.length; i++) {
			for( j=0; j<matriz.length; j++) {
				if(aux<matriz[i][j]) {
					aux=matriz[i][j];
					fila=i;
					columna=j;
				}else {
					aux=aux;
					fila=fila;
					columna=columna;
				}
			}
		}
		System.out.println("la posicion del mayor es ("+fila+","+columna+")");
	}
	
	public void posicionmenormatriz(int matriz[][]) {
		int fila = 0;
		int columna = 0;
		int aux=matriz[0][0];
		int i, j = 0;
		for( i=0; i<matriz.length; i++) {
			for( j=0; j<matriz.length; j++) {
				if(aux>matriz[i][j]) {
					aux=matriz[i][j];
					fila=i;
					columna=j;
				}else {
					aux=aux;
					fila=fila;
					columna=columna;
				}
			}
		}
		System.out.println("la posicion del menor es ("+fila+","+columna+")");
	}
	//////////////////////////////metodos de ordenacion\\\\\\\\\\\\\\\\\\\\\\\\\
	public void ordenarfilamatrizburbujaascendete(int matriz[][]) throws IOException {
		int fila;
		int total;
		total=matriz[0].length;
		int[] numeros =new int[total];
		System.out.println("Dime la fila que quieres ordenar");
		fila=e.try_int();
		for(int j=0; j<numeros.length; j++) {
			numeros[j]=matriz[fila][j];
		}
		burbuja_ascendente(numeros);
		for(int i=0; i<numeros.length; i++) {
			matriz[fila][i]=numeros[i];
			
		}
		System.out.println("la fila "+fila+" ya está ordenada correctamente");
		imprimirmatrizint(matriz);
	}
	
	public void ordenarfilamatrizburbujadescente(int matriz[][]) throws IOException {
		int fila;
		int total;
		total=matriz[0].length;
		int[] numeros =new int[total];
		System.out.println("Dime la fila que quieres ordenar");
		fila=e.try_int();
		for(int j=0; j<numeros.length; j++) {
			numeros[j]=matriz[fila][j];
		}
		burbuja_descendente(numeros);
		for(int i=0; i<numeros.length; i++) {
			matriz[fila][i]=numeros[i];
			
		}
		System.out.println("la fila "+fila+" ya está ordenada correctamente");
		imprimirmatrizint(matriz);
	}
	public void ordenarfilamatrizinsersionascendente(int matriz[][]) throws IOException {
		int fila;
		int total;
		total=matriz[0].length;
		int[] numeros =new int[total];
		System.out.println("Dime la fila que quieres ordenar");
		fila=e.try_int();
		for(int j=0; j<numeros.length; j++) {
			numeros[j]=matriz[fila][j];
		}
		 insersiondrectaascendente(numeros);
		for(int i=0; i<numeros.length; i++) {
			matriz[fila][i]=numeros[i];
			
		}
		System.out.println("la fila "+fila+" ya está ordenada correctamente");
		imprimirmatrizint(matriz);
	}
	
	
	public void ordenarfilamatrizinsersiondescendente(int matriz[][]) throws IOException {
		int fila;
		int total;
		total=matriz[0].length;
		int[] numeros =new int[total];
		System.out.println("Dime la fila que quieres ordenar");
		fila=e.try_int();
		for(int j=0; j<numeros.length; j++) {
			numeros[j]=matriz[fila][j];
		}
		 insersiondrectadescendente(numeros);
		for(int i=0; i<numeros.length; i++) {
			matriz[fila][i]=numeros[i];
			
		}
		System.out.println("la fila "+fila+" ya está ordenada correctamente");
		imprimirmatrizint(matriz);
	}
	//ascendente menor a mayor
	public void ordenarcolumnaburbujaascendente(int matriz[][]) throws IOException {
		int columna;
		int total;
		total=matriz.length;
		int[] numeros =new int[total];
		System.out.println("Dime la columna que quieres ordenar");
		columna=e.try_int();
		for(int j=0; j<numeros.length; j++) {
			numeros[j]=matriz[j][columna];
		}
		burbuja_ascendente(numeros);
		for(int i=0; i<numeros.length; i++) {
			matriz[i][columna]=numeros[i];
			
		}
		System.out.println("la columna "+columna+" ya está ordenada correctamente");
		imprimirmatrizint(matriz);
	}
	
	public void ordenarcolumnaburbujadescendete(int matriz[][]) throws IOException {
		int columna;
		int total;
		total=matriz.length;
		int[] numeros =new int[total];
		System.out.println("Dime la columna que quieres ordenar");
		columna=e.try_int();
		for(int j=0; j<numeros.length; j++) {
			numeros[j]=matriz[j][columna];
		}
		burbuja_descendente(numeros);
		for(int i=0; i<numeros.length; i++) {
			matriz[i][columna]=numeros[i];
			
		}
		System.out.println("la columna "+columna+" ya está ordenada correctamente");
		imprimirmatrizint(matriz);
	}
	
	public void ordenarcolumnainsersionascendente(int matriz[][]) throws IOException {
		int columna;
		int total;
		total=matriz.length;
		int[] numeros =new int[total];
		System.out.println("Dime la columna que quieres ordenar");
		columna=e.try_int();
		for(int j=0; j<numeros.length; j++) {
			numeros[j]=matriz[j][columna];
		}
		 insersiondrectaascendente(numeros);
		for(int i=0; i<numeros.length; i++) {
			matriz[i][columna]=numeros[i];
			
		}
		System.out.println("la columna "+columna+" ya está ordenada correctamente");
		imprimirmatrizint(matriz);
	}
	
	
	
	public void ordenarcolumnainsersiondescente(int matriz[][]) throws IOException {
		int columna;
		int total;
		total=matriz.length;
		int[] numeros =new int[total];
		System.out.println("Dime la columna que quieres ordenar");
		columna=e.try_int();
		for(int j=0; j<numeros.length; j++) {
			numeros[j]=matriz[j][columna];
		}
		 insersiondrectadescendente(numeros);
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
		 insersiondrectaascendente(numeros);
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
