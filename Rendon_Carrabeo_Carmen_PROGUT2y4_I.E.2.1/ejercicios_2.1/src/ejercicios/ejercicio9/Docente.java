package ejercicios.ejercicio9;
/**
 * 
 * @author Carmen
 *
 */
public class Docente extends Persona { //esta clase es hijo de Persona
	String categor�a;
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

public String getCategor�a() {
	return categor�a;
}

public void setCategor�a(String categor�a) {
	this.categor�a = categor�a;
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
			+"Categoria "+categor�a
			+"\n"
			+"Estudio de postgrado "+EstudiosPostgrado
			+"\n"
			+"Hora de clase "+horaclase
			+"\n"
			+"Pago por hora: "+pagoporhora;
}



}
