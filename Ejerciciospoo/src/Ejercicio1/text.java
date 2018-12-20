package Ejercicio1;

import java.io.IOException;

import excepciones.trycatch;

public class text {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
trycatch e = new trycatch();
DVD_CINE dvd = new DVD_CINE();
System.out.println("Titulo de la peli");
dvd.setTitulo(e.try_String());
System.out.println("Duracion");
dvd.setDuracion(e.try_int());
System.out.println("Resumen");
dvd.setResumen(e.try_String());
System.out.println("genero");
dvd.setGenero(e.try_String());
System.out.println("Personaje");
dvd.setPersonaje(e.try_String());
System.out.println(dvd.muestraDVDCine());
System.out.println("Es thriller: "+dvd.esThriller());
System.out.println("Tiene resumen "+dvd.tieneResumen());
System.out.println("Duracion "+dvd.muestraDuracion());
	}

}
