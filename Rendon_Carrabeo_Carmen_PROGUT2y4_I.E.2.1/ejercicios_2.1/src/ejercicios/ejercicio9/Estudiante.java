package ejercicios.ejercicio9;
/**
 * 
 * @author Carmen
 *
 */
public class Estudiante extends Persona{
	int codigo;
	String Categor�a;
	double pagopension;
	String colegiodeprocedencia;
	int promedio;
	/**
	 * constructor vacio
	 */
	Estudiante(){
		
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getCateor�a() {
		return Categor�a;
	}
	public void setCateor�a(String categor�a) {
		Categor�a = categor�a;
	}
	public double getPagopension() {
		return pagopension;
	}
	public void setPagopension(double d) {
		this.pagopension = d;
	}
	public String getColegiodeprocedencia() {
		return colegiodeprocedencia;
	}
	public void setColegiodeprocedencia(String colegiodeprocedencia) {
		this.colegiodeprocedencia = colegiodeprocedencia;
	}
	public int getPromedio() {
		return promedio;
	}
	public void setPromedio(int promedio) {
		this.promedio = promedio;
	}
	/**
	 * este metedodo Calcula el descuento sobre el pago parcial de pensiones de acuerdo al promedio
ponderado
	 * @return
	 */
	public double descuento() {
		if(promedio<13) {
			this.pagopension=pagopension;
		}
		else if( promedio>13 && promedio<16) {
			 this.pagopension=pagopension-(pagopension*0.08);
		}
		else if (promedio>16) {
			 this.pagopension=pagopension-(pagopension*0.15);
		}
		
		
		return pagopension;
	}
	/**
	 * imprie los datos de docente
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
				+"Categoria "+Categor�a
				+"\n"
				+"Colegio de procedencia "+colegiodeprocedencia
				+"\n"
				+"Promedio "+promedio;
			
	}

}
