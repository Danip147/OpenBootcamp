package teoriaJava;

public class TryCatch {

	public static void main(String[] args) {

		try {
			int result = 5 / 2;  						// esto falla si no estuviera dentro del try pararia el programa
			
		} catch (Exception e) {

			e.printStackTrace();						// Este es el fallo
		} finally {
			System.out.println("Cierre de recursos");   // Esto se va a ejecutar haya fallo o no
		}
		
		System.out.println("fin");

	}

}
