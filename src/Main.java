import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Player> players = new ArrayList<Player>();
        int numOfPlayers = 4;

        for(int i = 0; i<numOfPlayers; i++){
            players.add(new Player());
        }

        //print players
        for(Player player : players){
            System.out.println(player);
        }

        //make a deck
        Deck deck1 = new Deck();
        deck1.shuffle();
        deck1.printDeck();

        //distribute cards
        while(!deck1.isEmpty()){
            for(Player player : players){
                player.addCard(deck1.drawCard());
            }
        }

        //display cards
        System.out.println("cards");
        for(Player player : players){
            System.out.println("player: "+player.getID());
            player.showCard();
        }

        //while eac player has a card
            //ech player plays top card
            //find player with highest card
            //give apoint to winner

        boolean continueLoop = true;
        int round = 1;

        while(continueLoop){

            int pointsToGive = 1;
            Card currentHighestCard = new Card(0,null);
            Player highestPlayer = new Player();

            System.out.println("round " + round);

            for(int i=0; i<numOfPlayers; i++){
                Card currentCard = players.get(i).drawTopCard();

                System.out.println("\tplayer: " + players.get(i).getID() + " -> " + currentCard.displayCard() );

                if(currentCard.getValue()>currentHighestCard.getValue()){
                    currentHighestCard = currentCard;
                    highestPlayer = players.get(i);
                }
                else if(currentCard.getValue()<currentHighestCard.getValue()){
                    continue;
                }
                else{/*when two cards are equal*/
                    pointsToGive++;
                }
            }

            highestPlayer.addScore(pointsToGive);

            //break when every player left no cards
            continueLoop = false;
            for(Player player : players){
                if(player.haveAnyCards())
                    continueLoop = true;
            }

            round++;

        }

        //print score of each player
        for(Player player : players){
            System.out.println(player.showScore());
        }

    }
}