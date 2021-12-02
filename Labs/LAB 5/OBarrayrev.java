/* File: Hwk2/OBarrayrev.java by Oluwakayikunmi Babatunde - Akinnagbe 
Program: An arraylist of numbers size 5 is given in your program. Print: as it is, in reverse order, and sorted
*/
import java.util.*;
public class OBarrayrev 
{
    public static void main(String [] args)
    {
        List <Integer> L = new ArrayList<>(Arrays.asList(3,7,9,12,58));
		System.out.println("The list  in the normal order is " + L);
		System.out.print("The list  in the reverse order is ");
        Rev(L);
			
	}//main
	static void Rev(List <Integer> L )
    {
		for (int i = L.size() -1 ; i>= 0 ; i--)
			System.out.print(L.get(i) + " ");
	}//Rev
}
