package EJERCICIO2;

public class moderadores extends usuarios {
private int papelera;

public moderadores( String correoelectronico, String nick) {
		super( correoelectronico, nick);

	}
	
	public void papelerainc() {
		papelera=papelera+1;
	}
	
	public int getPapelera() {
		return papelera;
	}
	public void setPapelera(int papelera) {
		this.papelera = papelera;
	}
	public String To_String() {
		return "Numero de mensaje "+this.getNmensaje()+"\n"+" Correo electronico: "+this.getCorreoelectronico()+"\n"+" Nombre de usuario "+this.getNick()+"papelera: "+papelera;
	}

}
