package teoriaJava;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor introduce un nombre: ");
		String nombre = sc.nextLine();
		
		System.out.println("Por favor introduce un número: ");
		int numero = sc.nextInt();
		
		System.out.println("El nombre introducido es: " + nombre);
		System.out.println("El número introducido es: " + numero);
		 
		
		sc.close();

	}

}
