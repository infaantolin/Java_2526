package metodoak;

public class Laguntzailea {
	// Metodo estatikoa: ez du baliorik bueltatzen
    public static void agurtu(String izena) {
        System.out.println("Kaixo, " + izena + "!");
    }

    // Metodo estatikoa: emaitza bueltatzen du
    public static int biderkatu(int a, int b) {
        return a * b;
    }
}