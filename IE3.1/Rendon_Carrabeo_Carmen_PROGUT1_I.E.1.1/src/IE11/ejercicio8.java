package  IE11;

public class ejercicio8 {

	public static void main(String[] args) {
		int numero = 0, sumapar=0, sumainpar=0;
		// TODO Auto-generated method stub
		for(numero=1; 1<=numero && numero<=100;numero++) {
			if(numero%2==0) {
				sumapar=sumapar+numero;
				
			}else if(numero%2!=0) {
				sumainpar=sumainpar+numero;
			}
		}

	System.out.println("La suma de los pares es de " +sumapar);
	System.out.println("La suma de los impares es de "+sumainpar);
	}

}
