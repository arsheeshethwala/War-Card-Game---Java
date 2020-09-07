package WarCode;

/**
 * This the Enumeration class for the value of the cards
 *
 * @author Arsheemahedi Shethwala
 */
public enum Value
{
	//Setting the card names and their respective values
    Ace(13),
    Two(1),
    Three(2),
    Four(3),
    Five(4),
    Six(5),
    Seven(6),
    Eight(7),
    Nine(8),
    Ten(9),
    Jack(10),
    Queen(11),
    King(12);
	
	//Initializing the value of every card as final
    private final int value; 
    
    //Public getter for the value
    public int getValue()
    {
        return value;
    }

    private Value(int value)
    {
        this.value = value;
    }

} // End of the class
