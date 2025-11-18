package ariketak_1;

public class Arik_2metodoekin {

	// Sortu 1-100 arteko ausazko zenbaki bat
	public static int sortuZenbakia() {
		return (int) (Math.random() * 100) + 1;
	}

	// Array bete ausazko zenbakiekin
	public static void taulaKargatu(int[] zenbakiak) {
		for (int i = 0; i < zenbakiak.length; i++) {
			zenbakiak[i] = sortuZenbakia();
		}
	}

	// Posizio bikoitien batura
	public static int bikoitiakBatu(int[] zenbakiak) {
		int batura = 0;
		for (int i = 0; i < zenbakiak.length; i++) {
			if (i % 2 == 0) {
				batura += zenbakiak[i];
			}
		}
		return batura;
	}

	// Posizio bakoitien produktua
	public static long bakoitiakBiderkatu(int[] zenbakiak) {
		long produktua = 1;
		for (int i = 0; i < zenbakiak.length; i++) {
			if (i % 2 != 0) {
				produktua *= zenbakiak[i];
			}
		}
		return produktua;
	}

	// Datu guztiak inprimatu
	public static void datuakInprimatu(int[] zenbakiak, int batura, long produktua) {
		System.out.print("Array edukia: ");
		for (int n : zenbakiak) {
			System.out.print(n + " ");
		}
		System.out.println("\n\nPosizio bikoitien batura: " + batura);
		System.out.println("Posizio bakoitien produktua: " + produktua);
	}

	public static void main(String[] args) {
		int[] zenbakiak = new int[20];

		taulaKargatu(zenbakiak);
		int batura = bikoitiakBatu(zenbakiak);
		long produktua = bakoitiakBiderkatu(zenbakiak);

		datuakInprimatu(zenbakiak, batura, produktua);
	}
}
