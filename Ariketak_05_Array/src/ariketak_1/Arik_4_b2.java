package ariketak_1;

import java.util.Scanner;

public class Arik_4_b2 {

	// 1. Metodoa: ikasleen izenak kargatu
	public static String[] arrayIzenakKargatu() {
		Scanner sc = new Scanner(System.in);
		String[] izenak = new String[10];

		for (int i = 0; i < izenak.length; i++) {
			System.out.print("Sartu " + (i + 1) + ". ikaslearen izena: ");
			izenak[i] = sc.nextLine();
		}

		sc.close();

		return izenak;
	}

	// 2. Metodoa: notak kargatu (0-10 artean balidatuta)
	public static double[] arrayNotakKargatu() {
		Scanner sc = new Scanner(System.in);
		double[] notak = new double[10];

		for (int i = 0; i < notak.length; i++) {
			double nota;
			do {
				System.out.print("Sartu " + (i + 1) + ". ikaslearen nota (0-10): ");
				nota = sc.nextDouble();
			} while (nota < 0 || nota > 10);

			notak[i] = nota;
		}
		
		sc.close();

		return notak;
	}

	// 3. Metodoa: izenak eta notak aurkeztu
	public static void datuGuztiakAurkeztu(String[] izenak, double[] notak) {
		System.out.println("\n--- IKASLEEN DATUAK ---");
		for (int i = 0; i < izenak.length; i++) {
			System.out.println(izenak[i] + " - " + notak[i]);
		}
	}

	// 4. Metodoa: batezbestekoa, gehienezkoa eta gutxienekoa kalkulatu
	// Itzultzen du: [batezbestekoa, gehienekoNota, gehienekoPosizioa,
	// gutxienekoNota, gutxienekoPosizioa]
	public static Object[] datuakKalkulatu(double[] notak) {
		double batura = 0;
		double max = notak[0];
		int maxPos = 0;
		double min = notak[0];
		int minPos = 0;

		for (int i = 0; i < notak.length; i++) {
			batura += notak[i];

			if (notak[i] >= max) { // >= erabiltzen da azken ikaslea nagusitzeko
				max = notak[i];
				maxPos = i;
			}
			if (notak[i] <= min) { // <= erabiltzen da azken ikaslea nagusitzeko
				min = notak[i];
				minPos = i;
			}
		}

		double batez = batura / notak.length;

		return new Object[] { batez, max, maxPos, min, minPos };
	}

	// 5. Metodoa: estatistikak aurkeztu
	public static void estatistikakAurkeztu(String[] izenak, Object[] estat) {
		double batez = (double) estat[0];
		double max = (double) estat[1];
		int maxPos = (int) estat[2];
		double min = (double) estat[3];
		int minPos = (int) estat[4];

		System.out.println("\n--- ESTATISTIKAK ---");
		System.out.println("Klasearen batezbestekoa: " + batez);
		System.out.println("Nota altuena: " + max + " - " + izenak[maxPos]);
		System.out.println("Nota txikiena: " + min + " - " + izenak[minPos]);
	}

	// Programa nagusia
	public static void main(String[] args) {
		String[] izenak = arrayIzenakKargatu();
		double[] notak = arrayNotakKargatu();

		datuGuztiakAurkeztu(izenak, notak);

		Object[] estat = datuakKalkulatu(notak);

		estatistikakAurkeztu(izenak, estat);
	}
}