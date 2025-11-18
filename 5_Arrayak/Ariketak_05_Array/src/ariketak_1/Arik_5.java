package ariketak_1;
// Letren zozketa eta maiztasuna

import java.util.Random;

public class Arik_5 {

	// 1. sortuZozketa
	public static int[] sortuZozketa(int jaurtiketaKop, int balioMin, int balioMax) {
		Random rand = new Random();
		int[] array = new int[jaurtiketaKop];

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(balioMax - balioMin + 1) + balioMin;
			// 'a' = 97, 'z' = 122 ASCII kodeetan
		}

		return array;
	}

	// 2. zozketaErakutsi
	public static void zozketaErakutsi(int[] zozketaArray) {
		for (int i = 0; i < zozketaArray.length; i++) {
			System.out.print((char) zozketaArray[i] + " ");
			if ((i + 1) % 15 == 0) {
				System.out.println(); // 15 zutabetan
			}
		}
		System.out.println();
	}

	// 3. zenbatuMaiztasuna
	public static int[] zenbatuMaiztasuna(int[] zozketaArray, int balioMin, int balioMax) {
		int[] maiztasunak = new int[balioMax - balioMin + 1];

		for (int i = 0; i < zozketaArray.length; i++) {
			maiztasunak[zozketaArray[i] - balioMin]++;
		}

		return maiztasunak;
	}

	// 4. maiztasunaErakutsi
	public static void maiztasunaErakutsi(int[] maiztasunArray, int balioMin, int balioMax) {
		for (int i = 0; i < maiztasunArray.length; i++) {
			char letra = (char) (balioMin + i);
			System.out.println(letra + " -> " + maiztasunArray[i]);
		}
	}

	// MAIN
	public static void main(String[] args) {
		int[] zozketa = sortuZozketa(100, 'a', 'z');
		zozketaErakutsi(zozketa);
		int[] maiztasunak = zenbatuMaiztasuna(zozketa, 'a', 'z');
		maiztasunaErakutsi(maiztasunak, 'a', 'z');
	}
}