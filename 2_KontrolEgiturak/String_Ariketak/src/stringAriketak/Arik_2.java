package stringAriketak;

import java.util.Scanner;

/**
 * Programak testu bat jasoko du eta 'a' karakterea zenbat aldiz agertzen den
 * erakutsiko du.
 */

public class Arik_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Idatzi testu bat: ");
		String testua = sc.nextLine();

		int kont = 0;
		for (int i = 0; i < testua.length(); i++) {
			if (testua.charAt(i) == 'a' || testua.charAt(i) == 'A') {
				kont++;
			}
		}

		System.out.println("'a' karakterea " + kont + " aldiz agertzen da.");

		sc.close();

	}

}
