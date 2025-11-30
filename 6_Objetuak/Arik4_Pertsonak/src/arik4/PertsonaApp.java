package arik4;

import java.util.Scanner;

public class PertsonaApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Aldagaiak
		String izena = "";
		int adina = 0;
		char sexua = ' ';
		double pisua = 0;
		double altuera = 0;

		// Izena
		System.out.print("Sartu izena: ");
		izena = sc.nextLine();

		// Adina
		boolean balioZuzena = false;
		while (!balioZuzena) {
			try {
				System.out.print("Sartu adina: ");
				adina = Integer.parseInt(sc.nextLine());

				if (adina < 0) {
					System.out.println("Errorea: Adina ezin da negatiboa izan.");
				} else {
					balioZuzena = true;
				}

			} catch (NumberFormatException e) {
				System.out.println("Errorea: Zenbaki oso positiboa sartu behar duzu. Saiatu berriro.");
			}
		}

		// Sexua
		System.out.print("Sartu sexua (E/G): ");
		sexua = sc.nextLine().toUpperCase().charAt(0);

		// Pisua
		balioZuzena = false;
		while (!balioZuzena) {
			try {
				System.out.print("Sartu pisua (kilogramotan): ");
				String pisuLagun = sc.nextLine().replace(",", "."); // koma puntura bihurtu
				pisua = Double.parseDouble(pisuLagun);

				if (pisua <= 0) {
					System.out.println("Errorea: Pisua 0 baino handiagoa izan behar da.");
				} else {
					balioZuzena = true;
				}
			} catch (NumberFormatException e) {
				System.out.println("Errorea: Pisua ez da zenbaki baliagarria. Saiatu berriro.");
			}
		}

		// Altuera
		balioZuzena = false;
		while (!balioZuzena) {

			try {
				System.out.print("Sartu altuera (metrotan): ");
				String altuLagun = sc.nextLine().replace(",", "."); // koma puntura bihurtu
				altuera = Double.parseDouble(altuLagun);

				if (altuera <= 0) {
					System.out.println("Errorea: Altuera 0 baino handiagoa izan behar da.");
				} else {
					balioZuzena = true;
				}

			} catch (NumberFormatException e) {
				System.out.println("Errorea: Altuera ez da zenbaki baliagarria. Saiatu berriro.");
			}
		}

		// 1. Pertsona
		Pertsona p1 = new Pertsona(izena, adina, sexua, pisua, altuera);

		// 2. Pertsona
		Pertsona p2 = new Pertsona(izena, adina, sexua);

		// 3. Pertsona
		Pertsona p3 = new Pertsona();

		System.out.println("\n======= Pertsona bakoitzaren datuak =======\n");

		datuakErakutsi(1, p1);
		datuakErakutsi(2, p2);
		datuakErakutsi(3, p3);

		sc.close();
	}

	/** Pertsona baten datu guztiak erakutsiko dira */
	public static void datuakErakutsi(int perZenb, Pertsona per) {

		System.out.println("=== " + perZenb + per.toString());

		switch (per.kalkulatuIMC()) {
		case -1 -> System.out.println("Bere pisuaren azpitik dago.");
		case 0 -> System.out.println("Bere pisu idealean dago.");
		case 1 -> System.out.println("Gehiegizko pisua du.");
		}

		if (per.adinezNagusikoaDa())
			System.out.println("Adin nagusikoa da.");
		else
			System.out.println("Adin txikikoa da.");

		System.out.println();

	}

}
