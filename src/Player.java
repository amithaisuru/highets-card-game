
import java.util.ArrayList;

public class Player {
    private static int playerCount = 1;
    private int id;
    private String name;
    private int score;
    private ArrayList<Card> hand = new ArrayList<Card>();

    public Player(){
        this.name = "Player " + playerCount;
        this.id = playerCount;
        playerCount++;
    }

    public Player(String name){
        this.name = name;
        this.id = playerCount;
        playerCount++;
    }

    public void showCard(){
         for(Card card: hand){
             System.out.println(card.displayCard());
         }
    }

    public String toString(){
        return ("Player ID: " + this.id + " Name: " + this.name);
    }

    public void addCard(Card card){
        hand.add(card);
    }

    public int getID(){
        return this.id;
    }

    //this function removes the top card from the hand
    public Card drawTopCard(){
        return hand.removeFirst();
    }

    public void addScore(int points){
        score += points;
    }

    public boolean haveAnyCards(){
        return !hand.isEmpty();
    }

    public String showScore(){
        return ("Player ID: " + this.id + " Name: " + this.name + " Score: " + this.score);
    }

}
