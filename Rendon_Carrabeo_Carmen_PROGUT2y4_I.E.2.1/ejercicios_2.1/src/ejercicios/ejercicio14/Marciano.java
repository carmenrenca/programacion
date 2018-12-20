package ejercicios.ejercicio14;
/**
 * 
 * @author Carmen
 *
 */
public class Marciano {

private	boolean vivo=false;
private	String nombre;
private  int nummarcianos=n;
public static int n=1; //creamos una variable estatica para que vaya sumando 1 cada vex que cree un objeto de la clase marciano
	/**
	 * constructor al que le pasamos 1 parametro
	 * @param nombre nombre del marciano
	 */
	 
	 Marciano( String nombre){
		this.vivo=true;
		this.nombre=nombre;
		this.nummarcianos=n; //igualamos el numero de marciano a n que es la q se va a incrementar
		n++;  //incrementamos n
	System.out.println(nace());	//cada vez que cree el objeto imprimirá el metodo nace
	 }
	 
	 /**
	  * metodo que  nos permitirá visualizar el mensaje: “Hola,
he nacido y soy el marciano ……………….”
	  * @return
	  */

	 public String nace() { 
		 return "Hola he nacido y soy el marciano "+nombre+ " su numero es "+nummarcianos;
	 }
	
	public boolean isVivo() {
		return vivo;
	}






	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}






	public String getNombre() {
		return nombre;
	}






	public String setNombre(String nombre) {
		return this.nombre = nombre;
	}






	public  int getNummaricianos() {
		return nummarcianos;
	}
/**
 * metodo que nos permite matar al marciano(si este esta vivo)
 * en el caso de que no esta vivo y ejecutemos el metodo, nos saldrá el mensaje  "El marciano "+nombre+" ya está muerto"
 */

public void muere () {
	if(this.vivo==true) {
		this.vivo=false;
		this.nummarcianos=nummarcianos-1;
		System.out.println("El marciano "+nombre+" ha muerto");
		
	}else if(this.vivo==false) {
		System.out.println("El marciano "+nombre+" ya está muerto");
	}
}
/**
 * metodo que  nos permitirá saber si un marciano está
vivo o no.
 * @return
 */
public String estavivo() {
	if(vivo==false) {
	return	"Su marciano esta muerto";
	}else if(vivo==true) 
		return	"Su marciano esta vivo";
	return nombre;


}
/**
 * metodo que  nos dirá cuántos marcianos
vivos hay en ese momento.
 */
	
public  String	cuentaMarcianos() {
	return "en estos momentos hay "+nummarcianos+" marcianos vivos";
}




	
	 
}
