package arik_14;

import java.util.ArrayList;
import java.util.Scanner;

public class KontuKorrontea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> kontuak = new ArrayList<>();
		ArrayList<Double> saldos = new ArrayList<>();

		int kontu;

		do {
			System.out.println("Kontu-zenbakia adierazi:");
			kontu = sc.nextInt();

			if (kontu >= 0) {
				System.out.println("Adierazi saldoa:");
				double saldo = sc.nextDouble();

				kontuak.add(kontu);
				saldos.add(saldo);
			}
		} while (kontu >= 0);

		System.out.println("Laburpena:");
		double batura = 0;

		for (int i = 0; i < kontuak.size(); i++) {
			int zenbakia = kontuak.get(i);
			double saldo = saldos.get(i);

			System.out.println("Kontu-zenbakia " + (i + 1) + ": " + zenbakia);

			if (saldo > 0) {
				System.out.println(zenbakia + "(r)en saldoa: hartzekoduna");
				batura += saldo;
			} else if (saldo < 0) {
				System.out.println(zenbakia + "(r)en saldoa: zorduna");
			} else {
				System.out.println(zenbakia + "(r)en saldoa: null");
			}
		}

		System.out.println("BATURA: " + (int) batura);
		sc.close();
	}

}
