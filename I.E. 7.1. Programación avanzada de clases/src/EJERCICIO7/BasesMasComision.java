package EJERCICIO7;

public class BasesMasComision extends PorComision {

	private double sueldobase;
	public BasesMasComision(String nombre, String apellido, int seguro_Social, double ventasBrutas,
			double tarifaComicion, double sueldobase) {
		super(nombre, apellido, seguro_Social, ventasBrutas, tarifaComicion);
		// TODO Auto-generated constructor stub
		this.sueldobase=sueldobase;
	}




	public double getSueldobase() {
		return sueldobase;
	}

	public void setSueldobase(double sueldobase) {
		this.sueldobase = sueldobase;
	}

	@Override
	public double ingresos() {
		// TODO Auto-generated method stub
		return (this.getTarifaComision()*this.getVentasBrutas())+this.getSueldobase();
	}

}
