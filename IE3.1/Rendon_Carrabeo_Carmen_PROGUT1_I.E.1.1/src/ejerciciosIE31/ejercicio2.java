package ejerciciosIE31;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int longitud=7, espacios=longitud/2, estrellas=1, i,j;
		
		for(i=0;i<=longitud;i++) { //creamos un for para toda la longitud del rombo
			
		for(j=0; j<=espacios;j++) {//creamos otro bucle para contar los espacios del rombo, le vamos quitando o sumando cada vez que llega al if
		System.out.print(" "); //no olvides de quitar el ln del print para que no haga salto de linea 
		}
		for(j=0; j<estrellas; j++ ) {//creamos un bucle para las estrellas
		System.out.print("*");	//no olvides de quitar el ln del print para que no haga salto de linea
		
		
		}
		System.out.println(""); //esto es para que haga un salto  de linea
		if(i<longitud/2) { //cuando lleguemos a la mitad del rombo dejara de quitar esacios y sumar estrellas
			espacios--;
			estrellas+=2;
		}
		else if (i>longitud/2) {//y pasara aqui se sumara espacios y se quitaran dos estrellas
			espacios++;
			estrellas-=2;
		}
		}
		}
		
	}


