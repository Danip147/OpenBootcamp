package ejercicio03;

public class App {
	
	/**
	 * Primera parte:
	 * Crear una función con tres parámetros que sean números que se suman entre sí.
     * Llamar a la función en el main y darle valores.
	 * @param n1
	 * @param n2
	 * @param n3
	 * @return
	 */
	public static int sumaNumeros(int n1, int n2, int n3) {
		return n1 + n1 + n2;
	}
	
	
	public static void main(String[] args) {
		
		int resultado = sumaNumeros(15, 20, 10);
		System.out.println("El resultado de la suma es: " + resultado);
		
		Coche miCoche = new Coche();
		
		miCoche.incrementarPuertas();
		
	
		System.out.println(miCoche);

	}

}
