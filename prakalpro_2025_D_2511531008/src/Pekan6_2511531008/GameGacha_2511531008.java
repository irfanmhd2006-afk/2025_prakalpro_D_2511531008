package tugasprakalpro;
import java.util.Scanner;
import java.util.Random;

public class GameGacha_2511531008 {
	// ini gamedadu jika dijumlahkan harus sama dengan 7
	// kalau kkayak gini malah mirip gamegacha - gachaan wkwkwk 

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		boolean cek = true, menang = true;
		int gacha = 0;
		String jawab = null;
		
		while(cek) {
			int sum1 = rand.nextInt(6) + 1;
			int sum2 = rand.nextInt(6) + 1;
			int hasil = sum1 + sum2;
			gacha++;
			System.out.println(sum1 +" + "+ sum2 +" = " + hasil );
			if( hasil == 7) {
				System.out.println("Tebakan Anda benar");
				cek = false;
				
			}else {
				System.out.println("Tebakan Anda Salah");
				System.out.print("Apakah mau lempar dadu (iya / tidak?)");
				jawab = scan.nextLine();
			}
			
			if(jawab.equalsIgnoreCase("tidak")){
				menang = false;
				cek = false;
			}
			
		}
		
		if(menang) System.out.println("Anda menang setelah " + gacha +" percobaan!!");
		else System.out.println("Anda Gagal menang");
		
		scan.close();
		
		

	}

}

