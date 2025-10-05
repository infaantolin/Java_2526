package ariketak_Bilaketa;

import java.util.Scanner;

public class MenuMatrizea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int ERR = 5;
        final int ZUT = 2;

        int[][] matrizea = new int[ERR][ZUT];
        int kopurua = 0; // zenbat elementu dauden matrizean erabilita

        int aukera;

        do {
            System.out.println("\n====================");
            System.out.println("   MENUA - MATRIZEA");
            System.out.println("====================");
            System.out.println("1. Sartu balioa");
            System.out.println("2. Aurkitu balioa");
            System.out.println("3. Ezabatu balioa");
            System.out.println("4. Irten");
            System.out.print("Aukeratu aukera: ");
            aukera = sc.nextInt();

            switch (aukera) {

                case 1 -> { // Sartu balioa
                    if (kopurua == ERR * ZUT) {
                        System.out.println("Ez dago leku libre gehiago matrizean.");
                        break;
                    }

                    System.out.print("Sartu zenbakia: ");
                    int balioa = sc.nextInt();

                    // Begiratu ea dagoen jada
                    boolean badago = false;
                    for (int i = 0; i < ERR; i++) {
                        for (int j = 0; j < ZUT; j++) {
                            if (matrizea[i][j] == balioa) {
                                badago = true;
                                break;
                            }
                        }
                    }

                    if (badago) {
                        System.out.println("Balio hori dagoeneko matrizean dago.");
                    } else {
                        // Gehitu leku librean
                        boolean sartuDa = false;
                        for (int i = 0; i < ERR && !sartuDa; i++) {
                            for (int j = 0; j < ZUT && !sartuDa; j++) {
                                if (matrizea[i][j] == 0) {
                                    matrizea[i][j] = balioa;
                                    sartuDa = true;
                                    kopurua++;
                                    System.out.println("Balioa ondo gehitu da posizioan [" + i + "][" + j + "]");
                                }
                            }
                        }
                    }
                }

                case 2 -> { // Aurkitu balioa
                    if (kopurua == 0) {
                        System.out.println("Matriz hutsa dago, ez dago daturik.");
                        break;
                    }

                    System.out.print("Bilatu nahi duzun zenbakia: ");
                    int balioa = sc.nextInt();
                    boolean aurkitua = false;

                    for (int i = 0; i < ERR; i++) {
                        for (int j = 0; j < ZUT; j++) {
                            if (matrizea[i][j] == balioa) {
                                System.out.println("Balioa aurkitu da posizioan [" + i + "][" + j + "]");
                                aurkitua = true;
                            }
                        }
                    }

                    if (!aurkitua) {
                        System.out.println("Balio hori ez dago matrizean.");
                    }
                }

                case 3 -> { // Ezabatu balioa
                    if (kopurua == 0) {
                        System.out.println("Matriz hutsa dago, ez dago daturik ezabatzeko.");
                        break;
                    }

                    System.out.print("Ezabatu nahi duzun zenbakia: ");
                    int balioa = sc.nextInt();
                    boolean aurkitua = false;

                    for (int i = 0; i < ERR; i++) {
                        for (int j = 0; j < ZUT; j++) {
                            if (matrizea[i][j] == balioa) {
                                matrizea[i][j] = 0;
                                aurkitua = true;
                                kopurua--;
                                System.out.println("Balioa ezabatu da posizioan [" + i + "][" + j + "]");
                            }
                        }
                    }

                    if (!aurkitua) {
                        System.out.println("Balio hori ez dago matrizean.");
                    }
                }

                case 4 -> System.out.println("Programa amaitzen...");

                default -> {
                    if (aukera < 1 || aukera > 4)
                        System.out.println("Aukera baliogabea. Saiatu berriro.");
                }
            }

            // Matrizearen egoera erakutsi
            System.out.println("\nMatrizearen egoera:");
            for (int i = 0; i < ERR; i++) {
                for (int j = 0; j < ZUT; j++) {
                    System.out.printf("%4d", matrizea[i][j]);
                }
                System.out.println();
            }

        } while (aukera != 4);

        sc.close();
    }
}