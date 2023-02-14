package interfaces;

import cochePoo.Coche;

public class InterfacesMain {

	public static void main(String[] args) {
		
		ICocheService service = new CocheServiceClassicImpl();
		ICocheService service2 = new CocheServiceSportImpl();
		
		Coche coche1 =service.crearCocheDemo();
		System.out.println("Creando coche clasico");
		
		Coche coche2 =service2.crearCocheDemo();

	}

}
