package WarCode;

import java.util.ArrayList;
/**
 * The class that models your game. You should create a more specific child of
 * this class and instantiate the methods given.
 *
 * @author Arsheemahedi Shethwala
 */
public abstract class Game 
{
    private final String gName;//the title of the game
    private ArrayList <Player> players;// the players of the game
    
    /*
    Parameterized Constructor
    */
    public Game(String givenName)
    {
        gName = givenName;
        players = new ArrayList<Player>();
    }

    /*
     * @return the gName
     */
    public String getGName() 
    {
        return gName;
    }
    
     /*
     * @return the players of this game
     */
    public ArrayList <Player> getPlayers() 
    {
        return players;
    }

    /*
     * @param players the players of this game
     */
    public void setPlayers(ArrayList <Player> players) 
    {
        this.players = players;
    }
    
    /*
     * Play the game. This might be one method or many method calls depending
     * on your game.
     */
    public abstract void play();
    
    /*
     * When the game is over, use this method to declare and display a winning
     * player.
     */
    public abstract void declareWinner();

}  // end of the class