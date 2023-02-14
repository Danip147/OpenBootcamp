package interfaces;

import cochePoo.Coche;
import cochePoo.CocheElectrico;

public class CocheServiceClassicImpl implements ICocheService{

	@Override
	public Coche crearCocheDemo() {
		
		
		return new CocheElectrico();
		
	}

	
	
}
