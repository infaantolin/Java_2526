package arik_15;

import java.util.Scanner;

public class KalkuErrepik2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int aukera;

		do {
			System.out.println("*************** Kalkulagailua ***************");
			System.out.println("1. Gehitzea");
			System.out.println("2. Kenketa");
			System.out.println("3. Produktua");
			System.out.println("4. Dibisioa");
			System.out.println("5. Atera");
			System.out.print("Sartu nahi duzun aukera: ");
			aukera = sc.nextInt();

			if (aukera >= 1 && aukera <= 4) {
				System.out.println("Sartu lehenengo zenbakia:");
				double a = sc.nextDouble();
				System.out.println("Sartu bigarren zenbakia:");
				double b = sc.nextDouble();

				switch (aukera) {
				case 1:
					System.out.println("Aukeraturako eragiketa: Gehiketa");
					System.out.println(a + " + " + b + " = " + (a + b));
					break;
				case 2:
					System.out.println("Aukeraturako eragiketa: Kenketa");
					System.out.println(a + " - " + b + " = " + (a - b));
					break;
				case 3:
					System.out.println("Aukeraturako eragiketa: Biderketa");
					System.out.println(a + " * " + b + " = " + (a * b));
					break;
				case 4:
					System.out.println("Aukeraturako eragiketa: Zatiketa");
					if (b != 0)
						System.out.println(a + " / " + b + " = " + (a / b));
					else {
						System.out.println("Errerea: Ezin duzu 0-rekin zatitu!");
					}
					break;
				}

			} else if (aukera != 5) {
				System.out.println(aukera + " aukera ez dago erabilgarri, saiatu berriro.");
			}

		} while (aukera != 5);
		System.out.println("Agur!");
		sc.close();
	}
}
