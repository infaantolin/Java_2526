package metodoak;

public class MetodoAdibidea {

    // Metodo nagusia
    public static void main(String[] args) {
        System.out.println("Programa hasita...");

        // Deitu beste metodo bati
        agurtu("Ane");

        // Metodo batek emaitza bueltatzen duenean
        int z = biderkatu(5, 3);
        System.out.println("5 * 3 = " + z);
    }

    // Metodo sinplea: ez du ezer bueltatzen (void)
    public static void agurtu(String izena) {
        System.out.println("Kaixo, " + izena + "!");
    }

    // Metodoa balio bat bueltatzen du (int)
    public static int biderkatu(int a, int b) {
        return a * b;
    }
}