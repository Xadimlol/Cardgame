import java.util.Collections;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
    CardBase card = new CardBase(CardValues.three, CardColours.club);
    CardBase card2 = new CardBase(CardValues.three, CardColours.diamond);
    Deck deck = new Deck(52,"wayne");
    DiscardPile playpile = new DiscardPile();
    playpile.startingCard(deck);
    Player kevin = new Player(6, 52, deck);
    }
}
