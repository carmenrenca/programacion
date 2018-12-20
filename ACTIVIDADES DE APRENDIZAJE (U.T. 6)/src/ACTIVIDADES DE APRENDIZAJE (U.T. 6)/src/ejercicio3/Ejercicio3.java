package ejercicio3;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][] array;
array = new int[10][10];
int mayori = 0;
int aux;
int mayorj = 0;
for(int i=0;i<array.length;i++) {
	for(int j=0;j<array.length;j++) {
		aux=array[i][j];
		array[i][j]=(int)(Math.random()*100);
	
		System.out.println(array[i][j]);
		if(array[i][j]>aux) {
			mayori=i;
			mayorj=j;
		}
		
	}
	System.out.println(mayori+","+mayorj);
}
	}

}
