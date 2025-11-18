package pertsona;

public class Pertsona {

	// ============================
	// Atributuak (private)
	// ============================
	private String izena;
	private String abizenak;
	private int adina;
	private boolean ezkondua;
	private String nan;

	// ============================
	// Eraikitzailea
	// ============================
	public Pertsona() {
		// Hasierako balioak (aukerakoa)
		this.izena = "";
		this.abizenak = "";
		this.adina = 0;
		this.ezkondua = false;
		this.nan = "";
	}

	// ============================
	// SET metodoak
	// ============================
	public void setIzena(String iz) {
		this.izena = iz;
	}

	public void setAbizenak(String ab) {
		this.abizenak = ab;
	}

	public void setAdina(int a) {
		this.adina = a;
	}

	public void setEzkondua(boolean e) {
		this.ezkondua = e;
	}

	public void setNan(String n) {
		this.nan = n;
	}

	// ============================
	// GET metodoak
	// ============================
	public String getIzena() {
		return this.izena;
	}

	public String getAbizenak() {
		return this.abizenak;
	}

	public int getAdina() {
		return this.adina;
	}

	public boolean isEzkondua() {
		return this.ezkondua;
	}

	public String getNan() {
		return this.nan;
	}
}
