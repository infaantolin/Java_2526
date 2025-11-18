package stringAriketak;

import java.util.Scanner;

/**
 * Programak testu bat jasoko du eta 'a' karakterea zenbat aldiz agertzen den
 * erakutsiko du.
 */
public class Arik_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Testua eskatu
		System.out.print("Idatzi testu bat: ");
		String testua = sc.nextLine();

		// Aldagai laguntzailea
		int kont = 0;
		
		// Karaktere bakoitza aztertu
		for (int i = 0; i < testua.length(); i++) {
			if (testua.charAt(i) == 'a' || testua.charAt(i) == 'A') {
				kont++;
			}
		}

		// Emaitza erakutsi
		System.out.println("'a' karakterea " + kont + " aldiz agertzen da.");
		sc.close();
	}
	

}
