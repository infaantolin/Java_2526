package arik_15;

import java.util.Scanner;

public class KalkuErrepikakorra {

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
				System.out.print("Sartu lehen zenbakia: ");
				double a = sc.nextDouble();
				System.out.print("Sartu bigarren zenbakia: ");
				double b = sc.nextDouble();

				switch (aukera) {
				case 1:
					System.out.println("Hautatutako eragiketa: Gehitu " + a + " + " + b + " = " + (a + b));
					break;
				case 2:
					System.out.println("Hautatutako eragiketa: Ken " + a + " - " + b + " = " + (a - b));
					break;
				case 3:
					System.out.println("Hautatutako eragiketa: Bider " + a + " * " + b + " = " + (a * b));
					break;
				case 4:
					if (b != 0)
						System.out.println("Hautatutako eragiketa: Zati " + a + " / " + b + " = " + (a / b));
					else
						System.out.println("Ezin da zatitu 0-rekin");
					break;
				}
			} else if (aukera != 5) {
				System.out.println(aukera + " aukera ez dago erabilgarri, saiatu berriro.");
			}
		} while (aukera != 5);

		System.out.println("Programa amaituta. Agur!");
		sc.close();
	}

}
