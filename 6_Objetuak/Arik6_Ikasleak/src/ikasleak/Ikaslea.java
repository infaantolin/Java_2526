package ikasleak;

public class Ikaslea {
	private String izena;
	private char sexua;
	private int adina;
	private float altuera;
	private float pisua;
	
	
	
	
	public Ikaslea(String izena, char sexua, int adina, float altuera, float pisua) {
		this.izena = izena;
		this.sexua = sexua;
		this.adina = adina;
		this.altuera = altuera;
		this.pisua = pisua;
	}
	
	
	public String getIzena() {
		return izena;
	}
	public void setIzena(String izena) {
		this.izena = izena;
	}
	public char getSexua() {
		return sexua;
	}
	public void setSexua(char sexua) {
		this.sexua = sexua;
	}
	public int getAdina() {
		return adina;
	}
	public void setAdina(int adina) {
		this.adina = adina;
	}
	public float getAltuera() {
		return altuera;
	}
	public void setAltuera(float altuera) {
		this.altuera = altuera;
	}
	public float getPisua() {
		return pisua;
	}
	public void setPisua(float pisua) {
		this.pisua = pisua;
	}

	public String getDatuak() {
		return izena + " " + sexua + " " + adina + " " + altuera + " " + pisua;
	}

	@Override
	public String toString() {
		return "Ikaslearen datuak: \n"
				+ "izena=" + izena + "\n sexua=" + sexua + "\n adina=" + adina + "\n altuera=" + altuera + "\n pisua="
				+ pisua + "]";
	}

}
