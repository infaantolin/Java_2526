package arik4;

public class Pertsona {

	private final char SEXUA = 'E'; // Emakumea
	private final int AZPI_PISU = -1;
	private final int NORMAL_PISU = 0;
	private final int GOI_PISU = 1;

	// Atributuak
	private String izena;
	private int adina;
	private String nan;
	private char sexua;
	private double pisua;
	private double altuera;

	// Eraikitzaileak
	public Pertsona() {
		this.nan = "00000000A";
		this.sexua = SEXUA;
	}

	public Pertsona(String izena, int adina, char sexua) {
		this.izena = izena;
		this.adina = adina;
		this.nan = sortuNAN();
		this.sexua = sexuaEgiaztatu(sexua);
	}

	public Pertsona(String izena, int adina, char sexua, double pisua, double altuera) {
		this.izena = izena;
		this.adina = adina;
		this.nan = sortuNAN();
		this.sexua = sexuaEgiaztatu(sexua);
		this.pisua = pisua;
		this.altuera = altuera;
	}

	// SETTER-ak
	public void setIzena(String izena) {
		this.izena = izena;
	}

	public void setAdina(int adina) {
		this.adina = adina;
	}

	public void setSexua(char sexua) {
		this.sexua = sexuaEgiaztatu(sexua);
	}

	public void setPisua(double pisua) {
		this.pisua = pisua;
	}

	public void setAltuera(double altuera) {
		this.altuera = altuera;
	}

	// GETTER-ak
//	public String getIzena() {
//		return izena;
//	}
//
//	public int getAdina() {
//		return adina;
//	}
//
//	public String getNan() {
//		return nan;
//	}
//
//	public char getSexua() {
//		return sexua;
//	}
//
//	public double getPisua() {
//		return pisua;
//	}
//
//	public double getAltuera() {
//		return altuera;
//	}

	// METODOAK
	/**
	 * GMI (IMC) kalkulatzen du. Pertsona bere pisu idealean dagoen kalkulatuko du
	 * (pisua kg-tan/altuera2 metrotan), formula horrek 20 baino balio txikiagoa
	 * itzultzen badu, funtzioak -1 bat itzultzen du, 20 eta 25 arteko zenbaki bat
	 * itzultzen badu (barne), bere pisu idealaren azpitik dagoela esan nahi du,
	 * funtzioak 0 bat itzultzen du eta kalkulatutako GMIa 25etik gorako balio bat
	 * bada esan nahi du gehiegizko pisua duela, funtzioak 1 bat itzultzen du.
	 */
	public int kalkulatuIMC() {
		double imc = this.pisua / (this.altuera * this.altuera);

		if (imc < 20)
			return AZPI_PISU;
		if (imc <= 25)
			return NORMAL_PISU;
		return GOI_PISU;
	}

	/** Adin nagusikoa den ala ez itzultzen du (Boolean) */
	public boolean adinezNagusikoaDa() {
		return adina >= 18;
	}

	/** Sartutako sexua zuzena dela egiaztatu. Zuzena ez bada, G izango da. */
	private char sexuaEgiaztatu(char sexua) {
		if (sexua != 'G' && sexua != 'E') {
			return 'G';
		}else return sexua;
	}

	/** 8 zifrako ausazko zenbaki bat sortzen du */
	private String sortuNAN() {
		int zenbakia = (int) (Math.random() * 100000000); // 0-99999999
		char letra = sortuLetra(zenbakia);
		String nanOsoa = Integer.toString(zenbakia) + letra;
		return nanOsoa;
		// return String.format("%08d%c", zenbakia, letra);
	}

	/** NAN zenbakitik abiatuta dagokion letra sortzen du */
	private char sortuLetra(int zenb) {
		// El string de letras es fijo y deberían de ir en este orden
		String letrak = "TRWAGMYFPDXBNJZSQVHLCKE";
		// La letra correspondiente será el resto de la división del número del DNI
		// entre las 23 posibilidades que hay
		return letrak.charAt(zenb % letrak.length());
	}

	/** objektuari buruzko informazio guztia itzultzen du. */
	@Override
	public String toString() {
		return "Izena: " + izena + ", Adina: " + adina + ", NAN: " + nan + ", Sexua: " + sexua + ", Pisua: " + pisua
				+ ", Altuera: " + altuera;
	}

}
