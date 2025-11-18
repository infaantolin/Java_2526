package ariketak_bidimensionalak;
// Ausazko zenbakiekin 5x5 array bat sortzea, edukia taula formatuan bistaratzea eta guztizko batura kalkulatzea.

public class MatrizeaBatura {

	public static void main(String[] args) {
		final int TAM = 5;
        int[][] zenbakiak = new int[TAM][TAM];
        int batura = 0;

        // Ausazko zenbakiak sortu (1–100)
        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                zenbakiak[i][j] = (int) (Math.random() * 100) + 1;
                batura += zenbakiak[i][j];
            }
        }

        // Emaitzak erakutsi
        System.out.println("5x5 MATRIZEA:");
        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                System.out.printf("%4d", zenbakiak[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nElementu guztien batura: " + batura);
    }
}