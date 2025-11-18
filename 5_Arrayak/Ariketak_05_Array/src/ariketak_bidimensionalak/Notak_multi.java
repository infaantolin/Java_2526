package ariketak_bidimensionalak;

import java.util.Scanner;

public class Notak_multi {

	static final int IKASLE_KOP = 5;
	static final int GAIA_KOP = 3;
	static final String[] GAI_IZENAK = { "Sareak", "Datu-baseak", "Programazioa" };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] ikasleak = new String[IKASLE_KOP];
		double[][] notak = new double[IKASLE_KOP][GAIA_KOP];

		System.out.println("Sartu " + IKASLE_KOP + " ikasleren datuak:\n");

		// 1️⃣ Datuak sartu
		for (int i = 0; i < IKASLE_KOP; i++) {
			System.out.print("Ikaslearen izen-abizenak (" + (i + 1) + "): ");
			ikasleak[i] = sc.nextLine();

			for (int j = 0; j < GAIA_KOP; j++) {
				double nota;
				do {
					System.out.print("  " + GAI_IZENAK[j] + " (0-10): ");
					nota = sc.nextDouble();
				} while (nota < 0 || nota > 10);
				notak[i][j] = nota;
			}
			sc.nextLine(); // buffer garbitu
			System.out.println();
		}

		// 2️⃣ Ikasle bakoitzeko emaitzak
		System.out.println("\n--- IKASLE BAKOITZEKO EMAITZAK ---");
		for (int i = 0; i < IKASLE_KOP; i++) {
			double media = kalkulatuBatezbestekoa(notak[i]);
			System.out.println("\nIkaslea: " + ikasleak[i]);
			System.out.printf("Batezbestekoa: %.2f\n", media);

			// Suspendituak
			int suspKop = 0;
			System.out.print("Suspendituak: ");
			for (int j = 0; j < GAIA_KOP; j++) {
				if (notak[i][j] < 5) {
					System.out.print(GAI_IZENAK[j] + " ");
					suspKop++;
				}
			}
			if (suspKop == 0)
				System.out.print("Bat ere ez.");
			System.out.println();

			// Max eta min
			double max = notak[i][0];
			double min = notak[i][0];
			int gaiMax = 0;
			int gaiMin = 0;
			for (int j = 1; j < GAIA_KOP; j++) {
				if (notak[i][j] > max) {
					max = notak[i][j];
					gaiMax = j;
				}
				if (notak[i][j] < min) {
					min = notak[i][j];
					gaiMin = j;
				}
			}
			System.out.printf("Nota altuena: %.2f (%s)\n", max, GAI_IZENAK[gaiMax]);
			System.out.printf("Nota baxuena: %.2f (%s)\n", min, GAI_IZENAK[gaiMin]);
		}

		// 3️⃣ Gai bakoitzeko emaitzak
		System.out.println("\n--- GAIAREN ARABERAKO EMAITZAK ---");
		for (int j = 0; j < GAIA_KOP; j++) {
			double batura = 0;
			double max = notak[0][j];
			double min = notak[0][j];
			String maxIkaslea = ikasleak[0];
			String minIkaslea = ikasleak[0];
			int suspKop = 0;

			for (int i = 0; i < IKASLE_KOP; i++) {
				batura += notak[i][j];
				if (notak[i][j] > max) {
					max = notak[i][j];
					maxIkaslea = ikasleak[i];
				}
				if (notak[i][j] < min) {
					min = notak[i][j];
					minIkaslea = ikasleak[i];
				}
				if (notak[i][j] < 5)
					suspKop++;
			}

			double media = batura / IKASLE_KOP;
			System.out.println("\nGai: " + GAI_IZENAK[j]);
			System.out.printf("  Batezbestekoa: %.2f\n", media);
			System.out.printf("  Nota altuena: %.2f (%s)\n", max, maxIkaslea);
			System.out.printf("  Nota baxuena: %.2f (%s)\n", min, minIkaslea);
			System.out.printf("  Suspenditu kopurua: %d\n", suspKop);
		}

		// 4️⃣ Guztira orokorrak
		System.out.println("\n--- EMAITZA OROKORRAK ---");
		double baturaOrokorra = 0;
		double notaMax = notak[0][0];
		double notaMin = notak[0][0];
		String ikasleMax = ikasleak[0], ikasleMin = ikasleak[0];
		String gaiMax = GAI_IZENAK[0], gaiMin = GAI_IZENAK[0];
		int[] suspIkasle = new int[IKASLE_KOP];
		int[] suspGai = new int[GAIA_KOP];

		for (int i = 0; i < IKASLE_KOP; i++) {
			for (int j = 0; j < GAIA_KOP; j++) {
				double nota = notak[i][j];
				baturaOrokorra += nota;

				if (nota > notaMax) {
					notaMax = nota;
					ikasleMax = ikasleak[i];
					gaiMax = GAI_IZENAK[j];
				}
				if (nota < notaMin) {
					notaMin = nota;
					ikasleMin = ikasleak[i];
					gaiMin = GAI_IZENAK[j];
				}

				if (nota < 5) {
					suspIkasle[i]++;
					suspGai[j]++;
				}
			}
		}

		double mediaOrokorra = baturaOrokorra / (IKASLE_KOP * GAIA_KOP);
		System.out.printf("Batezbesteko orokorra: %.2f\n", mediaOrokorra);
		System.out.printf("Nota altuena: %.2f (%s - %s)\n", notaMax, ikasleMax, gaiMax);
		System.out.printf("Nota baxuena: %.2f (%s - %s)\n", notaMin, ikasleMin, gaiMin);

		// Ikasle eta gai “suspenditu gehien” kalkulatu
		int maxSuspIkasle = suspIkasle[0];
		String ikasleTxarrena = ikasleak[0];
		for (int i = 1; i < IKASLE_KOP; i++) {
			if (suspIkasle[i] > maxSuspIkasle) {
				maxSuspIkasle = suspIkasle[i];
				ikasleTxarrena = ikasleak[i];
			}
		}

		int maxSuspGai = suspGai[0];
		String gaiTxarrena = GAI_IZENAK[0];
		for (int j = 1; j < GAIA_KOP; j++) {
			if (suspGai[j] > maxSuspGai) {
				maxSuspGai = suspGai[j];
				gaiTxarrena = GAI_IZENAK[j];
			}
		}

		System.out.println("Suspentso gehien izan dituen ikaslea: " + ikasleTxarrena + " (" + maxSuspIkasle + ")");
		System.out.println("Suspentso gehien izan duen ikasgaia: " + gaiTxarrena + " (" + maxSuspGai + ")");
		
		sc.close();
	}

	// Metodo lagungarria
	public static double kalkulatuBatezbestekoa(double[] notak) {
		double batura = 0;
		for (double n : notak)
			batura += n;
		return batura / notak.length;
	}
}