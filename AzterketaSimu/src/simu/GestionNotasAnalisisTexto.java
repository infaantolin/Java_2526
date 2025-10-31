package simu;

import java.util.Scanner;

public class GestionNotasAnalisisTexto {

	public static void main(String[] args) {
		// 1. Declarar los arrays nombres y notas
		String[] nombres = new String[3];
		double[][] notas = new double[3][4];
		Scanner scanner = new Scanner(System.in);

		// 2. Llamar a los métodos en el orden adecuado
		rellenarDatos(nombres, notas, scanner);

		System.out.println("\n--- Resultados ---");
		mostrarMedias(nombres, notas);

		String mejorAlumno = mejorAlumno(nombres, notas);
		System.out.println("El mejor alumno es: " + mejorAlumno);

		System.out.println("\n--- Análisis de texto ---");
		scanner.nextLine(); // Limpiar buffer
		System.out.print("Introduce una frase: ");
		String frase = scanner.nextLine();

		// Análisis de texto
		System.out.println("Palabras: " + contarPalabras(frase));
		System.out.println("Vocales: " + contarVocales(frase));
		System.out.println("Frase invertida: " + invertirFrase(frase));

		scanner.close();
	}

	public static void rellenarDatos(String[] nombres, double[][] notas, Scanner scanner) {
		for (int i = 0; i < nombres.length; i++) {
			System.out.print("Introduce el nombre del alumno " + (i + 1) + ": ");
			nombres[i] = scanner.next();

			scanner.nextLine(); // Limpiar el buffer después de next()

			System.out.print("Introduce sus 4 notas: ");
			String notasString = scanner.nextLine();

			// Dividir el String por espacios y convertir a double
			String[] notasArray = notasString.split(" ");
			for (int j = 0; j < notas[i].length && j < notasArray.length; j++) {
				notas[i][j] = Double.parseDouble(notasArray[j]);
			}
		}
	}

	public static double calcularMedia(double[] notasAlumno) {
		double suma = 0;
		for (double nota : notasAlumno) {
			suma += nota;
		}
		return suma / notasAlumno.length;
	}

	public static void mostrarMedias(String[] nombres, double[][] notas) {
		for (int i = 0; i < nombres.length; i++) {
			double media = calcularMedia(notas[i]);
			System.out.printf("%s -> Media: %.2f\n", nombres[i], media);
		}
	}

	public static String mejorAlumno(String[] nombres, double[][] notas) {
		double mejorMedia = 0;
		String mejorAlumno = "";

		for (int i = 0; i < nombres.length; i++) {
			double mediaActual = calcularMedia(notas[i]);
			if (mediaActual > mejorMedia) {
				mejorMedia = mediaActual;
				mejorAlumno = nombres[i];
			}
		}
		return mejorAlumno;
	}

	public static int contarPalabras(String frase) {
		if (frase == null || frase.trim().isEmpty()) {
			return 0;
		}
		String[] palabras = frase.trim().split("\\s+");
		return palabras.length;
	}

	public static int contarVocales(String frase) {
		int contador = 0;
		String fraseMinusculas = frase.toLowerCase();

		for (int i = 0; i < fraseMinusculas.length(); i++) {
			char caracter = fraseMinusculas.charAt(i);
			if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
				contador++;
			}
		}
		return contador;
	}

	public static String invertirFrase(String frase) {
		StringBuilder fraseInvertida = new StringBuilder();

		for (int i = frase.length() - 1; i >= 0; i--) {
			fraseInvertida.append(frase.charAt(i));
		}

		return fraseInvertida.toString();
	}
}