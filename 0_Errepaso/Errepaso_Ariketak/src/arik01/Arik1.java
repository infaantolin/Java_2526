package arik01;

/**
 * Sartu bi zenbaki oso teklatu bidez, eta kontsola bidez batuketa, kenketa, biderketa, zatiketa eta modulua (zatiketaren hondarra) erakutsi.
 */
import java.util.Scanner;

public class Arik1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Bi zenbaki osoren batuketa, kenketa, biderketa, zatiketa eta modulua (zatiketaren hondarra) kalkulatuko dira");
		System.out.println("Sartu lehen zenbakia:");
		int a = sc.nextInt();

		System.out.println("Sartu bigarren zenbakia: ");
		int b = sc.nextInt();

		System.out.println("####### EMAITZAK #######");
		System.out.println("Batuketa: " + (a + b));
		System.out.println("Kenketa: " + (a - b));
		System.out.println("Biderketa: " + (a * b));

		if (b != 0) {
			System.out.println("Zatiketa: " + (a / b));
			System.out.println(("Hondarra: " + (a % b)));
		} else {
			System.out.println("Zatitzailea ezin da 0 izan. Sartu beste zenbaki bat.");
		}

		sc.close();
	}

}
