//import java.util.Scanner;
class StringAll
{
    public static void main (String [] args)
    {
        String s = "Turing";
        System.out.println(s + "Letters only" + isLet(s) + "has #r: " + countLet(s,'r'));
    }
    static void rotate (String s)
    {
        for (int i =0; i< s.length(); i++)
        {
        System.out.println(s.substring(1) + s.substring(0,1));
        }
    }

    static boolean isLet(String s)
    {
        for (int i = 0; i < s.length(); i ++)
        {
            if (!Character.isLetter(s.charAt(i)))
                return false;
        }
        return true;
    }

    static int countLet (String s, char ch) 
    {
		int res = 0;
		for (int i = 0; i < s.length(); i++) 
        {
			if ( ch == s.charAt(i))
                    res++;
		} 
        return res;
    }

}