
/* File: OBMyName.java by Oluwakayikunmi Babatunde - Akinnagbe + partner AO Aidan Orr
Program: Play with words
*/

import java.util.*;
public class OBPlayWords 
{
    public static void main(String[] args)
    {
        System.out.println("Enter a word?");
        Scanner keyboard = new Scanner(System.in);
        String word = keyboard.next();
        System.out.println();

        reverse(word); //reverse the word
        cap(word); //capitalize the word
        deletefirst(word); //delete the first word
        countletter(word); //count each letter
        char str[] = word.toCharArray();
        int n = str.length;
        System.out.println(removeDuplicate(str, n)); //remove one of each duplicated letter
        System.out.println();
        System.out.println();
        System.out.println("The word '" + word + "' is a palindrome?: "+ palindrome(word,0,word.length()-1)); //check for palindrome
        System.out.println();
        System.out.println();
        triple(word); //triple each letter
    

        keyboard.close(); //close input
    }// end of main

    private static void reverse(String word) 
    {
        for(int i = word.length()-1; i>= 0; i--)
        {
            System.out.print(word.charAt(i));
        }
        System.out.println();
        System.out.println();
        System.out.println();
    } // end of reverse
    private static void cap(String word) 
    {
        System.out.println(word.toUpperCase());
        System.out.println();
        System.out.println();
    }// end of cap
    private static void deletefirst(String word) 
    {
        System.out.println(word.substring(1));
        System.out.println();
        System.out.println();
    }// end of deletefirst
    private static void countletter(String word)
    {
        char[] wordArr;
        while(word.length() != 0)
        {
            wordArr = word.toCharArray();
            char ch = wordArr[0];
            int count = 1;
            for(int i = 1; i < wordArr.length; i++)
            {
                if(ch == wordArr[i])
                {
                    count++;
                }
            }
      
            if(((ch != ' ') && (ch != '\t')))
            {
                System.out.println(ch + " - " + count);
            }
      
            word = word.replace(""+ch, "");
        }  
        System.out.println();
        System.out.println();  
    }// end of countletter
    public static String removeDuplicate(char str[], int n)
    {
        int index = 0;
        for (int i = 0; i < n; i++)
        {
            int j;
            for (j = 0; j < i; j++)
            {
                if (str[i] == str[j])
                {
                    break;
                }
            }
            if (j == i)
            {
                str[index++] = str[i];
            }
        }
        return String.valueOf(Arrays.copyOf(str, index));
    }// end of removeDuplicate
    static boolean palindrome(String word,int i, int j) 
    {
		if ( i == j || i+1 == j ) 
            return true;
		if ( word.charAt(i) == word.charAt(j) )
			return palindrome(word,i+1,j-1);
		else
			return false;
	}// end of Palindrome
    private static void triple(String word) 
    {
        for(int i = 0; i< word.length(); i++)
        {
            System.out.print(word.charAt(i));
            System.out.print(word.charAt(i));
            System.out.print(word.charAt(i));
        }
        System.out.println();
        System.out.println();
    }// end of triple

}// end of class
