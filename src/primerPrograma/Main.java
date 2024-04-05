package primerPrograma;
/**
 * @author John
 *
 */
public class Main {

	public static void main(String[] args) {
		//System.out.println("¡Hola Mundo!");
		System.out.println("Bienvenido(a) a Screen Match");
		System.out.println("Pelicula: Matrix");
		int fechaDeLanzamiento = 1999;
		boolean incluidoEnELPlan = true;
		double notaDeLaPelicula = 8.2;
		
		double media = (8.2 + 6.0 + 9.0)/3;
		System.out.println(media);
		
		String sinopsis = """
				Matrix es uan paradoja 
                La mejor pelicula del fin del milenio
                Fue lanzada en: """ + fechaDeLanzamiento;
		System.out.println(sinopsis);
		
		
		int clasificacion = (int) media/2;
		System.out.println(clasificacion);
		
		
	}
}
