package temp;

public class Temperatura {

	// Celsius graduak Fahrenheit-era bihurtzen ditu
	public double celsiusToFahrenheit(double temp) {
		double fahrenheit = (temp * 9 / 5) + 32;
        return Math.round(fahrenheit * 100.0) / 100.0;
    }
	
	// Fahrenheit graduak Celsius-era bihurtzen ditu
	public double fahrenheitToCelsius(double temp) {
		double celsius = (temp - 32) * 5 / 9;
        return Math.round(celsius * 100.0) / 100.0;
    }
	
}
