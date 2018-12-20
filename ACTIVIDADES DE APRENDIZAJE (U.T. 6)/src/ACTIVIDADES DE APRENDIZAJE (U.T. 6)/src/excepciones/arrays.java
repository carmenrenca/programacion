package excepciones;

import java.util.Random;

public class arrays {

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
		
		public String mayorarray(int array[]){
			int aux = 0;
			for(int i=0; i<array.length; i++) {
				if(array[i]>aux) {
					aux=array[i];
				}else {
					aux=aux;
				}
			}
			return "El mayor es "+ aux;
		}
		
		public String menorarray(int array[]){
			int aux = 0;
			for(int i=0; i<array.length; i++) {
				if(array[i]<aux) {
					aux=array[i];
				}else {
					aux=aux;
				}
			}
			return "el menor es "+ aux;
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
	

	///////////////////////////////////////////////

	public void  imprimirmatriz(int array[][]) {
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j]+" ");
				
			}
			System.out.println(" ");
		}
	}




	
}
