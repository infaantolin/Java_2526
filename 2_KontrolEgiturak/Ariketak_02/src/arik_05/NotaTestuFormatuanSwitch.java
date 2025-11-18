package arik_05;

import java.util.Scanner;

public class NotaTestuFormatuanSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Sartu zure nota (1-10): ");
		int nota = sc.nextInt();

		switch (nota) {
		case 1:
		case 2:
			System.out.println("Gutxiegi");
			break;
		case 3:
		case 4:
			System.out.println("Gutxi");
			break;
		case 5:
			System.out.println("Nahiko");
			break;
		case 6:
			System.out.println("Ondo");
			break;
		case 7:
		case 8:
			System.out.println("Oso ondo");
			break;
		case 9:
		case 10:
			System.out.println("Bikain");
			break;
		default:
			System.out.println("Datu okerrak");
		}

		sc.close();
	}

}
