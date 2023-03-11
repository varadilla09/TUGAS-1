// NIM : 13020210130
// NAMA : VARA DILLA
// HARI/TGL/WKTU : SABTU, 4 MARET 2023 12:10

/*casting menggunakan tipe data class*/
public class casting2 {

	/**
	 * @param args
	 */
	public static void main (String[] args) {
		// TODO Auto-generated method stub
		
		int a=8, b=9;
		float d=2.f,e=3.2f;
		char g='5';
		double k=3.14;
		String n="67",m="45",l="100";

		a = Integer.parseInt(n); /*konversi String ke Integer*/
		k = Double.parseDouble(m); /*konversi String keDouble*/
		d = Float.parseFloat(l); /*konversi String ke Float*/
		System.out.println("a : "+a+"\nk : "+k+"\nd : "+d);
		n = String.valueOf(b); /*konversi Integer ke String*/
		m = String.valueOf(g); /*konversi karakter ke String*/
		l = String.valueOf(e); /*konversi Float ke String*/
		System.out.println("n : "+n+"\nm : "+m+"\nl : "+l);
		k = Double.valueOf(a).intValue();
		
		/*konversi integer ke Double*/
		double c = Integer.valueOf(b).doubleValue();

		System.out.println("k : "+k+"\nc : "+c+"\nl : "+l);

	}
}