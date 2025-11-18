package ariketa_08;
import java.util.Scanner;

// Bi zenbaki irakurri eta batura kalkulatu

public class BiZenbakiBatura {

	public static void main(String[] args) {
		Scanner teklatua = new Scanner(System.in);

        System.out.print("Sartu lehenengo zenbakia: ");
        int a = teklatua.nextInt();

        System.out.print("Sartu bigarren zenbakia: ");
        int b = teklatua.nextInt();

        int emaitza = a + b;
        System.out.println("Batura: " + emaitza);

        teklatua.close();
	}

}
