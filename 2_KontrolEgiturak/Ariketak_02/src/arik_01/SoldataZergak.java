package arik_01;

import java.util.Scanner;

public class SoldataZergak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Sartu zure soldata: ");
		double soldata = sc.nextDouble();

		if (soldata > 3000) {
			System.out.println("Zergak ordaindu behar dituzu.");
		} else {
			System.out.println("Ez duzu zergarik ordaindu behar.");
		}

		sc.close();
	}

}
