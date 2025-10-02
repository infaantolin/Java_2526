package adibideak;
// 5 zenbaki irakurri, array-an gorde eta kalkuluak egin

import java.util.Scanner;

public class Adib1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] zenbakiak = new int[5];

		// 1. Erabiltzaileari 5 zenbaki eskatu
		for (int i = 0; i < zenbakiak.length; i++) {
			System.out.print((i + 1) + ". zenbakia sartu: ");
			zenbakiak[i] = sc.nextInt();
		}

		// 2. Kalkuluak
		int batura = 0;
		int handiena = zenbakiak[0];
		int txikiena = zenbakiak[0];

		for (int i = 0; i < zenbakiak.length; i++) {
			batura += zenbakiak[i];
			if (zenbakiak[i] > handiena) {
				handiena = zenbakiak[i];
			}
			if (zenbakiak[i] < txikiena) {
				txikiena = zenbakiak[i];
			}
		}

		double batezbestekoa = (double) batura / zenbakiak.length;

		// 3. Emaitzak
		System.out.println("Zenbakien batura: " + batura);
		System.out.println("Zenbakien batezbestekoa: " + batezbestekoa);
		System.out.println("Zenbaki handiena: " + handiena);
		System.out.println("Zenbaki txikiena: " + txikiena);

		sc.close();
	}

}
