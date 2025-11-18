package stringAriketak;
import java.util.Scanner;
/**
 * Programak testu bat jasoko du eta bere inizialak aterako ditu. Adibidez: Tren Articulado Ligero Goikoetxea Oriol: TALGO
 */
public class Arik_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Idatzi testu bat: ");
        String testua = sc.nextLine();

        String[] hitzak = testua.split(" ");
        String inizialak = "";

        for (int i = 0; i < hitzak.length; i++) {
            inizialak += Character.toUpperCase(hitzak[i].charAt(0));
        }

        System.out.println("Inizialak: " + inizialak);

        sc.close();

	}

}
