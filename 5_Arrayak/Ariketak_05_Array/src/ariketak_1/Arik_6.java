package ariketak_1;

import java.util.Random;
// Array-a alderantzikatu

public class Arik_6 {

	// 1. taulaKargatu
	public static int[] taulaKargatu(int n, int balioMin, int balioMax) {
		Random rand = new Random();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = rand.nextInt(balioMax - balioMin + 1) + balioMin;
		}
		return array;
	}

	// 2. alderantzikatuArray
	public static void alderantzikatuArray(int[] array) {
		int ezker = 0, eskuin = array.length - 1;
		while (ezker < eskuin) {
			int aux = array[ezker];
			array[ezker] = array[eskuin];
			array[eskuin] = aux;
			ezker++;
			eskuin--;
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
		int[] taula = taulaKargatu(20, 1, 100);
		System.out.println("Hasierakoa:");
		arrayInprimatu(taula);

		alderantzikatuArray(taula);

		System.out.println("Alderantzikatuta:");
		arrayInprimatu(taula);
	}
}
