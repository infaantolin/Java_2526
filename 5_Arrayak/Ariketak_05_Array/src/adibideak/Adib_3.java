package adibideak;

public class Adib_3 {

	public static void main(String[] args) {
		String[] astekoEgunak = { "Al", "Ar", "Az", "Og", "Or", "Lr", "Ig" };

		astekoEgunakIdatzi(astekoEgunak);

	}

	public static void astekoEgunakIdatzi(String[] aEgunak) {
		System.out.println("Array-aren edukia hau da:");

//		for (int i = 0; i < aEgunak.length; i++) { // Modu 1
//			System.out.println((i+1) + " asteko eguna: " + aEgunak[i]);
//		}
			for(String eguna:aEgunak) { // Modu 2
			   System.out.println("Asteko eguna: " + eguna);
			}

	}

}
