package facturacion;

/**
 * Vamos a suponer ahora que estamos implementando una clase para manejar una
 * factura en un sistema de facturación. Aquí, utilizaremos un método privado
 * para calcular el impuesto interno de una factura, y este método solo será
 * utilizado internamente por la clase.
 * 
 * En este ejemplo, calcularImpuestoInterno() es un método privado que solo es
 * accesible dentro de la clase Factura. Se utiliza internamente para calcular
 * el impuesto interno y luego se llama desde el método público
 * calcularTotalConImpuesto().
 */

public class Factura {
	private double total;

	public Factura(double total) {
		this.total = total;
	}

	public double calcularTotalConImpuesto() {
		double impuesto = calcularImpuestoInterno(); // Llamada al método privado
		return total + impuesto;
	}

	private double calcularImpuestoInterno() {
		// Supongamos que el impuesto interno es el 15% del total
		return 0.15 * total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factura factura = new Factura(1000);
		System.out.println("Total con impuesto: " + factura.calcularTotalConImpuesto());

	}

}
