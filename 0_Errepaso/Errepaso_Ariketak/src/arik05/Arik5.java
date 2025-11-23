package arik05;

/**
 * Idatzi aplikazio bat String batekin, edozein pasahitz duena. Ondoren, pasahitza sartzeko eskatuko zaizu, 3 aldiz saiatuta. Asmatzen duzunean ez du gehiago pasahitza eskatuko eta «Zorionak» dioen mezua erakutsiko du. Ondo pentsatu irteteko baldintza (3 saiakera eta asmatzen badu irten egiten da, nahiz eta saiakerak geratu).
 */
import java.util.Scanner;

public class Arik5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pasahitza = "pasahitza";

		int saiakerak = 3;
		boolean asmatu = false;

		while (saiakerak > 0 && !asmatu) {
			System.out.print("Sartu pasahitza: ");
			String s = sc.nextLine();
			String proba = s.trim(); // hutsuneak kentzeko

			if (proba.equals(pasahitza)) {
				asmatu = true;
			} else {
				saiakerak--;
				System.out.println("Oker! Geratzen dira: " + saiakerak + " saiakera");
			}
		}

		if (asmatu)
			System.out.println("Zorionak!");
		else
			System.out.println("Sarbidea ukatuta.");

		sc.close();
	}

}
