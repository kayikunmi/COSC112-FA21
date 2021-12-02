/* File: Hwk2/OBarrayrev.java by Oluwakayikunmi Babatunde - Akinnagbe 
Program: Imagine a list of names of famous people. Display a random name. Then delete it from the list.
*/
import java.util.*;
public class OBfamous 
{
    public static void main(String [] args)
    {
        String [] names = {"Kourtney Kardashian", "Micheal Jordan", "Melinda Gates", "Michelle Obama", "Zendaya"};
		List <String> L = new ArrayList<>(Arrays.asList(names));
		int pos = randPos(L);
		System.out.println(L  + "\nRandom person: " + L.get(pos));
		L.remove(pos);
		System.out.print("New list of famous people: " + L);
	}//main
	static int randPos(List <String> L ){//returns random position
		return (int) (Math.random() * L.size());
	}// randPos
    
}
