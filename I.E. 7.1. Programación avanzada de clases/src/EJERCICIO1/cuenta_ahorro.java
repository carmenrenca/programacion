package EJERCICIO1;

import java.io.IOException;

public class cuenta_ahorro extends cuenta {

	double interes=1.5;



	final double saldominimo=100;
	public cuenta_ahorro(int numerocuenta, Persona cliente) {
		super(numerocuenta, cliente);
		// TODO Auto-generated constructor stub
		
		this.cliente=cliente;
		
	}
	
	
	
	@Override
	public void retirar(double retirar) {
		// TODO Auto-generated method stub
		if(this.saldocuenta-retirar<saldominimo) {
			System.out.println("la cantidad  a retirar no puede sobrepasar el saldo minimo de la cuenta");
		}else {
			this.saldocuenta=saldocuenta-retirar;
			System.out.println("se ha retirado "+retirar+"€ ahora tienes "+this.saldocuenta);
		}
			
		
	}

	@Override
	public void actualizarsaldo() {
		// TODO Auto-generated method stub
		this.interes=(this.saldocuenta*1.5)/100;
		this.saldocuenta=saldocuenta+interes;
		System.out.println("saldo "+this.saldocuenta);
	}




	   public String ToString(){
		return "Numero cuenta "+this.numerocuenta+" saldo: "+saldocuenta+"Nombre cliente: "+cliente.getNombre()+" apellidos "+cliente.getApellidos()+"NIF "+cliente.getNIF()+" saldo minimo: "+this.saldominimo;
		   
	   }

		public double getInteres() {
			return interes;
		}



		public void setInteres(double interes) {
			this.interes = interes;
		}
	
}
