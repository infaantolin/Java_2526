package pertsona;

public class PertsonaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pertsona p1 = new Pertsona("Ane", "Lopez", 22, false, "12345678A");
		Pertsona p2 = new Pertsona("Jon", "Garcia", 30, true, "11111111B");

		System.out.println(p1);
		System.out.println(p2);

		if (p1.zaharragoaDa(p2)) {
			System.out.println("Ane zaharragoa da.");
		} else if (p2.zaharragoaDa(p1)) {
			System.out.println("Jon zaharragoa da.");
		} else {
			System.out.println("Biek adin bera dute.");
		}
	}

}
