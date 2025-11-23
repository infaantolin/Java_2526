package arik07;

/**
 * Teklatu bidez bi zenbaki eskatzen ditu, eta zenbaki horien artean 10 ausazko zenbaki sortzen ditu. Erabili Math.random metodoa zorizko zenbaki oso bat sortzeko (gogoratu double a int casting-a).
 */
import java.util.Scanner;

public class Arik7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Sartu minimoa: ");
		int min = sc.nextInt();

		System.out.print("Sartu maximoa: ");
		int max = sc.nextInt();

		for (int i = 0; i < 10; i++) {
			int r = (int) (Math.random() * (max - min + 1)) + min;
			System.out.println(r);
		}

		sc.close();
	}

}
