//File: OBalphaRev.java  
//prints the English alphabet in reverse. upper case and lower case as: Zz Yy .. Aa
public class OBAlphaRev 
{
	public static void main(String[] args) {
		for (int i = 'Z'; i >='A'; i--) {
			System.out.println((char)i + "" + Character.toLowerCase((char)i));
		}//for
	}//main
}//class
