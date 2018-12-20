package ejercicios.ejercicio5;
/**
 * 
 * @author Carmen
 *
 */
public class Empleado {
int NIF;        //defenimos los atributos de la clase
double sueldobase;
int horasextra;
double IRPF;
boolean casado;
int hijos;
int DNI;
double pagohoraextra;
double sueldobruto;
double calculohoraextra;
double sueldoneto;
/**
 * creamos un constructor vacio
 */
Empleado(){ 
	
}
/**
 * Constructor con 7 parametros
 * @param NIF
 * @param sueldobase
 * @param pagohoraextra
 * @param horaextra
 * @param IRPF
 * @param casado
 * @param hijos
 */
Empleado(int NIF, double sueldobase, double pagohoraextra, int horaextra, double IRPF, boolean casado, int hijos){ //crearmos un cosntructor con parametros
	this.NIF=NIF;
	this.sueldobase=sueldobase;
	this.pagohoraextra=pagohoraextra;
	this.horasextra=horaextra;
	this.IRPF=IRPF;
	this.casado=casado;
	this.hijos=hijos;
	
}
public int getNIF() {
	return NIF;
}
public void setNIF(int nIF) {
	NIF = nIF;
}
public double getSueldobase() {
	return sueldobase;
}
public void setSueldobase(double sueldobase) {
	this.sueldobase = sueldobase;
}
public double getPagohoraextra() {
	return pagohoraextra;
}
public void setPagohoraextra(double pagohoraextra) {
	this.pagohoraextra = pagohoraextra;
}
public int getHorasextra() {
	return horasextra;
}
public void setHorasextra(double d) {
	this.horasextra = (int) d;
}
public double getIRPF() {
	return IRPF;
}
public void setIRPF(double IRPF) {
	
		this.IRPF=IRPF;
		
	
}
public boolean isCasado() {
	return casado;
}
public void setCasado(boolean casado) {
	this.casado = casado;
}
public int getHijos() {
	return hijos;
}
public void setHijos(int hijos) {
	this.hijos = hijos;
}
public int getDNI() {
	return DNI;
}
public void setDNI(int dNI) {
	DNI = dNI;
}

public double calculohoraextra() { //metodo para calcular el dinero de las horas extras
	this.calculohoraextra=(int) (this.pagohoraextra*this.horasextra);
	
	return this.calculohoraextra;
	
}
public double sueldobruto() { //metodo para calcular el sueldo bruto
	 this.sueldobruto=sueldobase+calculohoraextra;
	return sueldobruto;
}
public void setsueldoneto(double sueldoneto) {
	this.sueldoneto=sueldoneto-retenciones();
	this.sueldoneto=sueldoneto;
	
}
public double sueldoneto() {
return sueldoneto;
}
/**
 * metodo que nos aplica la retencion a el IRPF
 * @return nos devuelve el IRPF ya con la retencion aplicada
 */
public double retenciones () { 

	this.IRPF=(sueldobruto())*(IRPF-this.hijos-((casado)?2:0))/36500;
return IRPF;
}
/**
 * 
 * @return nos devuelve informacion menos detallada del empledado
 */
public String println() {
	return "NIF:" +this.NIF
		+"\n"
		+"Pago por horas extra: "+ this.pagohoraextra
		+"\n"
		+"Horas extras realizadas: "+this.horasextra
		+"\n"
		+"Casado: "+this.casado
		+"\n "
		+"Numeros de hijos: "+ this.hijos;
			
		
}
/**
 * 
 * @return nos devulve informacion mas detallada de empleado
 */
public String printall() {
	return "NIF:" +this.NIF
			+"\n"
			+"Casado: "+this.casado
			+"\n "
			+"Numeros de hijos: "+ this.hijos
			+"\n"
			+"Pago por horas extra: "+ this.pagohoraextra
			+"\n"
			+"Horas extras realizadas: "+this.horasextra	
			+"\n"
			+"Sueldo base"+sueldobase
			+"\n"
			+"IRPF: "+this.IRPF
			+"\n"
			+"Retencion: "+retenciones()
			+"\n"
			+"Completo horas extras: "+calculohoraextra()
			+"\n"
			+"Sueldo bruto: "+this.sueldobruto
			+"\n"
			+"Sueldo neto: "+this.sueldoneto;
	
}
/**
 * metodo que lo vamos a  utlizar para hacer una copia de los datos 
 * @param e cogemos los valores de los atributos
 */
public void realizarcopia (Empleado e) {
	 this.casado=e.casado;
	 this.hijos=e.hijos;
	 this.IRPF=e.IRPF;
	 this.horasextra=e.horasextra;
	 this.sueldobase=e.sueldobase;
	 this.sueldobruto=e.sueldobruto;
	 this.sueldoneto=e.sueldoneto;
	this.pagohoraextra=e.pagohoraextra;
	this.NIF=e.NIF;
				
}





}
