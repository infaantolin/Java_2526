package stringAriketak;
import java.util.Scanner;

/**
 * Programak esaldi bat jasoko du eta zenbat hitz dituen esango digu. Hitzak
 * espazio batez banatuko dira eta esaldi bat ez da inoiz espazio batekin
 * hasiko.
 */

public class Arik_7_Split {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Idatzi esaldi bat: ");
        String esaldia = sc.nextLine();

//        String[] hitzak = esaldia.split(" ");
        String[] hitzak = esaldia.split("\\s+");
        System.out.println("Hitz kopurua: " + hitzak.length);

        sc.close();

	}

}
