package ejercicios.ejercicio12;
/**
 * 
 * @author Carmen
 *
 */
public class sueldobruto {

	double sueldobruto;
	int horas;
	double plustarifa;
	double dineroxhora;
	String nombre;
	/**
	 * cosntructor vacio
	 */
	sueldobruto(){
		
	}



	public void setSueldobruto(double sueldobruto) {
		
		
		
	}
	/**
	 * metodo que devuelve el sueldo bruto dependiendo de las horas extras que realize
	 * @return
	 */
	public double getSueldobruto() {
		if(this.horas>40) {
			this.sueldobruto=(dineroxhora*40)+(((horas-40)*dineroxhora)+(((horas-40)*dineroxhora )/2));
			} else if(this.horas<=40) {
				this.sueldobruto=(dineroxhora*horas);
			}
		return sueldobruto;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double getPlustarifa() {
		return plustarifa;
	}

	public void setPlustarifa(double plustarifa) {
		this.plustarifa = plustarifa;
	}

	public double getDineroxhora() {
		return dineroxhora;
	}

	public void setDineroxhora(double dineroxhora) {
		this.dineroxhora = dineroxhora;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * nos devuelve un String con los datos
	 * @return
	 */
	public String getprintall () {
		return nombre +" trabajó "+horas+ " horas, cobra "+dineroxhora+" euros la hora por lo que corresponde un sueldo de "+ this.getSueldobruto()+ " euros"; 
	}
	
}
