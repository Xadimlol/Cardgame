public class Player {
    private int maxHandSize;

    private int currentHandSize;
    private CardBase[] currentHand;


    public Player(int startHand, int maxHandSize, Deck deck) {
        currentHand =  new CardBase[maxHandSize];
        drawCards(startHand, deck);
        currentHandSize = startHand;
    }

    private void drawCards(int startHand, Deck deck){

        for(int i = 0; i < startHand; i++){
            currentHand[i] = deck.drawCard();

        }

    }

   public void showHand(){
        for(int i = 0; i < currentHandSize; i++){
        currentHand[i].showCard();
        }
   }

}
