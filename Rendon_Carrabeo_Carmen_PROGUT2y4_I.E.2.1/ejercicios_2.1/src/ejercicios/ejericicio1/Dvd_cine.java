package ejercicios.ejericicio1;

public class Dvd_cine { //especificamos atributos

	String nombre;
	String duracion;
	String actores;
	String genero;
	String resumen;
	String director;
	Dvd_cine(){ //creamos un constructor vacio por si hiciera falta
	
	}
	
	Dvd_cine(String nombre, String duracion, String actores, String genero, String resumen, String director){ //creamos optro constructor en el cual el valor lo vamos a pasar por parametros
		this.nombre=nombre;
		this.duracion=duracion;
		this.actores=actores;
		this.genero=genero;
		this.resumen=resumen;
		this.director=director;
	}
	
	public String muestradvd_cine() { //generemaos unmetodo get para que imprima la informacion
		return nombre+" De:"+director+" con: "+ actores+ genero+ " - "+ duracion + " min "+ " Resumen: " +resumen;
	}
	
	public void setnombre(String nombre) {
		this.nombre=nombre;
	}
	public String mostrarnombre() {
		return nombre;
	}
	
	public void setdirector (String director){
		this.director=director;
	}
	
	public String mostrardirector () {
		return director;
	}
	
	public void setduracion(String duracion) {
		this.duracion=duracion;
	}
	
	public String mostrarduracion(String duracion) {
			return duracion;
	}
	
	public void setactores(String actores) {
		this.actores=actores;
		
	}
	
	public String mostractores( String actores) {
		return actores;
	}
	
	public void setgenero(String genero) {
		this.genero=genero;
	}
	
	public String mostrargenero (String genero) {
		return genero;
	}
	
	public void setresumen (String resumen) {
		this.resumen=resumen;
	}
	
	public String mostrarresumen (String resumen) {
		return resumen;
	}
	public boolean  esthriller() {
		return genero.equalsIgnoreCase("thriller");
			
			
		}
	public boolean tieneresumen( ) { //generamos un metodo get booleano para que me diha si tiene o no resumen, con isempty que es un metodo string que nos sirve para comprobar si el string esta o no vacio, si esta vacio nos lo ponfra como true
		return !resumen.isEmpty();
	}
	public String muestraduracion() {
		return  duracion + " min";
	}
}
		
	
	

