package ikasleak;

import java.util.Scanner;

public class IkasleAdmin {
	private Ikaslea[] ikasleList;
	private Scanner sc;

	public IkasleAdmin(int ikasleKop) {
		this.ikasleList = new Ikaslea[ikasleKop];
	}

	public void menuaAurkeztu() {
		int aukera;

		sc = new Scanner(System.in);

		do {
			System.out.println(
					"Menu nagusia \n \n 1.- Ikasleen datuak kargatzea \n 2.- Datuak prozesatzea \n 3.- Ikasleen datuak erakustea  \n 4.- Ikasle baten datuak erakustea \n 0.- Amaiera\n");
			aukera = Integer.parseInt(sc.nextLine());
			System.out.println(aukera);
			switch (aukera) {
			case 1:
				ikasleDatuakKargatu();
				break;
			case 2:
				datuakProzesatu();
				break;
			case 3:
				ikaleenDatuakErakutsi();
				break;
			case 4:
				ikaslebatenDatuakAurkeztu();
				break;
			default:
				break;
			}

		} while (aukera != 0);

	}

	private void ikasleDatuakKargatu() {

		for (int i = 0; i < ikasleList.length; i++) {
			Ikaslea oIkasle = new Ikaslea("Oier" + i, 'G', i, 0.50f + i, 80.0f);
			ikasleList[i] = oIkasle;
		}
	}

	private void datuakProzesatu() {
		System.out.println("Gizonen bataz besteko adina: " + batazBestekoAltueraGizonak());
		System.out.println("1.65 baino gehiago neurtzen duten pertsonak: " + altueraHandiago165());
	}

	private void ikaleenDatuakErakutsi() {
		System.out.println("Ikasleen zerrenda\r\n" + "----------------------------------\r\n"
				+ "Izena Sexua Adina Altuera (m) Pisua (kg)\r\n" + "----------------------------------\r\n" + "");
		for (Ikaslea oIkasle : ikasleList) {
			System.out.println(oIkasle.getDatuak());
		}
	}

	private void ikaslebatenDatuakAurkeztu() {
		String izena = sc.nextLine();
		for (Ikaslea oIkasle : ikasleList) {
			if (oIkasle.getIzena().equalsIgnoreCase(izena)) {
				System.out.println(oIkasle);
				break;
			}
		}
	}

	private float batazBestekoAltueraGizonak() {
		float emaitza = 0.0f;
		int kont = 0;

		for (Ikaslea oIkasle : ikasleList) {
			if (oIkasle.getSexua() == 'G') {
				emaitza += oIkasle.getAltuera();
				kont++;
			}
		}
		emaitza = emaitza / kont;

		return emaitza;
	}

	private int altueraHandiago165() {
		int kont = 0;

		for (Ikaslea oIkasle : ikasleList) {
			if (oIkasle.getAltuera() > 1.65f) {
				kont++;
			}
		}

		return kont;
	}

}
