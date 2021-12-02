package OBcountry;

// File: OBmycountry.java by Oluwakayikunmi Babatunde - Akinnagbe OB
//Use a class Country to build up an ArrayList of Countries

import java.util.*;
public class OBmycountry 
{
    public static void main(String [] args)
    {
        Country C = new Country ("China", 1400);
        System.out.println(C);
        Country c2 = new Country();
		System.out.println(c2) ; 	//prints
		c2.countryname = "China";
		System.out.println(c2) ; 	//prints
		Country [] Cs = new Country [2];
		Cs[0] = C; Cs[1] = c2;
		System.out.println(Arrays.toString(Cs));
        
    }  //end of main
}

