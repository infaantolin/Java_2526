package ariketak;

import java.util.Scanner;

/**
 * Diseinatu metodo lehenaDa () parametro gisa zenbaki oso bat jasotzen duena
 * eta zenbaki hori lehena (primo)den ala ez itzultzen duena. Erabili sortutako
 * metodoa eta eskatu N zenbaki bat eta topatu ditzala lehenengo N zenbaki
 * lehenak(primos).
 */
public class Arik04 {

	public static boolean lehenaDa(int n) {
		if (n <= 1) {
			return false; // 1, 0 eta negatiboak ez dira primoak
		}

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false; // zatitzaile bat aurkitu da → ez da primo
			}
		}

		return true; // zatitzailerik aurkitu ez bada → primo da
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Sartu N (zenbat zenbaki lehena nahi dituzun): ");
		int N = sc.nextInt();

		int aurkituta = 0;
		int n = 2;
		System.out.println("Lehenengo " + N + " zenbaki lehenak:");

		while (aurkituta < N) {
			if (lehenaDa(n)) {
				System.out.print(n + " ");
				aurkituta++;
			}
			n++;
		}

		sc.close();
	}

}
