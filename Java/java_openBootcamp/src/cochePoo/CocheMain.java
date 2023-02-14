package cochePoo;

public class CocheMain {

	public static void main(String[] args) {
		
//		Coche audi = new Coche("Audi", "a3", "negro", "1500", 3);
//		System.out.println(audi);
//		
//		audi.acelerar(50);
//		audi.setPeso("1000");
//		
//		System.out.println(audi);
		
		CocheElectrico coche1 = new CocheElectrico();
		Coche coche2 = new CocheElectrico("Dacia", "Sandero", "rojo", "1500", 5, "v-16");
		
		
		coche1.setMotorElectrico("vze-16");
		System.out.println(coche1);
		
		System.out.println(coche2);
		
		CocheHibrido coche3 = new CocheHibrido();
		
		coche3.getModelo();
		
		System.out.println(coche3);
	}

}
