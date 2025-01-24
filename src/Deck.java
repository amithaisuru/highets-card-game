import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> cardList = new ArrayList<Card>();
    private String[] suits = {"Spade", "Diamond", "Clubs", "Hearts"};

    public Deck(){
        for(String suit : suits){
            for(int i = 1; i<=13; i++){
                Card tempCard = new Card(i,suit);
                cardList.add(tempCard);
            }
        }
    }

    public void printDeck(){
        int i = 1;
        for(Card card : cardList){
            System.out.println(card.displayCard());
            i++;
        }
    }
}
