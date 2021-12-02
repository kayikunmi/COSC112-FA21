/* File: OBBincount.java by Oluwakayikunmi Babatunde - Akinnagbe 
Program: Given an integer count how many 1's it has in its binary representation. Example: Enter int? 9 Result: 1001
*/

import java.util.Scanner;
public class OBBincount 
{
    public static void main(String [] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter an integer to find the number of ones in its binary representation.");
        int number = keyboard.nextInt();
        System.out.println("You entered " + number + " as an integer");
        System.out.println( number + " as a binary is " + Integer.toBinaryString(number));
        System.out.println("There are " + count(Integer.toBinaryString(number)) + " ones in "  + Integer.toBinaryString(number));
        keyboard.close();
    }
    
    static int count (String s) {
        int counter = 0;
        for (int i = 0; i < s.length(); i ++) 
        {
            if (s.charAt(i) == '1') 
            {
                counter++;
            }
        }
        return counter;
    }
}