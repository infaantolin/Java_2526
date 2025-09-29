package birpasaAriketak;

import java.util.Scanner;

public class LangileenSoldatak {

	// 1. soldataKalkulatu
		public static double soldataKalkulatu(int soldataGordina, int adina, int semeAlabak) {
			double soldataOsoa = soldataGordina;
			soldataOsoa += semeAlabak * 25; //25€ seme-alaba bakoitzeko
			// 60 eta 65 urte artean daukan urte bakoitzagatik 50 euro
			if (adina >= 60 && adina <= 65) {
				soldataOsoa += (adina-59) * 50;
			}
			return soldataOsoa;
		}

		// 2. jubilaziorakoZenbat
		public static int jubilaziorakoZenbat(int adina) {
			// 65 urte dituztenean jubilatuko dira
			return 65-adina;
		}

		// 3. soldataMaila
		public static String soldataMaila(double soldataOsoa) {
			if (soldataOsoa < 1000) return "Soldata baxua.";
			else if (soldataOsoa <= 2000) return "Soldata ertaina.";
			else if (soldataOsoa <= 3000) return "Soldata altua.";
			else return "Soldata osoa altua.";
		}

		// 4. menua
		public static void menu() {
			System.out.println("************** MENUA **************");
			System.out.println("1. Soldatak kalkulatu");
			System.out.println("2. Jubilaziorako zenbat");
			System.out.println("3. Soldata maila");
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
