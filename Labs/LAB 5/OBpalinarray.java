/* File: Hwk2/OBarrayrev.java by Oluwakayikunmi Babatunde - Akinnagbe 
Program: Check if an arraylist of integers is a palindrome. Try a recursive approach. 
*/
import java.util.*;
public class OBpalinarray 
{
    public static void main(String [] args)
    { 
		List <Integer> L = new ArrayList<>(Arrays.asList(9,5, 6, 5, 9));
		System.out.println(L  + " isPalindrome: " + isPalindrome(L));
	}//main
	static boolean isPalindrome(List <Integer> L )
    {
		if ( L.size() == 0 || L.size() == 1 ) 
			return true; 	//base case
		if ( L.get(0) == L.get(L.size()-1) ) 
			return isPalindrome(L.subList(1,L.size()-1));
		return false;
	}//isPalindrome

}
