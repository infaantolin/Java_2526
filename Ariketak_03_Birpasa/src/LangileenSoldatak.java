import java.util.Scanner;

public class LangileenSoldatak {

    // 1. soldataKalkulatu
    public static double soldataKalkulatu(double soldataGordina, int adina, int semeAlabak) {
        double soldataOsoa = soldataGordina;
        soldataOsoa += semeAlabak * 25; //25€ seme-alaba bakoitzeko
        // 60 eta 65 urte artean daukan urte bakoitzagatik 50 euro
        if (adina >= 60 && adina <= 65) {
            soldataOsoa += (adina - 59) * 50;
        }
        return soldataOsoa;
    }

    // 2. jubilaziorakoZenbat
    public static int jubilaziorakoZenbat(int adina) {
        // 65 urte dituztenean jubilatuko dira
        return 65 - adina;
    }

    // 3. soldataMaila
    public static String soldataMaila(double soldataOsoa) {
        if (soldataOsoa < 1000) return "Soldata baxua.";
        else if (soldataOsoa <= 2000) return "Soldata ertaina.";
        else if (soldataOsoa <= 3000) return "Soldata altua.";
        else return "Soldata oso altua.";
    }

    // 4. emaitzakErakutsi
    public static void emaitzakErakutsi(String izena, double soldataOsoa, int adina) {
        System.out.println("\n--- Langilearen datuak ---");
        System.out.println("Izena: " + izena);
        System.out.println("Soldata osoa: " + soldataOsoa + " €");
        System.out.println("Maila: " + soldataMaila(soldataOsoa));
        System.out.println("Jubilaziorako falta zaio: " + jubilaziorakoZenbat(adina) + " urte");
    }

    // Programa nagusia
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totala = 0;   // soldaten batura
        int kopurua = 0;     // zenbat langile sartu diren

        boolean berriro = true;

        while (berriro) {
            // Datuak eskatu
            System.out.print("Sartu langilearen izena: ");
            String izena = sc.nextLine();

            double soldataGordina;
            do {
                System.out.print("Sartu soldata gordina (800-3000): ");
                soldataGordina = sc.nextDouble();
            } while (soldataGordina < 800 || soldataGordina > 3000);

            int adina;
            do {
                System.out.print("Sartu adina (18-65): ");
                adina = sc.nextInt();
            } while (adina < 18 || adina > 65);

            System.out.print("Sartu seme-alaba kopurua: ");
            int semeAlabak = sc.nextInt();
            sc.nextLine(); // buffer garbitu

            // Kalkuluak
            double soldataOsoa = soldataKalkulatu(soldataGordina, adina, semeAlabak);
            // Totala eta kontagailua eguneratu
            totala += soldataOsoa;
            kopurua++;

            // Emaitzak erakutsi
            emaitzakErakutsi(izena, soldataOsoa, adina);

            // Beste langile bat sartu nahi duen galdetu
            System.out.print("\nBeste langile baten datuak sartu nahi dituzu? (Bai/Ez): ");
            String erantzuna = sc.nextLine().trim().toLowerCase();
            if (!erantzuna.equals("bai")) {
                berriro = false;
            }
        }

        // Estatistikak
        double batazbestekoa = (kopurua > 0) ? totala / kopurua : 0;
        System.out.println("\n--- Estatistikak ---");
        System.out.println("Langile guztien soldatak guztira: " + totala + " €");
        System.out.println("Langile guztien batazbesteko soldata: " + batazbestekoa + " €");

        sc.close();

    }

}
