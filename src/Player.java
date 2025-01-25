
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Player {
    protected static int playerCount = 1;
    protected int id;
    protected String name;
    protected int score;
    protected ArrayList<Card> hand = new ArrayList<>();

    public void showCardHand(){
        System.out.println("ID\t\tCard");
         for(int i=0; i<hand.size(); i++){
             System.out.println(i + " --------> " + hand.get(i).displayCard());
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

    public Card drawRandomCard(){
        int randIndex = (int)(Math.random() * hand.size());
        return hand.remove(randIndex);
    }

    public void addScore(int points){
        score += points;
    }

    public boolean haveAnyCards(){
        return !hand.isEmpty();
    }

    public String showScore(){
        return ("Player ID: " + this.id + " | Name: " + this.name + " | Score: " + this.score);
    }

    public void sortCardHand(){
        this.hand.sort(Comparator.comparingInt(Card->Card.getValue()));
    }

    public Card drawCard(Card otherPlayerCard){
        return null;
    };

    public Card drawCardById(int id){
        return hand.remove(id);
    }
}
