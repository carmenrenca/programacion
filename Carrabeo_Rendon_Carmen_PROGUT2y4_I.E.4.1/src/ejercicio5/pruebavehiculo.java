package ejercicio5;

public class pruebavehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Coche c1= new Coche("0000BBB", "gris plata" );
c1.setNumpuerta(3);
Moto m1=new Moto("2222BBB","negro" );

m1.setNumplaza(4);
System.out.println(c1.print()+ c1.getNumpuerta());

System.out.println(" ");
System.out.println(m1.print()+m1.getNumplaza());




	}

}
