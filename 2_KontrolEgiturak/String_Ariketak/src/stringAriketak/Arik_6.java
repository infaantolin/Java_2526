package stringAriketak;

import java.util.Scanner;

/**
 * Programak testu bat jasoko du eta palindromoa den ala EZ esango digu.
 */

public class Arik_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Idatzi testu bat: ");
		String testua = sc.nextLine();

		// Garbitu: espazioak kendu eta minuskulaz jarri
		String garbia = testua.replaceAll("\\s+", "").toLowerCase();

		// Alderantziz sortu String hutsez
		String alderantziz = "";
		for (int i = garbia.length() - 1; i >= 0; i--) {
			alderantziz += garbia.charAt(i);
		}

		if (garbia.equals(alderantziz)) {
			System.out.println("Testua palindromoa da.");
		} else {
			System.out.println("Testua ez da palindromoa.");
		}

		sc.close();

	}

}
