package adibideak;

import java.util.Random;

public class Adib_4 {

	public static void main(String[] args) {
		int[] array1; // Array-a deklaratu
		int elementuKop = 10;
		array1 = arraySortu(elementuKop); // Metodoari deitu.
	}
	
	public static int[] arraySortu (int nkop) {
		int[] arrayBerria = new int[nkop];
		Random rnd = new Random();
		
		for (int i = 0; i < nkop; i++) {
			arrayBerria[i] = rnd.nextInt(100); //0-99
		}
		return arrayBerria;
	}

}
