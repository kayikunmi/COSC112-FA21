package hw4;

/* File: Hwk2/OBguessLetter.java by Oluwakayikunmi Babatunde - Akinnagbe + partner AO Aidan Orr
Program: guess a letter in secret word, and receive score
*/
import java.util.*;
public class OBguessword 
{
    public static void main(String[] args)
    {
        final String secretword = "COMPUTER";
		final String FLAG = "!";
		String guessedword = "", updatedWord = "";
		String guessedletter, wordGuess = "";
		int numguesses = 0;
		Scanner keyboard = new Scanner(System.in);
		
	
		System.out.println("WordGuess game.\n");
		for (int i = 0; i < secretword.length(); i++) {
			guessedword += "-";								
		}
		System.out.println(guessedword + "\n");				
	
	
		do {
			System.out.print("Enter a letter to guess entire word: ");
			guessedletter = keyboard.nextLine();
			guessedletter = guessedletter.toUpperCase();			
		
			
			numguesses += 1;
			
			
			if (secretword.indexOf(guessedletter) >= 0) {
				updatedWord = guessedword.substring(0, secretword.indexOf(guessedletter)); 
				updatedWord += guessedletter;												
				updatedWord += guessedword.substring(secretword.indexOf(guessedletter)+1, guessedword.length());
				guessedword = updatedWord;
			}
				
			
			System.out.println(guessedword + "\n");
		} while (!guessedletter.equals(FLAG) && !guessedword.equals(secretword));
		
		
		if (guessedletter.equals(FLAG)) {
			System.out.println("What is your guess? ");
			wordGuess = keyboard.nextLine();
			wordGuess = wordGuess.toUpperCase();
		}
		if (wordGuess.equals(secretword) || guessedword.equals(secretword)) {
			System.out.println("You won!");		
		} else {
			System.out.println("Sorry. You lose.");
		}
		System.out.println("The secret word is " + secretword);
		System.out.println("You made " + numguesses + " guesses.");	
        keyboard.close();
    }
    
}
