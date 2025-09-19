package stringAriketak;

import java.util.Scanner;

/**
 * Programak bi karaktere kate jasoko ditu teklatutik eta kateatuta bistaratuko ditu.
 */
public class Arik_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Idatzi lehen karaktere-katea: ");
        String kate1 = sc.nextLine();
        System.out.print("Idatzi bigarren karaktere-katea: ");
        String kate2 = sc.nextLine();

        String kateatuta = kate1 + kate2;
        System.out.println("Kateatuta: " + kateatuta);

        sc.close();
	}

}
