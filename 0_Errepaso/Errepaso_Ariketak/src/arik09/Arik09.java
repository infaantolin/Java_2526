package arik09;

import java.util.Scanner;

/**
 * pantailan izartxoz * egindako paralelogramo marrazten du, oinarria eta
 * altuera teklatuko bidez jasotzen ditu eta balidazioa egiten du (balio
 * positiboak).
 */
public class Arik09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int oinarria = 0;
		int altuera = 0;

		// Oinarria jasotzeko (balidatzen, zenbaki positiboa izan dadin)
		while (true) {
			try {
				System.out.print("Sartu oinarria (zenbaki oso positiboa): ");
				oinarria = Integer.parseInt(sc.nextLine());
				if (oinarria <= 0) {
					System.out.println("Mesedez, positiboa izan behar da.");
					continue;
				}
				break;
			} catch (NumberFormatException e) {
				System.out.println("Zenbaki oso bat sartu behar duzu.");
			}
		}

		// Altuera jasotzeko (balidatzen)
		while (true) {
			try {
				System.out.print("Sartu altuera (zenbaki oso positiboa): ");
				altuera = Integer.parseInt(sc.nextLine());
				if (altuera <= 0) {
					System.out.println("Mesedez, positiboa izan behar da.");
					continue;
				}
				break;
			} catch (NumberFormatException e) {
				System.out.println("Zenbaki oso bat sartu behar duzu.");
			}
		}

		System.out.println("\nHona hemen zure paralelogramoa:\n");

		// Paralelogramoa marrazten dugu: lerro bakoitzean espazio kopurua handitzen da,
		// eta ondoren oinarriko izartxoak inprimatzen dira.
		for (int lerro = 0; lerro < altuera; lerro++) {

			// espazioak (slantimist efektua)
			for (int s = 0; s < lerro; s++) {
				System.out.print(" ");
			}

			// izartxoen oinarria
			for (int k = 0; k < oinarria; k++) {
				System.out.print("*");
			}

			System.out.println();
		}

		sc.close();
	}

}
