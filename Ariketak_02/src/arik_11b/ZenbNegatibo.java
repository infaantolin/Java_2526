package arik_11b;

import java.util.Scanner;

public class ZenbNegatibo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int bikoiti = 0, bakoiti = 0;
        int z;

        do {
            System.out.print("Sartu zenbakia (negatibo batekin bukatu): ");
            z = sc.nextInt();
            if (z >= 0) {
                if (z % 2 == 0) bikoiti++;
                else bakoiti++;
            }
        } while (z >= 0);

        System.out.println("Bikoitiak: " + bikoiti);
        System.out.println("Bakoitiak: " + bakoiti);

        sc.close();
	}

}
