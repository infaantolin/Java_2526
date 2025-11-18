package arik_11;

import java.util.Scanner;

public class BikoitiBakoiti {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Zenbat zenbaki sartuko dituzu? ");
        int kop = sc.nextInt();

        int bikoiti = 0, bakoiti = 0;

        for (int i = 0; i < kop; i++) {
            System.out.print("Sartu zenbakia: ");
            int z = sc.nextInt();
            if (z % 2 == 0) bikoiti++;
            else bakoiti++;
        }

        System.out.println("Bikoitiak: " + bikoiti);
        System.out.println("Bakoitiak: " + bakoiti);

        sc.close();
	}

}
