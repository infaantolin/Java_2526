package handienetikTxikienera;

import java.util.Arrays;
import java.util.Scanner;

public class OrdenatuHiruZenbakiArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Hiru zenbaki array batean gorde
        int[] zenbakiak = new int[3];
        System.out.print("Sartu lehen zenbakia: ");
        zenbakiak[0] = sc.nextInt();
        System.out.print("Sartu bigarren zenbakia: ");
        zenbakiak[1] = sc.nextInt();
        System.out.print("Sartu hirugarren zenbakia: ");
        zenbakiak[2] = sc.nextInt();

        // Arrays.sort() ordenatzen du txikienetik handienera
        Arrays.sort(zenbakiak);

        // Atzekoz aurrera erakutsi handienetik txikienera
        System.out.println("Ordena handienetik txikienera:");
        for (int i = zenbakiak.length - 1; i >= 0; i--) {
            System.out.print(zenbakiak[i] + " ");
        }

        sc.close();
    }
}