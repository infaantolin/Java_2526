package arik_08;

import java.util.Scanner;

public class KalkulagailuSinplea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("***************");
        System.out.println("   Kalkulagailua");
        System.out.println("***************");

        System.out.print("Sartu 1. zenbakia: ");
        double a = sc.nextDouble();
        System.out.print("Sartu 2. zenbakia: ");
        double b = sc.nextDouble();

        System.out.println("1. Gehitzea");
        System.out.println("2. Kenketa");
        System.out.println("3. Produktua");
        System.out.println("4. Dibisioa");
        System.out.println("5. Atera");

        System.out.print("Sartu nahi duzun aukera: ");
        int aukera = sc.nextInt();

        switch (aukera) {
            case 1: System.out.println(a + " + " + b + " = " + (a+b)); break;
            case 2: System.out.println(a + " - " + b + " = " + (a-b)); break;
            case 3: System.out.println(a + " * " + b + " = " + (a*b)); break;
            case 4: 
                if (b != 0) System.out.println(a + " / " + b + " = " + (a/b));
                else System.out.println("Ezin da zatitu 0-rekin");
                break;
            case 5: System.out.println("Agur!"); break;
            default: System.out.println("Aukera okerra.");
        }

        sc.close();
	}

}
