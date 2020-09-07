package WarCode;
/**
 * A class that models each Player in the game. Players have an identifier,
 * which should be unique.
 *
 * @author Arsheemahedi Shethwala
 */
public abstract class Player 
{
    private String playerID1, playerID2; //the unique ID for this player
    
    /**
     * A constructor that allows you to set the player's unique ID
     * @param player1
     * @param player2
     */
    public Player(String player1, String player2)
    {
        playerID1= player1;
        playerID2= player2;
    }
    
    /**
     * @return the playerID1
     */
    public String getPlayerID1() 
    {
        return playerID1;
    }

    /**
     * Ensure that the playerID is unique
     * @param givenID the playerID to set
     */
    public void setPlayerID1(String givenID) 
    {
        playerID1 = givenID;
    }
    
    /**
     * @return the playerID2
     */
    public String getPlayerID2() 
    {
        return playerID2;
    }

    /**
     * Ensure that the playerID2 is unique
     * @param givenID the playerID2 to set
     */
    public void setPlayerID2(String givenID) 
    {
        playerID2= givenID;
    }
    
    /**
     * The method to be instantiated when you subclass the Player class
     * with your specific type of Player and filled in with logic to play your game.
     */
    public abstract void play();
    
} // End of the class
