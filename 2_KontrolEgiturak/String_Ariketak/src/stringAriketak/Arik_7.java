package stringAriketak;

import java.util.Scanner;

/**
 * Programak esaldi bat jasoko du eta zenbat hitz dituen esango digu. Hitzak
 * espazio batez banatuko dira eta esaldi bat ez da inoiz espazio batekin
 * hasiko.
 */
public class Arik_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Idatzi esaldi bat: ");
		String esaldia = sc.nextLine();

		int hitzak = 1; // Gutxienez hitz bat dago (ez da espazioarekin hasten)

		for (int i = 0; i < esaldia.length(); i++) {
			if (esaldia.charAt(i) == ' ') {
				hitzak++;
			}
		}

		System.out.println("Hitz kopurua: " + hitzak);

		sc.close();
	}

}
