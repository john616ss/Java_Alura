package primerPrograma;

public class Decisiones {

	public static void main(String[] args) {
		int fechaDeLanzamiento = 1999;
		boolean incluidoEnELPlan = false; //
		double notaDeLaPelicula = 8.2;
		String tipoPlan = "Plus";
		
		if (fechaDeLanzamiento > 2022) {
			System.out.println("");
			System.out.println("Péliculas más populares.");
		} else {
			System.out.println("");
			System.out.println("Pélicula retro que aún vale la pena ver.");
		}
		
		//tipoPlan == "Plus"
		if (incluidoEnELPlan || tipoPlan.equals("Plus")) {
			System.out.println("Disfrute su pelicula");
		} else {
			System.out.println("Pelicula no disponible para su plan actual");
		}
	}
}
