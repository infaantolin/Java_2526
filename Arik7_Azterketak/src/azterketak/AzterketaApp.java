package azterketak;

import java.util.Date;
import java.util.Scanner;

public class AzterketaApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Sartu ikasgaia: ");
        String ikasgaia = sc.nextLine();

        System.out.print("Sartu gela: ");
        String gela = sc.nextLine();

        System.out.println("Sartu data (DD/MM/YYYY):");
        String data = sc.nextLine();

        System.out.println("Sartu ordua (HH:MM):");
        String ordua = sc.nextLine();

        Azterketa azterketa = new Azterketa(ikasgaia, gela, data, ordua);
        
        // Momentuko data lortu
        Date gaur = new Date();
        long tiempo = gaur.getTime();
		System.out.println("fecha en milisegundos:"+tiempo);
		
		long tiempo2 = 
		long zenbatGeratu = tiempo -tiempo2;
        
        // Datuak pantailaratu
        System.out.println("/nAzterketak/n");
        System.out.println("/nIkasgaia/tGela/tData/tOrdua/tZenbat daukagu ikasteko/n");
        System.out.println(azterketa + "X");
	}

}
