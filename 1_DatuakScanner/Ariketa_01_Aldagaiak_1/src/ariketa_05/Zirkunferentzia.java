package ariketa_05;

// 3 metroko erradio-zirkunferentzia baten luzera kalkulatu eta pantailan agertu.

public class Zirkunferentzia {

	public static void main(String[] args) {
		// Erradioa (3 metro)
        double erradioa = 3.0;

        // Luzera kalkulatzeko formula: L = 2 * PI * r
        double luzera = 2 * Math.PI * erradioa;

        // Emaitza pantailaratu
        System.out.println("Erradioa = " + erradioa + " m");
        System.out.println("Zirkunferentziaren luzera = " + luzera + " m");
	}

}
