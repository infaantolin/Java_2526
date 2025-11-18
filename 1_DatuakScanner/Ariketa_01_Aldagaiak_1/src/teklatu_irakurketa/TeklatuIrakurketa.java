package teklatu_irakurketa;
//inportatu
import java.util.Scanner;

public class TeklatuIrakurketa {

	public static void main(String[] args) {
		//"Teklatu" objektua adierazten dut
		Scanner teklatua = new Scanner(System.in);
		
		// Kate aldagaia definitu (String mota)
		String katea;
		
		//Erabiltzailearentzako abisua
		System.out.println ("Sartu zenbaki oso bat, mesedez");
		//Katean gordetzen dut erabiltzaileak teklatu bidez sartzen duena.
		katea = teklatua.nextLine();  
		//Kate osoa ateratzen dut
		int nireOsoa = Integer.parseInt (katea);

		//Erabiltzailearentzako abisua
		System.out.println ("Sartu zenbaki hamartar bat, mesedez");
		//Katean gordetzen dut erabiltzaileak teklatu bidez sartzen duena.
		katea = teklatua.nextLine();  
		//Katetik float ateratzen dut
		float nireHamartarra = Float.parseFloat(katea);

		//Erabiltzailearentzako abisua
		System.out.println("Sartu zenbaki double bat, mesedez");
		//Katean gordetzen dut erabiltzaileak teklatu bidez sartzen duena.
		katea = teklatua.nextLine();  
		//Kateko doublea ateratzen dut
		double miDouble = Double.parseDouble(katea);

		//Erabiltzailearentzako abisua
		System.out.println("Sartu boolean bat, mesedez");
		//Katean gordetzen dut erabiltzaileak teklatu bidez sartzen duena.
		katea = teklatua.nextLine();  
		//Katetik boolean ateratzen dut
		boolean nireBoolean = Boolean.parseBoolean(katea); 

		// Balioak erakutsi
        System.out.println("Zenbaki osoa: " + nireOsoa);
        System.out.println("Float zenbakia: " + nireHamartarra);
        System.out.println("Double zenbakia: " + miDouble);
        System.out.println("Boolean balioa: " + nireBoolean);

		//"itxi" teklatua
		teklatua.close ();

	}

}
