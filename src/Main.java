import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Deck deck1 = new Deck();
        deck1.printDeck();
        deck1.shuffle();
        deck1.printDeck();

        ArrayList<Player> players = new ArrayList<Player>();
        int numOfPlayers = 4;

        for(int i = 0; i<numOfPlayers; i++){
            players.add(new Player());
        }

        //print players
        for(Player player : players){
            System.out.println(player);
        }
    }
}