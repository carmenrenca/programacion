package EJERCICIO6;

public class esculturas extends obras {
String material;
double altura;



public esculturas(String titulo, int numero_invetario, String autor, int año, String material, double altura) {
	super(titulo, numero_invetario, autor, año);
	this.material = material;
	this.altura = altura;
}
public String getMaterial() {
	return material;
}

public void setMaterial(String material) {
	this.material = material;
}

public double getAltura() {
	return altura;
}

public void setAltura(double altura) {
	this.altura = altura;
}

public boolean compararescultura(esculturas e) {
	if(this.titulo==e.getTitulo() && this.autor==e.getAutor() && this.año==e.getAño() && this.material==e.getMaterial() && this.altura==e.getAltura()) {
		return true;
		
	}else {
		return false;
	}
}
}
