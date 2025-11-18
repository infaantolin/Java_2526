package ariketak_1;

import java.util.Scanner;

public class Arik_4a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] izenak = new String[5];
		double[] notak = new double[5];

		// Datuak sartu
		for (int i = 0; i < izenak.length; i++) {
			System.out.print("Sartu ikaslearen izena eta abizenak: ");
			izenak[i] = sc.nextLine();

			double nota;
			do {
				System.out.print("Sartu nota (0-10): ");
				nota = sc.nextDouble();
				sc.nextLine();
			} while (nota < 0 || nota > 10);

			notak[i] = nota;
		}

		// Zerrenda erakutsi
		System.out.println("\n--- IKASLEEN ZERRENDA ---");
		for (int i = 0; i < izenak.length; i++) {
			System.out.println(izenak[i] + " - " + notak[i]);
		}

		// Batezbestekoa kalkulatu
		double batura = 0;
		for (double n : notak)
			batura += n;
		double batezbestekoa = batura / notak.length;
		System.out.println("\nKlasearen batezbestekoa: " + batezbestekoa);

		// Batezbestekoa baino handiagoak
		System.out.println("\nBatezbestekoa baino handiagoak:");
		for (int i = 0; i < notak.length; i++) {
			if (notak[i] > batezbestekoa) {
				System.out.println(izenak[i] + " - " + notak[i]);
			}
		}

		// Maximoa
		double max = notak[0];
		for (double n : notak)
			if (n > max)
				max = n;
		System.out.println("\nNota altuena: " + max);
		for (int i = 0; i < notak.length; i++) {
			if (notak[i] == max) {
				System.out.println(izenak[i]);
			}
		}

		// Minimoa
		double min = notak[0];
		for (double n : notak)
			if (n < min)
				min = n;
		System.out.println("\nNota txikiena: " + min);
		for (int i = 0; i < notak.length; i++) {
			if (notak[i] == min) {
				System.out.println(izenak[i]);
			}
		}

		sc.close();
	}
}