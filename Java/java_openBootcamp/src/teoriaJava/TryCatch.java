package teoriaJava;

public class TryCatch {

	public static void main(String[] args) {			
							
		try {											// INTENTA HACER ESTO SI NO ME DICES EL FALLO Y SIGUES
			int result = 5 / 2;  						// esto falla si no estuviera dentro del try pararia el programa
			
		} catch (Exception e) {

			e.printStackTrace();						// Este es el fallo
		} finally {
			System.out.println("Cierre de recursos");   // Esto se va a ejecutar SI o SI // Cerrar los recursos
		}
		
		System.out.println("fin");

	}

}
