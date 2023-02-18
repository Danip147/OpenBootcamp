package teoriaJava;

import java.util.ArrayList;
import java.util.List;

import cochePoo.Coche;
import cochePoo.CocheElectrico;

public class Listas {

	public static void main(String[] args) {
		
		List<String> nombre = new ArrayList<>();

		nombre.add("Daniel");
		nombre.add("Paco");
		nombre.add("Pepito");
		
		nombre.stream()
			.forEach(e -> System.out.println(e));
		
		nombre.stream()
			.filter(e -> e.contains("D"))
			.forEach(e -> System.out.println(e));
		
		
		List<Coche> coches = new ArrayList<>();
		
		coches.add(new CocheElectrico("Motor EMC"));
		coches.add(new CocheElectrico("Motor EJF"));
		coches.add(new CocheElectrico("Motor MFZ"));
		
		coches.stream()
			.forEach(e -> System.out.println(e));
		
		
		
	}

}
