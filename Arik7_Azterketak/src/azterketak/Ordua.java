package azterketak;

public class Ordua {
	private int ordua;
	private int min;
	
	
	public Ordua(int ordua, int min) {
		this.ordua = ordua;
		this.min = min;
	}


	public int getOrdua() {
		return ordua;
	}


	public void setOrdua(int ordua) {
		this.ordua = ordua;
	}


	public int getMin() {
		return min;
	}


	public void setMin(int min) {
		this.min = min;
	}


	
	@Override
	public String toString() {
		// 10:44
		// 10:5
		if(min<10)return ordua + ":0" + min;
		else return ordua + ":" + min;
	}
}
