/** File: OBrevnames.java 
 * sk the user for a list of names (stop when you type q/Q) and print them in reverse (use a Stack)? 
*/
import java.util.*;
public class OBrevnames 
{
    public static void main(String[] args) 
    {
        Scanner cin = new Scanner(System.in);
        String n;
        Stack<String> list = new Stack<String>();
        do 
        {
            System.out.println("Enter a number(enter q to end): ");
            n = cin.next();
            list.add(n);
        }
        while(!n.equalsIgnoreCase("q"));
        {
            list.pop();
        }
        while (!list.isEmpty())
        {
            System.out.println(list.pop());
        }
        cin.close();
    }
}
