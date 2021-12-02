/* File: OBintLL.java by Oluwakayikunmi Babatunde - Akinnagbe + partner AO Aidan Orr
Program: Copy ints from an Array into a LinkedList
*/

import java.util.*;
public class OBintLL 
{
    public static void main(String[] args)
    {
        
        Integer[] A = {2, 3, 4, 5, 6};
        List<Integer> arrlist = Arrays.asList(A);
        LinkedList<Integer> L = new LinkedList<Integer>(arrlist);
        System.out.println("The original Linked List is: "+ L);

        L.add(7);
        L.add(2);
        L.add(3);
        L.add(8);
        L.add(2);
        L.add(5);
        System.out.println("The new Linked List is: "+ L);

        L.set(0,1);
        L.set(1,9);
        System.out.println("The new Linked List is: "+ L);

       
        Collections.sort(L);
        System.out.println("The collected Linked List is: " + L);
    
    }
        
}
