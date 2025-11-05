package Pekan6_2511531008;
import java.util.Scanner;

public class perulanganWhile1_2511531008 {

	public static void main(String[] args) {
		
		int counter = 0;
		String jawab;
		boolean running = true;
		//deklarasi Scanner
		Scanner scan = new Scanner(System.in);
		while(running) {
			counter++;
			System.out.println("jumlah = " + counter);
			System.out.print("Apakah lanjut (iya/tidak?)");
			jawab = scan.nextLine();
			//cek jawab = tidak, perulangan  berhemti
			if(jawab.equalsIgnoreCase("tidak")) {
				running = false;
			}
			
		}
		System.out.println("Anda sudah melakukan perulangan" + counter + " kali");
		

	}

}
