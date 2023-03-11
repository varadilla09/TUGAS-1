// NIM : 13020210130
// NAMA : VARA DILLA
// HARI/TGL/WKTU : SABTU, 4 MARET 2021 14:42

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import javax.swing. *;

public class Bacakar {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main (String[] args) throws IOException {
		//TODO Auto-generated method stub

		/* kamus */
		char cc; int bil;		

		InputStreamReader isr = new
		InputStreamReader(System.in);
		BufferedReader dataIn = new BufferedReader(isr);
		// atau

		BufferedReader datAIn = new BufferedReader(new InputStreamReader (System.in));

		/* Algoritma */
		System.out.print ("Hello\n");
		System.out.print ("baca 1 karakter : ");

		// perintah baca karakter cc
		cc =dataIn.readLine() .charAt (0);
		System.out.print ("baca 1 bilangan : ");

		//perintah baca bil
		bil =Integer.parseInt (datAIn.readLine());

		/*String kar = JOptionPane.showInputDialog("karakter 1 : "); Sustem.out.println(kar); */

		//JOptionPane.showMessageDialog(null, "hello");

		System.out.print (cc +"\n" +bil+"\n");
		System.out.print ("bye \n");

		/* tambahkan program membaca/input data 
		   menggunakan class scanner, class console dan class 			   JOptionPane*/

	}
}

		




