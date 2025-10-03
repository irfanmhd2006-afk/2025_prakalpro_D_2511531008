package Irfan;
import java.util.Scanner;
public class tugasAlproPekan4_2511531008 {

	public static void main(String[] args) {
		String namapembeli, hariS = null,waktu = null, Nstudio = null;
		int hari, waktutayang, jenistudio, tiket, pwaktu = 0, phari = 0,pstudio = 0;
		// maksud p disini artinya price. biar hemat ngetik :)
		// Nstudio maksudnya Namastudio
		int perticket, subtotal, promo, totalbayar;
		boolean valid = true; // mengecek apakah input datanya valid atau tidak
		
		Scanner input = new Scanner(System.in);
		System.out.println("---- PEMBELIAN TIKET BIOSKOP -----");
		System.out.print("Nama Pembeli :");
		namapembeli = input.nextLine();
		System.out.print("jumlah tiket : ");
		tiket = input.nextInt();
		
		System.out.print("Hari : (1. senin-kamis / 2. jumat / 3.Sabtu-Minggu) (pilih angka)");
		hari = input.nextInt();
		System.out.print("waktu tayang : (1.pagi /2.siang /3.malam) (pilih angka)");
		waktutayang = input.nextInt();
		System.out.print("Jenis studio : (1.regular /2.Deluxe /3.Premium) (pilih angka)");
		jenistudio = input.nextInt();
		input.close();
		switch (waktutayang) {
        case 1:
        	waktu = "Pagi"; 
        	pwaktu = 0; 
        	break;
        case 2: 
        	waktu = "Siang";
        	pwaktu = 10; 
        	break;
        case 3: 
        	waktu = "Malam"; 
        	pwaktu = 20; 
        	break;
        	
        default: valid = false; 
		}
		
		
		if(hari == 1) {
			hariS = "senin-kamis";
			phari = 0;
		}else if ( hari == 2) {
			hariS = "jumat";
			phari = 10;
		}else if (hari == 3) {
			hariS = "sabtu-minggu";
			phari = 20;
		}else {
			valid = false;
		}
		
		
		if(jenistudio == 1) {
			pstudio = 0;
			Nstudio = "Reguler";
		}else if (jenistudio == 2) {
			pstudio = 10000;
			Nstudio = "Deluxe";
		}else if (jenistudio == 3) {
			pstudio = 20000;
			Nstudio ="premium";
		}else {
			valid = false;
		}
		
		perticket = 50000 + (50000 * phari/100 )+ (50000 *pwaktu/100) + pstudio;
		subtotal = perticket*tiket;
		promo =  subtotal *20/100;
		totalbayar = subtotal - promo;
		if(valid) {
			 System.out.println("------------------------------------");
		        System.out.println("Nama Pembeli     : " + namapembeli);
		        System.out.println("Jumlah Tiket     : " + tiket);
		        System.out.println("Hari             : " + hariS);
		        System.out.println("Waktu Tayang     : " + waktu);
		        System.out.println("Jenis Studio     : " + Nstudio);
		        System.out.println("------------------------------------");
		        System.out.println("Harga Dasar      : Rp " + 50000 + "/tiket");
		        System.out.println("Biaya Hari       : +" + phari + "%");
		        System.out.println("Biaya Waktu      : +" + pwaktu + "%");
		        System.out.println("Biaya Studio     : Rp " + pstudio);
		        System.out.println("Harga per Tiket  : Rp " + perticket);
		        System.out.println("Subtotal         : Rp " + subtotal);
		        System.out.println("Diskon (20%)     : Rp " + promo);
		        System.out.println("------------------------------------");
		        System.out.println("TOTAL BAYAR      : Rp " + totalbayar);
		}else {
			System.out.print("DATA TIDAK VALID!!");
		}
	}

}
