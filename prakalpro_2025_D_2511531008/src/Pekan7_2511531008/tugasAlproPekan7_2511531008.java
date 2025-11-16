package Pekan7_2511531008;
import java.util.Scanner;
public class tugasAlproPekan7_2511531008 {

	public static void main(String[] args) {
		Akun a = new Akun();
		Scanner input = new Scanner(System.in);
		boolean loop = true;
		while(loop) {
			System.out.println("\n=== Registrasi Akun baru ===");
			System.out.print("masukkan username : ");
			a.setUsername(input.next());
			System.out.print("masukkan password : ");
			a.setPassword(input.next());
			System.out.print("masukkan email : ");
			a.setEmail(input.next());
			System.out.print("masukkan PIN : ");
			a.setPinAngka(input.nextInt());
		
			if(!a.pwbetul() || !a.emailbetul()) {
				if(!a.pwbetul()) System.out.println("password harus mengandung minimal 8 karakter!");
				if(!a.emailbetul()) System.out.println("Email Anda "+ a.getemail() + " tidak valid harus (mengandung '@' dan '.')");
			System.out.println("Silahkan coba lagi");
			}else {
				//registrasi berhasil
				System.out.println("\n=== Registrasi Berhasil ===");
				System.out.println("Akun untuk "+ "\"" + a.getemail() +"\"" + "berhasil dibuat." );

	            //Detail akun
	            System.out.println("\n=== Detail Akun ===");
	            System.out.println("Username Lowecase  : " + a.getUsername().toLowerCase());
	            System.out.println("Username Uppercase  : " + a.getUsername().toUpperCase());
	            System.out.println("ID Pengguna (Gabungan)  : " + a.getUsername()+ a.getPinAngka());
	            System.out.println();
	            
	            // Uji tipe data
	            int PINnum =a.getPinAngka()+10;
	            String PINstr = String.valueOf(a.getPinAngka()) + "10";
	            System.out.println("=== Uji Tipe Data (PIN Anda: "+ a.getPinAngka()+") ===");
	            System.out.println("PIN (int) + 10 =" + PINnum);
	            System.out.println("PIN (String) + \"10\" =" + PINstr);
	            loop = false;
	            input.close();
			}
			
		}

	}

}
