package ariketak_bidimensionalak;
// Bankuak eta auzoak (bezero kopurua)

public class Arik_3 {

	static final int BANKUAK = 6;
	static final int AUZOAK = 7;

	static String[] bankuIzenak = { "BBVA", "BBK", "LA CAIXA", "EUSK. KUTXA", "SANTANDER", "KUTXA" };

	static String[] auzoIzenak = { "Deustu", "Uribarri", "Otxarkoaga", "Begoña", "Abando", "Errekalde", "Basurtu" };

	public static void main(String[] args) {
		// Bezero kopuruak (ausaz edo eskuz)
		int[][] bezeroak = { { 120, 90, 60, 50, 150, 70, 80 }, { 100, 80, 50, 40, 120, 60, 75 },
				{ 90, 60, 55, 45, 100, 65, 70 }, { 80, 70, 40, 50, 90, 55, 60 }, { 110, 95, 70, 65, 160, 80, 100 },
				{ 60, 40, 30, 25, 75, 50, 45 } };

		System.out.println("BEZEROEN BANAKETA:\n");
		datuakAurkeztu(bezeroak);

		int[] bankuTot = bezeroKopBankuko(bezeroak);
		int[] auzoTot = bezeroKopAuzoko(bezeroak);

		System.out.println("\nBANKU BAKOITZEKO BEZERO GUZTIRA:");
		for (int i = 0; i < bankuIzenak.length; i++) {
			System.out.printf("%-12s %d\n", bankuIzenak[i], bankuTot[i]);
		}

		System.out.println("\nAUZO BAKOITZEKO BEZERO GUZTIRA:");
		for (int j = 0; j < auzoIzenak.length; j++) {
			System.out.printf("%-12s %d\n", auzoIzenak[j], auzoTot[j]);
		}

		System.out.println("\nORDENATUTA (handienetik txikienera):");
		bezeroakBankukoOrdenatutaAurkeztu(bankuTot, bankuIzenak);
	}

	// Bezeroen guztira bankuka
	public static int[] bezeroKopBankuko(int[][] matrizea) {
		int[] tot = new int[BANKUAK];
		for (int i = 0; i < BANKUAK; i++) {
			int batura = 0;
			for (int j = 0; j < AUZOAK; j++) {
				batura += matrizea[i][j];
			}
			tot[i] = batura;
		}
		return tot;
	}

	// Bezeroen guztira auzoka
	public static int[] bezeroKopAuzoko(int[][] matrizea) {
		int[] tot = new int[AUZOAK];
		for (int j = 0; j < AUZOAK; j++) {
			int batura = 0;
			for (int i = 0; i < BANKUAK; i++) {
				batura += matrizea[i][j];
			}
			tot[j] = batura;
		}
		return tot;
	}

	// Datuak taula moduan aurkeztu
	public static void datuakAurkeztu(int[][] matrizea) {
		System.out.print("Bankua\\Auzoa\t");
		for (String auzo : auzoIzenak) {
			System.out.printf("%-10s", auzo);
		}
		System.out.println("GUZTIRA");

		for (int i = 0; i < BANKUAK; i++) {
			int batura = 0;
			System.out.printf("%-12s", bankuIzenak[i]);
			for (int j = 0; j < AUZOAK; j++) {
				System.out.printf("%-10d", matrizea[i][j]);
				batura += matrizea[i][j];
			}
			System.out.println(batura);
		}
	}

	// Ordenatu bankuak bezero kopuruaren arabera (handienetik txikienera)
	public static void bezeroakBankukoOrdenatutaAurkeztu(int[] bezeroTot, String[] bankuIzenak) {
		// Burbuila ordenamendua (descendente)
		for (int i = 0; i < bezeroTot.length - 1; i++) {
			for (int j = 0; j < bezeroTot.length - 1 - i; j++) {
				if (bezeroTot[j] < bezeroTot[j + 1]) {
					int aux = bezeroTot[j];
					bezeroTot[j] = bezeroTot[j + 1];
					bezeroTot[j + 1] = aux;

					String auxIzena = bankuIzenak[j];
					bankuIzenak[j] = bankuIzenak[j + 1];
					bankuIzenak[j + 1] = auxIzena;
				}
			}
		}

		for (int i = 0; i < bezeroTot.length; i++) {
			System.out.printf("%-12s %d\n", bankuIzenak[i], bezeroTot[i]);
		}
	}
}