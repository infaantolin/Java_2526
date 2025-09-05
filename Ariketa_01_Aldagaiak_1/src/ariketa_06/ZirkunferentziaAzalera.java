package ariketa_06;

//  5,2 zentimetroko erradioa duen zirkunferentzia baten azalera kalkulatu eta pantailan agertu. Azalera=π×r2

public class ZirkunferentziaAzalera {

	public static void main(String[] args) {
		// Erradioa cm-tan
        double erradioa = 5.2;

        // Azalera kalkulatu
        double azalera = Math.PI * erradioa * erradioa;

        // Emaitza pantailaratu
        System.out.println("Erradioa = " + erradioa + " cm");
        System.out.println("Zirkunferentziaren azalera = " + azalera + " cm^2");
	}

}
