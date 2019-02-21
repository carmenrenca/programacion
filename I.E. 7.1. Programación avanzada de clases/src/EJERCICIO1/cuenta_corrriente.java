package EJERCICIO1;

public class cuenta_corrriente extends cuenta {
	
	Double interes;

	

	public cuenta_corrriente() {
		super();
	}



	public cuenta_corrriente(int numerocuenta, double saldocuenta, String nombre, String apellidos, String nif) {
		super(numerocuenta, saldocuenta, cliente);
		// TODO Auto-generated constructor stub
		cliente.Nombre=nombre;
		cliente.apellidos=apellidos;
		cliente.NIF=nif;
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
		
	}
	

   public String ToString(){
	return "Numero cuenta "+this.numerocuenta+" saldo: "+saldocuenta+"Nombre cliente: "+cliente.Nombre+" apellidos"+cliente.apellidos+"NIF"+cliente.NIF;
	   
   }


	
	
	

}
