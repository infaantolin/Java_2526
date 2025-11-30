package kotxea;

public class Kotxea {
	private int abiadura;

	public Kotxea() {
		abiadura = 0;
	}

	// egungo abiadura itzultzen du
	public int getAbiadura() {
		return abiadura;
	}

//	public void setAbiadura(int abiadura) {
//		this.abiadura = abiadura;
//	}

	// Metodo horrek abiadura eguneratzen du, orduko kilometro gehiagotan.
	public void bizkortu(int gehiago) {
		this.abiadura += gehiago;
	}

	// Metodo honek abiadura eguneratzen du kilometro gutxiago orduko.
	public void geldotu(int gutxiago) {
		if (this.abiadura < gutxiago)
			this.abiadura = 0;
		else
			this.abiadura -= gutxiago;
	}

}
