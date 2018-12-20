package IE11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicioo15 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub


			int numero=0, n, num = 0, num1 = -23456534,num2 = -23456534,  aux = 0;
				System.out.println("Cuantos numeros deseas introducir");
				BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
				n=Integer.parseInt(teclado.readLine());

				for (numero=0; numero<n; numero++) { //creamo un cucle for para que nos pida el numero de veces q hemos indicado
					num=Integer.parseInt(teclado.readLine());
				
				if (num>num1) {//creamos una condicion en la que se meta su num es mayor que num1
					aux=num1;//aux va a coger lo q valga num1 en la primera vuelta
					num1=num; //num1 va a valer num
					num2=aux;// num2  va a valer lo que valga aux 
					
				}
				else if (num<num1) { //si num es mas chico que num1
					num=num2; //el numero lo metera en num2
					
				}
				
				}
				System.out.println( "El primer numero mayor es "+num1);
				System.out.println("El segundo mayor es " +num2);
	}

}
