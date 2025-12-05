import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App app = new App();
		app.m1();
		app.m2();
		app.convertir();
	}

	    private void convertir() {
	        String fechaString = "21/11/2023";
	        // Define el formato en el que está la cadena de entrada
	        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

	        try {
	            // Convierte el String a un objeto Date
	            Date fecha = formato.parse(fechaString);
	            System.out.println("Fecha convertida: " + fecha);
	        } catch (java.text.ParseException e) {
	            e.printStackTrace();
	        }
	    }

	
	private void m1() {
		Date fecha = new Date();
		
		System.out.println("fecha1:"+fecha);
		
		int anno = 2025;
		int mes = 2;
		int dia = 5;
		
		fecha = new Date(anno, mes, dia);
		System.out.println("fecha2:"+fecha);
		
		anno = 2025 - 1900;
		mes = 2 - 1;
		dia = 5;
		
		fecha = new Date(anno, mes, dia);
		System.out.println("fecha2:"+fecha);		
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("fecha formateada:"+ formato.format(fecha));	
		
		//se utiliza para sacar el time en milisegundos de dos fechas, 
		//restarlas y ver la diferencia de dias horas entre ellas
		long tiempo = fecha.getTime();
		System.out.println("fecha en milisegundos:"+tiempo);
		
		//saber si es menor o mayor
		if(fecha.after(new Date())){
			System.out.println(fecha + " es mayor");
		}
		if(fecha.before(new Date())){
			System.out.println(fecha + " es menor");
		}
		if(fecha.equals(new Date())){
			System.out.println(fecha + " berdina");
		}
		
		//como paso de String a Date??
		
		
	}

	private void m2() {
		LocalDate fecha = LocalDate.now();
		LocalTime hora = LocalTime.now();
		LocalDateTime fechaHora = LocalDateTime.now();
		
		System.out.println(fecha);
		System.out.println(hora);
		System.out.println(fechaHora);
		
	}

}
