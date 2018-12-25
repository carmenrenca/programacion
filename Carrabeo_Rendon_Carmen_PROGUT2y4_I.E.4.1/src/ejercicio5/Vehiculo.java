package ejercicio5;
//clase padre
public class Vehiculo {
private String matricula;
private String color_vehiculo;
private int numero_rueda;
private double cilindradas;
private int potencia;
//constructor vacio
Vehiculo(){
	
}


public Vehiculo(String matricula,String color_vehiculo, int numero_rueda){
	this.matricula=matricula;
	this.color_vehiculo=color_vehiculo;
	this.numero_rueda= numero_rueda;
	
}

public Vehiculo(String matricula,String color_vehiculo, int numero_rueda, double cilindradas ){
	this.matricula=matricula;
	this.color_vehiculo=color_vehiculo;
	this.numero_rueda=numero_rueda;
	this.cilindradas=cilindradas;
	
			
}
public Vehiculo(String matricula,String color_vehiculo, int numero_rueda, double cilindradas, int potencia ){
	this.matricula=matricula;
	this.color_vehiculo=color_vehiculo;
	this.numero_rueda=numero_rueda;
	this.cilindradas=cilindradas;
	this.potencia=potencia;
	
			
}


public String getMatricula() {
	return matricula;
}




public String getColor_vehiculo() {
	return color_vehiculo;
}




public int getNumero_rueda() {
	return numero_rueda;
}





public double getCilindradas() {
	return cilindradas;
}


public void setCilindradas(double cilindradas) {
	this.cilindradas = cilindradas;
}


public int getPotencia() {
	return potencia;
}


public void setPotencia(int potencia) {
	this.potencia = potencia;
}
//metodo get q nos retorna los datos de los obajetos que hayamos creado en las clases hijas
public String print () {
	return "matricula: "+matricula
	+"\n"
	+"color: "+color_vehiculo;
}

}
