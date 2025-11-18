package kotxeak;

/**
 * consideremos una clase Vehiculo que tiene un método protegido para obtener
 * información básica sobre el vehículo. También, tenemos una subclase Automovil
 * que hereda de Vehiculo y puede acceder al método protegido.
 * 
 * En este ejemplo, obtenerInfoVehiculo() es un método protegido en la clase
 * Vehiculo. La subclase Automovil puede acceder a este método protegido
 * utilizando la herencia y luego llamarlo desde su propio método público
 * mostrarInfoAutomovil().
 */
public class Adib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automovil automovil = new Automovil();
		automovil.mostrarInfoAutomovil();
	}

}
