/* File: OBmidterm.java by Oluwakayikunmi Babatunde - Akinnagbe 
Program: asks the user to input words in lower case letters until
you type Q or q and then prints a menu with the following options
Play List. Menu:
1. Sort alphabetically and Sort in reverse order
2. Count the letter ‘a’ in all words
Option (1-3,0-quit)? 0
*/
 //List <String> word = new ArrayList<>(Arrays.asList("lime", "apple", "pear", "lime", "plum5"));
import java.util.*;
public class OBmidterm 
{
    public static void main(String[] args)
    {
        System.out.print("Program By: Oluwakayikunmi Babatunde - Akinnagbe");
        List <String> L = new ArrayList<>(Arrays.asList("lime", "apple", "pear", "lime", "plum5"));
		System.out.println("The list  in the normal order is " + L);
		System.out.print("The list  in the reverse order is ");
        Rev(L);
        countletter(L);
    
    }
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
   
	static void Rev(List<String> l )
    {
		for (int i = l.size() -1 ; i>= 0 ; i--)
			System.out.print(l.get(i) + " ");
	}//Rev
    private static void countletter(List<String> l)
    {
        char[] wordArr;
        while(((CharSequence) l).length() != 0)
        {
            wordArr = l.toArray();
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
      
            wordArr = wordArr.length;
        }  
        System.out.println();
        System.out.println();  
    }// end of countletter
}
    
    

