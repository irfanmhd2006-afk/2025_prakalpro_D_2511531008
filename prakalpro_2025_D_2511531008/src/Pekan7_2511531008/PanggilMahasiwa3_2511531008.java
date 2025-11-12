package Pekan7_2511531008;
import java.util.Scanner;
public class PanggilMahasiwa3_2511531008 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Mahasiswa_2511531008 a = new Mahasiswa_2511531008();
		System.out.print("NIM: ");
		a.setNim2(input.nextLine());
		System.out.print("Nama: ");
		a.setNama(input.nextLine());
		if(a.getNim2().startsWith("25")) {
		System.out.println(a.getNama()+ " anda adalah angkatan 2025");
		}
		if(a.getNim2().contains("1153")) {
		System.out.println(a.getNama() + " Anda Mahasiswa informatika ");
		}
		a.Cetak2();
		input.close();

}


}
