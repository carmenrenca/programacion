package ejercicio;

import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import excepciones.trycatch;

public class text {
	static trycatch e= new trycatch();
	static Random r = new Random();
	static ArrayList<Alumno> lp = new ArrayList<Alumno>(); 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 
		int n=0;
		int exit;
	int nid;
		for(int i=0;i<11;i++){

		lp.add(new Alumno(i,"alumno"+i,r.nextInt(100)+100));
		
		}
		do {
			
		
		System.out.println("Elige una opcion");
		n=e.try_int();
		switch(n) {
		case 1: listaralumnos();break;
		case 2: crearalumno();break;
		case 3: 
			System.out.println("Dime la id del alumno a consultar");
			
			nid=e.try_int();
			
			if(nid>=lp.size()) {
				 do {
					 System.out.println("error ese alumno no se encuetra en la lista vuelve a introducirlo");
					nid=e.try_int();
				 }while(nid>lp.size());
			}
			System.out.println(consultar(nid));break;
		case 8: System.out.println("adios");break;
		}}while(n!=8);
		
		
			
		
	
		
		
		
	}
static public void listaralumnos() {
	System.out.println(lp.toString());
}

static public void crearalumno() {
int fin;
fin=lp.size();
	System.out.println("vas a añadir un alumno nuevo");
	

	

	lp.add(new Alumno(lp.size(),"alumno"+lp.size()+1,r.nextInt(100)+100));
	
	System.out.println("alumno creado con el id"+fin);
	
	
	
}

static public String consultar(int consulta) throws IOException {

	for(int i=0; i<lp.size(); i++) {
		 if(consulta==i) {
			lp.get(consulta);
			
		 }
	}
	
	 return   lp.get(consulta).toString();
}
}
