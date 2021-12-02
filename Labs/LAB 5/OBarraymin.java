/* File: Hwk2/OBarrayrev.java by Oluwakayikunmi Babatunde - Akinnagbe 
Program: Read and print an arraylist of n = 5 numbers(double) and find its minimum. Try: Collection.min(Arr) 
*/
import java.util.*;
public class OBarraymin 
{
    static Scanner cin = new Scanner(System.in);
	public static void main(String [] args)
    { 
		List <Integer> L = new ArrayList<>();//declare variable in main()
		read(L);			
		System.out.println(L + " The minimum number in this array is: " + Collections.min(L));
	}//main
	
    static void read(List <Integer> L)
    {
		int n = 1;
		while (n != 0)
        {
			System.out.print("Enter number?");
			n = cin.nextInt();
			L.add(n);
		}
		L.remove(L.size()-1); 
	}//read
}
