package ariketak_1;
// Zeroak mugitu

import java.util.Random;

public class Arik_7 {

	// 1. taulaKargatu
    public static int[] taulaKargatu(int n, int balioMin, int balioMax) {
        Random rand = new Random();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(balioMax - balioMin + 1) + balioMin;
        }
        return array;
    }

    // 2. zeroakMugitu
    public static void zeroakMugitu(int[] array) {
        int index = 0;
        // Zeroak ez direnak ezkerrean
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[index++] = array[i];
            }
        }
        // Gainerakoa zeroak
        while (index < array.length) {
            array[index++] = 0;
        }
    }

    // 3. arrayInprimatu
    public static void arrayInprimatu(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // MAIN
    public static void main(String[] args) {
        int[] taula = taulaKargatu(20, 0, 5); // probatzeko tartea 0-ak sartzeko aukera izan dadin
        System.out.println("Hasierakoa:");
        arrayInprimatu(taula);

        zeroakMugitu(taula);

        System.out.println("Zeroak mugitu ondoren:");
        arrayInprimatu(taula);
    }
}
