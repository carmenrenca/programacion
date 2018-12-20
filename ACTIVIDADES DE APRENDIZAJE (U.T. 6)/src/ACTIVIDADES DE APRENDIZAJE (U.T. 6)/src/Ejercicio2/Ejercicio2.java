package Ejercicio2;

public class Ejercicio2 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int [][] A;
		int [][] B;
		int [][]suma;

A = new int [2] [2];
B= new int[2] [2];
suma= new int [2][2];

for(int i=0; i<A.length; i++) {
for(int j=0; j<A.length;j++) {
	A[i][j]=(int) (Math.random()*100);


	

}
}
for(int i=0; i<B.length;i++) {
	for(int j=0; j<B.length;j++) {
		B[i][j]=(int)(Math.random()*100);
	
	}
	
}

for(int i=0; i<suma.length;i++) {
	for(int j=0; j<suma.length;j++) {
		suma[i][j]=A[i][j]+B[i][j];
		System.out.println(suma[i][j]);
	
	}
	
}
	}

}
