package desafios;

public class DesafioUno {
	
	public static void main(String[] args) {
		
		double celsius = 30.23;
		double fahrenheit = (celsius * 1.8) + 32;
		
		System.out.println("conversion de temperatura en grados Celsius a Fahrenheit");
		System.out.println("Grados celsius " +celsius + " a grados Fahrenheit es: "+fahrenheit);
		System.out.println("Casteando temperatura Fahrenheit");
		int castFahrenheit = (int)fahrenheit;
		System.out.println(castFahrenheit);
		
	}

}
