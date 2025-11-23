package arik03;

/**
 * Egin zirkulu baten azalera kalkulatzen duen aplikazio bat (pi*R2). Erradioa teklatuaren bidez eskatuko da (gogoratu String -etik double -ra pasatu behar dela Double.parseDouble-rekin). PI konstantea eta Math-en pow metodoa erabiltzen ditu.
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class Arik3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Sartu erradioa: ");
		double r = Double.parseDouble(sc.nextLine());

		double azalera = Math.PI * Math.pow(r, 2);
		System.out.println("Zirkuluaren azalera: " + azalera);

		// 2 hamartarrera borobildu - DecimalFormat
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("DecimalFormat erabiliz borobilduta: " + df.format(azalera));

		// 2 hamartarrera borobildu - Math.round
		double AzaleraBorobilduta = Math.round(azalera * 100.0) / 100.0;
		System.out.println("Math.round erabiliz borobilduta: " + AzaleraBorobilduta);

		sc.close();
	}

}
