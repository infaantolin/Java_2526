package azterketak;

import java.util.Date;

public class Azterketa {

	// Atributuak
	private String irakIzena;
	private String gela;
	private Date data;
	private Ordua ordua;

	// Eraikitzailea
	public Azterketa(String irakIzena, String gela, Date data, Ordua ordua) {
		this.irakIzena = irakIzena;
		this.gela = gela;
		this.data = data;
		this.ordua = ordua;
	}

	// GETTERak eta SETTERak
	public String getIrakIzena() {
		return irakIzena;
	}

	public void setIrakIzena(String irakIzena) {
		this.irakIzena = irakIzena;
	}

	public String getGela() {
		return gela;
	}

	public void setGela(String gela) {
		this.gela = gela;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Ordua getOrdua() {
		return ordua;
	}

	public void setOrdua(Ordua ordua) {
		this.ordua = ordua;
	}

	@Override
	public String toString() {
		return irakIzena + " " + gela + " " + data + " " + ordua;
	}
}
