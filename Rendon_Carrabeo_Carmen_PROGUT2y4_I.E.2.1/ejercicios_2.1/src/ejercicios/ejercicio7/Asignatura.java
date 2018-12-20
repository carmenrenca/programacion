package ejercicios.ejercicio7;
/**
 * 
 * @author Carmen
 *
 */
public class Asignatura {
public String asignatura;
public double nota;
public boolean apto=true;

/**
 * creamos constructor vacio
 */
public Asignatura() {
	
}
/**
 * Constructor que acepta como parámetros el nombre de la asignatura y la
nota obtenida
 * @param asignatura nombre de la asignatura
 * @param nota Nota obtenida
 */
public Asignatura (String asignatura, int nota ){
	this.asignatura=asignatura; 
	this.nota=nota;
}


public String getAsignatura() {
	return asignatura;
}


public void setAsignatura(String asignatura) {
	this.asignatura = asignatura;
}


public double cosultarnota () { //metodo get para consultar la nota
	return nota;
}

public void modificarnota(double nota) { //metodo set para modificar la nota
	this.nota=nota;
}
/**
 * Método que nos devuelve "Aprobado" si la nota es mayor o igual a 5 o
"Suspenso" si la nota es menor que 5
 * @return
 */
public String verificarapto() { //metodo get para que te devuelva si esta apto o no dependiendo de la nota 
	if (nota>=5) {
		System.out.println("Tu nota es es mayor que 4 por lo que: ");
		apto=true;
		
		return "apto";
	}else if(nota<=4) {
	apto=false;	
	System.out.println("Tu nota es manor que 5 por lo que");
	
	}
	return "no apto";
	
	
	
}
}
