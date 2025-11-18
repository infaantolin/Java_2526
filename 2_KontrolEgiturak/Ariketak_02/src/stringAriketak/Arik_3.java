package stringAriketak;
import java.util.Scanner;

/**
 * Programak testu bat jasoko du eta atzerantz bistaratuko du.
 */
public class Arik_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Testua jaso
		System.out.print("Idatzi testu bat: ");
		String testua = sc.nextLine();

		// StringBuilder erabiliz atzerantz buelta eman
		StringBuilder sb = new StringBuilder(testua);
		String alderantziz = sb.reverse().toString();

		// Emaitza erakutsi
		System.out.println("Testua atzerantz: " + alderantziz);

		sc.close();
	}
}
