package EJERCICIO2;

import java.io.IOException;

import excepciones.trycatch;

public class administradores extends usuarios{
	
	
trycatch e= new trycatch();
private int baneos;
private int papelera;

	public administradores( String correoelectronico, String nick) {
		super( correoelectronico, nick);
	
	}
public void cambiarnick() throws IOException {
	String nnick;
	System.out.println("dime el nuevo nombre");
this.setNick(e.try_String());
	System.out.println("su nombre de usuario se ha cambiado a: "+this.getNick());
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

public void incrementarbaneos() {
	baneos=baneos+1;
}
public int getBaneos() {
	return baneos;
}
public void setBaneos(int baneos) {
	this.baneos = baneos;
}

public String To_String() {
	return "Numero de mensaje "+this.getNmensaje()+"\n"+" Correo electronico: "+this.getCorreoelectronico()+"\n"+"Nombre de usuario "+this.getNick()+"papelera: "+papelera+" baneo: "+this.getBaneos();
}

}
