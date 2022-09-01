import java.sql.Array;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class Deck {
    private LinkedList<CardBase> deck;
    private int draw = 0;
    private int deckSize;

    public Deck(int size, String type) {
        deckSize = size;
        deck = new LinkedList<CardBase>();
        populateDeck(type);
    }

    public void populateDeck(String type) {
        int x = 0;


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                deck.add(new CardBase(CardValues.valueFromInteger(j), CardColours.colourFromInteger(i)));
                x++;
            }
        }


    }

    public CardBase drawCard() {
        if(draw == deckSize -1){
           populateDeck("wayne");
           shuffleDeck();
        }
        CardBase temp = deck.getFirst();
        deck.removeFirst();
        draw++;
        return temp;
    }


    public void showDeck(){
        for(int i = 0; i < 52; i++){
        deck.getFirst().showCard("");
        deck.removeFirst();
        }
    }



    public void shuffleDeck() {
        Collections.shuffle(deck);
    }


}





