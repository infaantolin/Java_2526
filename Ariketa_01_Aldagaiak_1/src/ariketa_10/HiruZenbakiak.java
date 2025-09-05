package ariketa_10;
import java.util.Scanner;

// Hiru zenbaki irakurri eta handiena/txikiena kalkulatu

public class HiruZenbakiak {

	public static void main(String[] args) {
		Scanner teklatua = new Scanner(System.in);

        System.out.print("Sartu A zenbakia: ");
        int A = teklatua.nextInt();

        System.out.print("Sartu B zenbakia: ");
        int B = teklatua.nextInt();

        System.out.print("Sartu C zenbakia: ");
        int C = teklatua.nextInt();

        // Handiena kalkulatu
        int handiena = A;
        if (B > handiena) handiena = B;
        if (C > handiena) handiena = C;

        // Txikiena kalkulatu
        int txikiena = A;
        if (B < txikiena) txikiena = B;
        if (C < txikiena) txikiena = C;

        System.out.println("Handiena: " + handiena);
        System.out.println("Txikiena: " + txikiena);

        teklatua.close();
	}

}

/*
┌───────────────────────────┐
│     Hasi programa         │
└─────────────┬─────────────┘
              │
     ┌────────▼─────────┐
     │ Irakurri A, B, C │
     └───────┬──────────┘
             │
   ┌─────────▼───────────┐
   │ handiena = A        │
   │ txikiena = A        │
   └─────────┬───────────┘
             │
┌─────────────▼─────────────┐
│ B > handiena ?            │
└───────┬───────────┬───────┘
       │bai         │ez
       ▼            ▼
handiena = B      (jarraitu)
       │
┌───────▼───────────┐
│ B < txikiena ?    │
└───────┬───────────┘
       │bai
       ▼
txikiena = B
       │
┌────────▼──────────┐
│ C > handiena ?    │
└───────┬───────────┘
      │bai
      ▼
handiena = C
      │
┌───────▼───────────┐
│ C < txikiena ?    │
└───────┬───────────┘
      │bai
      ▼
txikiena = C
      │
┌───────▼─────────┐
│ Inprimatu        │
│ handiena, txikiena│
└───────▼─────────┘
      │
┌───────▼──────────┐
│  Amaitu programa │
└──────────────────┘

*/