package kotxea;

import java.util.Scanner;

public class KotxeLasterketa {

	public static void main(String[] args) {
		Kotxea k1 = new Kotxea();
		Scanner sc = new Scanner(System.in);
		int abiadura = 0;

		System.out.println("Hasierako abiadura: " + k1.getAbiadura() + " km/h");
		System.out.println();
		do {
			System.out.println("Sartu abiadura aldaketa (0 bukatzeko): ");
			abiadura = sc.nextInt();
			if (abiadura > 0) {
				k1.bizkortu(abiadura);
			} else if (abiadura < 0) { // Math.abs(abiadura)
				k1.geldotu(abiadura * (-1));
			}

			if (abiadura != 0) {
				System.out.println("Egungo abiadura: " + k1.getAbiadura() + " km/h");
				System.out.println();
			}

		} while (abiadura != 0);

		System.out.println("Bukatu da.");
		sc.close();
	}

}
