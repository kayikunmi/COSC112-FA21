/* File: OBcardsgame.java by Oluwakayikunmi Babatunde - Akinnagbe + partner AV 
Program: CASINO. Imagine a very simple game showing random cards.
*/

import java.util.*;
public class OBcardsgame 
{
    public static void main (String args[]) 
    {
		Card cardone = new Card(); 		
		Card cardtwo = new Card('9','H');	
		System.out.println("\nCards: " +  cardone +"\t"+ cardtwo);
		Card [] Player = new Card[5]; // give Player 5 cards
		for (int i = 0; i < 5; i++) 
        {
			Player[i] = new Card();
		}
		System.out.println("Hand: " +  Arrays.toString(Player)); 
		System.out.println(Card.Face);
	}
}

	
class Card 
{
	public static final String Face = "987654321TQKJA";	
	public static final String Suit = "CDHS"; 
    char face; 
    char suit; 
	public Card() 
    {  
		face = Face.charAt((int)(Math.random()* 13));
		suit = Suit.charAt((int)(Math.random() * 4));
    }
	public Card(char face, char suit)
    {
		this.face = face;  
		this.suit = suit;}
    public String toString() 
    { 
        return (face + "" + suit);
    }
}