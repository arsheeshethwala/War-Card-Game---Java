package WarCode;
/**
 * @author Arsheemahedi Shethwala
 */
import java.util.ArrayList;
import java.util.Collections;

public class GamePlayer extends Player
{

    //declaring all the variables of the class
    private int numPlayer;
    public int i = 0, j = 0;

    String s;

    ArrayList<Card> temp = new ArrayList<Card>(); // Arraylist created to store the cards in the temp during the gameplay

    ArrayList<Card> p1 = new ArrayList<Card>(); // Arraylist created to store the cards of the player 1
    ArrayList<Card> p2 = new ArrayList<Card>(); // Arraylist created to store the cards of the player 2

    /*
    *Parameterized constructor which has numPlayers for number of players
    *Player 1 and Player 2 inherited from the super class Player for the player IDs
     */
    public GamePlayer(int numPlayer, String player1, String player2)
    {
        super(player1, player2);
        this.numPlayer = numPlayer;
    }

    // public getters and setters for the number of players
    public int getNumPlayer()
    {
        return numPlayer;
    }

    public void setNumPlayer(int numPlayer)
    {
        this.numPlayer = numPlayer;
    }

    /**
     * This is the method which initializes the games checks the number of
     * players. Shuffle the card between two players.
     *
     */
    @Override
    public void play()
    {

        if (numPlayer == 2) {

            GroupOfCards.shuffle();

            int t = 0;
            while (t < 26) {
                p1.add(GroupOfCards.getCards().get(t));
                System.out.println(p1.get(t));
                t++;
            }
            System.out.println("-------------------");
            while (t > 25 && t < 52) {
                p2.add(t - 26, GroupOfCards.getCards().get(t));
                System.out.println(p2.get(t - 26));
                t++;
            }
            System.out.println("-------------------");
            System.out.println("p1-->" + p1.size());
            System.out.println("p2 -->" + p2.size());
            System.out.println("-------------------");
            System.out.println(gameStart());
            System.out.println("p1-->" + p1.size());
            System.out.println("p2 -->" + p2.size());
        }
    } // End of the play() method

    /**
     * This method starts the games
     *
     * @return number of cards left with the either player
     */
    public String gameStart()
    {

        while (p1.size() > 0 && p2.size() > 0) {
            Collections.shuffle(p1);
            Collections.shuffle(p2);

            i = 0;
            j = 0;
            temp.add(p1.get(i));
            j++;

            temp.add(p2.get(i));
            j++;

            p1.remove(i);
            p2.remove(i);

            i++;
            check();
            j = 0;
            System.out.println("p1-->" + p1.size());
            System.out.println("p2 -->" + p2.size());

        }

        if (!p1.isEmpty()) {
            s = super.getPlayerID1() + " Player 1 win the game.";

        } else {
            s = super.getPlayerID2() + " Player 2 win the game.";

        }
        return s;
    } // End of the gameStart() method

    /**
     * This is the method to check the winner of the game
     */
    public void check()
    {
        System.out.println("temp -->" + temp.size());
        System.out.println("i -->" + i);
        if (temp.get(j - 1).getValue().getValue() < temp.get(j - 2).getValue().getValue()) {

            System.out.println("p1 won");
            for (int k = 0; k < temp.size(); k++) {
                p1.add(temp.get(k));

            }
            temp.clear();
        } else if (temp.get(j - 1).getValue().getValue() > temp.get(j - 2).getValue().getValue()) {
            System.out.println("p2 won");
            for (int k = 0; k < temp.size(); k++) {
                p2.add(temp.get(k));

            }
            temp.clear();
        } else {
            System.out.println("p1-->" + p1.size());
            System.out.println("p2 -->" + p2.size());
            System.out.println("War Begins: ");
            if (p1.size() <= 5) {
                s = super.getPlayerID2() + " Player 2 win the game.";
                p2.addAll(temp);
                temp.clear();
            } else if (p2.size() <= 5) {
                s = super.getPlayerID1() + " Player 1 win the game.";
                p1.addAll(temp);
                temp.clear();
            } else {
                for (int k = 0; k < 3; k++) {
                    temp.add(p1.get(i));
                    p1.remove(i);
                    j++;

                    temp.add(p2.get(i));
                    p2.remove(i);
                    j++;

                    i++;
                }
                check();
            }
        }

    } // End of the check method

} // End of the class
