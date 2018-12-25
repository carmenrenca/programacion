package ejercicio4;

public class Direccion {

	String calle;
	int numero;
	String piso;
	String ciudad;
	Direccion(){
		
	}
	/**
	 * Constructor con los siguientes parametros
	 * @param calle
	 * @param numero
	 * @param piso
	 * @param ciudad
	 */
	Direccion(String calle, int numero, String piso, String ciudad){
		this.calle=calle;
		this.numero=numero;
		this.piso=piso;
		this.ciudad=ciudad;
		
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getPiso() {
		return piso;
	}
	public void setPiso(String piso) {
		this.piso = piso;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	/**
	 * metodo get que devuelve una descripcion de la Direccion
	 */
	public String printall() {
		return "Calle: "+calle
				+"\n"
				+"Número: "+numero
				+"\n"
				+"Puerta: "+piso
				+"\n"
				+"Ciudad: "+ciudad;
		
	}
	
}
