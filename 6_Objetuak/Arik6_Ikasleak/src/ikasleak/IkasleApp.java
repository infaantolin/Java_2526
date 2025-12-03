package ikasleak;

import java.util.Scanner;

public class IkasleApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int aukera = -1;
		
		IkasleMetodoak metodoak = new IkasleMetodoak();
		
		do {
			System.out.println(
					"Menu nagusia \n \n 1.- Ikasleen datuak kargatzea \n 2.- Datuak prozesatzea \n 3.- Ikasleen datuak erakustea  \n 4.- Ikasle baten datuak erakustea \n 0.- Amaiera\n");

			try {
				System.out.print("Aukera: ");
				aukera = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("Errorea: Zenbaki bat sartu.");
				continue;
			}

			switch (aukera) {
			case 1:
				metodoak.ikasleDatuakKargatu(sc);
				break;
			case 2:
				metodoak.datuakProzesatu();
				break;
			case 3:
				metodoak.ikaleenDatuakErakutsi();
				break;
			case 4:
				metodoak.ikaslebatenDatuakAurkeztu(sc);
				break;
			case 0:
				System.out.println("Amaiera!");
				break;
			default:
				System.out.println("Aukera okerra!");
				break;
			}

		} while (aukera != 0);

		sc.close();
	}

}
