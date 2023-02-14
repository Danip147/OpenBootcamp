package cochePoo;

public class CocheElectrico extends Coche {

	private String motorElectrico;

	public CocheElectrico() {
		
	}

	public CocheElectrico(String motorElectrico) {
		this.motorElectrico = motorElectrico;
	}

	public CocheElectrico(String marca, String modelo, String color, String peso, int numeroPuertas, String motorElectrico) {
		super(marca, modelo, color, peso, numeroPuertas);
		this.motorElectrico = motorElectrico;
	}
	
	

	public String getMotorElectrico() {
		return motorElectrico;
	}

	public void setMotorElectrico(String motorElectrico) {
		this.motorElectrico = motorElectrico;
	}

	@Override
	public String toString() {
		return "CocheElectrico [motorElectrico=" + motorElectrico + ", getMotorElectrico()=" + getMotorElectrico()
				+ ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo() + ", getColor()=" + getColor()
				+ ", getPeso()=" + getPeso() + ", getNumeroPuertas()=" + getNumeroPuertas() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	
	
}
