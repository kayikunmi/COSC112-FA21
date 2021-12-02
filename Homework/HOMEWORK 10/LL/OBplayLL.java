package LL;
/* File: OBplayLL.java by Oluwakayikunmi Babatunde - Akinnagbe + partner CA Nick Addison
Program: Play with Linked Lists. Enter your LL of obejcts (choose ANY object your wish( student, country)). 
*/

import java.util.*;
public class OBplayLL 
{
    public static void main(String[] args)
    {
        LinkedList<Person> L = new LinkedList<Person>();
        Person Alice = new Person("Alice");
        Person Brady = new Person("Brady");
        Person Cathy = new Person("Cathy");
        Person Danny = new Person("Danny");
        Person Amy = new Person("Amy");
        Person Eddie = new Person("Eddie");
        

        L.add(Alice);
        L.add(Brady);
        L.add(Cathy);
        L.add(Danny);
        L.add(Amy);
        System.out.println("The original Linked List is: "+ L);
        L.pop();
        System.out.println("The Linked List with the 'pop' method is: "+ L);
        L.peek();
        System.out.println("The Linked List with the 'peek' method is: "+ L);
        L.push(Eddie);
        System.out.println("The Linked List with the 'push' method is: "+ L);
        L.addFirst(Brady);
        System.out.println("The Linked List with the 'addfirst' method is: "+ L);
        L.addLast(Eddie);
        System.out.println("The Linked List with the 'addlast' method is: "+ L);
        System.out.println("The first in the Linked List is " + L.getFirst());
        System.out.println("The last in the Linked List is " + L.getLast());
        L.lastIndexOf(Amy);
        System.out.println("LastIndexOf(Amy) is: "+ L.lastIndexOf(Amy));
        L.toArray();
        System.out.println("The Linked List with the 'toarray' method is: "+ L);
    }
}

