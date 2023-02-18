package teoriaJava;

public class StringMain {

	public static void main(String[] args) {
		
		//La clase String
		
		/*
			length()
			startsWith("")
			endsWith("")
			indexOf("")
			subString(1,5)
			trim()
			equals
			compareTo()
		
		 */
		
		String mensaje = "  Hola mundo   ";
		String mensaje2 = " Adios mundo";
		
		System.out.println(mensaje.length());						// Longitud 
		System.out.println(mensaje.toUpperCase());					// Pasa a mayúsculas
		System.out.println(mensaje.trim());							// Quita espacios delante y por detrás
		if(mensaje.equals(mensaje2)) {								// Equals compara
			System.out.println("Los mensajes son iguales");
		}else {
			System.out.println("Los mensajes son diferentes");
		}
	}

}
