package ariketa_09;
import java.util.Scanner;

// Bi zenbaki irakurri eta handiena zein den esan

public class HandienaBiZenbaki {

	public static void main(String[] args) {
		Scanner teklatua = new Scanner(System.in);

        System.out.print("Sartu lehenengo zenbakia: ");
        int a = teklatua.nextInt();

        System.out.print("Sartu bigarren zenbakia: ");
        int b = teklatua.nextInt();

        if (a > b) {
            System.out.println("Handiena: " + a);
        } else if (b > a) {
            System.out.println("Handiena: " + b);
        } else {
            System.out.println("Bi zenbakiak berdinak dira.");
        }

        teklatua.close();
	}

}
