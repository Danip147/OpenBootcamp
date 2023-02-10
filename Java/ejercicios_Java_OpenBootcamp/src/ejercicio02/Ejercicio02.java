package ejercicio02;

public class Ejercicio02 {

	
	public static double precioIva(double precio) {
		final double IVA = (1 + 0.21);
		
		return precio * IVA;
	}
	
	
	public static void main(String[] args) {
		double precioIva = precioIva(10);
		System.out.println("El precio final del producto con iva includo es: " + precioIva + " € ");

	}

}
