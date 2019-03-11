package EJERCICIO7;

public class PorComision extends Empleado {
private double ventasBrutas;
private double tarifaComision;

	public PorComision(String nombre, String apellido, int seguro_Social, double ventasBrutas, double tarifaComicion) {
		super(nombre, apellido, seguro_Social);
		// TODO Auto-generated constructor stub
		this.ventasBrutas=ventasBrutas;
		this.tarifaComision=tarifaComicion;
		
	}

	public double getVentasBrutas() {
		return ventasBrutas;
	}

	public void setVentasBrutas(double ventasBrutas) {
		this.ventasBrutas = ventasBrutas;
	}

	public double getTarifaComision() {
		return tarifaComision;
	}

	public void setTarifaComision(double tarifaComision) {
		this.tarifaComision = tarifaComision;
	}

	@Override
	public double ingresos() {
		// TODO Auto-generated method stub
		return this.getTarifaComision()*this.getVentasBrutas();
	}
public String toString() {
	return super.toString()+" Ventas Brutas: "+this.getVentasBrutas()+" Tarifa Comision: "+this.getTarifaComision();
}
}
