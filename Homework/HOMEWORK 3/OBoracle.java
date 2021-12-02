/* File: Hwk2/OBoracle.java by Oluwakayikunmi Babatunde - Akinnagbe + partner TW Theodore Woodward
Program: Build an oracle that produces a randomly automated answer
*/
import java.util.*;
public class OBoracle 
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        System.out.println("Ask me anything?");
        cin.next(); 
        int oracleResponse = (int) (Math.random() * 4) + 1;
        switch (oracleResponse)
        {
            case 1:
                System.out.println("Yes 👍");
                break;
            case 2:
                System.out.println("No 👎");
                break;
            case 3:
                System.out.println("Maybe, I'm not sure 😔");
                break;
            case 4:
                System.out.println("I don't know 🤔");
                break;
            case 5:
                System.out.println("You might be on to something 🧐");
                break;
            default:
                System.out.println("This an automated error message for this oracle. Try again later!");
                break;
        }
        cin.close();
    }
}
