package EJERCICIO1;

public class cuenta_ahorro extends cuenta {

	Double interes;
	final double saldominimo;
	public cuenta_ahorro(int numerocuenta, double saldocuenta, Persona cliente, double saldominimo) {
		super(numerocuenta, saldocuenta, cliente);
		// TODO Auto-generated constructor stub
		this.saldominimo=100;
		
	}
	
	
	
	@Override
	public void retirar(double retirar) {
		// TODO Auto-generated method stub
		if(this.saldocuenta-retirar>saldominimo) {
			System.out.println("la cantidad  a retirar no puede sobrepasar el saldo minimo de la cuenta");
		}else {
			this.saldocuenta=saldocuenta-retirar;
			System.out.println("se ha retirado "+retirar+"€ ahora tienes "+this.saldocuenta);
		}
			
		
	}

	@Override
	public void actualizarsaldo() {
		// TODO Auto-generated method stub
		this.saldocuenta=(this.saldocuenta+1.5+12)/100;
	}





	
}
