package stringAriketak;

import java.util.Scanner;

/**
 * Programak bi karaktere-kate jasoko ditu eta berdinak diren edo ez esango digu.
 */

public class Arik_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Idatzi lehen karaktere-katea: ");
        String kate1 = sc.nextLine();
        System.out.print("Idatzi bigarren karaktere-katea: ");
        String kate2 = sc.nextLine();

		if (kate1.equals(kate2)) {
			System.out.println("Kateak berdinak dira.");
		} else {
			System.out.println("Kateak ez dira berdinak.");
		}

		sc.close();
	}

}
