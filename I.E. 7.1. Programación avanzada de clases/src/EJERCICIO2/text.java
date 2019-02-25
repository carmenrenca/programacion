package EJERCICIO2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import javax.swing.plaf.synth.SynthSpinnerUI;

import EJERCICIO1.cuenta;
import excepciones.trycatch;

public class text {
	public static ArrayList<usuarios> usuario = new ArrayList<usuarios>();

	public static void main(String[] args) throws IOException {
		int n;
		int usu;
		trycatch e=  new trycatch();
		// TODO Auto-generated method stub
usuarios u = new usuarios( "ruben4h@gmail.com", "ruben4h");
moderadores m = new moderadores("carmen6j@gmail.com ","carmen6j");
administradores a = new administradores( "javier53@gmil.com", "javi56");

usuario.add(u);
usuario.add(m);
usuario.add(a);

do {
	

System.out.println("con que usuario quieres entrar ");
System.out.println("1-- Usuario");
System.out.println("2 ---- moderador");
System.out.println("3--- Administrador");
usu=e.try_int();



System.out.println("Elige una operacion");
System.out.println("1 incrementar mensaje");
System.out.println("2 decrementar mensaje");
System.out.println("3 visualizar datos");
System.out.println("4 modificar correo electronico");
System.out.println("5 incrementar el numero de mensaje en papelera");
System.out.println("6 incrementar el numero de baneo");
System.out.println("7 cambiar nick");
n=e.try_int();
switch(n) {
case 1: 

	
		
		if(usu==1) {
			u.incrementar();
			System.out.println("se ha incrementado el numero de mensaje para el usuario"+u.getNick());
		}else if( usu==2) {
			m.incrementar();
			System.out.println("se ha incrementado el numero de mensaje para el usuario"+m.getNick());
		}else if(usu==3) {
			a.incrementar();
			System.out.println("se ha incrementado el numero de mensaje para el usuario"+a.getNick());
		}
		break;

case 2:
	if(usu==1) {
		u.decrementar();
		System.out.println("se ha decrementado el numero de mensaje para el usuario"+u.getNick());
	}else if( usu==2) {
		m.decrementar();
		System.out.println("se ha decrementado el numero de mensaje para el usuario"+m.getNick());
	}else if(usu==3) {
		a.decrementar();
		System.out.println("se ha decrementado el numero de mensaje para el usuario"+a.getNick());
	}
	break;
	
case 3:
	
	if(usu==1) {
		
		System.out.println(u.To_String());
	}else if( usu==2) {
		System.out.println(m.To_String());
	}else if(usu==3) {
		System.out.println(a.To_String());
	}
	break;
	
case 4: 
	if(usu==1) {
		System.out.println("introduce el nuevo correo");
			u.modificarcorreo(e.try_String());
	}else if( usu==2) {
		System.out.println("introduce el nuevo correo");
		m.modificarcorreo(e.try_String());
	}else if(usu==3) {
		System.out.println("introduce el nuevo correo");
		a.modificarcorreo(e.try_String());
	}
	break;
case 5:
	if(usu==2) {
		m.papelerainc();
	}else if(usu==3) {
		a.papelerainc();
	}else {
		System.out.println("solo puedes entrar con un moderador o administrador");
	}break;
case 6:	
	if(usu==3) {
		a.incrementarbaneos();
	}else {
		System.out.println("solo puedes entrar con un admisnistrador");
	}
case 7:
	if(usu==3){
	a.cambiarnick();
	}else {
		System.out.println("solo los administradores pueden cambiar su nombre de usuario");
	}
}
	


	}while(n!=0);
	
}
}