package teoriaJava;

public class PruebaFunciones {

	public static void main(String[] args) {
		Funciones.holaMundo();            // En este caso SI me deja acceder porque la visualizacion es PUBLIC
//		Funciones.devolverHola();         // En este caso NO me deja acceder porque la visualizacion es PRIVATE
		Funciones.holaMundo();        	  // En este caso SI que puedo accder porque la visualizacion es PROTECTED
										  // si está en el mismo paquete si que puede acceder a ella.
		
	}

}
