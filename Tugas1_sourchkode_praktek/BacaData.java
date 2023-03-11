// NIM : 13020210130
// NAMA : VARA DILLA
// HARI/TGL/WKTU : SABTU, 4 MARET 2023 14:10

import java.util.Scanner;

/* contoh membaca integer menggunakan class scanner*/
public class BacaData {

	/**
	 * @param args
	 */
	public static void main(String [] args) {
		// TODO Auto-generated method stub
		/* kamus */
		int a;
		Scanner masukkan;
		/* Program */
		System.out.print ("Contoh membaca dan menulis, ketik nilai integer : \n");
		masukkan =  new Scanner(System.in);
		a = masukkan.nextInt();    /* coba ketik : apa akibatnya ? */
		System.out.print("nilai yang dibaca : "+ a);
	}
}