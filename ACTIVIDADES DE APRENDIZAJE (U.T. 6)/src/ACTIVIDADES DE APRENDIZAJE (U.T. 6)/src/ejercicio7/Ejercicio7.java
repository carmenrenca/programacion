package ejercicio7;

public class Ejercicio7 {

	public static void main(String[] args) {{
		// TODO Auto-generated method stub
		int [][] A;
	
		int [][] B;
		int aux=0;
		int auxB=0;
		
		A= new int [2][2];
		B= new int [2][2];
		int i=0;
		int j=0;

		for(i=0;i<A.length;i++) {
			
			for(j=0;j<A.length;j++) {
			
				A[i][j]=(int)(Math.random()*100);
				System.out.println("Numeros de A"+A[i][j]);
			
			if(A[i][j]>aux) {
				aux=A[i][j];
				
			}else {
				aux=aux;
				
				
			}
		

		System.out.println("Mayor de A"+aux);
		System.out.println("Mayot de b"+auxB);
	}

}
		for(i=0;i<B.length;i++) {
			
			for(j=0;j<B.length;j++) {
			
				B[i][j]=(int)(Math.random()*100);
				System.out.println("Numero de B"+B[i][j]);
			
			if(B[i][j]>aux) {
				auxB=B[i][j];
				
			}else {
				auxB=auxB;
				
				
			}
		
		
			
			
		}
		
	}	
		
	}
}
}