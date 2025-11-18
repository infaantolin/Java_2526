package arik_04;
import java.util.Scanner;

public class HiruZenbHandiena {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Sartu lehen zenbakia: ");
        int a = sc.nextInt();
        System.out.print("Sartu bigarren zenbakia: ");
        int b = sc.nextInt();
        System.out.print("Sartu hirugarren zenbakia: ");
        int c = sc.nextInt();

        int handiena = a;
        if (b > handiena) handiena = b;
        if (c > handiena) handiena = c;

        System.out.println("Handiena: " + handiena);

        sc.close();
	}

}
