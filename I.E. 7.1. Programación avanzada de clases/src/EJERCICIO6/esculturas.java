package EJERCICIO6;

public class esculturas extends obras {
String material;
double altura;



public esculturas(String titulo, int numero_invetario, String autor, int a�o, String material, double altura) {
	super(titulo, numero_invetario, autor, a�o);
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
	if(this.titulo==e.titulo && this.autor==e.autor && this.a�o==e.a�o && this.material==e.material && this.altura==e.altura) {
		return true;
		
	}else {
		return false;
	}
}
}
