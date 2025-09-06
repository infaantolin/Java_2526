package arik_10;

import java.util.Scanner;

public class BiderketaTaulaZenb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Sartu zenbaki bat: ");
        int n = sc.nextInt();

        System.out.println("== for bidez ==");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n*i));
        }

        System.out.println("== while bidez ==");
        int i = 1;
        while (i <= 10) {
            System.out.println(n + " * " + i + " = " + (n*i));
            i++;
        }

        System.out.println("== do while bidez ==");
        i = 1;
        do {
            System.out.println(n + " * " + i + " = " + (n*i));
            i++;
        } while (i <= 10);

        sc.close();
	}

}
