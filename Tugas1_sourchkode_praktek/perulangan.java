import java.util.Scanner;
public class perulangan {
	public static void main (String[] args) {
	String input;
	Scanner inputUser = new Scanner (System.in);

	System.out.print("panggil nama : ");
	input = inputUser.next();

	Switch (Input);{
		Case "vara":
			System.out.println("vara hadir");
			break;
			Default :
			System.out.println(Input +"tidak hadir");
			}
		System.out.println("program selesai");
	}
}