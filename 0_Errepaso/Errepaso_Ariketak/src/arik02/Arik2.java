package arik02;

/**
 * Adierazi 2 zenbaki oso kontsola bidez, eta adierazi bietatik zein den handiena. Berdinak badira, adierazi hori ere. Alda itzazu balioak funtzionatzen duela egiaztatzeko.
 */
import java.util.Scanner;

public class Arik2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Sartu lehen zenbakia: ");
		int a = sc.nextInt();

		System.out.print("Sartu bigarren zenbakia: ");
		int b = sc.nextInt();

		if (a > b) {
			System.out.println("Handiena: " + a);
		} else if (b > a) {
			System.out.println("Handiena: " + b);
		} else {
			System.out.println("Bi zenbakiak berdinak dira.");
		}

		sc.close();
	}

}
