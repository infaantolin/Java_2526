package metodoak;

public class MetodoNagusia {

	public static void main(String[] args) {
		System.out.println("Programa hasita...");

        // Metodo estatikoari deitzea beste klase batean
        Laguntzailea.agurtu("Ane");

        int emaitza = Laguntzailea.biderkatu(4, 7);
        System.out.println("4 * 7 = " + emaitza);
    }
}