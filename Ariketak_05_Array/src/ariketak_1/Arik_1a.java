package ariketak_1;

public class Arik_1a {

	public static void main(String[] args) {
		int[] adinak = new int[20];
		int batura = 0;

		// 20 adin ausazko sortu (18-35 artean)
		for (int i = 0; i < adinak.length; i++) {
			adinak[i] = (int) (Math.random() * 18) + 18;
			batura += adinak[i];
		}

		double batezbestekoa = (double) batura / adinak.length;

		// Emaitzak
		for (int i = 0; i < adinak.length; i++) {
			System.out.println((i + 1) + ". ikaslearen adina: " + adinak[i]);
		}
		System.out.println("Batezbesteko adina: " + batezbestekoa);
	}
}