package teoriaJava;

public class Coche {
	
	// Atributos 
	String marca;
	String modelo;
	String color;
	String peso;
	int numeroPuertas;
	Integer velocidad = 0;

	
	// Constructor vacio
	public Coche() {
		
	}

	// Constructor con parametros
	public Coche(String marca, String modelo, String color, String peso, int numeroPuertas) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.peso = peso;
		this.numeroPuertas = numeroPuertas;
		
	}
	// Constructor de copia
	public Coche(Coche c) {
		super();
		this.marca = c.marca;
		this.modelo = c.modelo;
		this.color = c.color;
		this.peso = c.peso;
		this.numeroPuertas = c.numeroPuertas;
		
	}
	
	

	// getters y setters
	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getPeso() {
		return peso;
	}


	public void setPeso(String peso) {
		this.peso = peso;
	}


	public int getNumeroPuertas() {
		return numeroPuertas;
	}


	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}


	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", peso=" + peso
				+ ", numeroPuertas=" + numeroPuertas + "]";
	}
	
	
	
	// Metodos adicionales
	
	public void acelerar(Integer cantidad) {
		if (cantidad > 0 && cantidad <= 120) {
			this.velocidad += cantidad;
		}
	}
	
}
