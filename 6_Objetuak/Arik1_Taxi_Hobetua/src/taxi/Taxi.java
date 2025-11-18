package taxi;

public class Taxi {

	// ============================
	// Atributuak
	// ============================
	private final String probintzia = "Bizkaia";
	private String matrikula;
	private String udalerria;
	private int motoreMota; // 0=ezezaguna, 1=diesel, 2=gasolina

	// ============================
	// Eraikitzaile bakarra
	// ============================
	public Taxi(String matrikula, String udalerria, int motoreMota) {
		this.matrikula = matrikula;
		this.udalerria = udalerria;
		if (motoreMota >= 0 && motoreMota <= 2) {
			this.motoreMota = motoreMota;
		} else {
			this.motoreMota = 0;
		}
	}

	// ============================
	// GET metodoak
	// ============================
	public String getMatrikula() {
		return matrikula;
	}

	public String getUdalerria() {
		return udalerria;
	}

	public int getMotoreMota() {
		return motoreMota;
	}

	public String getProbintzia() {
		return probintzia;
	}

	// ============================
	// toString() — informazioa erakusteko
	// ============================
	@Override
	public String toString() {

		String mota = switch (motoreMota) {
		case 1 -> "Diesel";
		case 2 -> "Gasolina";
		default -> "Ezezaguna";
		};

		return "Taxi {" + " Probintzia='" + probintzia + '\'' + ", Matrikula='" + matrikula + '\'' + ", Udalerria='"
				+ udalerria + '\'' + ", MotoreMota=" + mota + " }";
	}

	// ============================
	// Objektuen arteko konparazioa
	// ============================
	/**
	 * Bi taxi konparatzen ditu motor motaren arabera.
	 * 
	 * @param besteTaxi alderatu nahi den taxi objektua
	 * @return true bi taxiek motor mota bera badute
	 */
	public boolean motorMotaBerdinaDa(Taxi besteTaxi) {
		return this.motoreMota == besteTaxi.motoreMota;
	}
}
