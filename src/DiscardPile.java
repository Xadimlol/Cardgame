import java.util.LinkedList;

public class DiscardPile {
    public LinkedList<CardBase> pile;
    public int currentCardPlayed = 0;
    public CardBase currentCard;


    public DiscardPile(){
        pile = new LinkedList<CardBase>();
    }



    public void showPile(){
            pile.getLast().showCard("Top of playing field ");
        }


    public void startingCard(Deck deck){
        pile.addFirst(deck.drawCard());
        currentCard = pile.getFirst();
    }


}
