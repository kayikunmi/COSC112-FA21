/* File: OBMyName.java by Oluwakayikunmi Babatunde - Akinnagbe 
Program: Ask for name
*/

import java.util.Scanner;
public class OBMyName 
{
    public static void main(String[] args)
    {
        System.out.println("What is your name?");
        Scanner keyboard = new Scanner(System.in);
        String name = keyboard.next();
        System.out.println();
        reverse(name);
        triple(name);
        swap(name);
        caplow(name);
        count(name);
        
    
        keyboard.close();
    }

    private static void reverse(String name) 
    {
        for(int i = name.length()-1; i>= 0; i--)
        {
            System.out.print(name.charAt(i));
        }
        System.out.println();
        System.out.println();
    }

    private static void triple(String name) 
    {
        for(int i = 0; i< name.length(); i++)
        {
            System.out.print(name.charAt(i));
            System.out.print(name.charAt(i));
            System.out.print(name.charAt(i));
        }
        System.out.println();
        System.out.println();
    }
    private static void swap(String name) 
    {
        int last = name.length() - 1;
        System.out.println(name.substring(last) + name.substring(1,last) + name.substring(0,1));
        System.out.println();
        System.out.println();
        
    }

    private static void caplow(String name) 
    {
        System.out.println(name.toUpperCase());
        System.out.println();
        System.out.println();
        System.out.println(name.toLowerCase());
        System.out.println();
        System.out.println();
    }
    public static void count(String name) 
    {
		int countUpper = 0;
		int countLower = 0;
		for(int i=0; i<name.length(); i++) {
			if(Character.isUpperCase(name.charAt(i))) {
				countUpper++;
			}
			if(Character.isLowerCase(name.charAt(i))) {
				countLower++;
			}
		}
		System.out.print(name + " has " + countUpper + " uppercases and " + countLower + " lowercases.");
        System.out.println();
        System.out.println();
	}
}
