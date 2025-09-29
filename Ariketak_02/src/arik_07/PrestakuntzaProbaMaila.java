package arik_07;

import java.util.Scanner;

public class PrestakuntzaProbaMaila {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Zenbat galdera egin dira guztira? ");
		int guztira = sc.nextInt();

		System.out.print("Zenbat erantzun zuzen izan dira? ");
		int zuzen = sc.nextInt();

		double portzentaia = (zuzen * 100.0) / guztira;

		System.out.println("Portzentaia: " + portzentaia + "%");

		if (portzentaia >= 90) {
			System.out.println("Gehienezko maila");
		} else if (portzentaia >= 75) {
			System.out.println("Maila ertaina");
		} else if (portzentaia >= 50) {
			System.out.println("Maila arrunta");
		} else {
			System.out.println("Mailaz kanpo");
		}

		sc.close();
	}

}
