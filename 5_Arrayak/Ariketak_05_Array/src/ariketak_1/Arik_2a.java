package ariketak_1;

public class Arik_2a {

	public static void main(String[] args) {
		int[] zenbakiak = new int[20];

		// Array ausazko zenbakiekin (1-100)
		for (int i = 0; i < zenbakiak.length; i++) {
			zenbakiak[i] = (int) (Math.random() * 100) + 1;
		}

		int bikoitiBatura = 0;
		long bakoitiProduktua = 1;

		for (int i = 0; i < zenbakiak.length; i++) {
			if (i % 2 == 0) {
				bikoitiBatura += zenbakiak[i];
			} else {
				bakoitiProduktua *= zenbakiak[i];
			}
		}

		// Emaitzak
		System.out.print("Array-aren edukia: ");
		for (int n : zenbakiak) {
			System.out.print(n + " ");
		}
		System.out.println("\n\nPosizio bikoitien batura: " + bikoitiBatura);
		System.out.println("Posizio bakoitien produktua: " + bakoitiProduktua);
	}
}
