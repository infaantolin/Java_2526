package ariketak_Bilaketa;

import java.util.Scanner;

public class OrdenaketaBilaketa {

	static final int ERR = 5;
	static final int ZUT = 2;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matrizea = new int[ERR][ZUT];
		int kopurua = 0;

		int aukera;
		do {
			System.out.println("\n===========================");
			System.out.println("     MATRIZEAREN MENUA");
			System.out.println("===========================");
			System.out.println("1. Sartu balioa");
			System.out.println("2. Aurkitu balioa (bilaketa sekuentziala)");
			System.out.println("3. Ezabatu balioa");
			System.out.println("4. Ordenatu balioak (burbuila)");
			System.out.println("5. Bilatu balioa (bilaketa bitarra)");
			System.out.println("6. Irten");
			System.out.print("Aukeratu aukera: ");
			aukera = sc.nextInt();

			switch (aukera) {
			case 1 -> kopurua = sartuBalioa(matrizea, kopurua, sc);
			case 2 -> aurkituBalioa(matrizea, sc);
			case 3 -> kopurua = ezabatuBalioa(matrizea, kopurua, sc);
			case 4 -> ordenatuBurbuila(matrizea);
			case 5 -> bilaketaBitarra(matrizea, sc);
			case 6 -> System.out.println("Programa amaitzen...");
			default -> System.out.println("Aukera baliogabea. Saiatu berriro.");
			}

			erakutsiMatrizea(matrizea);
		} while (aukera != 6);

		sc.close();
	}

	// 1️⃣ Sartu balioa
	public static int sartuBalioa(int[][] m, int kop, Scanner sc) {
		if (kop == ERR * ZUT) {
			System.out.println("KONTUZ! Ez dago leku libre gehiago.");
			return kop;
		}

		System.out.print("Sartu zenbaki oso bat: ");
		int balioa = sc.nextInt();

		// Begiratu ea dagoen
		for (int i = 0; i < ERR; i++) {
			for (int j = 0; j < ZUT; j++) {
				if (m[i][j] == balioa) {
					System.out.println("KONTUZ! Balio hori dagoeneko sartuta dago.");
					return kop;
				}
			}
		}

		// Sartu lehen posizio librean
		for (int i = 0; i < ERR; i++) {
			for (int j = 0; j < ZUT; j++) {
				if (m[i][j] == 0) {
					m[i][j] = balioa;
					System.out.println("Balioa gehitu da [" + i + "][" + j + "]");
					return kop + 1;
				}
			}
		}
		return kop;
	}

	// 2️⃣ Bilaketa sekuentziala
	public static void aurkituBalioa(int[][] m, Scanner sc) {
		System.out.print("Bilatu nahi duzun zenbakia: ");
		int balioa = sc.nextInt();
		boolean aurkitua = false;

		for (int i = 0; i < ERR; i++) {
			for (int j = 0; j < ZUT; j++) {
				if (m[i][j] == balioa) {
					System.out.println("Balioa aurkitu da [" + i + "][" + j + "]");
					aurkitua = true;
				}
			}
		}

		if (!aurkitua)
			System.out.println("Ez da aurkitu balioa.");
	}

	// 3️⃣ Ezabatu balioa
	public static int ezabatuBalioa(int[][] m, int kop, Scanner sc) {
		System.out.print("Ezabatu nahi duzun zenbakia: ");
		int balioa = sc.nextInt();
		for (int i = 0; i < ERR; i++) {
			for (int j = 0; j < ZUT; j++) {
				if (m[i][j] == balioa) {
					m[i][j] = 0;
					System.out.println("Balioa ezabatu da [" + i + "][" + j + "]");
					return kop - 1;
				}
			}
		}
		System.out.println("Ez da aurkitu balioa ezabatzeko.");
		return kop;
	}

	// 4️⃣ Ordenatu burbuila (matrize osoa linealizatu eta ordenatu)
	public static void ordenatuBurbuila(int[][] m) {
		int[] lineala = bihurtuLineal(m);
		boolean aldaketa;

		for (int i = 0; i < lineala.length - 1; i++) {
			aldaketa = false;
			for (int j = 0; j < lineala.length - i - 1; j++) {
				if (lineala[j] > lineala[j + 1]) {
					int aux = lineala[j];
					lineala[j] = lineala[j + 1];
					lineala[j + 1] = aux;
					aldaketa = true;
				}
			}
			if (!aldaketa)
				break; // ez da aldaketarik → ordenatuta dago
		}

		// berriz matrizean sartu
		int k = 0;
		for (int i = 0; i < ERR; i++) {
			for (int j = 0; j < ZUT; j++) {
				m[i][j] = lineala[k++];
			}
		}

		System.out.println("Matrizea burbuila bidez ordenatu da (txikienetik handienera).");
	}

	// 5️⃣ Bilaketa bitarra
	public static void bilaketaBitarra(int[][] m, Scanner sc) {
		int[] lineala = bihurtuLineal(m);
		System.out.print("Sartu bilatu nahi duzun zenbakia (ordenatuta dagoela suposatuta): ");
		int bilatu = sc.nextInt();

		int ezk = 0, esk = lineala.length - 1;
		boolean aurkitua = false;
		while (ezk <= esk) {
			int erd = (ezk + esk) / 2;
			if (lineala[erd] == bilatu) {
				System.out.println("Balioa aurkitu da posizio linealean " + erd + " (balioa: " + lineala[erd] + ")");
				aurkitua = true;
				break;
			} else if (lineala[erd] < bilatu) {
				ezk = erd + 1;
			} else {
				esk = erd - 1;
			}
		}

		if (!aurkitua)
			System.out.println("Balioa ez dago matrizean (bilaketa bitarra).");
	}

	// Laguntza: matrize bidimentsionala array lineal batean bihurtu
	public static int[] bihurtuLineal(int[][] m) {
		int[] lineala = new int[ERR * ZUT];
		int k = 0;
		for (int i = 0; i < ERR; i++) {
			for (int j = 0; j < ZUT; j++) {
				lineala[k++] = m[i][j];
			}
		}
		return lineala;
	}

	// Laguntza: matrizearen egoera erakutsi
	public static void erakutsiMatrizea(int[][] m) {
		System.out.println("\nMatrizearen egoera:");
		for (int i = 0; i < ERR; i++) {
			for (int j = 0; j < ZUT; j++) {
				System.out.printf("%4d", m[i][j]);
			}
			System.out.println();
		}
	}
}