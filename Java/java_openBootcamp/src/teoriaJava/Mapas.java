package teoriaJava;

import java.util.HashMap;
import java.util.Map;

public class Mapas {

	public static void main(String[] args) {
		
		Map<String, String> personas = new HashMap<>();
		
		personas.put("4867261C" , "Nombre Apellido 1");
		personas.put("1467261C" , "Nombre Apellido 2");
		personas.put("8467261C" , "Nombre Apellido 2");
		
		System.out.println(personas);
		
		for(String key :  personas.keySet()) {
			System.out.println(key);
		}
		
		for(String value :  personas.values()) {
			System.out.println(value);
		}

	}

}
