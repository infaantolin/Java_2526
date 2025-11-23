package arik04;

import java.util.Scanner;

/**
 * 1etik 10era bitarteko zenbakiak erakusten ditu (biak barne) while begizta
 * baten bidez. 
 * 
 * Jarraian, 10etik 0ra bitarteko zenbakiak erakutsi FOR begizta
 * batekin.
 * 
 * Amaitzeko, teklatu bidez zenbaki oso positibo bat eskatzen du
 * (kontrolatu egin behar dugu), eta zenbat zifra dituen erakusten du. Adibidez:
 * 1250 sartzen badugu, erakutsi 4 zifra dituela. Mezua bistaratzean, kontrolatu
 * egin beharko dugu zifra bat edo gehiago dituen.
 */
public class Arik4 {

	public static void main(String[] args) {
		// 1etik 10era bitarteko zenbakiak - WHILE
		int i = 1;
		System.out.println("#### 1etik 10era bitarteko zenbakiak ####");
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		
		// 10etik 0ra bitarteko zenbakiak - FOR
		System.out.println("#### 10etik 0ra bitarteko zenbakiak ####");
		for (int j = 10; j >= 0; j--) {
			System.out.println(j);
		}
		
		// Zenbaki baten zifrak - DO-WHILE
		Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Sartu zenbaki positiboa: ");
            n = sc.nextInt();
        } while (n <= 0);

        int kop = 0;
        int temp = n;

        while (temp > 0) {
            temp /= 10;
            kop++;
        }

        System.out.println("Zifrak: " + kop);
        
        sc.close();
	}

}
