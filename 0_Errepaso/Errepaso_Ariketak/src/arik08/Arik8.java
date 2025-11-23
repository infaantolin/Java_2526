package arik08;

import java.util.Scanner;

/**
 * Kalkulagailua metodoekin
 */

public class Arik8 {
	public static int batuketa(Scanner sc) {
		System.out.print("Sartu lehen zenbakia: ");
		int a = sc.nextInt();
		System.out.print("Sartu bigarren zenbakia: ");
		int b = sc.nextInt();
		return a + b;
	}

	public static int kenketa(Scanner sc) {
		System.out.print("Sartu lehen zenbakia: ");
		int a = sc.nextInt();
		System.out.print("Sartu bigarren zenbakia: ");
		int b = sc.nextInt();
		return a - b;
	}

	public static int biderketa(Scanner sc) {
		System.out.print("Sartu lehen zenbakia: ");
		int a = sc.nextInt();
		System.out.print("Sartu bigarren zenbakia: ");
		int b = sc.nextInt();
		return a * b;
	}

	public static double zatiketa(Scanner sc) {
		System.out.print("Sartu lehen zenbakia: ");
		int a = sc.nextInt();
		System.out.print("Sartu bigarren zenbakia: ");
		int b = sc.nextInt();
		if (b == 0)
			return -1;
		return (double) a / b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int aukera;

		do {
			System.out.println("Kalkulagailuaren menua:");
			System.out.println("1.- Batu");
			System.out.println("2.- Kendu");
			System.out.println("3.- Biderkatu");
			System.out.println("4.- Zatitu");
			System.out.println("5.- Irten");
			System.out.print("Sartu nahi duzun aukera (1-5): ");
			aukera = sc.nextInt();

			switch (aukera) {
			case 1:
				System.out.println("Emaitza: " + batuketa(sc));
				break;
			case 2:
				System.out.println("Emaitza: " + kenketa(sc));
				break;
			case 3:
				System.out.println("Emaitza: " + biderketa(sc));
				break;
			case 4:
				double ema = zatiketa(sc);
				if (ema == -1)
					System.out.println("Errorea: ezin da zatitu 0-rekin.");
				else
					System.out.println("Emaitza: " + ema);
				break;
			case 5:
				System.out.println("Programa amaituta.");
				break;
			default:
				System.out.println("Aukera okerra.");
			}
			System.out.println();
		} while (aukera != 5);

		sc.close();

	}

}
