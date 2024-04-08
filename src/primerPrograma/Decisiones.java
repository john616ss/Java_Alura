package primerPrograma;

public class Decisiones {

	public static void main(String[] args) {
		int fechaDeLanzamiento = 1999;
		boolean incluidoEnELPlan = true;
		double notaDeLaPelicula = 8.2;
		
		if (fechaDeLanzamiento > 2022) {
			System.out.println("");
			System.out.println("Péliculas más populares.");
		} else {
			System.out.println("");
			System.out.println("Péliculas retro que aún vale la pena ver.");
		}
	}
}
