/* File: Hwk2/OBguess.java by Oluwakayikunmi Babatunde - Akinnagbe + partner DS Dylan Schor
Program: Guess a random number between 1 and 100
*/
import java.util.*;
public class OBguess 
{
    public static void main(String[] args)
    {
        int secretNumber;

            secretNumber = (int) (Math.random() * 99 + 1);

            Scanner keyboard = new Scanner(System.in);

            int guess;

            do {

                  System.out.print("Enter a guess for a number between 1 and 100: ");

                  guess = keyboard.nextInt();

                  if (guess == secretNumber)

                        System.out.println("Your guess is correct, CONGRATUALTIONS!");

                  else if (guess < secretNumber)

                        System.out.println("Your guess is smaller than the secret number, TRY AGAIN!");

                  else if (guess > secretNumber)

                        System.out

                                   .println("Your guess is greater than the secret number, TRY AGAIN!");

            } while (guess != secretNumber);
            keyboard.close();
    }
}
