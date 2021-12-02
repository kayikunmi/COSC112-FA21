/** File: OBrevstack.java 
 * Stack. Ask the user for a doubls (stop when you type 0). 
 * Using the STACK data structure write a program that displays them in reverse. Idea: push and pop from a Stack.
*/
import java.util.*;
public class OBrevstack 
{
    public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    double x = -1;
    Stack<Double> A = new Stack<>();
    while(x!=0)
    {
      System.out.println("Enter a double, it will stop when you enter zero");
      x = keyboard.nextDouble();
      if(x != 0)
      {
        A.push(x);
      }
    }
    while(!A.isEmpty())
    {
      System.out.println(A.pop());
    }
    keyboard.close();
  }
  
    
}
