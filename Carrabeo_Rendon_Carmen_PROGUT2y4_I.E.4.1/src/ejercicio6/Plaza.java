package ejercicio6;

public class Plaza {
int numplaza;
Coche c1=new Coche();
static boolean libre [];
static String aux;

static int numcoche;

Plaza(int numplaza){
	this.libre= new boolean [10];
	
	
}

public int getNumplaza() {
	return numplaza;
}

public void setNumplaza(int numplaza) {
	this.numplaza = numplaza;
}



public static int getNumcoche() {
	return numcoche;
}

public static void setNumcoche(int numcoche) {
	Plaza.numcoche = numcoche;
}

public static String  aparcar() {
	int i=+1;
	if(libre[i]=true) {
		for( i=0; i<i;i++) {
			libre[i]=false;
		numcoche++;
		aux="COCHE SE HA APARCADO";
		}
	}else if(libre[i]==false) {
		aux=" PLAZA YA OCUPADA POR OTRO COCHE";
	}
	return aux;
}

}
