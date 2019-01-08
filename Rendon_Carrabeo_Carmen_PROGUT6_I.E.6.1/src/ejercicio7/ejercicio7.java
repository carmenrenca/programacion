package ejercicio7;

import java.util.StringTokenizer;

public class ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

StringTokenizer st=new StringTokenizer("Juan Carlos ha sacado un 8.5,Andrés ha sacado un 4.9,Pedro ha sacado 3.8,Juan ha sacado un 6", ",");

while (st.hasMoreTokens())
    System.out.println(st.nextToken());
}
}