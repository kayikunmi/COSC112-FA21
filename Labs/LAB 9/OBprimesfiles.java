//File: OBprimesfiles.java by Kayikunmi B. A.
import java.util.*;
import java.io.*;
public class OBprimesfiles 
{
    public static void main(String[] args) 
    {
        Scanner keyboard = null;
        try 
        {
            keyboard = new Scanner(new File("mydata.txt"));
        }
        catch (Exception ex) 
        {
            System.out.println(ex);
        }
        while(keyboard.hasNext()) 
        {
            int x = Integer.parseInt(keyboard.next());
            if (isPrime(x)) 
            {
                System.out.println(x);
            }
        }
    }
    public static boolean isPrime(int x) 
    { 
        if (x==1) 
        {
            return false;
        }
        for (int i = 2; i <=Math.sqrt(x); i++) 
        {
            if (x%i==0) 
            {
                return false;
            }
        }
        return true;
    }
}
