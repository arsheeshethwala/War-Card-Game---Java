package WarCode;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. 
 *
 * @author Arsheemahedi Shethwala
 */
public abstract class Card 
{
    //default modifier for child classes
    
    /*
     * Students should implement this method for their specific children classes 
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    
    @Override
    public String toString()
    {
        return suit+" -- >"+value;
    }
    
    // Enum class for the suits
    public enum Suits{Heart, Diamond, Spades, Clubs};
    
    private Suits suit;
    private Value value;
    
    // Parameterized Constructor for the class card 
    public Card(Suits s, Value v)
    {
        suit = s;
        value = v;
    }
    
    // public getters for the value and suits
    public Value getValue() {
		return this.value;
	}

	
    public Suits getSuit() {
		return this.suit;
        }
    
    
    
} // end of the class
