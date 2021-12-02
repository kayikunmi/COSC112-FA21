/** File: OBBinHexTable.java  OLUWAKAYIKUNMI BABATUNDE - AKINNAGBE
 * DECIMAL, BINARY and HEXADECIMAL
*/
 
class OBBinHexTable {
	public static void main (String [] args) { 
		int n = 100;
		tableBinHex(n);
	}

	static void tableBinHex(int many) {
		System.out.println("Dec \tBin \tHex");
		for (int i = 0; i < many; i++) {
			System.out.println(i + "\t" + Integer.toBinaryString(i)+ "\t " + Integer.toHexString(i));
		}
	}
}