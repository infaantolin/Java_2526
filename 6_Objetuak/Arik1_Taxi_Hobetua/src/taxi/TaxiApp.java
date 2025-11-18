package taxi;

public class TaxiApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Taxi t1 = new Taxi("1234-ABC", "Bilbao", 1);
		Taxi t2 = new Taxi("5555-XYZ", "Barakaldo", 2);

		System.out.println(t1);
		System.out.println(t2);

		if (t1.motorMotaBerdinaDa(t2)) {
			System.out.println("Bi taxiek motor mota bera dute.");
		} else {
			System.out.println("Ez dute motor mota bera.");
		}

	}

}
