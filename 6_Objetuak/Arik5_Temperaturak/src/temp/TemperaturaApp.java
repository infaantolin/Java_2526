package temp;

import java.util.Scanner;

public class TemperaturaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Temperatura t1 = new Temperatura();

		System.out.println("Aukeratu bihurketa mota: \n 1. celsiusToFahrenheit \n 2. fahrenheitToCelsius");
		int aukera = Integer.parseInt(sc.nextLine());

		System.out.println("Sartu tenperatura: ");
		double temp = Double.parseDouble(sc.nextLine());

		if (aukera == 1) {
			System.out.println("Celsius: " + temp + " - Fahrenheit: " + t1.celsiusToFahrenheit(temp));
		} else if (aukera == 2) {
			System.out.println("Fahrenheit: "+ temp + " - Celsius: " + t1.fahrenheitToCelsius(temp));
		} else {
			System.out.println("Aukera desegokia.");
		}

		sc.close();

	}

}
