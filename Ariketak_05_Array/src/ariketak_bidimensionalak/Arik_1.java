package ariketak_bidimensionalak;

public class Arik_1 {

	// Konstanteak
    static final int IKASLEAK = 4;
    static final int MODULUAK = 3;

    // Datuen taulak
    static double[][] notak = {
        {5.2, 3.2, 6.7},
        {5.3, 6.5, 3.4},
        {2.3, 5.8, 9.7},
        {2.4, 5.5, 7.4}
    };

    static String[] ikasleak = {"Ana", "Kepa", "Miren", "Jon"};
    static String[] moduluak = {"PROG", "LM", "BD"};

    public static void main(String[] args) {

        // 1. Taula erakutsi (soilik zenbakiak)
        System.out.println("NOTEN TAULA (zenbakizkoa):");
        erakutsiTaula();

        // 2. Taula izenekin
        System.out.println("\nNOTEN TAULA (ikasle eta modulu izenekin):");
        erakutsiTaulaIzenekin();

        // 3. Ikasle bakoitzaren batezbestekoa
        double[] ikasleBatez = kalkulatuIkasleBatezbestekoak();
        System.out.println("\nIKASLEEN BATEZBESTEKOAK:");
        for (int i = 0; i < IKASLEAK; i++) {
            System.out.printf("%-6s %.2f\n", ikasleak[i], ikasleBatez[i]);
        }

        // 4. Modulu bakoitzaren batezbestekoa
        double[] moduluBatez = kalkulatuModuluBatezbestekoak();
        System.out.println("\nMODULUEN BATEZBESTEKOAK:");
        for (int j = 0; j < MODULUAK; j++) {
            System.out.printf("%-6s %.2f\n", moduluak[j], moduluBatez[j]);
        }

        // 5. Taula osoa batezbestekoekin
        System.out.println("\nTAULA OSOA (batezbestekoekin):");
        erakutsiTaulaBatezbestekoekin(ikasleBatez, moduluBatez);
    }

    // ============ METODOAK ============

    // Noten matrizea erakutsi (zenbaki hutsak)
    public static void erakutsiTaula() {
        for (int i = 0; i < IKASLEAK; i++) {
            for (int j = 0; j < MODULUAK; j++) {
                System.out.printf("%.1f\t", notak[i][j]);
            }
            System.out.println();
        }
    }

    // Ikasle eta modulu izenekin
    public static void erakutsiTaulaIzenekin() {
        System.out.print("\t");
        for (String mod : moduluak) {
            System.out.printf("%-6s", mod);
        }
        System.out.println();

        for (int i = 0; i < IKASLEAK; i++) {
            System.out.printf("%-6s", ikasleak[i]);
            for (int j = 0; j < MODULUAK; j++) {
                System.out.printf("%-6.1f", notak[i][j]);
            }
            System.out.println();
        }
    }

    // Ikasle bakoitzaren batezbestekoak kalkulatu
    public static double[] kalkulatuIkasleBatezbestekoak() {
        double[] batez = new double[IKASLEAK];
        for (int i = 0; i < IKASLEAK; i++) {
            double batura = 0;
            for (int j = 0; j < MODULUAK; j++) {
                batura += notak[i][j];
            }
            batez[i] = batura / MODULUAK;
        }
        return batez;
    }

    // Modulu bakoitzaren batezbestekoak kalkulatu
    public static double[] kalkulatuModuluBatezbestekoak() {
        double[] batez = new double[MODULUAK];
        for (int j = 0; j < MODULUAK; j++) {
            double batura = 0;
            for (int i = 0; i < IKASLEAK; i++) {
                batura += notak[i][j];
            }
            batez[j] = batura / IKASLEAK;
        }
        return batez;
    }

    // Taula osoa erakutsi ikasle eta modulu batezbestekoekin
    public static void erakutsiTaulaBatezbestekoekin(double[] ikasleBatez, double[] moduluBatez) {
        System.out.print("\t");
        for (String mod : moduluak) {
            System.out.printf("%-6s", mod);
        }
        System.out.println("Media");

        for (int i = 0; i < IKASLEAK; i++) {
            System.out.printf("%-6s", ikasleak[i]);
            for (int j = 0; j < MODULUAK; j++) {
                System.out.printf("%-6.1f", notak[i][j]);
            }
            System.out.printf("%.2f\n", ikasleBatez[i]);
        }

        System.out.print("Media ");
        for (int j = 0; j < MODULUAK; j++) {
            System.out.printf("%-6.2f", moduluBatez[j]);
        }
        System.out.println();
    }
}
