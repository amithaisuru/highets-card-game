import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {

        Card[] cardsOnTable = new Card[2];
        Player[] players = new Player[2];
        int numOfPlayers = players.length;

        //make human player
        Player human = new Human("Amitha");
        players[0] = human;

        //make computer
        Player computer = new Computer();
        players[1] = computer;

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

        //sort cards on hand
        for(Player player : players){
            player.sortCardHand();
        }

        boolean continueLoop = true;
        int round = 1;

        Scanner scanner = new Scanner(System.in);

        while(continueLoop){

            clearScreen();
            int pointsToAdd = 1;

            //display cards
            human.showCardHand();
            System.out.println("Enter card to play(cardID): ");
            int cardToPlay = scanner.nextInt();

            Card humanPlacedCard = human.drawCardById(cardToPlay);
            Card computerPlacedCard = computer.drawCard(humanPlacedCard);

            System.out.println("you: " + humanPlacedCard.displayCard());
            System.out.println("Computer: " + computerPlacedCard.displayCard());

            //conditions
            if(humanPlacedCard.getValue() > computerPlacedCard.getValue()) {
                human.addScore(pointsToAdd);
            }
            else if(humanPlacedCard.getValue() < computerPlacedCard.getValue()) {
                computer.addScore(pointsToAdd);
            }
            else //cards with same value
                pointsToAdd ++;


            //break the loop when every player left no cards
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