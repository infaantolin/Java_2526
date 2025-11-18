package handienetikTxikienera;

import java.util.Scanner;

public class OrdenatuHiruZenbaki {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Hiru zenbaki irakurri
        System.out.print("Sartu lehen zenbakia: ");
        int a = sc.nextInt();

        System.out.print("Sartu bigarren zenbakia: ");
        int b = sc.nextInt();

        System.out.print("Sartu hirugarren zenbakia: ");
        int c = sc.nextInt();

        // Ordenazioa
        int handiena, erdikoa, txikiena;

        if (a >= b && a >= c) {
            handiena = a;
            if (b >= c) {
                erdikoa = b;
                txikiena = c;
            } else {
                erdikoa = c;
                txikiena = b;
            }
        } else if (b >= a && b >= c) {
            handiena = b;
            if (a >= c) {
                erdikoa = a;
                txikiena = c;
            } else {
                erdikoa = c;
                txikiena = a;
            }
        } else {
            handiena = c;
            if (a >= b) {
                erdikoa = a;
                txikiena = b;
            } else {
                erdikoa = b;
                txikiena = a;
            }
        }

        // Emaitza erakutsi
        System.out.println("Ordena handienetik txikienera: " + handiena + " - " + erdikoa + " - " + txikiena);

        sc.close();
    }
}