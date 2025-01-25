public class Computer extends Player{
    private static int computerPlayerCount = 1;

    public Computer(){
        this.name = "Computer " + computerPlayerCount;
        this.id = playerCount;
        computerPlayerCount++;
        playerCount++;
    }

    /*
    this method returns a card that is equals or greater than opponent card
    if no such card, place the minimum card
    */
    @Override
    public Card drawCard(Card otherPlayeCard){
        int otherPlayerCardVal = otherPlayeCard.getValue();
        System.out.println("[debug]: " + hand.size());

        int cardToPlayIdx = 0;

        for(int i=0;i<hand.size();i++){
            if(otherPlayerCardVal == hand.get(i).getValue()){
                cardToPlayIdx = i;
            }
        }

        if(cardToPlayIdx < hand.size() - 1)
            if(hand.get(cardToPlayIdx+1).getValue() > otherPlayerCardVal)
                return hand.remove(cardToPlayIdx+1);
            else
                return hand.remove(cardToPlayIdx);

        else if(cardToPlayIdx == hand.size()-1)
            return hand.remove(cardToPlayIdx);

        return hand.removeFirst(); //returns card with the smallest value
    }
}