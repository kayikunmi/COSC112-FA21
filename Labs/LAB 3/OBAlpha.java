//File: OBAlpha.java OLUWAKAYIKUNMI BABATUNDE - AKINNAGBE
//UPPER CASE, ASCII and UNICODE
public class OBAlpha {
	public static void main(String[] args) {
		System.out.println("Letter\tASCII\tUnicode");
		for (int i = 'A'; i <='Z'; i++) {
			System.out.print( (char)i+ "\t" + (int)i + "\t" +(Integer.toHexString((int)i)));
			System.out.println();
		}
	}
}
