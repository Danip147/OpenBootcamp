package teoriaJava;

public class Arrays {

	public static void main(String[] args) {
		
		int[] notas = new int[10];
		
//		int[] notas = {3,6,10,4,7,8,3,9};
		
		notas[0] = 3 ; 
		notas[1] = 9 ;
		notas[2] = 5 ;
		notas[3] = 4 ;
		notas[4] = 7 ;
		notas[5] = 9 ;
		notas[6] = 8 ;
		notas[7] = 9 ;
		notas[8] = 1 ;
		notas[9] = 8 ;
		
		System.out.println(notas[2]);	  // DEVUELVE EL 5
		
		
		// RECORRER ARRAY bucle For
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
		
		// RECORRER ARRAY forEach
		
		for(int nota : notas) {
			System.out.println(nota);
		}
		
		

	}

}
