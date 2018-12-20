package ejercicios.ejercicio16;

import java.io.IOException;

import excepciones.trycatch;

public class text {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		trycatch excepcion =new trycatch();
		Guerreros guerrero1 = new Guerreros("pepe","espada",100);
		System.out.println(guerrero1.combatir(20));
		Guerreros guerrero2 = new Guerreros("mike","pistola",80);
		System.out.println(guerrero2.combatir(40));
		
		System.out.println(" ");
		Magos magos1 = new Magos ("harry", "patronus");
		System.out.println(magos1.encantar());
		Magos magos2 = new Magos ("Ron", "expeliermus");
		System.out.println(magos2.encantar());
		Magos magos3 = new Magos ("Hermione", "oculus reparus");
		System.out.println(magos3.encantar());
	}

}
