package ejercicio4;

public class Empleado {
String nombre;
int salario;
Direccion direccion;
/**
 * constructor vacio
 */
Empleado(){
	
}
/**
 * constructor con los siguientes parametros
 * @param nombre
 * @param salario
 * @param direccion
 */
Empleado(String nombre, int salario, Direccion direccion){
	this.nombre=nombre;
	this.salario=salario;
	this.direccion=direccion;
	
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getSalario() {
	return salario;
}
public void setSalario(int salario) {
	this.salario = salario;
}
public Direccion getDireccion() {
	return direccion;
}
public void setDireccion(Direccion direccion) {
	this.direccion = direccion;
}
/**
 * metodo get que devuelve una descripcion del Empleado y llama al metodo que devolvia la descripcion de la direcion, para que nos lo imprima ya todo junto
 */
public String print() {
	return "Nombre: "+nombre
			+"\n"
			+"Salario: "+salario
			+"\n"
			+"Dirección:"
			+"\n"
			+direccion.printall();
	
}
}
