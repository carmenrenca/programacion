package ejercicios.ejericicio1;

public class meinDVD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dvd_cine dvd1;
		Dvd_cine dvd2;
		dvd1 = new Dvd_cine();
		dvd2 = new Dvd_cine();
		
		dvd1.setnombre("Animales fantasticos");
		dvd1.setdirector(" jk ");
		dvd1.setactores("Con David Heyman y David Yates");
		dvd1.setgenero("THRILLER");
		dvd1.setduracion("130");
		dvd1.setresumen("Basada en la obra de J.K. Rowling. Un aprendiz de mago debe impedir que un artefacto mágico caiga en malévolas manos.");
		
		dvd2.setnombre("El corredor del laberinto");
		dvd2.setdirector("Wes Ball");
		dvd2.setactores("Dylan O'Brien");
		dvd2.setgenero("Acción");
		dvd2.setduracion("170");
	   dvd2.setresumen("");
		System.out.println(dvd1.muestradvd_cine());
		System.out.println("La pelicula pertenece a thriller: "+dvd1.esthriller());
		System.out.println("tiene resumen "+ dvd1.tieneresumen());
		System.out.println(dvd1.muestraduracion());
		
		System.out.println(dvd2.muestradvd_cine());
		System.out.println("La pelicula pertenece a thriller: "+dvd2.esthriller());
		System.out.println("tiene resumen "+ dvd2.tieneresumen());
		System.out.println(dvd2.muestraduracion());
		
		
	}

}
