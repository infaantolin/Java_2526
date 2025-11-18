package metodoak;

import java.util.Scanner;

public class Ejer_46 {

	static final int LIM = 20;
	static int numPrimos = 0;
	static int numCompuestos = 0;
	static Scanner sc = new Scanner(System.in);

	// Función: comprobarRepetido
	public static boolean comprobarRepetido(int num, int[] listaEscrita, int contador) {
		for (int i = 0; i < contador; i++) {
			if (listaEscrita[i] == num) {
				return true;
			}
		}
		return false;
	}

	// Función: pedirNumero
	public static int pedirNumero(int pos) {
		int numero;
		do {
			System.out.print("Introduzca un numero entero positivo " + pos + ": ");
			numero = sc.nextInt();
			if (numero < 1) {
				System.out.println("Numero no valido. Intente de nuevo.");
			}
		} while (numero < 1);
		return numero;
	}

	// Función: comprobarPrimo
	public static boolean comprobarPrimo(int n) {
		if (n <= 1)
			return false;
		int div = 2;
		while (div < n) {
			if (n % div == 0) {
				return false; // no es primo
			}
			div++;
		}
		return true; // si llega aquí, es primo
	}

	// Función: burbuja
	public static void burbuja(int tamanyo, int[] listaSinOrdenar, boolean ascendente) {
		for (int i = 0; i < tamanyo - 1; i++) {
			for (int j = i + 1; j < tamanyo; j++) {
				if (listaSinOrdenar[i] > listaSinOrdenar[j]) {
					int aux = listaSinOrdenar[i];
					listaSinOrdenar[i] = listaSinOrdenar[j];
					listaSinOrdenar[j] = aux;
				}
			}
		}

		if (ascendente) {
			for (int i = 0; i < tamanyo; i++) {
				System.out.print(listaSinOrdenar[i] + " ");
			}
		} else {
			for (int i = tamanyo - 1; i >= 0; i--) {
				System.out.print(listaSinOrdenar[i] + " ");
			}
		}
		System.out.println();
	}

	// Función: separarPrimosCompuestos
	public static void separarPrimosCompuestos(int[] listaEscrita) {
		int[] primos = new int[LIM];
		int[] compuestos = new int[LIM];

		for (int i = 0; i < LIM; i++) {
			boolean esPrimo = comprobarPrimo(listaEscrita[i]);
			if (esPrimo) {
				primos[numPrimos] = listaEscrita[i];
				numPrimos++;
			} else {
				compuestos[numCompuestos] = listaEscrita[i];
				numCompuestos++;
			}
		}

		System.out.println("\nHay " + numPrimos + " numeros primos:");
		for (int j = 0; j < numPrimos; j++) {
			System.out.print(primos[j] + " ");
		}

		System.out.println("\nNumeros primos ordenados en orden descendente:");
		burbuja(numPrimos, primos, false);

		System.out.println("\nHay " + numCompuestos + " numeros compuestos:");
		for (int j = 0; j < numCompuestos; j++) {
			System.out.print(compuestos[j] + " ");
		}

		System.out.println("\nNumeros compuestos ordenados en orden ascendente:");
		burbuja(numCompuestos, compuestos, true);
	}

	// MAIN
	public static void main(String[] args) {
		int[] lista = new int[LIM];
		int i = 0;

		while (i < LIM) {
			int aux = pedirNumero(i + 1);
			boolean repe = comprobarRepetido(aux, lista, i);

			while (repe) {
				System.out.println("Numero no valido (repetido)");
				aux = pedirNumero(i + 1);
				repe = comprobarRepetido(aux, lista, i);
			}

			lista[i] = aux;
			i++;
		}

		System.out.println("\nEl vector introducido es el siguiente:");
		for (int j = 0; j < LIM; j++) {
			System.out.print(lista[j] + " ");
		}
		System.out.println();

		separarPrimosCompuestos(lista);
	}
}