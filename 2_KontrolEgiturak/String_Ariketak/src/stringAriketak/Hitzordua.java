package stringAriketak;

import java.util.Scanner;

public class Hitzordua {

	public static void main(String[] args) {
		int tis = 0;
		String abizena = "";
		String jaiotzeData = "";
		int hitzordua = 1;
		String zerbitzuMota = "";
		String hitzorduMota = "";
		boolean ondoZbk = false;
		boolean atzeraItzuli = false;
		int aukera = 0;

		// ================================= Erabiltzailearen datuak eskuratu.
		Scanner teklatua = new Scanner(System.in);
		// TIS irakurri.
		do {
			try {
				System.out.println("TIS zenbakia txertatu");
				tis = Integer.parseInt(teklatua.nextLine());
				ondoZbk = true;
			} catch (Exception e) {
				System.out.println("Ez duzu zenbaki bat sartu, berriro saiatu.");
			}
		} while (ondoZbk == false);

		// Abizena irakurri
		System.out.println("Sartu lehen abizena");
		abizena = teklatua.nextLine();

		// Jaiotze data irakurri.
		System.out.println("Sartu jaiotze data");
		jaiotzeData = teklatua.nextLine();

		// ================================= Zerbitzua aukeratu.
		do {
			// Garrantzitsua aldagaiak berabiaraztea. Bestela bukle infinitoak egon litezke.
			atzeraItzuli = false;
			ondoZbk = false;
			do {
				try {
					System.out.println("Aukeratu zerbitzua \n 1-Ezabatu hitzordua \n 2-Eskatu hitzordua");
					aukera = Integer.parseInt(teklatua.nextLine());
					if (aukera == 1 || aukera == 2) {
						ondoZbk = true;
					}
				} catch (Exception e) {
					System.out.println("Ez duzu baliozko aukera egin, berriro saiatu.");
				}
			} while (ondoZbk == false);
			// ===================== Hitzordua ezabatu.
			if (aukera == 1) {
				ondoZbk = false;
				do {
					try {
						System.out.println("Sartu hitzordu zenbakia");
						hitzordua = Integer.parseInt(teklatua.nextLine());
						ondoZbk = true;
					} catch (Exception e) {
						System.out.println("Ez duzu zenbaki bat sartu, berriro saiatu.");
					}
				} while (ondoZbk == false);
				System.out.println(hitzordua + " zenbakia duen hitzordua bertan behera utzi da");
			} else {
				// ===================== Hitzordua eskatu.
				// --------- Zerbitzu mota.
				ondoZbk = false;
				do {
					try {
						System.out.println(
								"Aukeratu zerbitzua \n 1-Erizainarekin hitzordua \n 2-Medikuarekin hitzordua\n 3-Itzuli hasierara\n");
						aukera = Integer.parseInt(teklatua.nextLine());
						if (aukera >= 1 && aukera <= 3) {
							ondoZbk = true;
						}
					} catch (Exception e) {
						System.out.println("Ez duzu baliozko aukera egin, berriro saiatu.");
					}
				} while (ondoZbk == false);

				switch (aukera) {
				case 1:
					zerbitzuMota = "Erizainarekin";
					break;
				case 2:
					zerbitzuMota = "Medikuarekin";
					break;
				case 3:
					atzeraItzuli = true;
					break;
				}
				// --------- Hitzordu mota.
				if (atzeraItzuli == false) {
					ondoZbk = false;
					do {
						try {
							System.out.println(
									"Hitzordu mota aukeratu \n 1-Presentziala \n 2-Telefonoa \n 3-Itzuli hasierara \n");
							aukera = Integer.parseInt(teklatua.nextLine());
							if (aukera >= 1 && aukera <= 3) {
								ondoZbk = true;
							}
						} catch (Exception e) {
							System.out.println("Ez duzu baliozko aukera egin, berriro saiatu.");
						}
					} while (ondoZbk == false);

					switch (aukera) {
					case 1:
						hitzorduMota = "Presentziala";
						break;
					case 2:
						hitzorduMota = "Telefonoz";
						break;
					case 3:
						atzeraItzuli = true;
						break;
					}
					// ===================== Hitzorduaren informazioa aurkeztu.
					if (atzeraItzuli == false) {
						System.out.println("Zure " + zerbitzuMota + " hitzordu bat duzu: " + hitzorduMota
								+ ". Hauek dira datuak:");
						System.out.println("TIS: " + tis);
						System.out.println("Abizena: " + abizena);
						System.out.println("Jaiotze data: " + jaiotzeData);
						System.out.println("Hitzordu zenbakia: " + hitzordua++);
					}
				}

			}
		} while (atzeraItzuli == true);

		teklatua.close();

	}

}
