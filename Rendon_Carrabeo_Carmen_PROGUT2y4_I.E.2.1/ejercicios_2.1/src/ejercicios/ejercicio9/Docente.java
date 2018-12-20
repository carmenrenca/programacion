package ejercicios.ejercicio9;
/**
 * 
 * @author Carmen
 *
 */
public class Docente extends Persona { //esta clase es hijo de Persona
	String categoría;
	String EstudiosPostgrado;
	int horaclase;
	double pagoporhora;
	double pagoparcial;
	int codigo;
	/**
	 * constructor vacio
	 */
Docente(){

	
}

public Double getpagoparcial() {
	return this.pagoparcial=horaclase*pagoporhora;
	
}



public int getCodigo() {
	return codigo;
}

public void setCodigo(int codigo) {
	this.codigo = codigo;
}

public String getCategoría() {
	return categoría;
}

public void setCategoría(String categoría) {
	this.categoría = categoría;
}

public String getEstudiosPostgrado() {
	return EstudiosPostgrado;
}

public void setEstudiosPostgrado(String estudiosPostgrado) {
	EstudiosPostgrado = estudiosPostgrado;
}

public int getHoraclase() {
	return horaclase;
}

public void setHoraclase(int horaclase) {
	this.horaclase = horaclase;
}

public double getPagoporhora() {
	return pagoporhora;
}

public void setPagoporhora(double pagoporhora) {
	this.pagoporhora = pagoporhora;
}

/**
 * devuelve los datos del docente
 * @return
 */
public String printall() {
	
	return "DATOS DOCENTE"
			+"Nombre: "+nombre
			+"\n"
			+"Apellidos: "+apellidos
			+"\n"
			+"Genero: "+genero
			+"\n"
			+"DNI: "+DNI
			+"\n"
			+"Codigo: "+codigo
			+"\n"
			+"Categoria "+categoría
			+"\n"
			+"Estudio de postgrado "+EstudiosPostgrado
			+"\n"
			+"Hora de clase "+horaclase
			+"\n"
			+"Pago por hora: "+pagoporhora;
}



}
