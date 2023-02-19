package ejercicio03;

public class Coche {
	
	private int numPuertas;

	
	public Coche() {
		
	}


	public Coche(int numPuertas) {
		super();
		this.numPuertas = numPuertas;
	}


	public int getNumPuertas() {
		return numPuertas;
	}


	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}


	@Override
	public String toString() {
		return "El coche tiene : " + numPuertas + " puerta " ;
	}
	
	  public void incrementarPuertas() {
	        this.numPuertas++;
	    }
	
	
	
	
}


