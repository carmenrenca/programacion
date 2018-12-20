package ejercicios.ejercicio10;

public class patatachoco {
private int comensales;
private int chocos;
private int patata;
 int kilopatata;
int kilochoco;
/**
 * constructor vacio
 */
patatachoco(){
	
}

public void setkilopatata (int kilopatata) {
	this.kilopatata=kilopatata;
}

public int getkilopatata () {
	return this.kilopatata;
}

public int getKilochoco() {
	return kilochoco;
}

public void setKilochoco(int kilochoco) {
	this.kilochoco = kilochoco;
}
/**
 * añadimos una cantidad de choco
 * @param kilochoco
 */
public void addchoco(int kilochoco) {
	this.kilochoco=this.kilochoco+kilochoco;
}
/**
 * añadimos una cantidad de kilodepapa
 * @param kilopatata
 */
public void addpatata(int kilopatata){
	this.kilopatata=this.kilopatata+kilopatata;
}
/**
 * 
 * Devuelve el número de clientes que peude atender el restaurante
 * @return
 */
public int getcomensales () { //hacemos un get para que devuelva el numeor de comensales que puedan comer con los kilos proporcionados
	this.kilochoco=kilochoco*6; //multiplicamos por 6 comensales para calcular el kilo entero CON 6 COMENSALES COMEN 1 KILO DE CHOCO
	this.kilopatata=kilopatata*3; //multiplicamos por 3 comensales para calcular el kilo 
	
	if(kilopatata>kilochoco) {
		return kilochoco;
	}else if(kilopatata<kilochoco) {
		return kilopatata;
	}else if(kilopatata==kilochoco) {
		return kilopatata;   //Segun esto el numero mas chico q salga de los chocos y papas seria el numero de comensales que pueden comer, ya que no podemos olvidar que antes pusimos que 6 comensales comen un kilo de choco
	}
	return chocos;
			
}


public int showchocos() {
	return this.kilochoco;
}
public int showpatatas() {
	return this.kilopatata;
}

}

