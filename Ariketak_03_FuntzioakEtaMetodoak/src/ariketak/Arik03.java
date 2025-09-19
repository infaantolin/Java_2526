package ariketak;

/**
 * Diseinatu metodo handiaDa() parametro gisa bi zenbaki oso jasotzen dituena eta bietako handiena itzultzen duena. Erabili teklatua balioak sartzeko.
 */

import java.util.Scanner;

public class Arik03 {

	public static int handiaDa(int a, int b) {
        return (a > b) ? a : b;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Sartu lehen zenbakia: ");
        int a = sc.nextInt();
        System.out.print("Sartu bigarren zenbakia: ");
        int b = sc.nextInt();

        System.out.println("Handiena: " + handiaDa(a, b));

        sc.close();
	}

}
