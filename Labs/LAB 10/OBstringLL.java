/* File: OBstringLL.java by Oluwakayikunmi Babatunde - Akinnagbe + partner AO Aidan Orr
Program:  Copy words from an Array into a LinkedList
*/

import java.util.*;
public class OBstringLL 
{
    public static void main(String[] args)
    {
        String[] A = {"Ant", "math", "conputers", "apple", "Classroom"};
        List<String> arrlist = Arrays.asList(A);
        LinkedList<String> L = new LinkedList<String>(arrlist);
        System.out.println("The original Linked List is: "+ L);

        L.add("ant");
        L.add("porcelain");
        L.add("IDE");
        System.out.println("The new Linked List is: "+ L);

        L.set(1,"laptop");
        System.out.println("The new Linked List is: "+ L);

       
        Collections.sort(L);
        System.out.println("The collected Linked List is: " + L);
    
    }
}
