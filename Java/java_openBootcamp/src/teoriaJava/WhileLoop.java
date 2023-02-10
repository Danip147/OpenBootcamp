package teoriaJava;

public class WhileLoop {

	public static void main(String[] args) {
		
		boolean check = true;
		
		int contador = 0;
		
		while(contador < 10) { // para que entre en el bucle la condicion debe ser TRUE.
			System.out.println(contador + " Hola mundo");
			contador++; // condicicion que va hacer que la condicion se vaya modificando 
		}

		System.out.println("Fin");
	}

}
