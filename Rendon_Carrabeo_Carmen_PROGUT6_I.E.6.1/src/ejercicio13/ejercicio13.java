package ejercicio13;

import com.sun.javafx.geom.Matrix3f;

import excepciones.arrays;

public class ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
arrays a = new arrays();
int matriz[][] ={ {23,44,65,88,90},{11,22,56,86,3 },{9,12,10,33,66},{20,22,45,58,93}};
int[] menor =new int[4];
int[] menorfila =new int[4];
int[] mayor =new int[4];
int[] mayorfila =new int[4];
int h=0;
int aux=0; 

a.imprimirmatrizint(matriz);

for(int i=0; i<matriz.length; ) {
	for(int j=0; j<matriz.length; j++) {
	aux=matriz[i][j];
	menor[j]=aux;
	
		
	}
	
	aux=a.menorarray(menor);
	
	menorfila[h]=aux;
	h++;
	i++;
}
aux=0;
h=0;
for(int i=0; i<matriz.length; i++) {
	for(int j=h; j<matriz.length; j++) {
		if(j==h) {
			aux=matriz[i][j];
			mayor[i]=aux;
	if(i==3) {
		aux=a.mayorarray(mayor);
		mayorfila[h]=aux;
		h++;
		i=0;
	}
	}
}

	}
int k=0;
aux=0;
for(int i=0; i<4; i++) {

	if(menorfila[i]==mayorfila[k]) {
		aux=menorfila[i];
	}
	if(i==3) {
		k++;
		i=0;
	}else if(k==3) {
		i=3;
	}
		
		
}
if(aux==0) {
	System.out.println("no hay punto de silla");
}else {
	System.out.println(aux+" es un punto de silla");
}

}
}