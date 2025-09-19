package stringAriketak;

import java.util.Scanner;

/**
 * Programak testu bat irakurriko du eta informazio hau aterako du: - Luzeera -
 * 7. posizioan dagoen karakterea.
 * - Lehenengo 'x' karakterea agertzen den posizioa edo existitzen ez bada, mezu bat agertuko da: "Karakter hau ez da aurkitu". 
 * - Testua letra larriz.
 */
public class Arik_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Idatzi testu bat: ");
		String testua = sc.nextLine();

		// Luzeera
		System.out.println("Luzeera: " + testua.length());

		// 7. posizioan dagoen karakterea.
		if (testua.length() >= 7) {
            System.out.println("7. posizioko karakterea: " + testua.charAt(6));
        } else {
            System.out.println("Testuak 7 karaktere baino gutxiago ditu.");
        }

		// Lehenengo 'x' karakterea agertzen den posizioa edo existitzen ez bada, mezu
		// bat agertuko da: "Karakter hau ez da aurkitu".
		if ((testua.indexOf("x")) != -1)
			System.out.println("Lehenengo 'x' karakterea agertzen den posizioa, " + (testua.indexOf("x")+1) + " da.");
		else
			System.out.println("X karakterea ez da aurkitu.");

		// Testua letra larriz.
		System.out.println("Hau da zure testua letra larriz: " + testua.toUpperCase());
		
		sc.close();
	}

}
