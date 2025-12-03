package ikasleak;

import java.util.Scanner;

public class IkasleMetodoak {
	private Ikaslea[] ikasleLista;

	protected void ikasleDatuakKargatu(Scanner sc) {

		int ikasleKop = 0;

		do {
			System.out.println("Zenbat ikasle sartu nahi dituzu: ");
			ikasleKop = Integer.parseInt(sc.nextLine());

		} while (ikasleKop != 0);

		ikasleLista = new Ikaslea[ikasleKop];

		for (int i = 0; i < ikasleLista.length; i++) {
			Ikaslea ik = ikasleDatuakEskatu(sc);
			ikasleLista[i] = ik;
		}
	}

	private Ikaslea ikasleDatuakEskatu(Scanner sc) {
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

		// 1. Ikaslea
		return new Ikaslea(izena, sexua, adina, pisua, altuera);

	}

	protected void datuakProzesatu() {
		System.out.println("Gizonen bataz besteko adina: " + batazBestekoAdinaGizonak());
		System.out.println("1.65 baino gehiago neurtzen duten pertsonak: " + altueraHandiago165());
	}

	protected void ikaleenDatuakErakutsi() {
		System.out.println("Ikasleen zerrenda\r\n" + "----------------------------------\r\n"
				+ "Izena Sexua Adina Altuera (m) Pisua (kg)\r\n" + "----------------------------------\r\n" + "");
		for (Ikaslea oIkasle : ikasleLista) {
			System.out.println(oIkasle.getDatuak());
		}
	}

	protected void ikaslebatenDatuakAurkeztu(Scanner sc) {
		String izena = sc.nextLine();
		for (Ikaslea oIkasle : ikasleLista) {
			if (oIkasle.getIzena().equalsIgnoreCase(izena)) {
				System.out.println(oIkasle);
				break;
			}
		}
	}

	private float batazBestekoAdinaGizonak() {
		float emaitza = 0.0f;
		int kont = 0;

		for (Ikaslea oIkasle : ikasleLista) {
			if (oIkasle.getSexua() == 'G') {
				emaitza += oIkasle.getAdina();
				kont++;
			}
		}
		emaitza = emaitza / kont;

		return emaitza;
	}

	private int altueraHandiago165() {
		int kont = 0;

		for (Ikaslea oIkasle : ikasleLista) {
			if (oIkasle.getAltuera() > 1.65f) {
				kont++;
			}
		}

		return kont;
	}

}
