/* File: Hwk2/OBcasino.java by Oluwakayikunmi Babatunde - Akinnagbe + partner DS Dylan Schor
Program: Guess how many times it takes for you to get a triple
*/
import java.util.*;
public class OBcasino 
{
    public static void main (String [] args) {
        System.out.println("How many rolls do you think it would take for you to get a triple?");
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt(); 
        int rand1 = 0;
        int rand2 = 0;
        int rand3 = 0;
        int counter = 0;
        while(!(rand1 == rand2 && rand1 == rand3)) 
        {
            rand1 = (int)(Math.random () * 6) + 1;
            rand2 = (int)(Math.random () * 6) + 1;
            rand3 = (int)(Math.random () * 6) + 1;
            System.out.println(rand1 + "-" + rand2 + "-" + rand3);
            counter++;
        }
        if(n == counter) {
            System.out.println("Congrats! You guessed correctly! \nIt took exactly " + counter + " times." );
        } 
        else {
            System.out.println("You're guess wasn't quite right, but it took only " + counter + " times. Try again later!" );
        }
        cin.close();
    }
}
