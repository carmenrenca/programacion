package ejercicio5;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int primo [];
primo = new int [20];

int i;
int aux=0;

for( i=0; i<primo.length; i++) {
primo[i]=(int) (Math.random()*100);


	for(int j=1; j<100; j++) {
		if(primo[i]%j==0) {
			aux++;
			
		}
		
		
	}
	if(aux==2) {
		System.out.println("Es primo el "+primo[i]);	
		}

	aux=0;	
	
}


	}

}
