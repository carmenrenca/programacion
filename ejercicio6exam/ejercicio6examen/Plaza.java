package ejercicio6examen;

import java.io.IOException;

import excepciones.trycatch;

public class Plaza {
private int numeroplaza;
private Coche coche=null;
private boolean veriplaza=false;
static int numerocoche;
trycatch e = new trycatch();




public Plaza() {
	super();
	this.numeroplaza = 5;
	this.coche = null;
	this.veriplaza = false;
	numerocoche++;
}
public int getNumeroplaza() {
	return numeroplaza;
}
public void setNumeroplaza(int numeroplaza) {
	this.numeroplaza = numeroplaza;
}
public Coche getCoche() {
	return coche;
}
public void setCoche(Coche coche) {
	this.coche = coche;
}
public boolean isVeriplaza() {
	return veriplaza;
}
public void setVeriplaza(boolean veriplaza) {
	this.veriplaza = veriplaza;
}
public static int getNumerocoche() {
	return numerocoche;
}
public static void setNumerocoche(int numerocoche) {
	Plaza.numerocoche = numerocoche;
}

public String To_String () {

	return  "Menu"
			+ "\n"
			+ "1 Aparcar coche"
			+ "\n"
			+ "2 sacar coche"
			+ "\n"
			+ "3 ver coche"
			+ "\n"
			+ "4 salir aplicacion";
	
			
}
public String printplaza() {
	return "Numero de plaza "+this.numeroplaza
	+"\n"
	+"Plaza ocupada: "+this.veriplaza
	+"\n"
	+"numero de coche: "+numerocoche;
}

public void aparcar() throws IOException {
	if(coche==null) {
		String matricula;
		String marca;
		String modelo;
		System.out.println("Matricula: ");
		matricula=e.try_String();
		System.out.println("marca: ");
		marca=e.try_String();
		System.out.println("modelo:");
		modelo=e.try_String();
		
		Coche c1= new Coche(matricula, marca, modelo);
		this.coche=c1;
		this.veriplaza=true;
		System.out.println(" EL COCHE SE HA APARCADO.");
	}else if(coche!=null && this.veriplaza==true) {
		System.out.println("PLAZA YA OCUPADA POR OTRO COCHE");
		
	}
}

public void sacarcoche() {
	if( this.veriplaza==true) {
		this.veriplaza=false;
		coche=null;
		System.out.println("PLAZA LIBRE EL COCHE HA SALIDO DE LA PLAZA ");
		
	}else if(this.veriplaza==false) {
		System.out.println("ERROR, NO HAY COCHE EN LA PLAZA DE\r\n" + 
				"APARCAMIENTO LA PLAZA ESTÁ LIBRE\r\n" + 
				"");
	}
	
}

public void mostrarcoche() {
	if(coche!=null) {
		System.out.println(coche.mostrar()); 
}else {
	System.out.println(printplaza()); 
}}
public void estado() {
	System.out.println("El total de coches aparcado es de "+numerocoche); 
	System.out.println(this.printplaza());
		
			
	if(coche!=null) {
			System.out.println("el conche con matricula: "+coche.getMatricula()+ " esta estacionado en estos momentos");
		
				
	}else {
		System.out.println("no hay coches aparcado en estos momentos");
	}
}


}
