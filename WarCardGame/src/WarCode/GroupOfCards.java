package WarCode;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you
 * might want to subclass this more than once. The group of cards has a maximum
 * size attribute which is flexible for reuse.
 *
 * @author Arsheemahedi Shethwala
 */
public abstract class GroupOfCards
{

    private static int size;//the size of the grouping
    //The group of cards, stored in an ArrayList
    protected static ArrayList<Card> cards = new ArrayList<Card>(size);

    //Parameterized Constructor
    public GroupOfCards(int givenSize)
    {
        size = givenSize;
    }

    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public ArrayList<Card> showCards()
    {
        return cards;
    }

    /**
     * Method implementation for shuffling of the cards
     */
    public static void shuffle()
    {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize()
    {
        return size;
    }

    /**
     * @param givenSize the max size for the group of cards
     */
    public void setSize(int givenSize)
    {
        size = givenSize;
    }

    /**
     * Public getter for the Array list cards
     *
     * @return cards
     */
    public static ArrayList<Card> getCards()
    {
        return cards;
    }

}//end of the class
