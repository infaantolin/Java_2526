package stringAriketak;

import java.util.Scanner;

/**
 * Programak testu bat jasoko du eta atzerantz bistaratuko du.
 */

public class Arik_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Idatzi testu bat: ");
		String testua = sc.nextLine();

		// Atzerantz eraiki for buclearekin
		String alderantziz = "";
		for (int i = testua.length() - 1; i >= 0; i--) {
			alderantziz += testua.charAt(i);
		}

		System.out.println("Atzerantz: " + alderantziz);

		sc.close();
	}

}
