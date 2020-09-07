package WarCode;

import java.util.Scanner;

/**
 * This is the main class for the game which executes all the methods and game
 * play.
 *
 * @author Arsheemahedi Shethwala
 */
public class War
{

    public static void main(String args[])
    {	
    	Scanner in = new Scanner(System.in);
        System.out.println("There are 52 Cards in the Deck which will be distributed evenly between two players");
        int cardDeckSize = 52;
        Deck card[] = new Deck[cardDeckSize];
        int i = 0;
        for (Card.Suits s : Card.Suits.values()) {
            for (Value v : Value.values()) {
                card[i] = (new Deck(s, v));
                GroupOfCards.cards.add(card[i]);
                i++;
            }
        } //for loop for end outer
        
        int numPlayers = 2;

        System.out.println("Enter name of player1: ");
        String player1 = in.next();

        System.out.println("Enter name of player2: ");
        String player2 = in.next();

        GamePlayer pg1 = new GamePlayer(numPlayers, player1, player2); 
        pg1.play();
        in.close(); // closing the scanner
    } // End of the main method
} // End of the class
