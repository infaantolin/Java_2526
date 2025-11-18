package arik_02;
import java.util.Scanner;

public class AdinezNagusia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Sartu zure adina: ");
        int adina = sc.nextInt();

        if (adina >= 18) {
            System.out.println("Adinez nagusia zara.");
        } else {
            System.out.println("Adingabea zara.");
        }

        sc.close();
	}

}
