package ejercicio4;

public class text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creamos los objetos de Direccion
Direccion d1= new Direccion("Málaga", 4, "A1", "Sevilla");
Direccion d2= new Direccion("Tajo", 3, "B8", "Huelva");
Direccion d3 = new Direccion("Valencia", 20, "A6", "Barcelona");
//creamos los objetos de empleado
Empleado e1= new Empleado("Carmen", 600, d1);
Empleado e2= new Empleado("María", 1000, d2);
Empleado e3= new Empleado("Manuel", 3000, d3);

System.out.println("Empleado 1");
System.out.println(e1.print());
System.out.println("");
System.out.println("Empleado 2");
System.out.println(e2.print());
System.out.println("");
System.out.println("Empleado3");
System.out.println(e3.print());	
	}

}
