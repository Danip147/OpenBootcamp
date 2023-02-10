package tiposDeDatos;

public class Funciones {


	public static void holaMundo() {
		System.out.println("Hola mundo desde un método");
		
	}
	
	protected static void holaMundo(String name) {
		System.out.println("Hola " + name);
		
	}
	
	private static String devolverHola() {
		return "Hola";
		
	}
	


	
	public static void main(String[] args) {
		
		System.out.println("Hola Mundo");
		System.out.println("Hola Mundo");
		
		holaMundo();
		holaMundo();
		
		holaMundo("Dani"); // pasando argumento por parametro
		holaMundo("Natalia"); // pasando argumento por parametro
		
		String hola = devolverHola();
		System.out.println(hola);
		
		
	}
}
