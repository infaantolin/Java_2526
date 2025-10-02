package ariketak_1;

import java.util.Scanner;

public class Arik_4metodoekin {

	public static void datuakSartu(Scanner sc, String[] izenak, double[] notak) {
        for (int i = 0; i < izenak.length; i++) {
            System.out.print("Sartu ikaslearen izena eta abizenak: ");
            izenak[i] = sc.nextLine();

            double nota;
            do {
                System.out.print("Sartu nota (0-10): ");
                nota = sc.nextDouble();
                sc.nextLine();
            } while (nota < 0 || nota > 10);

            notak[i] = nota;
        }
    }

    public static void zerrendaErakutsi(String[] izenak, double[] notak) {
        System.out.println("\n--- IKASLEEN ZERRENDA ---");
        for (int i = 0; i < izenak.length; i++) {
            System.out.println(izenak[i] + " - " + notak[i]);
        }
    }

    public static double batezbestekoa(double[] notak) {
        double batura = 0;
        for (double n : notak) batura += n;
        return batura / notak.length;
    }

    public static void handiagoak(String[] izenak, double[] notak, double batez) {
        System.out.println("\nBatezbestekoa baino handiagoak:");
        for (int i = 0; i < notak.length; i++) {
            if (notak[i] > batez) {
                System.out.println(izenak[i] + " - " + notak[i]);
            }
        }
    }

    public static void maximoa(String[] izenak, double[] notak) {
        double max = notak[0];
        for (double n : notak) if (n > max) max = n;
        System.out.println("\nNota altuena: " + max);
        for (int i = 0; i < notak.length; i++) {
            if (notak[i] == max) {
                System.out.println(izenak[i]);
            }
        }
    }

    public static void minimoa(String[] izenak, double[] notak) {
        double min = notak[0];
        for (double n : notak) if (n < min) min = n;
        System.out.println("\nNota txikiena: " + min);
        for (int i = 0; i < notak.length; i++) {
            if (notak[i] == min) {
                System.out.println(izenak[i]);
            }
        }
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        String[] izenak = new String[5];
        double[] notak = new double[5];

        datuakSartu(sc, izenak, notak);
        zerrendaErakutsi(izenak, notak);

        double batez = batezbestekoa(notak);
        System.out.println("\nKlasearen batezbestekoa: " + batez);

        handiagoak(izenak, notak, batez);
        maximoa(izenak, notak);
        minimoa(izenak, notak);

        sc.close();
    }
}