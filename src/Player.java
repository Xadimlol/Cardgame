public class Player {

    private int currentHandSize;
    public CardBase[] currentHand;
    private int maxHandSize;


    public Player(int startHand, int maxHandSize1, Deck deck) {
        currentHand =  new CardBase[maxHandSize1];
        drawStartingHand(startHand, deck);
        currentHandSize = startHand;
        maxHandSize = maxHandSize1;
    }

    private void drawStartingHand(int startHand, Deck deck){

        for(int i = 0; i < startHand; i++){
            currentHand[i] = deck.drawCard();

        }

    }

    public void drawCard(Deck deck){
        if(maxHandSize == currentHandSize){
            System.out.println("you cant draw more cards");
            return;
        }
        currentHand[currentHandSize] = deck.drawCard();
        currentHandSize +=1;
    }

    private void removeCard(CardBase playedCard){
        currentHandSize-=1;
        CardBase[] newHand = new CardBase[currentHandSize];
        int j = 0;
        for(int i = 0; i < currentHandSize+1;i++){
            if(currentHand[i] != playedCard){
                newHand[i] = currentHand[i];

            }


        for(i = 0; i < currentHandSize;i++){
            currentHand[i] = newHand[i];
        }

        }


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
        for(int i = 0; i < currentHandSize; i++){
        currentHand[i].showCard();
        }
   }

}
