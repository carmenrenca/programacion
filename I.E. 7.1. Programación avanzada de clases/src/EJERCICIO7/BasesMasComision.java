package EJERCICIO7;
/**
 * Esta clase extendera de la clase porcomision ya que comparte caraterísticas con esta
 * pero su clase padre extiende de Empleado por lo que BasesMasComision es una subclase indirecta de Empleado
 * @author Carmen
 *
 */
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
