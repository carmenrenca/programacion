package ejercicios.ejercicio17;
/**
 * 
 * @author Carmen
 *
 */
public class Ordenador {
int RAM;
int discoduro;
String modelo_procesador;
String modelo_grafica;
double precio;
/**
 * constructor vacio
 */
Ordenador(){
	
}
/**
 * generamos los getters y los setters
 * @return
 */
public int getRAM() {
	return RAM;
}

public void setRAM(int rAM) {
	RAM = rAM;
}

public int getDiscoduro() {
	return discoduro;
}


public void setDiscoduro(int discoduro) {
	this.discoduro = discoduro;
}

public String getModelo_procesador() {
	return modelo_procesador;
}

public void setModelo_procesador(String modelo_procesador) {
	this.modelo_procesador = modelo_procesador;
}

public String getModelo_grafica() {
	return modelo_grafica;
}

public void setModelo_grafica(String modelo_grafica) {
	this.modelo_grafica = modelo_grafica;
}

public double getPrecio() {
	return precio;
}
/**
 *hacemos una restrición para que el parametro precio no le den un numero negativo
 * @param precio
 */
public void setPrecio(double precio) {
	do {
		if(precio>0) {
			this.precio = precio;
		}else if(precio<0) {
			System.out.println("no me puedes dar un numero menor que 0");
		}	
	}while(precio<0);

	
}



}
