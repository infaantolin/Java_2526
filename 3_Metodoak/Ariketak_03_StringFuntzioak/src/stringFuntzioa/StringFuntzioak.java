package stringFuntzioa;

import java.util.Scanner;

public class StringFuntzioak {

	// 1. lerroaMarraztu
	public static void lerroaMarraztu(char karakterea, int zenbakia) {
		for (int i = 0; i < zenbakia; i++) {
			System.out.print(karakterea);
		}
		System.out.println();
	}

	// 2. xeheaBihurtu
	public static String xeheaBihurtu(String testua) {
		return testua.toLowerCase();
	}

	// 3. larriaBihurtu
	public static String larriaBihurtu(String testua) {
		return testua.toUpperCase();
	}

	// 4. menu
	public static void menu() {
		System.out.println("************** MENU **************");
		System.out.println("1. Lerro bat margotu");
		System.out.println("2. Letra minuskulara bihurtu (karaktere bakarra)");
		System.out.println("3. Letra maiuskulara bihurtu (karaktere bakarra)");
		System.out.println("4. Esaldia minuskulara bihurtu");
		System.out.println("5. Esaldia maiuskulara bihurtu");
		System.out.println("6. Irten");
		System.out.print("Aukeratu (1-6): ");
	}

	// Programa nagusia
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int aukera;

		do {
			menu();
			aukera = sc.nextInt();
			sc.nextLine(); // bufferra garbitzeko

			switch (aukera) {
			case 1:
				System.out.print("Sartu karaktere bat: ");
				char kar = sc.next().charAt(0);
				System.out.print("Sartu zenbaki bat: ");
				int n = sc.nextInt();
				lerroaMarraztu(kar, n);
				break;

			case 2:
				System.out.print("Sartu karaktere bat: ");
				char minChar = sc.next().charAt(0);
				System.out.println("Letra minuskulaz: " + xeheaBihurtu(String.valueOf(minChar)));
				break;

			case 3:
				System.out.print("Sartu karaktere bat: ");
				char mayChar = sc.next().charAt(0);
				System.out.println("Letra maiuskulaz: " + larriaBihurtu(String.valueOf(mayChar)));
				break;

			case 4:
				System.out.print("Sartu esaldi bat: ");
				String esaldi1 = sc.nextLine();
				System.out.println("Esaldia minuskulaz: " + xeheaBihurtu(esaldi1));
				break;

			case 5:
				System.out.print("Sartu esaldi bat: ");
				String esaldi2 = sc.nextLine();
				System.out.println("Esaldia maiuskulaz: " + larriaBihurtu(esaldi2));
				break;

			case 6:
				System.out.println("Programa amaituta.");
				break;

			default:
				System.out.println("Aukera okerra. Saiatu berriro.");
			}

			System.out.println();
		} while (aukera != 6);

		sc.close();
	}
}