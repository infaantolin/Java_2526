package pertsona;

/**
 * Adibide honetan, Pertsona klaseak izenaren eta adinaren datuak kapsulatzen
 * ditu eta datu horiek modu kontrolatuan atzitu eta aldatzeko metodo publikoak
 * ematen ditu.
 */

public class Pertsona {

	// Atributo pribatuak
	private String izena;
	private int adina;

	// Eraikitzailea
	public Pertsona(String izena, int adina) {
		this.izena = izena;
		this.adina = adina;
	}

	// izena lortzeko metodoa
	public String getIzena() {
		return izena;
	}

	// Izena ezartzeko metodoa
	public void setIzena(String izena) {
		this.izena = izena;
	}

	// Adina lortzeko metodoa
	public int getAdina() {
		return adina;
	}

	// Adina ezartzeko metodoa
	public void setAdina(int adina) {
		this.adina = adina;
	}

	public static void main(String[] args) {
		// Pertsona objektu bat sortu
		Pertsona pertsona = new Pertsona("Ane", 30);

		// Datuak atzitzea sarbide-metodoen bidez
		System.out.println("Izena: " + pertsona.getIzena());
		System.out.println("Adina: " + pertsona.getAdina());

		// Datuak aldatzea sarbide-metodoen bidez
		pertsona.setAdina(31);
		System.out.println("Adin berria: " + pertsona.getAdina());
	}

}
