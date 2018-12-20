package Ejercicio1;



public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array [];
array = new int [20];
int aux=0;


for(int i = 0; i<array.length; i++) {
	
	array[i]=(int) (Math.random()*20);

	aux=array[i]-1;
	
	while(aux>1) {
		array[i]*=aux;
		aux--;
	}
	
}
for(int j=0; j<array.length; j++) {
	System.out.print(array[j]+" ");
}


	}

}
