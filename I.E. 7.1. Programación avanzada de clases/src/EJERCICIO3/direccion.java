package EJERCICIO3;

public class direccion {
private String calle;
private String ciudad;
private String cp;
private String pais;




public direccion(String calle, String ciudad, String cp, String pais) {
	super();
	this.calle = calle;
	this.ciudad = ciudad;
	this.cp = cp;
	this.pais = pais;
}
public String getCalle() {
	return calle;
}
public void setCalle(String calle) {
	this.calle = calle;
}
public String getCiudad() {
	return ciudad;
}
public void setCiudad(String ciudad) {
	this.ciudad = ciudad;
}
public String getCp() {
	return cp;
}
public void setCp(String cp) {
	this.cp = cp;
}
public String getPais() {
	return pais;
}
public void setPais(String pais) {
	this.pais = pais;
}


}
