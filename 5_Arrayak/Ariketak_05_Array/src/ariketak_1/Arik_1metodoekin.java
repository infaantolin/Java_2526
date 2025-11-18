package ariketak_1;

import java.util.Scanner;

public class Arik_1metodoekin {

	// Teklatutik irakurri adina (18-35 arteko balio zuzena)
	public static int adinaIrakurri(Scanner sc) {
        int adina;
        do {
            System.out.print("Sartu adina (18-35): ");
            adina = sc.nextInt();
        } while (adina < 18 || adina > 35);
        return adina;
    }

    // Kalkulatu arrayaren batezbestekoa
    public static double mediaKalkulatzea(int[] adinak) {
        int batura = 0;
        for (int i = 0; i < adinak.length; i++) {
            batura += adinak[i];
        }
        return (double) batura / adinak.length;
    }

    // Adinak eta batezbestekoa inprimatu
    public static void adinaInprimatu(int[] adinak) {
        for (int i = 0; i < adinak.length; i++) {
            System.out.println((i + 1) + ". ikaslearen adina: " + adinak[i]);
        }
        System.out.println("Batezbesteko adina: " + mediaKalkulatzea(adinak));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] adinak = new int[20];

        for (int i = 0; i < adinak.length; i++) {
            adinak[i] = adinaIrakurri(sc);
        }

        adinaInprimatu(adinak);
        sc.close();
    }
}
