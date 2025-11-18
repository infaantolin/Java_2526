package pertsona;

public class Pertsona {
	// ============================
	// Atributuak
	// ============================
	private String izena;
	private String abizenak;
	private int adina;
	private boolean ezkondua;
	private String nan;

	// ============================
	// Eraikitzailea
	// ============================
	public Pertsona(String izena, String abizenak, int adina, boolean ezkondua, String nan) {
		this.izena = izena;
		this.abizenak = abizenak;
		this.adina = adina;
		this.ezkondua = ezkondua;
		this.nan = nan;
	}

	// ============================
	// GET metodoak
	// ============================
	public String getIzena() {
		return izena;
	}

	public String getAbizenak() {
		return abizenak;
	}

	public int getAdina() {
		return adina;
	}

	public String getNan() {
		return nan;
	}

	// ============================
	// toString() — informazioa erakusteko
	// ============================
	@Override
	public String toString() {

		String egoera = ezkondua ? "Ezkonduta" : "Ez ezkonduta";

		return "Pertsona {" + " Izen-abizenak='" + izena + " " + abizenak + '\'' + ", Adina=" + adina + ", Egoera="
				+ egoera + ", NAN='" + nan + '\'' + " }";
	}

	// ============================
	// Objektuen arteko konparazioa
	// ============================
	/**
	 * Bi pertsonen adina konparatzen du.
	 * 
	 * @param bestePertsona alderatzeko pertsona
	 * @return this zaharragoa bada true
	 */
	public boolean zaharragoaDa(Pertsona bestePertsona) {
		return this.adina > bestePertsona.adina;
	}
}
