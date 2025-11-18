package ariketak_bidimensionalak;
// 3 ikasle eta 4 irakasgaien notak gordetzen dituen array bat sortu, eta bakoitzaren batezbestekoa kalkulatu.

import java.util.Scanner;

public class NotakMatrizea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int IKASLEAK = 3;
		final int ASIGNATURAK = 4;

		double[][] notak = new double[IKASLEAK][ASIGNATURAK];
		String[] ikasleak = { "Ane", "Jon", "Maite" };
		String[] irakasgaiak = { "PROG", "BD", "SI", "FOL" };

		// Datuak sartzea
		for (int i = 0; i < IKASLEAK; i++) {
			System.out.println("\n" + ikasleak[i] + " ikaslearen notak sartu:");
			for (int j = 0; j < ASIGNATURAK; j++) {
				System.out.print(irakasgaiak[j] + ": ");
				notak[i][j] = sc.nextDouble();
			}
		}

		// Emaitzak erakutsi eta batezbestekoak kalkulatu
		System.out.println("\nIkasleen notak eta batezbestekoak:");
		System.out.printf("%-10s", "Ikaslea");
		for (String irakasgai : irakasgaiak) {
			System.out.printf("%8s", irakasgai);
		}
		System.out.printf("%10s\n", "Batezbestekoa");

		for (int i = 0; i < IKASLEAK; i++) {
			double batura = 0;
			System.out.printf("%-10s", ikasleak[i]);
			for (int j = 0; j < ASIGNATURAK; j++) {
				System.out.printf("%8.2f", notak[i][j]);
				batura += notak[i][j];
			}
			double batazbestekoa = batura / ASIGNATURAK;
			System.out.printf("%10.2f\n", batazbestekoa);
		}

		sc.close();
	}
}
