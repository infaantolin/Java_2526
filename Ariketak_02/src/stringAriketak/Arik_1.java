package stringAriketak;
/**
 * Programak testu bat irakurriko du eta informazio hau aterako du:
Luzeera
7. posizioan dagoen karakterea.
Lehenengo 'x' karakterea agertzen den posizioa edo existitzen ez bada, mezu bat agertuko da:
"Karakter hau ez da aurkitu".
Testua letra larriz.
 */
import java.util.Scanner;

public class Arik_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		// Testua eskatu
        System.out.print("Idatzi testu bat: ");
        String testua = sc.nextLine();

        // 1. Luzeera
        System.out.println("Testuaren luzeera: " + testua.length());

        // 2. 7.posizioko karakterea
        if (testua.length() >= 7) {
            System.out.println("7. posizioko karakterea: " + testua.charAt(6));
        } else {
            System.out.println("Testuak ez du 7 karaktere baino gehiago.");
        }

        // 3. Lehenengo 'x' karakterearen posizioa
        int pos = testua.indexOf('x');
        if (pos == -1) {
            System.out.println("Karakter hau ez da aurkitu.");
        } else {
            System.out.println("Lehenengo 'x' posizioa: " + (pos+1));
        }

        // 4. Testua letra larriz
        System.out.println("Letra larriz: " + testua.toUpperCase());

        sc.close();
    }
}