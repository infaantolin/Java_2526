package adibideak;

public class Adibidea {

	public static void main(String[] args) {
		int[] zenbakiak = { 4, 5, 15, 27, 42, 89 };
		System.out.println("Lehen elementua: " + zenbakiak[0]);
		System.out.println("Azken elementua:" + zenbakiak[zenbakiak.length - 1]);

		int batura = 0;
		for (int i = 0; i < zenbakiak.length; i++) {
			batura += zenbakiak[i];
		}
		System.out.println("Zenbakien batura: " + batura);
	}

}
