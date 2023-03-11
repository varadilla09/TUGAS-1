import java.util.*;
public class ProgramArray {

	public static void main(String[] program) {
		Scanner input = new Scanner(System.in);
		double nilai[];
		int bil[]= new int[10];
		bil[9] = 45;

		System.out.println(bil[9]);
		for(int i=0; i<bil.length; i++){
			bil[i] = input.nextInt();		
		}
		for(int i=0; i<bil.length; i++){
			System.out.println("bil ke-"+ i +" : " +bil[i]);
		}
	}

}