package taxi;

public class TaxiApp {

	public static void main(String[] args) {
		
		// Taxi objektu bat sortu
		Taxi t1 = new Taxi();

		// Datuak ezarri
		t1.setMatrikula("1234-ABC");
		t1.setUdalerria("Bilbao");
		t1.setMotoreMota(1);

		// Datuak pantailan erakutsi
		System.out.println("=== TAXI INFORMAZIOA ===");
		System.out.println("Probintzia: " + t1.getProbintzia());
		System.out.println("Matrikula: " + t1.getMatrikula());
		System.out.println("Udalerria: " + t1.getUdalerria());

		int mota = t1.getMotoreMota();
		if (mota == 1)
			System.out.println("Motorea: Diesel");
		else if (mota == 2)
			System.out.println("Motorea: Gasolina");
		else
			System.out.println("Motorea: Ezezaguna");
	}

}
