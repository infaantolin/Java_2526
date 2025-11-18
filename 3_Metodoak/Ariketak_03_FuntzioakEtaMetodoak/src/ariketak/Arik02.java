/**
 * Egokitu aurreko ariketa ausazko 10 zenbaki sortzeko eta zenbatu horietako zenbat diren bikoitiak eta zenbat bakoitiak.
 */
package ariketak;
import java.util.Random;

public class Arik02 {

	public static boolean bikoitiaDa(int n) {
        return n % 2 == 0;
    }
	
	public static void main(String[] args) {
		Random rnd = new Random();
        int bikoitiak = 0, bakoitiak = 0;

        for (int i = 0; i < 10; i++) {
            int n = rnd.nextInt(100); // 0-99 bitarteko ausazko zenbakiak
            System.out.println("Sortutako zenbakia: " + n);
            if (bikoitiaDa(n)) bikoitiak++;
            else bakoitiak++;
        }

        System.out.println("Bikoitiak: " + bikoitiak);
        System.out.println("Bakoitiak: " + bakoitiak);
    }
}
