import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Player {

    private int currentHandSize;
    public CardBase[] currentHand;




    public Player(int startHand, Deck deck) {
        currentHand =  new CardBase[startHand];
        drawStartingHand(startHand, deck);
        currentHandSize = startHand;

    }

    private void drawStartingHand(int startHand, Deck deck){

        for(int i = 0; i < startHand; i++){
            currentHand[i] = deck.drawCard();
        }

    }




    public void drawCard(Deck deck){
        CardBase[] newHand = new CardBase[currentHandSize+1];
        for(int i = 0; i < currentHandSize; i++){
            newHand[i] = currentHand[i];
        }
        newHand[currentHandSize] = deck.drawCard();
        currentHand = newHand;
        currentHandSize+=1;
    }

    private void removeCard(CardBase playedCard){
        CardBase[] newHand = new CardBase[currentHandSize-1];
        for(int i = 0, j = 0; i < currentHandSize;i++){
            if(!(playedCard == currentHand[i])){
            newHand[j++] = currentHand[i];
            }
        }
        currentHand = newHand;
        currentHandSize-=1;

    }

    public void playCard(CardBase playedCard, DiscardPile playpile) {
        if (GameRules.doesMatch(playedCard, playpile.currentCard)) {
            playpile.pile.addLast(playedCard);
            removeCard(playedCard);
            playpile.currentCard = playpile.pile.getLast();

        } else {
            System.out.println("you cant play this Card");
            return;
        }
    }

   public void showHand(){
        String prefix;
        for(int i = 0; i < currentHandSize; i++){
        prefix = String.valueOf(i+1);
        prefix = prefix + ") ";
        currentHand[i].showCard(prefix);
        }
   }
   public int getCurrentHandSize(){
        return currentHandSize;
   }

}
