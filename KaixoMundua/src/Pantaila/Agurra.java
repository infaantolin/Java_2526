package Pantaila;
import java.util.Scanner;

public class Agurra {

	public static void main(String[] args) {
		// Scanner objektua sortu (teklatutik datuak irakurtzeko)
        Scanner teklatua = new Scanner(System.in);

        // Erabiltzaileari mezua erakutsi
        System.out.print("Sartu zure izena: ");

        // Irakurri erabiltzaileak idatzitakoa
        String izena = teklatua.nextLine();

        // Mezua pantailaratu
        System.out.println("Kaixo, " + izena + "!");

        // Scanner itxi
        teklatua.close();
	}

}
