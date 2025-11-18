package arik_13;

import java.util.Scanner;

public class IkasleNotaHandiago7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int gainditu = 0, ezGainditu = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ". ikaslearen nota: ");
            int nota = sc.nextInt();
            if (nota >= 7) gainditu++;
            else ezGainditu++;
        }

        System.out.println("7 edo gehiago dutenak: " + gainditu);
        System.out.println("7 baino gutxiago dutenak: " + ezGainditu);

        sc.close();
	}

}
