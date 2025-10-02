package adibideak;
// 10 ausazko zenbaki sortu eta bakoitia/bikoitia adierazi

import java.util.Random;

public class Adib2_b {

	public static void main(String[] args) {
		int[] zenbakiak = new int[10];
		Random rnd = new Random();

		// 1. Array ausazko zenbakiekin bete (1-100 artekoak)
		for (int i = 0; i < zenbakiak.length; i++) {
			zenbakiak[i] = rnd.nextInt(100) + 1;
		}

		// 2. Zenbaki guztiak erakutsi eta bakoitia/bikoitia adierazi
		for (int i = 0; i < zenbakiak.length; i++) {
			System.out.print(zenbakiak[i]);
			if (zenbakiak[i] % 2 == 0) {
				System.out.println(" → Bikoitia");
			} else {
				System.out.println(" → Bakoitia");
			}
		}

	}

}
