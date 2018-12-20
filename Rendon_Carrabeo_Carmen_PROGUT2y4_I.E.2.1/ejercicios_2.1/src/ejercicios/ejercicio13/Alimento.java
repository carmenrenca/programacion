package ejercicios.ejercicio13;
/**
 * 
 * @author Carmen
 *
 */
public class Alimento {
	boolean aux;
	String nombre;
	int lipidos;
	int proteinas;
	boolean origen;
	String vitaminas;
	String minerales;
	/**
	 * constructor vacio
	 */
	Alimento(){
		
	}
	/**
	 * constructo en el que pasamos el parametro nombre
	 * @param nombre nombre del alimento
	 */
Alimento(String nombre){
		
	}
/**
 * constructor que contiene 6 parametros
 * @param nombre Nombre de alimentos
 * @param lipidos porcentaje de lipidos
 * @param proteinas porcentaje proteinas
 * @param origen origen animal o no
 * @param vitaminas contenido de vitaminas
 * @param minerales contenido de minerales
 */
	Alimento (String nombre, int lipidos, int proteinas, boolean origen, String vitaminas, String minerales){
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLipidos() {
		return lipidos;
	}

	public void setLipidos(int lipidos) {
		this.lipidos = lipidos;
	}

	public int getProteinas() {
		return proteinas;
	}

	public void setProteinas(int proteinas) {
		this.proteinas = proteinas;
	}

	public boolean isOrigen() {
		return origen;
	}

	public void setOrigen(boolean origen) {
		this.origen = origen;
	}

	public String getVitaminas() {
		return vitaminas;
	}
/**
 * metodo en el que nos permite saber la cantidad de vitaminas que contiene nuestro alimento si es alto, medio o bajo
 * @param vitaminas
 */
	public void setVitaminas(String vitaminas) {
		this.vitaminas=vitaminas;
			 if(vitaminas.equalsIgnoreCase("A")) {
				  System.out.println("Tu contenido es alto");
			 
			  }else if(vitaminas.equalsIgnoreCase("B")) {
				  
				  System.out.println("Tu contenido es bajo");
				  
			  }else if(vitaminas.equalsIgnoreCase("M")){
				  System.out.println("Tu contenido es medio");
			  }else {
				  System.out.println("tienes que introducir una de las letras A, M o B");
			  }
	
		
	}
	

	/**
	 * metodo en el que nos permite saber la cantidad de minerlaes que contiene nuestro alimento si es alto, medio o bajo
	 * @param vitaminas
	 */

	public void setMinerales(String minerales) {
		this.minerales=minerales;
		 if(minerales.equalsIgnoreCase("A")) {
			  System.out.println("Tu contenido es alto");
		 
		  }else if(minerales.equalsIgnoreCase("B")) {
			  
			  System.out.println("Tu contenido es bajo");
			  
		  }else if(minerales.equalsIgnoreCase("M")){
			  System.out.println("Tu contenido es medio");
		  }else {
			  System.out.println("tienes que introducir una de las letras A, M o B");
		  }
		 
	}
	public String getMinerales() {
		return minerales;
	}
	/**
	 * este metodo  retorna cierto si el alimento contiene menos del 20% de
lípidos y el contenido en vitaminas no es bajo. 
	 * @return
	 */

	public boolean esDietetico() {
		if(this.lipidos<20 && this.vitaminas!="B") {
			aux=true;
		}else if(this.lipidos>20 && this.vitaminas=="B") {
			aux=false;
		}
			
		return aux;
	}
	/**
	 * retorna una descripción del alimento
	 * @return
	 */
	public String muestraalimento() {
		return "Lípidos: "+lipidos
				+"\n"
				+"Hidratos: "+proteinas
				+"\n"
				+"Origen animal; "+origen
				+"\n"
				+"Vitaminas: "+vitaminas
				+"\n"
				+"Minerales "+minerales
				+"\n"
				+"Es dietetico; "+aux;
				
	}
	
	
}
