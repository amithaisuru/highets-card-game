
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

    public String toString(){
        return ("Player ID: " + this.id + " Name: " + this.name);
    }

}
