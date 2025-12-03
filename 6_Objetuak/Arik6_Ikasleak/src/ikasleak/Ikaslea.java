package ikasleak;

public class Ikaslea {
	
	private final char SEXUA_E ='E';
	
	private String izena;
	private char sexua;
	private int adina;
	private double altuera;
	private double pisua;
	
	
	
	public Ikaslea(String izena, char sexua, int adina, double altuera, double pisua) {
		this.izena = izena;
		this.sexua = sexuaEgiaztatu(sexua);
		this.adina = adina;
		this.altuera = altuera;
		this.pisua = pisua;
	}
	
	
	public String getIzena() {
		return this.izena;
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
		return this.adina;
	}
	public void setAdina(int adina) {
		this.adina = adina;
	}
	public double getAltuera() {
		return this.altuera;
	}
	public void setAltuera(double altuera) {
		this.altuera = altuera;
	}
	public double getPisua() {
		return this.pisua;
	}
	public void setPisua(double pisua) {
		this.pisua = pisua;
	}

	/** Sartutako sexua zuzena dela egiaztatu. Zuzena ez bada, G izango da. */
	private char sexuaEgiaztatu(char sexua) {
		if (sexua != 'G' && sexua != 'E') {
			return SEXUA_E;
		} else
			return sexua;
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
