import java.util.LinkedList;

public class DiscardPile {
    public LinkedList<CardBase> pile;
    public int currentCardPlayed = 0;
    public CardBase currentCard;


    public DiscardPile(){
        pile = new LinkedList<CardBase>();
    }



    public void showPile(int size){
        for(int i = 0; i < size; i++){
            pile.getFirst().showCard();
            pile.removeFirst();
        }
    }

    public void startingCard(Deck deck){
        pile.addFirst(deck.drawCard());
        currentCard = pile.getFirst();
    }


}
