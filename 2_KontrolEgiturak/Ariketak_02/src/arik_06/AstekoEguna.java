package arik_06;

import java.util.Scanner;

public class AstekoEguna {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Sartu 1etik 7ra arteko zenbakia: ");
		int eguna = sc.nextInt();

		switch (eguna) {
		case 1:
			System.out.println("Astelehena");
			break;
		case 2:
			System.out.println("Asteartea");
			break;
		case 3:
			System.out.println("Asteazkena");
			break;
		case 4:
			System.out.println("Osteguna");
			break;
		case 5:
			System.out.println("Ostirala");
			break;
		case 6:
			System.out.println("Larunbata");
			break;
		case 7:
			System.out.println("Igandea");
			break;
		default:
			System.out.println("Zenbaki okerra");
		}

		sc.close();

	}

}
