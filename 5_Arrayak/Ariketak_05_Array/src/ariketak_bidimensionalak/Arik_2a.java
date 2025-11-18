package ariketak_bidimensionalak;

// Enpresako langileen taula

public class Arik_2a {

	static final int SAILAK = 10;
	static final int KATEGORIAK = 5;

	public static void main(String[] args) {
		// Datuak eskuz edo ausaz kargatu
		int[][] langileak = { { 2, 2, 1, 3, 1 }, { 0, 1, 4, 1, 2 }, { 0, 1, 3, 4, 6 }, { 2, 1, 3, 0, 0 },
				{ 1, 1, 0, 1, 2 }, { 2, 0, 0, 0, 0 }, { 3, 1, 1, 1, 1 }, { 0, 2, 0, 2, 0 }, { 1, 1, 0, 2, 0 },
				{ 0, 0, 0, 1, 2 } };

		System.out.println("LANGILEEN BANAKETA TAULA:\n");
		erakutsiTaula(langileak);

		int[] sailGuztira = kalkulatuSailGuztira(langileak);
		int[] kategoriaGuztira = kalkulatuKategoriaGuztira(langileak);
		int guztira = kalkulatuEnpresaGuztira(langileak);

		System.out.println("\nSAILEN GUZTIRA:");
		for (int i = 0; i < sailGuztira.length; i++) {
			System.out.printf("Saila %d: %d langile\n", i + 1, sailGuztira[i]);
		}

		System.out.println("\nKATEGORIAREN GUZTIRA:");
		for (int j = 0; j < kategoriaGuztira.length; j++) {
			System.out.printf("Kategoria %d: %d langile\n", j + 1, kategoriaGuztira[j]);
		}

		System.out.println("\nENPRESAKO LANGILE GUZTIRA: " + guztira);
	}

	// Taula formatuan erakutsi
	public static void erakutsiTaula(int[][] matrizea) {
		System.out.print("SAIL\\KAT\t");
		for (int k = 1; k <= KATEGORIAK; k++) {
			System.out.printf("%4d", k);
		}
		System.out.println("  Guztira");

		for (int i = 0; i < SAILAK; i++) {
			int batura = 0;
			System.out.printf("%4d\t", i + 1);
			for (int j = 0; j < KATEGORIAK; j++) {
				System.out.printf("%4d", matrizea[i][j]);
				batura += matrizea[i][j];
			}
			System.out.printf("  %4d\n", batura);
		}

		// Kategoria guztira lerroa
		System.out.print("Tot:\t");
		int[] kategoriak = kalkulatuKategoriaGuztira(matrizea);
		for (int v : kategoriak) {
			System.out.printf("%4d", v);
		}
		System.out.printf("  %4d\n", kalkulatuEnpresaGuztira(matrizea));
	}

	public static int[] kalkulatuSailGuztira(int[][] matrizea) {
		int[] emaitza = new int[SAILAK];
		for (int i = 0; i < SAILAK; i++) {
			int batura = 0;
			for (int j = 0; j < KATEGORIAK; j++) {
				batura += matrizea[i][j];
			}
			emaitza[i] = batura;
		}
		return emaitza;
	}

	public static int[] kalkulatuKategoriaGuztira(int[][] matrizea) {
		int[] emaitza = new int[KATEGORIAK];
		for (int j = 0; j < KATEGORIAK; j++) {
			int batura = 0;
			for (int i = 0; i < SAILAK; i++) {
				batura += matrizea[i][j];
			}
			emaitza[j] = batura;
		}
		return emaitza;
	}

	public static int kalkulatuEnpresaGuztira(int[][] matrizea) {
		int guztira = 0;
		for (int[] sail : matrizea) {
			for (int langile : sail) {
				guztira += langile;
			}
		}
		return guztira;
	}
}