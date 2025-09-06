package aldagai_konstanteak;

public class KonstanteakAdibidea {

	// Konstante globalak (static final)
    static final double BEZ = 21.0;
    static final double KPI = 3.5;
    static final double PI = 3.1416;
    
	public static void main(String[] args) {
		// BEZ erabiliz prezio bat kalkulatu
        double prezioNetoa = 100;
        double prezioFinala = prezioNetoa + (prezioNetoa * BEZ / 100);

        System.out.println("Prezio netoa: " + prezioNetoa + " €");
        System.out.println("BEZ tasa: " + BEZ + "%");
        System.out.println("Prezio finala: " + prezioFinala + " €");

        // KPI konstantea ere erabili
        System.out.println("KPI balioa: " + KPI);

        // PI konstantea erabiliz azalera kalkulatu
        double r = 5;
        double azalera = PI * r * r;
        System.out.println("Erradio " + r + " duen zirkunferentziaren azalera = " + azalera);

        // Konstante bat aldatzen saiatu → errorea emango luke
        // BEZ = 18;  // ❌ konpilazio errorea

	}

}
