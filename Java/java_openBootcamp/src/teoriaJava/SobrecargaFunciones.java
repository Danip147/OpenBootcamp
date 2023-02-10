package teoriaJava;

public class SobrecargaFunciones {

	// Sobrecargar es cuando la funcion tiene el mismo nombre pero el tipo de dato que le entra
	// (parametros) es DISTINTO.
	
	// Misma funcion que ofrece distintas opciones
	
	
	public static int suma(int n1, int n2) {
		return n1 + n2; 
	}
	
	public static double suma(double n1, double n2) {
		return n1 + n2; 
	}
	
	
	
	public static void main(String[] args) {
		int suma1 = suma(2,2);
		System.out.println(suma1);
		
		double suma2 = suma(2.4, 4.2);
		System.out.println(suma2);
		
	}

}
