
/**
 * Diseinatu metodo bikoitiaDa() da, parametro gisa zenbaki oso bat jasotzen duena eta zenbaki hori bikoitia den ala ez itzultzen duena. Erabili teklatua balioak sartzeko.
 */
package ariketak;
import java.util.Scanner;

public class Arik01 {
	
	public static boolean bikoitiaDa(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Sartu zenbaki oso bat: ");
        int zenbakia = sc.nextInt();

        if (bikoitiaDa(zenbakia)) {
            System.out.println(zenbakia + " bikoitia da.");
        } else {
            System.out.println(zenbakia + " bakoitia da.");
        }

        sc.close();
    }
}