package EJERCICIO2;

public class usuarios {
private int nmensaje;
private String correoelectronico;
private String nick;

public usuarios(String correoelectronico, String nick) {
	super();

	this.correoelectronico = correoelectronico;
	this.nick = nick;
}

public void incrementar() {
	nmensaje=nmensaje+1;
}


public void decrementar() {
	nmensaje=nmensaje-1;
}

public void modificarcorreo(String correo) {
	this.setCorreoelectronico(correo);
	System.out.println("tu nombre de correo se ha cambiado a "+this.getCorreoelectronico());
}

public int getNmensaje() {
	return nmensaje;
}

public void setNmensaje(int nmensaje) {
	this.nmensaje = nmensaje;
}

public String getCorreoelectronico() {
	return correoelectronico;
}

public void setCorreoelectronico(String correoelectronico) {
	this.correoelectronico = correoelectronico;
}

public String getNick() {
	return nick;
}

public void setNick(String nick) {
	this.nick = nick;
}

public String To_String() {
	return "Numero de mensaje " +nmensaje+"\n"+" Correo electronico: "+correoelectronico+"\n"+" Nombre de usuario "+nick;
}

}
