//file: Lab2/OBDivisors.java (Kayikunmi Babatunde - Akinnagbe)

import java.util.*;
public class OBDivisors {
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        int  a = 0;
        a = cin.nextInt();
        System.out.println("Enter any integer we can use to find the sum of its factors?");
        int sum = 0;
        for (int i = 1; i <= a; ++i) 
        {
            if (a % i == 0) 
            {
              sum =(i+i);
            }
        }
        System.out.println();
        System.out.println("The sum of the factors of " + a + " is: " + sum);
    cin.close();
    }
}
