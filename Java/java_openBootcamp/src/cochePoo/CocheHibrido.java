package cochePoo;

public class CocheHibrido extends Coche {

	private String tipoCombustible;
	
	public CocheHibrido() {
		
	}

	public CocheHibrido(String marca, String modelo, String color, String peso, int numeroPuertas, String tipoCombustible) {
		super(marca, modelo, color, peso, numeroPuertas);
		this.tipoCombustible = tipoCombustible;
	}

	public String getTipoCombustible() {
		return tipoCombustible;
	}

	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}

	@Override
	public String toString() {
		return "CocheHibrido [tipoCombustible=" + tipoCombustible + "]";
	}
	
	
	
	
}
