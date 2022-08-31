import java.sql.Array;
import java.util.Collections;

public class Deck {
    private static CardBase[] deck;
    private int draw = 0;
    public Deck(int i, String type){
        deck = new CardBase[52];
        populateDeck(type);
        }

      private void populateDeck(String type){
        int x = 0;
        System.out.println(deck);
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 13; j++){
                deck[x].setColour(CardColours.colourFromInteger(i));
                deck[x].setValue(CardValues.valueFromInteger(j));
                x++;
                System.out.println(x);
              }
          }


        }

      public void showDeck(){
        for(int k = 0; k < 52; k++){
            deck[k].showCard();
        }
    }

    public CardBase drawCard() {
        draw++;
        return deck[draw-1];
    }
}

