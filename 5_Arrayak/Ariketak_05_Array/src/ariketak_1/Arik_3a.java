package ariketak_1;

public class Arik_3a {

	public static void main(String[] args) {
		int[] taula = new int[20];

		// Taula ausazko balioekin (1-9)
		for (int i = 0; i < taula.length; i++) {
			taula[i] = (int) (Math.random() * 9) + 1;
		}

		// Edukia erakutsi
		System.out.print("Taularen edukia: ");
		for (int n : taula) {
			System.out.print(n + " ");
		}
		System.out.println();

		// Maiztasunak kalkulatu
		for (int i = 1; i <= 9; i++) {
			int kont = 0;
			for (int n : taula) {
				if (n == i)
					kont++;
			}
			System.out.println(i + " kopurua: " + kont);
		}
	}
}
