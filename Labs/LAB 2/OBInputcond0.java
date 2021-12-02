//file: Lab1/Inputcond0.java (Kayikunmi Babatunde - Akinnagbe)

import java.util.*;
class OBInputcond0 {
		public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);

		int n = 0;
		while ( ! ( 10 < n &&  n < 20  &&  n % 2 == 0) ){
			System.out.print("Enter an even integer between 10 and 20? ");
			n = cin.nextInt();
		}//while
		System.out.println("Thank you.");
		/// same
        cin.close();
	}//main
}//class