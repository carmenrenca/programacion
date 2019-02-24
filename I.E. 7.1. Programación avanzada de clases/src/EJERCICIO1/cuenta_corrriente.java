package EJERCICIO1;

import java.io.IOException;

public class cuenta_corrriente extends cuenta {
	
	Double interes;

	public cuenta_corrriente(int numerocuenta, Persona cliente) {
		super(numerocuenta, cliente);
		this.numerocuenta=numerocuenta;
	}
	
	
	@Override
	public void retirar(double retirar) {
		// TODO Auto-generated method stub
		this.saldocuenta=saldocuenta-retirar;
		if(retirar>this.saldocuenta) {
			System.out.println("No puedes retirar esa cantidad, vuelva a intentarlo");
			
		}else {
			System.out.println("se a retirado "+retirar+"€ ahora tienes "+this.saldocuenta);
		}
		
	}
	@Override
	public void actualizarsaldo() {
		// TODO Auto-generated method stub
		this.interes=(this.saldocuenta*1.5)/100;
		this.saldocuenta=saldocuenta+interes;
		System.out.println("saldo "+this.saldocuenta);
	}
	
	



	
	
	

}
