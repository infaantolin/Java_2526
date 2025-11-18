package taxi;

public class Taxi {

	// ============================
	// Atributuak (private)
	// ============================
	private String matrikula;
	private String udalerria;
	private int motoreMota;
	// 0 = ezezaguna, 1 = diesel, 2 = gasolina

	private final String probintzia = "Bizkaia";
	// probintzia ez da aldatzen, final erabil daiteke

	// ============================
	// Eraikitzailea (aukerakoa)
	// ============================
	public Taxi() {
		// balio lehenetsiak
		this.matrikula = "";
		this.udalerria = "";
		this.motoreMota = 0;
	}

	// ============================
	// SET metodoak
	// ============================
	public void setMatrikula(String m) {
		this.matrikula = m;
	}

	public void setUdalerria(String u) {
		this.udalerria = u;
	}

	public void setMotoreMota(int mota) {
		if (mota >= 0 && mota <= 2) {
			this.motoreMota = mota;
		} else {
			System.out.println("Motore mota okerra! (0=ezezaguna, 1=diesel, 2=gasolina)");
		}
	}

	// ============================
	// GET metodoak
	// ============================
	public String getMatrikula() {
		return this.matrikula;
	}

	public String getUdalerria() {
		return this.udalerria;
	}

	public int getMotoreMota() {
		return this.motoreMota;
	}

	public String getProbintzia() {
		return this.probintzia;
	}

}
