package ariketak_1;

public class Arik_3metodoekin {
	// Arraya ausazko balioekin sortu
	public static int[] taulaKargatu(int tamaina, int balioMin, int balioMax) {
		int[] taula = new int[tamaina];
		for (int i = 0; i < taula.length; i++) {
			taula[i] = (int) (Math.random() * (balioMax - balioMin + 1)) + balioMin;
		}
		return taula;
	}

	// Array edukia erakutsi
	public static void arrayInprimatu(int[] taula) {
		System.out.print("Taularen edukia: ");
		for (int n : taula) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

	// Maiztasunak erakutsi
	public static void maiztasunaErakutsi(int[] taula) {
		for (int i = 1; i <= 9; i++) {
			int kont = 0;
			for (int n : taula) {
				if (n == i)
					kont++;
			}
			System.out.println(i + " kopurua: " + kont);
		}
	}

	public static void main(String[] args) {
		int[] taula = taulaKargatu(20, 1, 9);
		arrayInprimatu(taula);
		maiztasunaErakutsi(taula);
	}
}
