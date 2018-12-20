package array;

public class paresimpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array [];
array = new int [100];

int pares[] = null;
int impares[] = null;


int par=0;
int impar=0;

for (int i=0; i<array.length; i++) {
array[i]=(int) (Math.random()*1000);
	
	System.out.print(array[i]+" ");
	System.out.print("  ");
	if(array[i]%2==0) {
		par++;
	}else {
		impar++;
	}


}
pares = new int[par];
impares = new int[impar];
int h=0;
int f=0;
for(int i=0; i<array.length;i++) {
	 if(array[i]%2==0) {
		
		
			 pares[h]=array[i];
h++;
	

	}else {

		 impares[f]=array[i];
f++;
}




}



System.out.println("Numero impares: ");
for(int j=0; j<impares.length; j++) {

	 System.out.println(impares[j]+" ");
}

System.out.println("Numeros pares: ");
for(int j=0; j<pares.length; j++) {

	 System.out.println ( pares[j]+" ");
}

	}
}

