package pertsona;

import java.util.Scanner;

public class PertsonaApp {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// ============================
		// 2 pertsona sortu
		// ============================
		Pertsona p1 = new Pertsona();
		Pertsona p2 = new Pertsona();

		// 1. pertsonaren datuak eskatu
		System.out.println("1. pertsonaren datuak sartu:");
		System.out.print("Izena: ");
		p1.setIzena(sc.nextLine());
		System.out.print("Abizenak: ");
		p1.setAbizenak(sc.nextLine());
		System.out.print("Adina: ");
		p1.setAdina(sc.nextInt());
		sc.nextLine(); // buffer garbitu
		System.out.print("Ezkonduta? (true/false): ");
		p1.setEzkondua(sc.nextBoolean());
		sc.nextLine();
		System.out.print("NAN: ");
		p1.setNan(sc.nextLine());

		// 2. pertsonaren datuak eskatu
		System.out.println("\n2. pertsonaren datuak sartu:");
		System.out.print("Izena: ");
		p2.setIzena(sc.nextLine());
		System.out.print("Abizenak: ");
		p2.setAbizenak(sc.nextLine());
		System.out.print("Adina: ");
		p2.setAdina(sc.nextInt());
		sc.nextLine();
		System.out.print("Ezkonduta? (true/false): ");
		p2.setEzkondua(sc.nextBoolean());
		sc.nextLine();
		System.out.print("NAN: ");
		p2.setNan(sc.nextLine());

		// ============================
		// Emaitzak erakutsi
		// ============================
		System.out.println("\n=== PERTSONEN DATUAK ===");
		System.out.println(p1.getIzena() + " " + p1.getAbizenak() + " - " + p1.getAdina() + " urte");
		System.out.println(p2.getIzena() + " " + p2.getAbizenak() + " - " + p2.getAdina() + " urte");

		// ============================
		// Zaharrena nor den kalkulatu
		// ============================
		System.out.println("\n=== ZAHARRENA ===");
		if (p1.getAdina() > p2.getAdina()) {
			System.out.println("Zaharrena: " + p1.getIzena() + " " + p1.getAbizenak());
		} else if (p2.getAdina() > p1.getAdina()) {
			System.out.println("Zaharrena: " + p2.getIzena() + " " + p2.getAbizenak());
		} else {
			System.out.println("Bi pertsonak adin bera dute.");
		}

		sc.close();
	}
}
