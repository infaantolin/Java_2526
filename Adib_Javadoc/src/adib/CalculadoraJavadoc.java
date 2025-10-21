package adib;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase CalculadoraJavadoc.
 * <p>
 * Este programa implementa una calculadora básica en consola con las
 * operaciones de suma, resta, multiplicación y división. El usuario puede
 * introducir dos números y elegir la operación deseada desde un menú.
 * </p>
 *
 * <p>
 * Incluye ejemplos de documentación con Javadoc, utilizando etiquetas como
 * {@code @param}, {@code @return}, {@code @throws}, {@code @see}, etc.
 * </p>
 *
 * @author Jon Iruretagoiena
 * @version 1.0
 * @since 2025-10-04
 */
public class CalculadoraJavadoc {

	/**
	 * Método principal del programa.
	 * <p>
	 * Muestra un menú de opciones al usuario y ejecuta las operaciones
	 * seleccionadas hasta que el usuario elija salir.
	 * </p>
	 *
	 * @param args Argumentos de línea de comandos (no utilizados en este programa)
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opcion = 0;

		System.out.println("=== CALCULADORA JAVADOC ===");

		do {
			System.out.println("\nMenú de opciones:");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Salir");
			System.out.print("Selecciona una opción: ");

			try {
				opcion = sc.nextInt();

				if (opcion >= 1 && opcion <= 4) {
					System.out.print("Introduce el primer número: ");
					double a = sc.nextDouble();
					System.out.print("Introduce el segundo número: ");
					double b = sc.nextDouble();

					double resultado = 0;

					switch (opcion) {
					case 1:
						resultado = sumar(a, b);
						System.out.println("Resultado: " + resultado);
						break;
					case 2:
						resultado = restar(a, b);
						System.out.println("Resultado: " + resultado);
						break;
					case 3:
						resultado = multiplicar(a, b);
						System.out.println("Resultado: " + resultado);
						break;
					case 4:
						resultado = dividir(a, b);
						System.out.println("Resultado: " + resultado);
						break;
					}
				} else if (opcion != 5) {
					System.out.println("⚠️ Opción no válida. Inténtalo de nuevo.");
				}

			} catch (InputMismatchException e) {
				System.err.println(
						"❌ Error: debes introducir un número entero para la opción o un valor numérico válido.");
				sc.nextLine(); // Limpiar el buffer
			} catch (ArithmeticException e) {
				System.err.println("❌ Error matemático: " + e.getMessage());
			}

		} while (opcion != 5);

		System.out.println("👋 Programa finalizado. ¡Hasta pronto!");
		sc.close();
	}

	/**
	 * Suma dos números reales.
	 *
	 * @param a Primer número
	 * @param b Segundo número
	 * @return La suma de {@code a} y {@code b}
	 * @see #restar(double, double)
	 */
	public static double sumar(double a, double b) {
		return a + b;
	}

	/**
	 * Resta dos números reales.
	 *
	 * @param a Primer número
	 * @param b Segundo número
	 * @return El resultado de {@code a - b}
	 * @see #sumar(double, double)
	 */
	public static double restar(double a, double b) {
		return a - b;
	}

	/**
	 * Multiplica dos números reales.
	 *
	 * @param a Primer número
	 * @param b Segundo número
	 * @return El resultado de {@code a * b}
	 */
	public static double multiplicar(double a, double b) {
		return a * b;
	}

	/**
	 * Divide dos números reales.
	 *
	 * @param a Dividendo
	 * @param b Divisor
	 * @return El cociente de {@code a / b}
	 * @throws ArithmeticException Si {@code b == 0}
	 */
	public static double dividir(double a, double b) throws ArithmeticException {
		if (b == 0) {
			throw new ArithmeticException("No se puede dividir entre cero.");
		}
		return a / b;
	}
}
