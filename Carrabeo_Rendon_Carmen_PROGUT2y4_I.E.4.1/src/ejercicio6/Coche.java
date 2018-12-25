package ejercicio6;

public class Coche {
String matricula;
String marca;
String modelo;
Coche(){
	
}
Coche(String matricula, String marca, String modelo){
	this.matricula=matricula;
	this.marca=marca;
	this.modelo=modelo;
}

public String getMatricula() {
	return matricula;
}

public void setMatricula(String matricula) {
	this.matricula = matricula;
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}

public String print() {
	return "Matricula: "+matricula
	+"\n"
	+"Marca: "+marca
	+"\n"
	+"Modelo: "+modelo;
}
}
