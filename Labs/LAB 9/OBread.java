//File: OBread.java by Kayikunmi B. A.
import java.util.*;
import java.io.*;

public class OBread 
{
	public static void main(String[] args) 
    {
		Scanner keyboard = null;
		try 
        {
			keyboard = new Scanner(new File("myData.txt"));
		} 
        catch(Exception ex) 
        {}
		while(keyboard.hasNext()) 
        {
			String s = keyboard.next();
			System.out.println(s);
		}
	}
}