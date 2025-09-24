package Pekan2;

public class ContohChar {

	public static void main(String[] args) {
		// Deklarasi variabel char
		char huruf1 = 'A';
		char huruf2 = 'B';
		char angka = '7';
		char simbol = '%';
		
		//menampilkan nilai variabel char
		System.out.println("contoh variabel char");
		System.out.println("Huruf pertama: " + huruf1);
		System.out.println("Huruf kedua: " + huruf2);
		System.out.println("Angka: " + angka);
		System.out.println("Simbol: "+ simbol);
		
		//operasi dengan chhar(berdasarkan kode unicode/ASCII
		char huruf3 = (char)(huruf1 + 1); // A(65) + 1 = B (66)
		System.out.println("huruf1 + 1 = " + huruf3);
		
		//Char juga bisa disimpan dalam integer (ASCII/Unicode value)
		int kodehuruf = huruf1;
		String biner1 = String.format("%8s", Integer.toBinaryString(huruf1)).replace(' ', '0');
		System.out.println("kode ASCII dari " + huruf1 + " - "+ kodehuruf);
		System.out.println("kode BINER dari " + huruf1 + " - "+ biner1);
		
		// Menggabungkan char menjadi string
		String kata = "" + huruf1 + huruf2 + angka + simbol;
		System.out.println("Gabungan char menjadi string: " + kata);
	}

}
