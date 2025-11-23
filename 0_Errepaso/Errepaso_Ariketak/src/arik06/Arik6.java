package arik06;

/**
 * Egin aplikazio bat sartu beharreko salmenta-kopurua eskatuko duena; ondoren, adierazitako salmenta-kopuru adina salmenta eskatuko dizkigu teklatu bidez sartzeko. Azkenean, salmenta guztien batura erakutsiko du. Zer errepikatzen den eta zer ez pentsatu. Salbuespenak kudeatu.
 */
import java.util.Scanner;

public class Arik6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int salmentaKop = 0;
		boolean balioEgokia = false;

		// SALMENTA KOPURUA
		while (!balioEgokia) {
			try {
				System.out.print("Zenbat salmenta sartu nahi dituzu? ");
				salmentaKop = Integer.parseInt(sc.nextLine());

				if (salmentaKop <= 0) {
					System.out.println("Errorea: Balioa positiboa izan behar da.");
				} else {
					balioEgokia = true;
				}
			} catch (NumberFormatException e) {
				System.out.println("Errorea: zenbaki oso bat sartu behar da!");
			}
		}

		// SALMENTAK SARTU
		double batura = 0;
		for (int i = 1; i <= salmentaKop; i++) {
			boolean salmentaOk = false;
			while (!salmentaOk) {
				try {
					System.out.print(i + ". salmenta sartu: ");
					double salmenta = Double.parseDouble(sc.nextLine());

					batura += salmenta;
					salmentaOk = true;
				} catch (NumberFormatException e) {
					System.out.println("Errorea: zenbaki baliozkoa sartu behar da!");
				}
			}
			System.out.print(i + ". salmenta: ");
			batura += sc.nextDouble();
		}

		// EMAITZA
		System.out.println("Salmenten batura: " + batura);

		// Scanner itxi
		sc.close();
	}

}
