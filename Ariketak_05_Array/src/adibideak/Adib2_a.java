package adibideak;
// 10 ausazko zenbaki sortu eta bakoitia/bikoitia adierazi

public class Adib2_a {

	public static void main(String[] args) {
		int[] zenbakiak = new int[10];

		// 1. Array-a ausazko 10 zenbakiekin bete (1-100 artekoak)
		for (int i = 0; i < zenbakiak.length; i++) {
			zenbakiak[i] = (int) (Math.random() * 100) + 1; // casting -> double int-era bihurtzen du
		}

		// 2. Zenbaki guztiak erakutsi eta bakoitia/bikoitia diren adierazi
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
