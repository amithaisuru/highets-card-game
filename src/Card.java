
public class Card {
    private int value;
    private String suit;

    public Card(int value, String suit){
        this.value = value;
        this.suit = suit;
    }

    public int getValue(){
        return this.value;
    }

    public String getSuit(){
        return this.suit;
    }

    public String displayCard(){
        return switch (this.value) {
            case 13 -> "A" + " of " + this.suit;
            case 12 -> "Q" + " of " + this.suit;
            case 11 -> "J" + " of " + this.suit;
            default -> this.value + " of " + this.suit;
        };
    }

}
