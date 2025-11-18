package ariketa_07;

public class BalioakTrukatu {

	public static void main(String[] args) {
		int a = 5;
        int b = 10;

        System.out.println("Hasieran: a = " + a + ", b = " + b);

        // Trukea, temp gabe
        a = a + b; // a = 15
        b = a - b; // b = 5
        a = a - b; // a = 10

        System.out.println("Trukatu ondoren: a = " + a + ", b = " + b);
	}

}
