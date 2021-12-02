//File: OBread.java by Kayikunmi B. A. + JG
//Program: You should have at least 5 countries in your database. You do not need to implement all the countries. 
import java.util.*;
import java.io.*;

public class OBcountrydriver
{
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args)
    {
        ArrayList<Country> countries = getfromfile("6country.csv");
        int menuOption = -1;
        System.out.print("cinished inputting file! ");
        do
        {
            switch(menuOption)
            {
                case 1:
                    System.out.println("There are " + countries.size() + " many counteries.");
                    for (Country c : countries)
                        System.out.println(c);
                    break; // displays the number of countries and the list of countries
               
                case 0:
                    System.out.println("\nThanks for trying the program!");
                    break;
            }
        } while (menuOption != 0);
       
        System.out.println("Goodbye!");
    }//main

    public static ArrayList<Country> getfromfile(String fileNm)
    {
        Scanner cin = null;
        try
        {
            cin = new Scanner(new File(fileNm));
        }
        catch (FileNotFoundException e)
        {
            System.out.println("ERROR READING FILE:\n" + e);
            System.exit(401);
        }
        ArrayList<Country> toReturn = new ArrayList<>();
        String[] currentLn;
        String nm, isocode;
        int countrycode;
        while (cin.hasNext())
        {
            currentLn = cin.next().split(",");
            nm = currentLn[0];
            countrycode = Integer.parseInt(currentLn[1]);
            isocode = currentLn[2];
            
            toReturn.add(new Country(nm, countrycode, isocode));
        }
        return toReturn;
    }//getfromfile


   

    
}