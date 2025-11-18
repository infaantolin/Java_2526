package kutxazaina;
import java.util.Scanner;

public class Kutxazaina {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        boolean berriro = true; // erabiltzaileak nahi du beste eragiketa bat?

        System.out.println("**** Ongi etorri kutxazain automatikora. *****\n");
        
        while (berriro) {
            int zenbatekoa, aux;
            

            // 1. Eskatu zenbatekoa eta balidatu
            do {
                System.out.print("Sartu atera nahi duzun zenbatekoa: ");
                zenbatekoa = sc.nextInt();
                aux =  zenbatekoa;
                
                if (aux < 10 || aux % 10 != 0) {
                    System.out.println("Errorea: sartutako zenbatekoa ez da zuzena. Saiatu berriro.");
                }
            } while (aux < 10 || aux % 10 != 0);

            // 2. Kalkulatu billeteak (gutxieneko kopurua)
            int billete50 = aux / 50;
            aux = aux % 50;

            int billete20 = aux / 20;
            aux = aux % 20;

            int billete10 = aux / 10;

            // 3. Emaitza erakutsi
            System.out.println("\n" + zenbatekoa + " euro aterako dira hurrengo moduan:");
            System.out.println("Banaketa:");
            if (billete50 > 0) {
                System.out.println(billete50 + " x 50 euroko billete");
            }
            if (billete20 > 0) {
                System.out.println(billete20 + " x 20 euroko billete");
            }
            if (billete10 > 0) {
                System.out.println(billete10 + " x 10 euroko billete");
            }

            // 4. Galdetu erabiltzaileari beste eragiketa bat egin nahi duen
            System.out.print("\nBeste eragiketa bat egin nahi duzu? (B/E): ");
            char erantzuna = sc.next().toUpperCase().charAt(0);

            if (erantzuna == 'E') {
                berriro = false;
                System.out.println("Eskerrik asko gure kutxazaina erabiltzeagatik.");
            }
        }

        sc.close();
    }
}