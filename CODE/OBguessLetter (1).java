/* File: Hwk2/OBguessLetter.java by Oluwakayikunmi Babatunde - Akinnagbe + partner TW Theodore Woodward
Program: Build a program that guesses a random letter
*/
import java.util.*;
public class OBguessLetter 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();
        char randomizedCharacter = (char) (random.nextInt(26) + 'a');
        char guess;
        
        do 
        {
            System.out.print("Enter a guess for a random letter: ");
            guess = keyboard.next().charAt(0);

            if (guess == randomizedCharacter)
                System.out.println("Your guess is correct, CONGRATUALTIONS!");
                
            else if (guess != randomizedCharacter)
                System.out.println("TRY AGAIN");
        }        
        while (guess != randomizedCharacter);
        keyboard.close();
    }
    
}
